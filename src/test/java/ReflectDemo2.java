import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * @Description 获取Class中的构造函数
 * @Author Administrator
 * @Date 2018/11/30
 */
public class ReflectDemo2 {

    @Test
    public void createNewObject_1() throws Exception {
        // 早期创建对象,先根据被new的类的名称找寻该类的字节码文件，并加载进内存，
        // 并创建该字节码文件对象，并接着创建该接文件的对应的Person对象
        com.hw.bean.Person p = new com.hw.bean.Person();

        // 现在
        String name = "com.hw.bean.Person";
        // 找寻该名称类文件，并加载进内存，并产生Class对象
        Class clazz = Class.forName(name);
        // 通过空参构造器获取实例
        Object obj = clazz.newInstance();
    }

    @Test
    public void createNewObject_2() throws Exception {
        String name = "com.hw.bean.Person";
        Class clazz = Class.forName(name);
        // 获取指定方法参数的构造对象
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);
        // 通过该构造器对象的newInstance()方法进行对象的初始化
        Object obj = constructor.newInstance("小明", 22);
    }


}
