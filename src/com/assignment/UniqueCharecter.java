package com.assignment;
import java.util.HashMap;
import java.util.Map;
public class UniqueCharecter {
    public static void main(String[] args) {
        String str = "hello world hello";
        char firstUnique = findFirstUniqueChar(str);
        System.out.println("First unique character: " + firstUnique);
    }
    public static char findFirstUniqueChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
           charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
  }}

