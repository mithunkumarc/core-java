create data.txt in current project

> reader

              package com.example;

              import java.io.BufferedReader;
              import java.io.IOException;
              import java.nio.file.Files;
              import java.nio.file.Paths;

              public class Test {
                public static void main(String[] args) throws IOException{
                  try(BufferedReader br = Files.newBufferedReader(Paths.get("","data.txt"))){
                    br.lines().forEach(System.out::println);
                    br.close();
                  }catch(Exception e) {
                    System.out.println(e.getMessage());
                  }
                }
              }


              // Paths.get("","data.txt") : "" : current path
> write : 

              package com.example;

              import java.io.BufferedWriter;
              import java.io.IOException;
              import java.nio.file.Files;
              import java.nio.file.Paths;

              public class Test {
                public static void main(String[] args) throws IOException{
                  try(BufferedWriter bw = Files.newBufferedWriter((Paths.get("","data.txt")))){			
                    bw.write("publisher\n");
                    bw.write("subscriber");
                    bw.close();
                  }catch(Exception e) {
                    System.out.println(e.getMessage());
                  }
                }
              }
