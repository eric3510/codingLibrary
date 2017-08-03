package thread.communication;

/**
 * @author 王强
 * @version 创建时间：2017/07/31 11:11
 * ThreadB
 **/
public class ThreadB extends Thread {
    private MyObject object;

    ThreadB (MyObject object) {
        this.object = object;
    }

    public void run() {
        super.run();
        object.methodB();
    }
}