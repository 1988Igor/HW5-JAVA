package org.example;

import java.util.HashMap;
import java.util.Map;

//1) Подсчитать количество вхождения каждого слова
//Пример:
//Россия идет вперед всей планеты. Планета — это не Россия.
//toLoverCase().
public class Task1 {
    public static void main(String[] args) {

        String str = "Россия идет вперед всей планеты.Планета, это не Россия.";
        String[] str2 = str.toLowerCase().split("[. ]",  0);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String words : str2) {
            if (map.containsKey(words)) {
                map.put(words, map.get(words) + 1);
            } else {
                map.put(words,1);
            }
        }
        System.out.println(map);
    }


}

