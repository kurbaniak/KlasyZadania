package Bloggucio;

import java.time.LocalDateTime;

public abstract class Note {

    private int id;
    private LocalDateTime date;
    private User author;
    private String content;
    private static int NOTE_COUNTER = 0;

    public Note(LocalDateTime date, User author, String content) {
        this.date = date;
        this.author = author;
        this.content = content;
        this.id = ++ NOTE_COUNTER;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        //return "Note: " + id + ", added by " +author.getNick() + " --> \"" + getContent() + "\" on " + date.toString();
        return author.getNick() + " posted just now "  + getContent();
    }
}
