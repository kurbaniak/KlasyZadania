package Blog;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {

    private List<User> users;
    private List<Post> posts;

    public Blog() {
        users = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public void addPostGucio(int userID, String content) {
        if (findPost(userID).getId() == userID) {
            Post post = new Post(new Date(), findUser(userID), content);
            posts.add(post);

        }

    }

    public void commentPost(int userId, int postId, String content) {
        User user = findUser(userId);
        if (user == null) {
            System.out.println("Can not publish comment, user ID: "
                    + userId + " doesn't exist.");
        }

        Post post = findPost(postId);
        if (post == null) {
            System.out.println("Can not comment post, post ID: "
                    + postId + " doesn't exist.");
        }

        System.out.println("(COMMENT) " + user.getNickName() + " commneted "
                + post.getAuthor().getNickName() + "\'s post: " + content + ".");

        post.getComments().add(new Comment(new Date(), user, content));

    }

    public void displayUserEntries(int userId){
        User user = findUser(userId);
        if(user == null){
            System.out.println("There is no user with id " + userId);
        }
        System.out.println((user.getNickName() + "'s posts:"));
    //todo nalezy zakonczyc wyswietlanie

    }


    public void addPost(int userID, String content) {
        User user = findUser(userID);
        if (user == null) {
            System.out.println("Can not publish post, user ID: "
                    + userID + " doesn't exist.");
        } else {
            System.out.println("(POST) " + user.getNickName() + " posted just now " + content);
            posts.add(new Post(new Date(), user, content));
        }
    }

    private User findUser(int userId) {
        for (User u : users) {
            if (userId == u.getId()) {
                return u;
            }
        }
        return null;
    }

    private Post findPost(int postId) {
        for (int i = 0; i < posts.size(); i++) {
            if (postId == posts.get(i).getId()) {
                return posts.get(i);
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
