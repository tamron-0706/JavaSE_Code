package com.itheima.com_06;

public class Dog extends Animal implements Jumpping{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("���Թ�ͷ");
    }

    @Override
    public void jump() {
        System.out.println("����������");
    }
}
