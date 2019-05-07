package Bloggucio;


import java.time.LocalDateTime;

public class Comment extends Note {


    public Comment(LocalDateTime date, User author, String content) {
        super(date, author, content);
    }


    public String toString(Post post) {
        return getAuthor().getNick() + " commented " + post.getAuthor().getNick() + "\'s post " + getContent();
    }
}
