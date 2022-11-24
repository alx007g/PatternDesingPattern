/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexander.gramajo.patterndesingbuilder;

/**
 *
 * @author grama
 */
public class Person {

    private String name;
    private String surname;
    private Integer age;
    private String gender;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    private Person(PersonBuilder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public static class PersonBuilder {

        private String name;
        private String surname;
        private Integer age;
        private String gender;
        
        public PersonBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        
        public PersonBuilder age(Integer age){
            this.age = age;
            return this;
        }
        
        public PersonBuilder gender(String gender){
            this.gender = gender;
            return this;
        }
        
        public Person build(){
            Person person = new Person(this);
            return person;
        }
        
    }
}
