package com.itheima.com_01;

public class StaticDemo {
    public static void main(String[] args) {

        Student.university = "����";

        Student s1 = new Student();
        s1.name = "�����";
        s1.age = 18;
//        s1.university = "����";
        s1.show();

        Student s2 = new Student();
        s2.name = "������";
        s2.age = 19;
//        s2.university = "����";
        s2.show();
    }
}
