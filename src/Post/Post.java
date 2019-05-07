package Post;

import java.util.*;

public class Post {
    private String title;
    private String author;

    private Set<Tag> tag;


    public void addTag(Tag tag) {
             this.tag.add(tag);
    }

    public Post(String title, String author) {
        tag = new TreeSet<Tag>();
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<Tag> getTag() {
        return tag;
    }

    public void setTag(Set<Tag> tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tagList=" + tag +
                '}';
    }



}
