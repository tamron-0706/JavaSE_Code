package com.itheima.com_04;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("�ӷ�");
        a.setAge(2);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("-------");

        a = new Cat("�ӷ�",3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
    }
}
