package com.zipcodewilmington;

import sun.security.util.ArrayUtil;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int i = 0;
        while (i < personArray.length) {
            result += String.valueOf(personArray[i]);
            i++;
        }
        System.out.println(result);
        return result;
    }



    public String forLoop() {
        String result = "";
        for (int i = 0; i < personArray.length; i++) {
            result += String.valueOf(personArray[i]);
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for (Person person : personArray)
            result += String.valueOf(person);
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
