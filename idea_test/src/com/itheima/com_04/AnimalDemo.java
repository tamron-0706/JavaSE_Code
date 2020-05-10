package com.itheima.com_04;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("¼Ó·Æ");
        a.setAge(2);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("-------");

        a = new Cat("¼Ó·Æ",3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
    }
}
