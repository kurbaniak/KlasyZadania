package Bloggucio;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post extends Note {

    List<Comment> commentList;

    public Post(LocalDateTime date, User author, String content) {
        super(date, author, content);
        this.commentList = new ArrayList<>();
    }

    public void addCommentToPost(String s){
        Comment comment = new Comment(LocalDateTime.now(), this.getAuthor(), s);
        commentList.add(comment);
    }

    public void showAllComments(){
        for (Comment comment: commentList) {
            System.out.println(comment.toString());
        }
    }


    public void showPost() {
        System.out.println(this.getAuthor().getNick() + " posted just now: " + this.getContent());
    }
}

