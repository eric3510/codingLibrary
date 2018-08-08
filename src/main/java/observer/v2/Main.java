package observer.v2;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/7
 * Main
 */
public class Main{
    public static void main(String[] args){
        //老板胡汉三
        Boss huHanSan = new Boss();

        //看股票的同事
        StockObserver tongShi1 = new StockObserver("张三", huHanSan);

        //看NBA的同事
        NBAObserver tongShi2 = new NBAObserver("李四", huHanSan);

        huHanSan.attach(tongShi1);
        huHanSan.attach(tongShi2);

        huHanSan.detach(tongShi1);

        //老板回来

        huHanSan.setSubjectState("我胡汉三回来啦！");

        //发出通知
        huHanSan.notifys();
    }
}
