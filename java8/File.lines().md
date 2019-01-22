#### read file using File.lines()

          package oops;
          import java.io.IOException;
          import java.nio.file.Files;
          import java.nio.file.Paths;
          import java.util.stream.Stream;

          public class TestEncapsulation {
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
