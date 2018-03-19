/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.quiz.universo.modelo;

import java.util.ArrayList;

/**
 *
 * @author willi_000
 */
public class Person {
    private String gender;
    private String name;
    private Person[] parents;
    private ArrayList<Person> children;

    public Person(String name, String gender) {
        this.gender = gender;
        this.name = name;
        this.parents = new Person[2];
        this.children = new ArrayList();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person[] getParents() {
        return parents;
    }

    public void setParents(Person[] parents) {
        this.parents = parents;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }    
}
