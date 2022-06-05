package com.mira;

import java.util.*;
import java.util.stream.Collectors;  
class Product {  
    int id;  
    String name;  
   float price;  
    Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    } 
  float getprice()
    {
    	return price;
    }

  public String toString()
  {
	  return id+" "+name+" "+price;
  }
}
public class JavaStreamExample
{
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>(); 
        
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f)); 
        
        List<Product> prize=productsList.stream()  //stream elements
                    .filter(p ->p.price> 30000).collect(Collectors.toList())  ; // filtering price  
                    //.map(pm ->pm.price)          // fetching price  
                   // .forEach(System.out::println);  // iterating price  */
        System.out.println(prize);
       
       
    }  
}  