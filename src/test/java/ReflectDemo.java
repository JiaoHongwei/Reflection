import com.hw.bean.Person;

import org.junit.jupiter.api.Test;

/**
 * @Description 获取Class对象的三种方式
 * @Author Administrator
 * @Date 2018/11/30
 */
public class ReflectDemo {

    /**
     * 获取Class对象的三种方式
     * 方式一：Object类中的getClass()方法，必须要明确具体的类，并且要创建对象，麻烦。
     */
    @Test
    public void getClassObject_1() {
        Person person = new Person();
        Class clazz = person.getClass();

        Person person1 = new Person();
        Class clazz1 = person1.getClass();

        System.out.println(clazz == clazz1);
    }

    /**
     * 方式二：通过对象静态属性 .class来获取对应的Class对象
     */
    @Test
    public void getClassObject_2() {
        Class clazz = Person.class;
    }


    /**
     * 方式三：只要通过给定类的字符串名称就可以获取该类，更为拓展，forName
     */
    @Test
    public void getClassObject_3() throws ClassNotFoundException {
        String className = "com.hw.bean.Person";
        Class clazz = Class.forName(className);
        System.out.println(clazz);
    }
}
