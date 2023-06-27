package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
     //Example 1

        List<Product> productList=new ArrayList<>();
        productList.add(new Product(123456l,"Martin Eden", "book",9.5));
        productList.add(new Product(123457l,"Puzzle","toys", 31.5));
        productList.add(new Product(123456l,"Sherloc Holmes", "book", 72.0));
        productList.add(new Product(123457l,"Barbie","toys", 81.0));

     List<Product> list=   productList.stream().filter(product ->product.getCategory().equalsIgnoreCase("book")).filter(product -> product.getPrice()>50).map(product -> new Product(product.getId(),product.getName(),product.getCategory(),product.getPrice()*0.8)).collect(Collectors.toList());
        System.out.println(list); }
}