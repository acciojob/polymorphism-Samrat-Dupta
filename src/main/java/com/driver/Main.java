package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(10, 5));
        System.out.println(p.product(4.5, 5.5));
        System.out.println(p.product(5,66,3));
    }
        public static class Product {
            public int product(int x, int y) {
                return x * y;
            }
            public double product(double x, double y){
                return x + y;
            }
            public int product(int x, int y, int z){
                return x * y * z;
            }
        }
}