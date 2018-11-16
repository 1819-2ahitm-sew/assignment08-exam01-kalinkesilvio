package at.htl.exam01.document;

abstract public class Main {

    
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
        String[] title = {"Rowlings", "Harry Potter und der Stein der Weisen"};
        String[] title2 = {"Tolkien", "lordOfTheRings"};
        String[] email = {"Susi", "Bewerbung", "CoolCompany"};
    }

    String[] document = {
            Book,
            Email;
    }
}

