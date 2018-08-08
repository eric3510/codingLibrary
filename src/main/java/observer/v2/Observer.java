package observer.v2;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/7
 * Observer 抽象观察者
 */
public abstract class Observer{
    protected String name;
    protected Subject subject;
    public Observer(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
