similar to promises. 

CompletableFuture is used for asynchronous programming in Java. 

Asynchronous programming is a means of writing non-blocking code by running a task on a separate thread than the 
main application thread and notifying the main thread about its progress, completion or failure.

This way, your main thread does not block/wait for the completion of the task and it can execute other tasks in parallel.

 > CompletableFuture Example : separate thread to run task
  
        package oops;

        import java.util.concurrent.CompletableFuture;

        public class Test {
          public static void main(String[] args) {
            System.out.println("In start of main "+Thread.currentThread());
            startAsyncTask();
          }

          private static void startAsyncTask() {
            CompletableFuture.runAsync(new Runnable(){
              public void run() {
                System.out.println("running little task" + Thread.currentThread());
              }
            });
          }	
        }

        //output : 
        //	In start of main Thread[main,5,main]
        //	running little taskThread[ForkJoinPool.commonPool-worker-3,5,main]


#### same example as above but with lambda

          package oops;
          import java.util.concurrent.CompletableFuture;

          public class Test {
            public static void main(String[] args) {
              System.out.println("In start of main "+Thread.currentThread());
              startAsyncTask();
            }

            private static void startAsyncTask() {
              CompletableFuture.runAsync(() -> 
                  System.out.println("running little task" + Thread.currentThread())
              );
            }
          }

          //output : 
          //	In start of main Thread[main,5,main]
          //	running little taskThread[ForkJoinPool.commonPool-worker-3,5,main]


---

#### CompletableFuture.thenAccept() : 

            package oops;

            import java.util.concurrent.CompletableFuture;

            public class Test {
              public static void main(String[] args) {
                //avoid startAsyncTask(2).get() or getNow() which are blocking
                startAsyncTask(2).thenAccept(result -> System.out.println(result));
                ////when main hits this line, if the task is completed, then the execution of the
                //lambda runs in the main thread. However, when main hits this line, if the task is not
                //completed, then the lambda may run into a different thread. Non-blocking.
                //
              }

              private static CompletableFuture<Integer> startAsyncTask(int number){
                return CompletableFuture.supplyAsync(() -> {
                  if(Math.random() > 0.75) {
                    System.out.println("taking a slow run this time");
                    try{
                      Thread.sleep(1000);
                    }catch(InterruptedException e) {}
                  }
                  System.out.println(Thread.currentThread());
                  return number*2;
                });
              }

            }

            output : 
            4 
            
            
#### if you call thenAccept after CompletableFuture completes, thenAccept runs in main thread.


        import java.util.concurrent.CompletableFuture;

        public class Test {
          public static void main(String[] args) {
            //avoid startAsyncTask(2).get() or getNow() which are blocking
            var cf = startAsyncTask(2);
            try{
              Thread.sleep(1000);
            }catch(InterruptedException e) {}
            //task already completed so , lambda runs in main thread
            cf.thenAccept(result -> System.out.println(result + " , Thread : "+ Thread.currentThread()));
          }

          private static CompletableFuture<Integer> startAsyncTask(int number){
            return CompletableFuture.supplyAsync(() -> {
              if(Math.random() > 0.75) {
                System.out.println("taking a slow run this time");
                try{
                  Thread.sleep(1000);
                }catch(InterruptedException e) {}
              }
              System.out.println(Thread.currentThread());
              return number*2;
            });
          }

        }


        ouput : 
        taking a slow run this time // don't bother
        Thread[ForkJoinPool.commonPool-worker-3,5,main]
        4 , Thread : Thread[main,5,main]
