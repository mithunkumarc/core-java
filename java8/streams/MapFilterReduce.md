#### using map filter and reduce to find sum

            package com.test;

            import java.util.Arrays;
            import java.util.List;

            public class MapFilterReduce {
              public static void main(String[] args) {
                List<StockInfo> stocks = 
                    Arrays.asList(new StockInfo(500),new StockInfo(400),new StockInfo(300),new StockInfo(200),new StockInfo(100));		
                var totalSum = stocks.stream().filter(stock -> stock.getPrice() > 200) //select stock with price > 200
                        .map(stock -> stock.getPrice())	//object list to price list
                        .reduce((s1,s2) -> s1 + s2)
                        .get();
                System.out.println("total of last three stocks : " + totalSum);
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
