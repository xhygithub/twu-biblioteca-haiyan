package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by twcn on 3/7/16.
 */
public class librarySystem {
    public String welcomeMessage() {
        String welcome = "Welcome! the application is available.";
        return welcome;
    }

    public ArrayList<Map<String, Object>> createBooks() {
        ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bookName", "TDD Methods");
        map.put("author", "Tom");
        map.put("publishDate", "2013-2-4");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("bookName", "Code Refactoring Methods");
        map.put("author", "Allan");
        map.put("publishDate", "2011-2-4");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("bookName", "Code");
        map.put("author", "arch");
        map.put("publishDate", "2001-2-4");
        list.add(map);
        return list;
    }

    public String getBookLists(ArrayList<HashMap<String, Object>> bookList) {
        Iterator<HashMap<String, Object>> it = bookList.iterator();
        String bookLists = "";
        while(it.hasNext()) {
            Map<String, Object> book = it.next();
            bookLists =bookLists + book.get("bookName") + "\n";
        }

        return bookLists;
    }

    public String getBookInfo(ArrayList<HashMap<String, Object>> bookList) {
        System.out.println("the count of books is:" + bookList.size());
        Iterator<HashMap<String, Object>> it = bookList.iterator();
        String bookInfo = "";
//        int i = 1;
        while(it.hasNext()) {
            Map<String, Object> book = it.next();
            bookInfo =bookInfo + book.get("bookName") + "\t" + book.get("author") + "\t" + book.get("publishDate") + "\n";
        }

        return bookInfo;
    }

    public String showMenu() {
        String menu = "";
        menu = menu + "[1]" + "\t" + "listBooks\n"
                +"[2]" + "\t" + "quit\n";
        return menu;
    }

    public boolean checkOut(int i, ArrayList books, ArrayList checkoutLists) {
        if(i > 0 && i <= books.size() ) {
            Object checkout = books.remove(i - 1);
            checkoutLists.add(checkout);
            return true;
        }
        return false;
    }

    public boolean returnBook(Object book, ArrayList books, ArrayList checkoutLists) throws Exception {
        int size = checkoutLists.size();

            return true;
    }
    public String getCheckOut(Boolean isSuccess) {
        String checkOutInfo = "";
        if(isSuccess) {
            checkOutInfo = "Thank you! Enjoy the book”";
        }
        else checkOutInfo = "That book is not available";
        return checkOutInfo;
    }
    public String getReturnInfo(Boolean isSuccess) {
        String returnInfo = "";
        if(isSuccess) {
            returnInfo = "Thank you for returning the book.";
        }
        else returnInfo = "That is not a valid book to return.";
        return returnInfo;
    }
}
