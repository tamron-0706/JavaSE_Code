package com.itheima.com_06;
//≤‚ ‘¿‡
public class AnimalDemo {
    public static void main(String[] args) {

        Jumpping j = new Cat();
        j.jump();

        System.out.println("-------");

        Animal a = new Cat("º”∑∆",3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("-------");

        Cat c = new Cat();
        c.setName("”¢∂Ã");
        c.setAge(2);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        c.jump();
    }
}
