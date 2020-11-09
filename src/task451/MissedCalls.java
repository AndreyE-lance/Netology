package task451;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private static Map<LocalDateTime, String> missedCalls = new TreeMap<>();


    public void addMissedCall(String phone) {
        missedCalls.put(LocalDateTime.now(), phone);
    }

    public void showMissedCalls(Contacts contacts) {
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        StringBuilder sBuilder = new StringBuilder("Пропущеные вызовы:\n");
        missedCalls.forEach((k, v) -> {
            String name;
            try {
                name = contacts.getContactByPhone(v).getName() + " " + contacts.getContactByPhone(v).getSurname();
            } catch (NullPointerException e) {
                name = "Контакта нет в записной книжке";
            }
            sBuilder.append(k.format(dtFormatter))
                    .append(": ")
                    .append(v)
                    .append(" ")
                    .append(name)
                    .append("\n");
        });
        System.out.println(sBuilder.toString());
    }

    public void clearMissedList() {
        missedCalls.clear();
    }
}
