package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */
    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        String[] text = sc.readFromFile(FILE_NAME);
        sc.print(text);
    }

    /**
     *
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB 5A
     * Nun wird in das String-Array AAAAA geschrieben
     *
     * Bsp Testdatei
     * 5A
     * 3B
     * 4C
     *
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA
     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public String[] readFromFile(String fileName) {

        String[] zeilen = new String[getNoOfLines(fileName)];
        int counter = 0;

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                zeilen[counter] = scanner.nextLine();
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return zeilen;
    }

    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     *
     * @param lines String-Array
     */
    public void print(String[] lines) {

        char buchstabe;
        int zahl;

        for (int i = 0; i < lines.length; i++) {
            buchstabe = lines[i].charAt(0);
            zahl = Integer.valueOf(lines[i].substring(1));
            for (int j = 0; j < zahl; j++) {
                System.out.print(buchstabe);
            }
            System.out.println();
        }
    }

    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */

    public int getNoOfLines(String fileName) {

        int anzahl = 0;

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                anzahl++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return anzahl;
    }
}