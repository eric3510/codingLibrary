package observer.v1;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/7
 * Main
 */
public class Main{
    public static void main(String[] args){
        Secretary tongZiZhe = new Secretary();

        StockObserver stockObserver1 = new StockObserver("张三", tongZiZhe);
        StockObserver stockObserver2 = new StockObserver("李四", tongZiZhe);

        tongZiZhe.attach(stockObserver1);
        tongZiZhe.attach(stockObserver2);

        tongZiZhe.setSecretaryAction("老板回来了！");
        tongZiZhe.notifys();
    }
}
