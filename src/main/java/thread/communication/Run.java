package thread.communication;

/**
 * @author 王强
 * @version 创建时间：2017/07/31 11:12
 * Run
 **/
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        ThreadB b = new ThreadB(object);

        a.start();
        b.start();

        //System.out.println("argsLength = " + args.length);
    }
}