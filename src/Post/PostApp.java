package Post;

public class PostApp {

    public static void main(String[] args) {

        Post post1 = new Post("Programowanie jest super", "gucio");


        post1.addTag(new Tag("programowanie"));
        post1.addTag(new Tag("java"));
        post1.addTag(new Tag("programowanie"));

        System.out.println(post1);

        Tag tag = new Tag("abc");


        System.out.println(tag.isEqual(new Tag("abc")));




    }
}
