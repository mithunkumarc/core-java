streams can be processed as sequential or parallel

#### sequential : 

          package com.test;

          import java.util.Arrays;
          import java.util.List;

          public class MapFilterReduce {
            public static void main(String[] args) {
              List<StockInfo> stocks = 
                  Arrays.asList(new StockInfo(100),new StockInfo(200),new StockInfo(300),new StockInfo(400),new StockInfo(500));		
              stocks.stream()
                    .map(stock -> stock.getPrice())	//object list to price list
                    .forEach(System.out::println);


            }
          }
          class StockInfo{
            private int price;
            public StockInfo(int price) {
              this.price = price;
            }
            public int getPrice() {
              return this.price;
            }
            public void setPrice(int price) {
              this.price = price;
            }
          }
          
          output : 
          100
          200
          300
          400
          500


---

#### parallelstream : 


              package com.test;

              import java.util.Arrays;
              import java.util.List;

              public class MapFilterReduce {
                public static void main(String[] args) {
                  List<StockInfo> stocks = 
                      Arrays.asList(new StockInfo(100),new StockInfo(200),new StockInfo(300),new StockInfo(400),new StockInfo(500));		
                  stocks.parallelStream()
                        .map(stock -> stock.getPrice())	//object list to price list
                        .forEach(System.out::println);


                }
              }
              class StockInfo{
                private int price;
                public StockInfo(int price) {
                  this.price = price;
                }
                public int getPrice() {
                  return this.price;
                }
                public void setPrice(int price) {
                  this.price = price;
                }
              }

              // output : 
              300
              500
              400
              200
              100


                or 
                
                stocks.stream()
                      .parallel()
                      .map(stock -> stock.getPrice())	//object list to price list
                      .forEach(System.out::println);
                      
                      
---                      

parallel stream uses forjoin thread : 

          package com.test;

          import java.util.Arrays;
          import java.util.List;



          public class MapFilterReduce {

            public static int helperMap(StockInfo stock) {
              System.out.println("thread of parallel stream : " + Thread.currentThread());
              return stock.getPrice();
            }



            public static void main(String[] args) {
              List<StockInfo> stocks = 
                  Arrays.asList(new StockInfo(100),new StockInfo(200),new StockInfo(300),new StockInfo(400),new StockInfo(500));		
              stocks.stream()
                  .parallel()
                    .map(stock -> helperMap(stock))	//object list to price list
                    .forEach(System.out::println);


            }
          }
          class StockInfo{
            private int price;
            public StockInfo(int price) {
              this.price = price;
            }
            public int getPrice() {
              return this.price;
            }
            public void setPrice(int price) {
              this.price = price;
            }
          }
          
          
          output : main thread also participates in parallel stream
          thread of parallel stream : Thread[main,5,main]
          300
          thread of parallel stream : Thread[ForkJoinPool.commonPool-worker-3,5,main]
          thread of parallel stream : Thread[main,5,main]
          200
          thread of parallel stream : Thread[ForkJoinPool.commonPool-worker-7,5,main]
          100
          thread of parallel stream : Thread[ForkJoinPool.commonPool-worker-7,5,main]
          400
          500
