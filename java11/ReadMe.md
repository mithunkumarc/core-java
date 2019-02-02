var not a best option in case of using parent type to subclass objects : 
type of var is always derived type not parent type   

          import java.util.ArrayList;
          import java.util.LinkedList;
          import java.util.List;

          public class Test {
            public static void main(String[] args) throws IOException{
            List<String> old = new ArrayList();
            var _new = new ArrayList<String>();
            System.out.println(old.getClass());
            System.out.println(_new.getClass());
            old = new LinkedList<String>();
            //_new = new LinkedList<String>();//Error : 
            }
          }


### String methods

#### isBlank() : length > 0 but space
          
#### isEmpty() : length == 0
          
#### repeat(int) : repeat strings
          
#### lines() : 
          
          String str = "first line\nsecond line\nthird line";
	str.lines().forEach(System.out::println);         //print line by line
          // --or-- collect to list
          List<String> lines =str.lines().collect(Collectors.toList());
	lines.stream().forEach(System.out::println);
          
          
          
#### strip() :           
          
          strip() : same as trim() with unicode aware
          String str = "    vision    ";
          System.out.println(str);
          System.out.println(str.strip());
          System.out.println(str.stripLeading());
          System.out.println(str.stripTrailing());
          //check white space using character class
          System.out.println(Character.isWhitespace(' '));          
          
---


#### local variable syntax for lambda expression

                    package com.example;

                    public class TestReflection {
                              public static void main(String[] args) {
                                        //Addition addition = (a,b) -> a + b; without var
                                        Addition addition = (var a, var b) -> a + b;
                                        //Addition addition1 = (var a, int b) -> a + b;// var ,int cannot mix type
                                        System.out.println(addition.add(3,4));

                              }
                    }
                    interface Addition{
                              public int add(int a,int b);
                    }
                    
                    
