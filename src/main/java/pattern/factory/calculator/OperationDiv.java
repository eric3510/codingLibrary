package pattern.factory.calculator;

/**
 * @author 王强 eric3510@foxmail.com
 * @version 创建时间：2017/07/26 14:50
 * OperationDiv
 **/
public class OperationDiv extends Operation {
    public double getResult() {
        if (this.getNumberB() == 0){
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.getNumberA() / this.getNumberB();
    }
}