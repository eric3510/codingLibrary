package calculator;

/**
 * @author 王强 eric3510@foxmail.com
 * @version 创建时间：2017/07/26 13:30
 * Operation
 **/
public abstract class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA(){
        return this.numberA;
    }

    public double getNumberB(){
        return this.numberB;
    }

    public void setNumberA(double numberA){
        this.numberA = numberA;
    }

    public void setNumberB(double numberB){
        this.numberB = numberB;
    }

    /**
     * 获取结果
     * @return
     */
    public abstract double getResult();
}

