#### output of stream can be collected to list

          package com.test;

          import java.util.Arrays;
          import java.util.List;
          import java.util.stream.Collector;
          import java.util.stream.Collectors;

          public class MapFilterReduce {
            public static int reduce_task(int pre,int next) {
              System.out.println("running Thread : "+ Thread.currentThread());
              return pre + next;
            }


            public static void main(String[] args) {		
              List<String> names = Arrays.asList("Jack", "Jane", "Stu", "Bob");
              List<String> modified_name = names.stream().parallel()
              .map(name -> "Hello : "+ name)
              .collect(Collectors.toList());
              System.out.println(modified_name.toString());
            }
          }
          
          
          // Collectors.toList() : parallel stream back to ordered output : working for small set of data : test 
          //output : [Hello : Jack, Hello : Jane, Hello : Stu, Hello : Bob]
