package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topKFrequentWords {

    public static void main(String[] args) {
        String[] words =  {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        topKFrequent(words, k);
    }


    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        List<String> answer = new ArrayList<>();

        //Add All Words to Map
        for(String word : words) {
            System.out.println(word);
            map.put(word, map.getOrDefault(word, 0)+ 1);
        }


        return answer;

    }




}
