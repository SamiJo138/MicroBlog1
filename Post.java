import java.util.ArrayList;
import java.util.Iterator;

public class Post
{
    public String user;
    public String postNum;
    public String posts;
    public String post;
    public String website;
 public void Post(String user,String postNum, String posts, String website)
    {
        this.user=user;
        this.postNum=postNum;
        this.posts=posts;
        this.post=post;
        this.website=website;
    }
  
           public String getPostString()
    { 
        return this.user+"  " +this.posts+ " | "+this.website;
    }
}