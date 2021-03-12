package leetcode;

import java.util.*;

public class topKFrequentWords {

    public static void main(String[] args) {
        String[] words =  {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }


    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        List<String> answer = new ArrayList<>();

        //Add All Words to Map
        for(String word : words) {
            //System.out.println(word);
            map.put(word, map.getOrDefault(word, 0)+ 1);
        }

        //Create Comparator Class (sort by frequency then alphabetical order)
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String word1, String word2) {

                //Check Frequency of Words (Sorting Logic)
                int frequency1 = map.get(word1);
                int frequency2 = map.get(word2);
                if(frequency1 == frequency2) {
                    return word2.compareTo(word1);
                }

                return frequency1 - frequency2;
            }
        });
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(entry.getKey());
            if(pq.size() > k) {
                pq.poll();
            }
        }

        //Add elements to list from the Priority Q
        while(!pq.isEmpty()) {
            answer.add(pq.poll());
        }
        Collections.reverse(answer);

        return answer;

    }

}

/*
PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String word1, String word2) {
                int frequency1 = map.get(word1);
                int frequency2 = map.get(word2);

                if(frequency1 == frequency2) {
                    return word2.compareTo(word1);
                }

                return frequency1 - frequency2;
            }
        });

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(entry.getKey());
            if(pq.size() > k) {
                pq.poll();
            }
        }

        List<String> result = new ArrayList<>();

        //Add elements to list from the Priority Q
        while(!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result);

        return result;

 */
