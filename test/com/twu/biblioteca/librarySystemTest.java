package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by twcn on 3/7/16.
 */
public class librarySystemTest {

    @Test
    public void should_return_fixed_welcome_message_when_be_welcomeMessage_called() throws Exception {
        String welcomeMessage = new librarySystem().welcomeMessage();
        assertEquals("Welcome! the application is available.", welcomeMessage);
    }
    @Test
    public void should_return_bookName_when_be_getBookLists_called() throws Exception {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("bookName", "TDD Methods");
        map.put("author", "Tom");
        map.put("publishDate", "2013-2-4");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("bookName", "Code Refactoring Methods");
        map.put("author", "Allan");
        map.put("publishDate", "2011-2-4");
        list.add(map);

        String bookLists = new librarySystem().getBookLists(list);

        assertEquals("TDD Methods\n" + "Code Refactoring Methods\n", bookLists);
    }
    @Test
    public void should_return_bookLists_information_when_getBookInfo_be_called() throws Exception {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("bookName", "TDD Methods");
        map.put("author", "Tom");
        map.put("publishDate", "2013-2-4");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("bookName", "Code Refactoring Methods");
        map.put("author", "Allan");
        map.put("publishDate", "2011-2-4");
        list.add(map);

        String bookLists = new librarySystem().getBookInfo(list);

        assertEquals("TDD Methods\tTom\t2013-2-4\n" + "Code Refactoring Methods\tAllan\t2011-2-4\n", bookLists);
    }

    @Test
    public void should_return_two_options_when_showmenu_be_called() throws Exception {
        String menuOptions = new librarySystem().showMenu();

        assertEquals("[1]\tlistBooks\n" + "[2]\tquit\n", menuOptions);
    }
    @Test
    public void should_return_the_checkout_success_when_checkout_be_called_and_the_number_is_1() throws Exception {
        ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("bookName", "TDD Methods");
        map.put("author", "Tom");
        map.put("publishDate", "2013-2-4");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("bookName", "Code Refactoring Methods");
        map.put("author", "Allan");
        map.put("publishDate", "2011-2-4");
        list.add(map);
        ArrayList checkoutLists = new ArrayList();
        boolean isCheckout =new librarySystem().checkOut(1, list, checkoutLists);
        assertEquals(isCheckout, true);
    }


}