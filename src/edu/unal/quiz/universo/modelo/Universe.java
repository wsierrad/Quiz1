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
public class Universe {
    
    private ArrayList<Person> people;
    
    public Universe(){
        people = new ArrayList();
    }
    public void addPerson(String name, String gender){
        Person person = new Person(name,gender);
        people.add(person);
    }
    
    public int getNumPeopleWithDau(){
        int count=0;
        for(Person p: people){
            if (p.getChildren()!=null){
                for (Person c: p.getChildren()){
                    if(c.getGender().equals("female"))
                        count++;
                }
            }
                       
        }
        return count;
    }
    
    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }    
}
