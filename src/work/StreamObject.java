package work;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Stream API - collection process
       // collection / group of object
      // Stream are work on also Array
     //stream are lost most of the number to get a Methods
    // 1) Empty Stream create

         Stream<Object> emptyStream = Stream.empty();
//         emptyStream.forEach(e->{ // 1 ways
//             System.out.println(e);
//         });
//        2 ways to create a stream with Methods
        String names[] = {"Shimanshu", "Abhishek", "Ankit", "Sandeep"};
         Stream<String> names1 = Stream.of(names);
        names1.forEach(e->{
            System.out.println(e);
        });


    }
}
