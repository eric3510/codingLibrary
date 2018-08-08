package observer.v1;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/7
 * StockObserver
 */
public class StockObserver{
    private String name;
    private Secretary secretary;

    public StockObserver(String name, Secretary secretary){
        this.name = name;
        this.secretary = secretary;
    }

    public void Update(){
        System.out.println(String.format("%s %s 关闭股票行情，继续工作!",name, secretary.getSecretaryAction()));
    }
}
