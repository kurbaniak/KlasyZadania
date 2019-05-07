package Blog;

import java.util.Date;

public class BlogApp {

    public static void main(String[] args) {

        Blog blog = new Blog();

        blog.getUsers().add(new User("Jan", "Kowalski", "kowal"));
        blog.getUsers().add(new User("Anna", "Nowak", "any"));
        blog.getUsers().add(new User("Marek", "Markowski", "mario"));

        blog.addPost(1, "Piwerszy wpis");
        blog.addPost(1, "Drugi wspis");
        //blog.addPost(3, "Trzeci post");
        //blog.addPost(4, "czwarty post");

        System.out.println();

        blog.commentPost(1, 2, "user1 post2");
        //blog.commentPost(2, 2, "User2 post2");

        blog.displayUserEntries(1);



    }
}
