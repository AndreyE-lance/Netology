package task431;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class PhoneContacts {
    private Map<String, Set<Contact>> groups;

    public PhoneContacts() {
        this.groups = new HashMap<>();
    }

    public void addGroup(String groupName) {
        groups.put(groupName, null);
    }

    public void addContact(String groupName, Contact contact) {
        Set<Contact> contacts;
        if (groups.containsKey(groupName)) {
            if (groups.get(groupName) != null) {
                contacts = groups.get(groupName);
            } else {
                contacts = new HashSet<>();
            }
            contacts.add(contact);
            groups.put(groupName, contacts);
        } else {
            System.out.println("Такой группы нет");
        }
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder("Все записи телефонной книги: \n");
        groups.forEach((k, v) -> {
            sBuilder.append("{" + k + "}\n");
            v.forEach(val -> sBuilder.append("\t" + val + "\n"));
        });
        return sBuilder.toString();
    }

    public List<Contact> toSortedList() {
        List<Contact> list = new ArrayList<>();
        groups.forEach((k, v) -> {
            v.forEach(val -> {
                int index = Collections.binarySearch(list, val);
                if (index != 0) list.add(Math.abs(index) - 1, val);
            });

        });
       return list;
    }
}
