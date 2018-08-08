package observer.v3;

import java.util.ArrayList;
import java.util.List;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/7
 * Boss
 */
public class Boss implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void attach(Observer observer){
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer){
        observers.remove(observer);
    }

    @Override
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
