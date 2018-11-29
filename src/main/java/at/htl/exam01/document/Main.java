package at.htl.exam01.document;

import java.util.Arrays;

public class Main {


    /**
     * Führen Sie hier folgendes durch:
     * <p>
     * 1. Erstellen Sie 2 Bücher und ein email
     * Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     * Email: "Susi", "Bewerbung", "CoolCompany"
     * Buch: "Tolkien", "lordOfTheRings"
     * <p>
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     * <p>
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     * Nutzen Sie dabei die Mechanismen der Vererbung.
     * Erstellen Sie außerdem geeignete toString-Methoden
     * <p>
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {

        Book book = new Book("Rowlings", "Harry Potter und der Stein der Weisen");
        Email email = new Email("Susi", "Bewerbung", "CoolCompany");
        Book book2 = new Book("Tolkien", "lordOfTheRings");

        Documents[] documents = {
                book,
                email,
                book2
        };

        System.out.println(Arrays.toString(documents));

        int bookcounter = 0;
        int emailcounter = 0;

        for (int i = 0; i < documents.length; i++) {
            if (documents[i] instanceof Book) {
                System.out.println("Book: " + documents[i]);
                bookcounter++;
            } else if (documents[i] instanceof Email) {
                System.out.println("Email: " + documents[i]);
                emailcounter++;
            }
        }

        System.out.println();
        System.out.println("Anzahl Books: " + bookcounter + "");
        System.out.println("Anzahl Email: " + emailcounter + "");

    }
}

