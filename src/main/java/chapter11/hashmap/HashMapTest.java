package chapter11.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

    private static HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>();


    public static void main(String[] args) {
        addPhoneNo("친구", "이자바", "010-111-1111");
        addPhoneNo("친구", "김자바", "010-222-2222");
        addPhoneNo("친구", "김자바", "010-333-3333");
        addPhoneNo("회사", "김대리", "010-444-4444");
        addPhoneNo("회사", "김대리", "010-555-5555");
        addPhoneNo("회사", "박대리", "010-666-6666");
        addPhoneNo("회사", "이과장", "010-777-7777");
        addPhoneNo("세탁", "010-888-8888");

        printPhoneBook();
    }

    private static void printPhoneBook() {
        phoneBook.entrySet().stream()
                .map(entry -> "entry = " + entry)
                .forEach(entry -> System.out.println(entry));
    }

    private static void addPhoneNo(String name, String phoneNumber) {
        addPhoneNo("기타", name, phoneNumber);
    }

    private static void addPhoneNo(String group, String name, String phoneNumber) {
        addGroup(group);
        HashMap<String, String> map = phoneBook.get(group);
        map.put(phoneNumber, name);

    }

    private static void addGroup(String group) {
        if (!phoneBook.containsKey(group)) {
            phoneBook.put(group, new HashMap<>());
        }
    }


}
