package Blog;

import java.util.Date;

public abstract class Entry {

    protected int id;
    protected Date postedDate;
    private User author;
    protected  String Content;

    private static int ENTRY_COUNTER = 0;

    public Entry(Date postedDate, User author, String content) {
        this.id = ++ ENTRY_COUNTER;
        this.postedDate = postedDate;
        this.author = author;
        Content = content;
    }

    public int getId() {
        return id;
    }


    public User getAuthor() {
        return author;
    }


    public String getContent() {
        return Content;
    }


}
