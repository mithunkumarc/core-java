Filter : condition on stream
        
        package com.test;

        import java.util.Arrays;
        import java.util.List;

        public class MapFilterReduce {
          public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);		
            numbers.stream()
                .parallel()
                .filter(number -> number % 2 == 0 )
                .forEach(System.out::println);
          }
        }

        6
        10
        8
        4
        2


Map : applying logic on stream
                package com.test;

                import java.util.Arrays;
                import java.util.List;

                public class MapFilterReduce {
                        public static void main(String[] args) {
                                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);		
                                numbers.stream()
                                                .parallel()
                                                .map(number -> number * 10 )
                                                .forEach(System.out::println);
                        }
                }

                output : 
                
                70
                80
                60
                90
                100
                30
                50
                40
                10
                20
