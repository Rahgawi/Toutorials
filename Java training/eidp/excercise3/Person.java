package eidp.excercise3;

public class Person {

    private String name;

    protected int age;

    public Person(String name,int age )
    {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return  name + '\'' +
                ", age=" + age +
                '}';
    }














}
