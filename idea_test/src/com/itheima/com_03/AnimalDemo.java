package com.itheima.com_03;

public class AnimalDemo {
    public static void main(String[] args) {

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(2);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲",3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("------------");

        Animal d = new Dog();
        d.setName("大黄");
        d.setAge(4);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();

        d = new Dog("大黄",3);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
    }
}
