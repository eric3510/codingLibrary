package thread.communication;

/**
 * @author 王强
 * @version 创建时间：2017/07/31 11:10
 * ThreadA
 **/
public class ThreadA extends Thread {
    private MyObject object;

    ThreadA (MyObject object) {
        this.object = object;
    }

    //省略构造方法
    public void run() {
        super.run();
        object.methodA();
    }
}