package StudentManagemernt;

import java.io.*;


public class Student implements Serializable {
    private int rollNumber;
    private String name;
    private int age;
    private double mark;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Student(int rollNumber, String name, int age, double mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "RollNumber= " + rollNumber +
                ", Name= '" + name + '\'' +
                ", Age= " + age +
                ", Mark= " + mark +
                '}';
    }
}
