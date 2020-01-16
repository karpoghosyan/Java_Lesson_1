package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Product product1 = new Product();
        product1.setTitle("Samsung  ");
        Product product2 = new Product();
        product2.setTitle("Apple    ");
        Product product3 = new Product();
        product3.setTitle("Lenovo   ");
        Product product4 = new Product();
        product4.setTitle("HP       ");
        Product product5 = new Product();
        product5.setTitle("Acer     ");
        Product product6 = new Product();
        product6.setTitle("Asus     ");
        Product product7 = new Product();
        product7.setTitle("Dell     ");
        Product product8 = new Product();
        product8.setTitle("LG       ");
        Product product9 = new Product();
        product9.setTitle("Microsoft");
        Product product10 = new Product();
        product10.setTitle("Msi      ");

        ArrayList<Product> products = new ArrayList<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
        for (int i = 0; i < products.size(); i++) {
            int price = random.nextInt(50);
            price = price + 50;
            products.get(i).setPrice(price);
        }
        for (int i = 0; i < products.size(); i++) {
            int rating = random.nextInt(10);
            products.get(i).setRating(rating);
        }
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i).getTitle() + "  ");
            System.out.print(products.get(i).getPrice() + "$  ");
            System.out.println(products.get(i).getRating() + "  ");
        }
        int max = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getRating() > max) {
                max = products.get(i).getRating();
            }
        }
        System.out.println("__________________________ ");
        for (int i = 0; i < products.size(); i++) {
            if (max == products.get(i).getRating()) {
                System.out.println("The best raiting have " + products.get(i).getTitle());
            }
        }
    }
}
