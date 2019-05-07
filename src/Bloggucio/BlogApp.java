package Bloggucio;

import java.time.LocalDateTime;

public class BlogApp {
    public static void main(String[] args) {


        User user1 = new User("Krzysztof", "Urbaniak", "gucio");
        User user2 = new User("Małgorzata", "Urbaniak", "maja");

        Blog blog = new Blog();
        blog.addUserToList(user1);
        blog.addUserToList(user2);

        blog.showUsers();

        Note post1 = new Post(LocalDateTime.now(), user1, "Pierwszy wpis");
        Note post2 = new Post(LocalDateTime.now(), user1, "Pierwszy wpis");

        blog.addNoteToList(post1);
        blog.addNoteToList(post2);

        blog.showAllNotes();

        ((Post) post1).addCommentToPost("pierwszy komentarz");

       // post1.showAllComments();



    }
}
