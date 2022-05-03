package org.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        names
                .stream().forEach(System.out::println);
    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
       return numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {

        return Arrays.stream(numbers)
                .map(n -> n *= 2)
                .toArray();
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        return Arrays.stream(input.split("")).map(String::toUpperCase).toList();
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
       return list.stream()
               .filter(a -> a.startsWith(letter))
               .map(String::toUpperCase)
               .sorted().collect(Collectors.toList());
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        return words.stream()
                .filter(w -> w.toCharArray().length < maxLength)
                .filter(w -> w.startsWith(firstLetter))
                .toList();
    }
}