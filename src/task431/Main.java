package task431;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       /* PhoneContacts pContacts = new PhoneContacts();
        Set<Contact> contacts = new HashSet<>();
        pContacts.groups.put("Семья", null);
        pContacts.groups.put("Работа", null);
        contacts.add(new Contact("Вася","7-10-99"));
        pContacts.groups.put("Работа", contacts);
        pContacts.groups.forEach((k,v)-> System.out.println(k+" "+v));
        contacts=pContacts.groups.get("Работа");
        contacts.add(new Contact("Петя","8-90-09"));
        pContacts.groups.forEach((k,v)-> System.out.println(k+" "+v));*/
        PhoneContacts pContacts = new PhoneContacts();
        pContacts.addGroup("Работа");
        pContacts.addGroup("Семья");
        pContacts.addContact("Работа", new Contact("Вася", "7-10-99"));
        pContacts.addContact("Семья", new Contact("Петя", "234-234-247"));
        pContacts.addContact("Семья", new Contact("Маша", "234-098-564"));
        pContacts.addContact("Работа", new Contact("Маша", "234-098-564"));
        pContacts.addContact("Работа", new Contact("Ваня", "234-098-564"));
        System.out.println(pContacts.toString());
        pContacts.toSortedList().forEach(v -> System.out.println(v.toString()));
        System.out.println("");
    }


}
