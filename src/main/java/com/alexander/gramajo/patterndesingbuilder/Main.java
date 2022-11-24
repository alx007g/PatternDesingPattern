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
public class Main {

   public static void main(String[] args) throws InterruptedException {
        Person person = Person.PersonBuilder("Otto Alexander", "Gramajo de León")
                .age(28)
                .gender("Masculino")
                .build();
        System.out.println(person);
   }
}
