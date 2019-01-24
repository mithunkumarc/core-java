#### Lists maintain order but parallel streams process lists quickly but doesn't maintain order 
        eg : 

              package com.test;

              import java.util.Arrays;
              import java.util.List;

              public class MapFilterReduce {
                public static void main(String[] args) {
                  List<Integer> stocks = 
                      Arrays.asList(100,200,300,400,500,600,700,800,900,1000);		
                  stocks.stream()
                      .parallel()
                      .forEach(System.out::println);//similar to data -> Syso(data)		
                }
              }


              output ; 
              700
              600
              900
              1000
              800
              300
              200
              500
              100
              400

#### to get ordered output from parallel stream use , forEachOrder() at the end

              package com.test;

              import java.util.Arrays;
              import java.util.List;

              public class MapFilterReduce {
                public static void main(String[] args) {
                  List<Integer> stocks = 
                      Arrays.asList(100,200,300,400,500,600,700,800,900,1000);		
                  stocks.stream()
                      .parallel()
                      .forEachOrdered(System.out::println);//similar to data -> Syso(data)		
                }
              }
              
              // forEachOrdered will wait till stream completes
              output : 
              100
              200
              300
              400
              500
              600
              700
              800
              900
              1000
