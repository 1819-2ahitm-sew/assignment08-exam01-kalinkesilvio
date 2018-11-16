package at.htl.exam01.document;

public class Email extends Main {

    private static final String subject = "Bewerbung";
    private static final String to = "Susi";

    public String Email(String author, String subject, String to) {
        return Email(author, subject, to);
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

}
