/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Town;

import java.util.Scanner;

/**
 *
 * @author Hello VIỆT
 */
public class Person {
    private static final Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private String job;
    private String passport;

    public Person() {
    }
    
    public Person(String name, int age, String job, String passport) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.passport = passport;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", job=" + job + ", passport=" + passport + '}';
    }
    public void input() {
        System.out.println("nhap ten");
        this.setName(sc.nextLine());
        System.out.println("nhap con viec");
        this.setJob(sc.nextLine());
        System.out.println("nhap tuoi"); 
        this.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("nhap CMND");
        this.setPassport(sc.nextLine());
       
    }
}
