package observer.v3;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/7
 * Subject 抽象通知者
 */
public interface Subject{
    //增加
    void attach(Observer observer);

    //减少
    void detach(Observer observer);

    void notifys();

    String getSubjectState();

    void setSubjectState(String subjectState);
}
