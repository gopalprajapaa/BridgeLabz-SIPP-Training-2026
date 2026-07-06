import java.util.*;

class Product<T>{

    T category;
    String name;
    double price;

    Product(T category,String name,double price){

        this.category=category;
        this.name=name;
        this.price=price;

    }

    public String toString(){

        return name+" "+price;

    }
}

class Discount{

    public static <T extends Product<?>> void applyDiscount(T product,double percentage){

        product.price=product.price-(product.price*percentage/100);

    }

}

public class MarketPlace{

    public static void main(String[] args){

        Product<String> book=new Product<>("Book","Java",1000);

        Discount.applyDiscount(book,20);

        System.out.println(book);

    }

}