package com.itheima.com_02;

public class AnimalDemo {
    public static void main(String[] args) {
       AnimalOperator ao = new AnimalOperator();

       //��̬�����뿴��ߣ����п��ұ�
       Cat c = new Cat();
       ao.useAnimal(c);

       Dog d = new Dog();
       ao.useAnimal(d);
    }

}
