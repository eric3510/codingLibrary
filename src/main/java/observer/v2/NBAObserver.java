package observer.v2;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/7
 * NBAObserver
 */
public class NBAObserver extends Observer{
    public NBAObserver(String name, Subject subject){
        super(name, subject);
    }

    @Override
    public void update(){
        System.out.println(String.format("%s %s 关闭NBA直播,继续工作!", name, subject.getSubjectState()));
    }
}
