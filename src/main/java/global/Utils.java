package global;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 王强 eric3510@foxmail.com
 * @version 创建时间：2017/07/27 10:55
 * Utils
 **/
public class Utils {

    public static class EnmuUtils {
        /**
         * 获取对应枚举的所有值，JSONArray队列表示
         * @param enmuObjs
         * @return JSONArray
         */
        public static List<Map<String, Object>> getJSON(Object... enmuObjs){
            List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            for (Object enmuObj : enmuObjs) {
                Field[] fields = enmuObj.getClass().getDeclaredFields();
                Map<String, Object> map = new TreeMap<String, Object>();
                for (Field field : fields) {
                    field.setAccessible(true);
                    try {
                        String type = field.getType().toString();
                        if(type.endsWith("String") || type.endsWith("int") || type.endsWith("Integer") || type.endsWith("Boolean") || type.endsWith("boolean")){
                            Object val = field.get(enmuObj);
                            map.put(field.getName(), val);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
                list.add(map);
            }
            return list;
        }

        /***
         * 根据keyName得值获取对应valueName的值
         * @param enmuObjs 要查的枚举类数组对象
         * @param keyName 相对key的名称（此名称也可指定枚举中的value或别的字段的变量名）
         * @param valueName 相对value的名称（keyName多对应的value的值）（此名称也可指定枚举中的value或别的字段的变量名）
         * @param byKey keyName对应的key值
         * @return
         */
        public static <T> T getValue(Object[] enmuObjs, String keyName, String valueName, String byKey, Class<T> type){
            String methodKeyName = "";
            String methodValueName = "";
            for (Object enmuObj : enmuObjs) {
                Field[] fields = enmuObj.getClass().getDeclaredFields();
                String get = "get";
                //取到key name 和 value name
                if (methodKeyName.equals("") || methodKeyName.equals(null)){
                    for (Field field : fields) {
                        field.setAccessible(true);
                        String fieldName = field.getName();
                        //判断是否为key name
                        if (keyName.equals(fieldName)) methodKeyName = get + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());//如果为key name或者value name则存起来
                        if (valueName.equals(fieldName)) methodValueName = get + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
                    }
                }
                try {
                    Method methodValueMth = enmuObj.getClass().getMethod(methodValueName);
                    Method methodKeyMth = enmuObj.getClass().getMethod(methodKeyName);
                    T value = (T)methodValueMth.invoke(enmuObj);
                    String key  = (String)methodKeyMth.invoke(enmuObj);
                    if (key.equals(byKey)){
                        return value;
                    }
                } catch (NoSuchMethodException e) {
                    String msg = e.getMessage();
                    String msgStr = "() 此方法不存在";
                    if(msg.contains(methodValueName)){
                        try {
                            throw new Exception(methodValueName + msgStr);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    }else if(msg.contains(methodKeyName)){
                        try {
                            throw new Exception(methodKeyName + msgStr);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    }else {
                        e.printStackTrace();
                    }
                }catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }
}