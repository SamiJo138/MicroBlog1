package Microblog;

import java.util.ArrayList;

public class User2 {

    private String name;
    private String screenName;
    private String url;
    private String email;
    private int userID;
    private ArrayList<Content2> posts;

    User2(String name, String screenName, String url, String email)
    {
        this.name=name;
        this.screenName=screenName;
        this.url=url;
        this.email=email;
        this.posts=new ArrayList<>();
    }

    public String getUser() {

        return this.screenName;
    }
public String toString()

        {
            return this.name+"\n" +this.screenName+"\n"+this.url+ "\n"+this.email;
        }

        public void addPost(Content2 post)
        {
        this.posts.add(post);
        }
        public ArrayList getPosts()
        {
            return this.posts;
        }
        public Content2 getLatestPost()
        {
            return this.posts.get(this.posts.size()-1);
        }

}
