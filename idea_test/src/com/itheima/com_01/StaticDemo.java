package com.itheima.com_01;

public class StaticDemo {
    public static void main(String[] args) {

        Student.university = "º¼µç";

        Student s1 = new Student();
        s1.name = "Ëï·ÉÁú";
        s1.age = 18;
//        s1.university = "º¼µç";
        s1.show();

        Student s2 = new Student();
        s2.name = "ÍõÒïÁú";
        s2.age = 19;
//        s2.university = "º¼µç";
        s2.show();
    }
}
