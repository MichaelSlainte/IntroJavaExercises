/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author engmi
 */
public class Test {

    private String name;
    private int age;

    public Test() {
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Test(int age) {
        this.age = age;
    }

    public Test(String name) {
        this.name = name;
    }

    public void displayMe() {
        System.out.println(name);
        System.out.println(age);
        System.out.println();
    }

}
