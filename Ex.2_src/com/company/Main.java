package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Learn Java advanced course in 4 or 5 months:");
        book.setPrice(375);
        Author author1 = new Author();
        author1.setName("Mher   ");
        author1.setSurname("Azizbekyan  ");
        author1.setGender(Gender.MALE);
        Author author2 = new Author();
        author2.setName("Ruzanna");
        author2.setSurname("Hovhannisyan");
        author2.setGender(Gender.FEMALE);
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        book.setAuthors(authors);
        for (int i = 0; i < book.getAuthors().size(); i++) {
            System.out.print(book.getAuthors().get(i).getName() + "  ");
            System.out.print((book.getAuthors().get(i).getSurname()) + "  ");
            System.out.println(book.getAuthors().get(i).getGender());
        }
        System.out.println("_____________________________________");
        System.out.println(book.getTitle());
        System.out.println(book.getPrice() + " $");
    }
}
