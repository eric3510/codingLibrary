package observer.v2;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/7
 * StockObserver
 */
public class StockObserver extends Observer{
    public StockObserver(String name, Subject subject){
        super(name, subject);
    }

    @Override
    public void update(){
        System.out.println(String.format("%s %s 关闭股票行情,继续工作！", this.subject.getSubjectState()));
    }
}
