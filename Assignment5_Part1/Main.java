package Assignment5_Part1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//      Task1:
        System.out.println("Task1:");
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("orange");
        wordList.add("grape");
        wordList.add("kiwi");
        System.out.println(wordList);

        wordList.add(0,"pear");
        wordList.remove(2);
        System.out.println("wordList.contains(\"orange\"): " + wordList.contains("orange"));
        System.out.println(wordList);

//      Task2:
        System.out.println("\nTask2:");
        Pair<Integer,String> p1 = new Pair<>(1, "english");
        System.out.println(p1);

        Pair<Double, Double> p2 = new Pair<>(8.8, 9.9);
        System.out.println(p2);

//      Task3:
        System.out.println("\nTask3:");
        ArrayList<Pair> array = new ArrayList<>();
        array.add(p1);
        array.add(p2);
        System.out.println(array);

//      Task4:
        System.out.println("\nTask4:");
        showElements(array);
        System.out.println();
        showElements(wordList);
    }

    public static <T> void showElements(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}
