package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {

        //create a list and print even number and filter all even number from list

         List<Integer> list1 = List.of(2, 3, 4, 5, 6, 44, 55); // list.of(is are Immutable these are not changed it)
//        list1.add(21);
         List<Integer> list2 = new ArrayList<>(); // Basically these are old version to create a list
         list2.add(22);
         list2.add(21);
         list2.add(23);
         list2.add(24);
         list2.add(20);

        List<Integer> list3 = Arrays.asList(12, 11, 14, 15, 144); // Arrays.asList also UnModified means Immutable


        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        // List1 collect the Even Number and Add to another list
        // without Stream
        List<Integer> listEven = new ArrayList<>();

        for (Integer i : list1) {
            if (i %2 == 0) {
                listEven.add(i);
            }
        }
        System.out.println(listEven);

        List<Integer> listAnother = new ArrayList<>();
        for (Integer e : list2) {
            if(e % 2 == 0) {
                listAnother.add(e);
            }
        }
        System.out.println(listAnother);

        List<Integer> listThird = new ArrayList<>();
        for (Integer i : list3) {
            if (i%2 == 0) {
                listThird.add(i);
            }
        }
        System.out.println(listThird);

        // using Stream API

//        Stream<Integer> stream = list2.stream();
//        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(newList);

//        Stream<Integer> stream = list2.stream();
//         List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);

         Stream<Integer> stream = list1.stream();
         List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

//         Stream<Integer> stream1 = list3.stream();
//         List<Integer> collect1 = stream1.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect1);

         List<Integer> collect1 = list3.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect1);

         Object collect2 = list1.stream().filter(i -> i > 3).collect(Collectors.toList());
        System.out.println(collect2);

         List<Integer> collect3 = list2.stream().filter(integer -> integer > 2).collect(Collectors.toList());
        System.out.println(collect3);
         List<Integer> collect4 = list3.stream().filter(integer -> integer > 3).collect(Collectors.toList());
        System.out.println(collect4);


    }
}
