              package com.test;

              import java.util.*;
              import java.util.stream.*;

              import java.util.Arrays;
              import java.util.List;
              import java.util.stream.Collector;
              import java.util.stream.Collectors;

              public class MapFilterReduce {
                public static boolean isEven(int number) {
                    return number % 2 == 0;
                  }                        

                  public static int doubleIt(int number) {
                    return number * 2;
                  }                   

                  public static void doWork(boolean parallel) {
                    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                    Stream<Integer> stream = numbers.stream();

                    if(parallel) stream = stream.parallel();

                    System.out.println(
                      stream.filter(MapFilterReduce::isEven)
                            .mapToInt(MapFilterReduce::doubleIt)
                            .sum());
                  } 

                  public static void main(String[] args) {
                    doWork(false);
                    doWork(true);

                    Timeit.code(() -> doWork(false));//sequential
                    Timeit.code(() -> doWork(true));//parallel
                  }             
              }

              class Timeit {
                public static void code(Runnable block) {
                  long start = System.nanoTime();
                  try {
                    block.run();
                  } finally {
                    long end = System.nanoTime();
                    
                    
source : https://stackoverflow.com/questions/23170832/java-8s-streams-why-parallel-stream-is-slower                    
                    System.out.println("Time taken(s): " + (end - start) / 1.0e9);
                  }
                }
              }

        ouput : 
        Time taken(s): 2.40593E-4 : sequential
        Time taken(s): 0.003211865 : parallel


The first is that solving a problem in parallel always involves performing more actual work than doing it sequentially. 
Overhead is involved in splitting the work among several threads and joining or merging the results. 
Problems like converting short strings to lower-case are small enough that they are in danger of being swamped by the parallel splitting overhead.
