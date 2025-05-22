/*
 * File : Person.java
 * Deskripssi : person database model
 * Nama : Muhammad Farhan Al Ghifari
 * NIM : 24060123140186
 */

 public class Person {
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
 }