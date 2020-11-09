package task451;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Contacts {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        contacts.put(contact.getPhone(), contact);
    }

    public void deleteContact(String name, String surname) {
        Iterator<Map.Entry<String, Contact>> iterator = contacts.entrySet().iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next().getValue();
            if (contact.getName().equals(name)
                    && contact.getSurname().equals(surname)) {
                iterator.remove();
                System.out.println("Контакт удален.");
                break;
            }
        }
    }

    public Contact getContactByPhone(String phone) {
        return contacts.get(phone);
    }

    public void editContact(int contactNumber, String name, String surname, Group group) {
        AtomicInteger i = new AtomicInteger(1);
        contacts.forEach((k, v) -> {
            if (i.get() == contactNumber) {
                v.setGroup(group);
                v.setName(name);
                v.setSurname(surname);
                System.out.println("Изменения внесены");
                return;
            }
            i.getAndIncrement();
        });

    }

    @Override
    public String toString() {
        AtomicInteger i = new AtomicInteger(1);
        StringBuilder sBuilder = new StringBuilder("Контакты:\n");
        contacts.forEach((k, v) -> {
            sBuilder.append("\n\t").append(i.get()).append(". ").append(v.toString());
            i.getAndIncrement();
        });
        return sBuilder.toString();
    }
}
