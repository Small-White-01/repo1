package jmore1;

public class Person1 {
    private String name;
    private int age;

    public Person1(){

    }

    public Person1(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }


    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
}
