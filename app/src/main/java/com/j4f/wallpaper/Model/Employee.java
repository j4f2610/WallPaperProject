package com.j4f.wallpaper.Model;

/**
 * Created by pham on 8/6/2015.
 */
public class Employee {

    private String name;
    private int age;
    private int salary;
    private boolean gender;
    private float rating;

    public Employee(String name, int age, int salary, boolean gender, float rate) {
        this.age = age;
        this.name = name;
        this.rating = rate;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isGender() {
        return gender;
    }

    public float getRating() {
        return rating;
    }
}
