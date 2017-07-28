package annotation;

/**
 * @author 王强
 * @version 创建时间：2017/07/28 18:45
 * Model
 **/
public class Model {
    private String name;
    private String value;

    public void setName(String name){
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

}