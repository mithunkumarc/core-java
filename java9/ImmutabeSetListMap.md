Oracle Corp has introduced some convenient factory methods to create Immutable List, Set, Map and Map.Entry objects. 

            package com.test;

            import java.util.*;
            import java.util.stream.*;

            import java.util.Arrays;
            import java.util.List;
            import java.util.stream.Collector;
            import java.util.stream.Collectors;

            public class MapFilterReduce {

                public static void main(String[] args) {
                  //Factory Methods for Immutable List, Set, Map and Map.Entry
                  List<Integer> list = List.of(1,2,3,4,5);
                  //list : class java.util.ImmutableCollections$ListN
                  //list.add(5);//not supported
                  Set<String> set = Set.of("one","two","three","four","five");
                  Map<Integer,String> map = Map.of(1,"one",2,"two",3,"three");
                  for(var m : map.entrySet()) {
                    System.out.println("key : "+ m.getKey() +", value : "+ m.getValue());
                  }


                }             
            }

            output : 
            key : 1, value : one
            key : 2, value : two
            key : 3, value : three

