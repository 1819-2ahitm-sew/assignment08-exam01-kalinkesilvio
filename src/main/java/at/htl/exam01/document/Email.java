package at.htl.exam01.document;

public class Email extends Documents {

    private String subject;

    private String to;
    public Email(String author, String subject, String to) {
        super(author);
        this.subject = subject;
        this.to = to;
    }

    @Override
    public String toString() {
        return "\nEmail: '" + subject + "' von '" + getAuthor() + "' an '" + to + "'";
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }
}
