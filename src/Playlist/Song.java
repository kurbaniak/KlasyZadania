package Playlist;

public class Song implements Playable{

    private String author;
    private String title;

    public Song(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Utwór muzyczny " + getAuthor() + ", " + getTitle());
    }
}
