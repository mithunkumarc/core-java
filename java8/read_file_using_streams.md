#### stream acts only once, later it will be closed
#### sample data.txt file
          content : 
                    first line
                    second line
                    third line




#### read file using File.lines()

          package oops;
          import java.io.IOException;
          import java.nio.file.Files;
          import java.nio.file.Paths;
          import java.util.stream.Stream;

          public class Test {
            public static void main(String[] args) {
              try {
                //paths.get("directory path","file name")
                Stream<String> lines = Files.lines(Paths.get("", "data.txt"));
                //stream can act only once, later it will be closed. 
                //if you uncomment count(), forEach() method will not work
                //System.out.println("number of line : " + lines.count());
                lines.forEach(System.out::println);
              } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }
          }


### File.lines() with try as resource : 


                    package oops;
                    import java.io.IOException;
                    import java.nio.file.Files;
                    import java.nio.file.Paths;
                    import java.util.stream.Stream;

                    public class Test {
                              public static void main(String[] args) {
                                        try(Stream<String> lines = Files.lines(Paths.get("", "data.txt"))) {
                                                  lines.forEach(System.out::println);
                                        } catch (IOException e) {
                                                  // TODO Auto-generated catch block
                                                  e.printStackTrace();
                                        }
                              }
                    }


#### bufferedreader : reading files through stream : try resource

                    package oops;

                    import java.io.BufferedReader;
                    import java.io.IOException;
                    import java.nio.file.Files;
                    import java.nio.file.Paths;

                    public class Test {
                              public static void main(String[] args) {
                                        try(BufferedReader reader = Files.newBufferedReader(Paths.get("","data.txt"))){
                                                  reader.lines().forEach(System.out::println);
                                        }catch(IOException ioe){
                                                  System.out.println(ioe.getMessage());
                                        }
                              }
                    }



#### to write into file

                    try(BufferedWriter writer = Files.newBufferedWriter(Paths.get("","data.txt"))){
                                            //reader.lines().forEach(System.out::println);
                                            writer.append("first line \n");
                                            writer.append("second line");                       
                                            //no need to close streams
                                                  }catch(IOException ioe){
                                            System.out.println(ioe.getMessage());
                                                  }
