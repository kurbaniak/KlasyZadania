package Post;

import java.util.Objects;

public class Tag implements Comparable<Tag>{
private String title;

    public Tag(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public boolean isEqual(Tag tag) {
        int length1 = title.length();
        int length2 = tag.getTitle().length();
        if (length1==length2){
            for (int i = 0; i < length1; i++) {
                char first = title.charAt(i);
                char second = tag.getTitle().charAt(i);
                if (first!=second){
                    return false;
                }
                return true;
            }

        }

        return false;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(title, tag.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public int compareTo(Tag o) {
        return this.title.compareTo(o.title);
    }
}
