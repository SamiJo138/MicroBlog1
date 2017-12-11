
public class Post
{
    public String user;
    public String postNum;
    public String posts;
    public String website;

    Post(String user, String postNum, String posts, String website)
    {
        this.user=user;
        this.postNum=postNum;
        this.posts=posts;
        this.website=website;
    }

    public String getPostString()
    {
        return user+"  " +postNum+ "  "+posts+ " | "+website;
    }


}
