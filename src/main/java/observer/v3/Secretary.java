package observer.v3;

import java.util.ArrayList;
import java.util.List;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/7
 * Secretary
 */
public class Secretary implements Subject{
    //同事列表
    private List<Observer> observers = new ArrayList<>();

    private String action;

    //增加
    public void attach(Observer observer){
        observers.add(observer);
    }

    //减少
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    public void notifys(){
        for(Observer observer : observers){
            observer.update();
        }
    }

    @Override
    public String getSubjectState(){
        return this.action;
    }

    @Override
    public void setSubjectState(String subjectState){
        this.action = subjectState;
    }
}
