package com.hw.bean;

/**
 * @Description
 * @Author Administrator
 * @Date 2018/11/29
 */
public class Person {

    private String name;
    private int age;


    public void show() {
        System.out.println(name + "... show run ..." + age);
    }

    private void privateMethod() {
        System.out.println("privateMethod run...");
    }

    public void paramMethod(String str, int num) {
        System.out.println("paramMethod run..." + str + ": " + num);
    }

    public static void staticMethod() {
        System.out.println("staticMethod run ... ");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        super();
        System.out.println("person run ...");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("person param run ... name=" + name);
    }
}
