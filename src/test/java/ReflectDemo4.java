import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Description 获取Class中的方法
 * @Author Administrator
 * @Date 2018/11/30
 */
public class ReflectDemo4 {

    /**
     * 获取的都是共有的方法（包括父类）
     */
    @Test
    public void getMethodDemo() throws Exception {
        Class clazz = Class.forName("com.hw.bean.Person");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    /**
     * 获取本类中的所有的方法（包含私有的）
     */
    @Test
    public void getMethodDemo_2() throws Exception {
        Class clazz = Class.forName("com.hw.bean.Person");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    /**
     * 获取单个方法
     *
     * 方法无参 方式一：使用无参构造器（默认） method.invoke(o, null)
     */
    @Test
    public void getMethodDemo_3() throws Exception {
        Class clazz = Class.forName("com.hw.bean.Person");
        // 获取空参的一般方法
        Method method = clazz.getMethod("show", null);
        Object o = clazz.newInstance();
        method.invoke(o, null);
        System.out.println(method);
    }

    /**
     * 方法无参 方式二：使用有参构造器  method.invoke(o, null)
     */
    @Test
    public void getMethodDemo_4() throws Exception {
        Class clazz = Class.forName("com.hw.bean.Person");
        // 获取空参的一般方法
        Method method = clazz.getMethod("show", null);
        // 获取带参构造器
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Object o = constructor.newInstance("小明", 12);
        method.invoke(o, null);
        System.out.println(method);
    }


    /**
     * 方法有参
     */
    @Test
    public void getMethodDemo_5() throws Exception {
        Class clazz = Class.forName("com.hw.bean.Person");
        Method method = clazz.getMethod("paramMethod", String.class, int.class);
        // 获取带参构造器
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Object o = constructor.newInstance("小明", 12);
        method.invoke(o, "张三", 18);
        System.out.println(method);
    }


}
