package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//2) Подсчитать количество искомого слова,
// через map (наполнением значение, где искомое слово будет являться ключом)
public class Task2 {

    public static void main(String[] args) {

        String str = "Happy holidays and a happy new year";
        String[] str2 = str.toLowerCase().split(" ", 0);
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово которое вы ищете: ");
        String searchedWord = scanner.next();
        searchedWord = searchedWord.toLowerCase();
        map.put(searchedWord, 0);
        for (String words : str2) {
            if (map.containsKey(words)) {
                map.put(searchedWord, map.get(searchedWord) + 1);
            }
        }
        for (var entry : map.entrySet()) {
            System.out.println("Количество искомое слово: '" + entry.getKey() + "' равно =  " + entry.getValue());

        }
    }
}
