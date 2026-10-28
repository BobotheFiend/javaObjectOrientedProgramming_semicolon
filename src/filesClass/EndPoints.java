package filesClass;


import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;


public class EndPoints {

    public static void main() {

        String postsFromJSON = "https://jsonplaceholder.typicode.com/posts";
        URI postsUri = URI.create(postsFromJSON);
        String postsFileLocation = "/home/gamp/Documents/jsonTASKSS/posts.json";

        String postFromJSON = "https://jsonplaceholder.typicode.com/posts/1";
        URI postUri = URI.create(postFromJSON);
        String postFileLocation = "/home/gamp/Documents/jsonTASKSS/post.json";

        String commentFromJSON = "https://jsonplaceholder.typicode.com/posts/1/comments";
        URI commentUri = URI.create(commentFromJSON);
        String commentFileLocation = "/home/gamp/Documents/jsonTASKSS/comment.json";

        String commentsFromJSON = "https://jsonplaceholder.typicode.com/comments?postId=1";
        URI commentsUri = URI.create(commentsFromJSON);
        String commentsFileLocation = "/home/gamp/Documents/jsonTASKSS/comments.json";

        String xlink = "https://x.com/JoshNorris/status/2113990845082845422?s=20";
        URI xLinkDecoded = URI.create(xlink);
        String saveTo = "/home/gamp/Videos/jackson_thumbs_up_down_celly.mov";


        try(InputStream input = postsUri.toURL().openStream();
            InputStream inputTwo = postUri.toURL().openStream();
            InputStream inputThree = commentUri.toURL().openStream();
            InputStream inputFour = commentsUri.toURL().openStream();
            InputStream getLinkFromHost = xLinkDecoded.toURL().openStream();
        ){

            byte [] bytesOfExtractedPostsJSON = input.readAllBytes();
            Files.write(Path.of(postsFileLocation), bytesOfExtractedPostsJSON);

            byte [] bytesOfExtractedPostJSON = inputTwo.readAllBytes();
            Files.write(Path.of(postFileLocation), bytesOfExtractedPostJSON);

            byte [] bytesOfExtractedCommentJSON = inputThree.readAllBytes();
            Files.write(Path.of(commentFileLocation), bytesOfExtractedCommentJSON);

            byte [] bytesOfExtractedCommentsJSON = inputFour.readAllBytes();
            Files.write(Path.of(commentsFileLocation), bytesOfExtractedCommentsJSON);


            Files.write(Path.of(saveTo), getLinkFromHost.readAllBytes());

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e + " Izzz Gonee!!");
        }
    }
}
