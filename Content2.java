
class Content2 {

    private String content;
    private String userPost;

public String getContent()
        {
            return content + "\n" +userPost;
        }
        Content2(String postContent, String userPosted)
        {
            this.content=postContent;
            this.userPost=userPosted;
        }
}