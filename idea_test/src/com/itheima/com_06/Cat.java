package com.itheima.com_06;

public class Cat extends Animal implements Jumpping{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Ã¨³ÔÓã");
    }

    @Override
    public void jump() {
        System.out.println("Ã¨¿ÉÒÔÌø¸ß");
    }
}
