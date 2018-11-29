import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

/**
 * @Description 5、获取Class中的字段
 * @Author Administrator
 * @Date 2018/11/30
 */
public class ReflectDemo3 {

    /**
     * 获取字节码文件的字段
     */
    @Test
    public void getFieldDemo() throws Exception {

        Class clazz = Class.forName("com.hw.bean.Person");

        Field field = // clazz.getField("name");
                clazz.getDeclaredField("name");
        // 对私有字段的访问取消权限检查。暴力访问
        field.setAccessible(true);
        Object instance = clazz.newInstance();
        // 对字段赋值
        field.set(instance, "张四");
        Object name = field.get(instance);
        System.out.println(name);
    }
}
