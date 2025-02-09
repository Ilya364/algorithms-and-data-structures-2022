package ru.mirea.practice.task5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int toHumanAge() {
        return this.getAge() * 7;
    }

    public String toString() {
        return "dog's age: " + age + "\ndog's name: " + name;
    }
}
