package com.sbt.javaschool.examples.lambdas.dishes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {



        List<Dish> menu = Arrays.asList(
                new Dish(700, "FISH","prawns", false),
                new Dish(400, "FISH","salmon", false),
                new Dish(350, "OTHER","french fries", true),
                new Dish(220, "OTHER","rice", true),
                new Dish(200, "OTHER","season fruit", true),
                new Dish(850, "OTHER","pizza", false),
                new Dish(900, "MEAT","pork", false),
                new Dish(1100, "MEAT","beef", false),
                new Dish(600, "MEAT","chicken", false)
        );


        /*
        List<String> lowCaloriesDishesGroups = menu.stream()
                .filter(d->d.getCalories() < 500)
                .map(Dish::getType)
                .distinct()
                .collect(toList());

        System.out.println(lowCaloriesDishesGroups);
        */

        List<String> words = Arrays.asList("Hello World");

        List<String> newWords = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

        System.out.println(words);
        System.out.println(newWords);


        IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));

        System.out.println(menu);

    }

}
