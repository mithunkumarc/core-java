functioan interface example : sam : single abstract method in an interface

        package test;

        public class Test {
            public static void main(String[] args) {
                Math math = number -> number * number;             
                System.out.println(math.accept(5));
            }
        }

        interface Math{
            public int accept(int number);
        }


------

Runnable is also functional interface

        package test;

        public class Test {
            public static void main(String[] args) {        
                Runnable runnable = () -> { System.out.println("My runnable");
                                            System.out.println(Thread.currentThread().toString());
                                            };  
                Thread t = new Thread(runnable);
                System.out.println("outer thread "+ Thread.currentThread().toString());
                t.start();    
            }
        }
        //outer thread Thread[main,5,main]
        //My runnable
        //Thread[Thread-0,5,main]




