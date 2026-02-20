package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    List<Integer> result1 = numbers.stream()
            .filter(n-> n % 2 == 0)
            .collect(Collectors.toList());

    List<String> names = Arrays.asList("Aya","Bouchra","Sara","Dina","Amal","Farah","Gigi","Donia");
    List<String> result2 = names.stream()
            .filter(n->n.startsWith("A"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());

    List<String> words = Arrays.asList("java","stream","code","collection");
    Long count = words.stream()
            .filter(w->w.length()>5)
            .count();

    List<Integer> num = Arrays.asList(5,1,9,3,7);
    List<Integer> result4 = num.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());





}
