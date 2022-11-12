package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HashTagCounter {
    public static String[] HashTagCounterFUNC(ArrayList<String> input){
        Map<String, Integer> hashtagsAndCount = new HashMap<>();
        for (int i = 0; i < input.size(); i++){
            String text = Arrays
                    .stream(input.get(i).split("\\s+"))
                    .distinct()
                    .collect(Collectors.joining(" "));
            Pattern pattern = Pattern.compile("\\#[A-Za-z]+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                if (!hashtagsAndCount.containsKey(text.substring(matcher.start(), matcher.end()))){
                    hashtagsAndCount.put(text.substring(matcher.start(), matcher.end()), 1);
                } else {
                    hashtagsAndCount.put(text.substring(matcher.start(), matcher.end()), hashtagsAndCount.get(text.substring(matcher.start(), matcher.end())) + 1);
                }
            }
        }
        String[] arr = new String[hashtagsAndCount.size()];
        int size = hashtagsAndCount.size();
        for (int i = 0; i < size && i < 5; i++){
            int max = -1;
            String key = "";
            for (Map.Entry<String, Integer> pair: hashtagsAndCount.entrySet()) {
                if (pair.getValue() > max){
                    max = pair.getValue();
                    key = pair.getKey();
                }
            }
            arr[i] = "#" + (i+1) + ". " + key + " = " + max;
            hashtagsAndCount.remove(key);
        }
        return arr;
    }
}
