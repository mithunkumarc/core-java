#### sequential : 
        

        package com.test;

        import java.util.Arrays;
        import java.util.List;

        public class MapFilterReduce {
          public static int reduce_task(int pre,int next) {
            System.out.println("running Thread : "+ Thread.currentThread());
            return pre + next;
          }


          public static void main(String[] args) {


            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);		
            var result = numbers.stream()
                .reduce((pre,next) -> reduce_task(pre,next))
                .get();
            System.out.println("sum of all nubmers : "+ result);
          }
        }
        
        output : 
        running Thread : Thread[main,5,main]
        running Thread : Thread[main,5,main]
        running Thread : Thread[main,5,main]
        running Thread : Thread[main,5,main]
        running Thread : Thread[main,5,main]
        running Thread : Thread[main,5,main]
        running Thread : Thread[main,5,main]
        running Thread : Thread[main,5,main]
        running Thread : Thread[main,5,main]
        sum of all nubmers : 55

#### parallel : 

            package com.test;

            import java.util.Arrays;
            import java.util.List;

            public class MapFilterReduce {
              public static int reduce_task(int pre,int next) {
                System.out.println("running Thread : "+ Thread.currentThread());
                return pre + next;
              }


              public static void main(String[] args) {


                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);		
                var result = numbers.stream()
                    .parallel()
                    .reduce((pre,next) -> reduce_task(pre,next))
                    .get();
                System.out.println("sum of all nubmers : "+ result);
              }
            }


            output : 

            running Thread : Thread[main,5,main]
            running Thread : Thread[ForkJoinPool.commonPool-worker-7,5,main]
            running Thread : Thread[ForkJoinPool.commonPool-worker-5,5,main]
            running Thread : Thread[ForkJoinPool.commonPool-worker-5,5,main]
            running Thread : Thread[ForkJoinPool.commonPool-worker-5,5,main]
            running Thread : Thread[ForkJoinPool.commonPool-worker-3,5,main]
            running Thread : Thread[ForkJoinPool.commonPool-worker-3,5,main]
            running Thread : Thread[ForkJoinPool.commonPool-worker-3,5,main]
            running Thread : Thread[ForkJoinPool.commonPool-worker-3,5,main]
            sum of all nubmers : 55
