package org.example;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;

//3) Найти пересечения слов в массивах и указать их общее количество.
//Пример:
//mas1= [“qwe”,”asd”,”qwe”,”x”]
//mas2=[“qwe”,”v”]
//Результат:
//qwe=3
public class Task3 {

    public static void main(String[] args) {
        String[] arr1 = {"car", "home", "car", "wine"};
        String[] arr2 = {"car", "ball"};
        Map<String, Integer> myMap = new HashMap<>();
        for (String elem1 : arr1) {
            myMap.put(elem1, 1);
            for (String elem2 : arr2) {
                if (myMap.containsKey(elem2)) {
                    myMap.put(elem2, (myMap.get(elem2) + 1));
                }
            }
            if (myMap.get(elem1) == 1) {
                myMap.remove(elem1);
            }
        }
        for (var entry : myMap.entrySet()) {
            System.out.println("Cлово '" + entry.getKey() + "', " + "пересекается в массивах " + entry.getValue() + " раза");
        }

    }

}

