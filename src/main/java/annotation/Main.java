package annotation;

/**
 * @author 王强
 * @version 创建时间：2017/07/28 17:19
 * Main
 **/
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        model.setName("13213223");
        System.out.println(model.hashCode());
//        model = new Model();
        model.setValue("321");
        System.out.println(model.hashCode());
    }
}