package pattern.factory.calculator;

/**
 * @author 王强 eric3510@foxmail.com
 * @version 创建时间：2017/07/26 14:48
 * OperationSub
 **/
public class OperationSub extends Operation {
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}