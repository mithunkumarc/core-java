#### hashmap does't allow concurrent modification while iterating


        package oops;

        import java.util.Iterator;
        import java.util.concurrent.ConcurrentHashMap;


        public class Test {
          public static void main(String[] args) {
            ConcurrentHashMap< Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
            concurrentHashMap.put(1, "one");
            concurrentHashMap.put(2, "two");//replacing with new value while iterating
            concurrentHashMap.put(3, "three");
            concurrentHashMap.put(4, "four");

            Iterator<Integer> iterator = concurrentHashMap.keySet().iterator();
            while(iterator.hasNext()) {
              int key = iterator.next();
              if(key == 2) {
                concurrentHashMap.put(key,"new value");
              }	
            }
            System.out.println(concurrentHashMap.get(2));
          }
        }

        output : new value
