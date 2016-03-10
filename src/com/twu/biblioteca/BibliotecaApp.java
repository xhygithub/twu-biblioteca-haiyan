package com.twu.biblioteca;

import java.io.Console;
import java.util.*;

public class BibliotecaApp {


    public static void main(String[] args) {
        librarySystem librarySystem = new librarySystem();
        String welcomeMessage = librarySystem.welcomeMessage();
        System.out.println(welcomeMessage);

        System.out.println("All library book list is below:");
        ArrayList books = librarySystem.createBooks();
        ArrayList checkoutLists = new ArrayList();
        System.out.println("there are " + books.size() + " books");
        String bookLists = librarySystem.getBookLists(books);
        System.out.println(bookLists);

        System.out.println("All books detail information:");
        String bookInfo = librarySystem.getBookInfo(books);
        System.out.println(bookInfo);


        Scanner scanner = new Scanner(System.in);

//        String menuNum = console.readLine();
        Boolean a = true;
        while (a) {
            System.out.println("the menu options is below and choose the number you want:");
            String menuOptions = librarySystem.showMenu();
            System.out.println(menuOptions);
            String menuNum = scanner.next();

            if (menuNum.equals("1")) {
                librarySystem.getBookInfo(books);
                System.out.println(books);
                System.out.println("Do you want to check out the first book? y or n ");
                String willCheckout = scanner.next();
                if (willCheckout.equals("y")) {
                    boolean isCheckout = librarySystem.checkOut(1, books, checkoutLists);
                    String checkOutInformation = librarySystem.getCheckOut(isCheckout);
                    System.out.println(checkOutInformation);
                }
            } else if (menuNum.equals("2")) {
                System.exit(0);
            } else {
                System.out.println("Select a valid option");
            }
        }


        String b = scanner.next();
//        Console console = System.console();
        System.out.println("show you next page!");
//        String reply = console.readLine("show you next page! y or n: ");
        if (b.equals("y")) {
            System.out.println("the book lists is below");
        } else {
            System.exit(0); //exit application
        }
        System.out.println("Hello World!");
        scanner.nextLine();

        System.exit(0); //exit application
    }
}
