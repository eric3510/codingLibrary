package pattern.factory.calculator;

/**
 * @author 王强 eric3510@foxmail.com
 * @version 创建时间：2017/07/26 14:39
 * OperatinFactory
 **/
public class OperatinFactory {
        public static Operation createOperate(String operate) {
            switch (operate) {
                case "+": return new OperationAdd();
                case "-": return new OperationSub();
                case "*": return new OperationMul();
                case "/": return new OperationDiv();
                default : return null;
            }
        }
}