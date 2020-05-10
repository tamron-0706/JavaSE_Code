package com.itheima.com_02;

public class AnimalDemo {
    public static void main(String[] args) {
       AnimalOperator ao = new AnimalOperator();

       //多态，编译看左边，运行看右边
       Cat c = new Cat();
       ao.useAnimal(c);

       Dog d = new Dog();
       ao.useAnimal(d);
    }

}
