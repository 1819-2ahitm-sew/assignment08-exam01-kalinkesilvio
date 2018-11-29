package at.htl.exam01.document;

abstract public class Documents {

    private String author;

    public Documents(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book: " +
                " von '" + author + '\'';
    }
}
