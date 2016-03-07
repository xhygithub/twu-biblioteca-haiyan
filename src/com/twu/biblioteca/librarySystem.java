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
        while(it.hasNext()) {
            Map<String, Object> book = it.next();
            bookInfo =bookInfo + book.get("bookName") + "\t" + book.get("author") + "\t" + book.get("publishDate") + "\n";
        }

        return bookInfo;
    }
}
