import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //creazione data
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //formattazione data
        String dateNewFormat = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));

        //stampa data formattata
        System.out.println(dateNewFormat);
    }
}