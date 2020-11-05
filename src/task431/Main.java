package task431;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
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
