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


String methods like 

          isBlank() : length > 0 but space
          isEmpty() : length == 0
          repeat(int) : repeat strings
