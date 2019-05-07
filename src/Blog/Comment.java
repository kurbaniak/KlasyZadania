package Blog;

import java.util.Date;

public class Comment extends Entry{


    public Comment(Date postedDate, User author, String content) {
        super(postedDate, author, content);
    }
}
