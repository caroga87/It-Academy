package n2exercici4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> list = Arrays.asList("computer", "coffe", 2564,"elefant", "Water", 2, "school","timetable", 22541254, "name", "pencil", 0, "array");

        System.out.println("Ordered alphabetically by the first character:");
        list.sort(Comparator.comparing(objecte -> objecte.toString().charAt(0)));
        list.forEach(System.out::println);
        System.out.println();

       
        System.out.println("First ordered alphabetically by the first character the words containing 'e', then the rest:");
        
        list.stream().filter (objecte -> objecte.toString().toLowerCase().charAt(0)== 'e')
        				.sorted(Comparator.comparing(objecte -> objecte.toString().toLowerCase().charAt(0)))
        					.forEach(System.out::println);
        
        list.stream().filter (objecte -> objecte.toString().toLowerCase().charAt(0)!= 'e')
        				.sorted(Comparator.comparing(objecte -> objecte.toString().toLowerCase().charAt(0)))
        					.forEach(System.out::println);
       
        System.out.println();
       
        System.out.println("Change the words that conatin an 'a' and replaced it with '4':");
        list.stream().map(objecte -> (objecte.toString().replace("a","4"))).forEach(System.out::println);
        System.out.println();

       
        System.out.println("Only numbers:");
        list.stream().filter(objecte -> objecte.toString().matches("[0-9]*")).forEach(System.out::println);
    }
}