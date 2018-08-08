package observer.v1;

import java.util.ArrayList;
import java.util.List;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/7
 * Secretary
 */
public class Secretary{
    //同事列表
    private List<StockObserver> observers = new ArrayList<>();
    private String action;

    //增加
    public void attach(StockObserver observer){
        observers.add(observer);
    }

    //通知
    public void notifys(){
        for(StockObserver stockObserver : observers){
            stockObserver.Update();
        }
    }

    //前台状态
    public String getSecretaryAction(){
        return action;
    }

    public void setSecretaryAction(String action){
        this.action = action;
    }
}
