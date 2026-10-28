package filesClass;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileCreator {

    public static void main(String[] args) {
        //1.Defining the path that points to the file you are trying to work with
        //unix - /home/gamp/Desktop.. Windows - C:\\users\Desktop
        //Two types of paths, Absolute and Relative

        String fileLocation = "/home/gamp/Nammdi-rr/Documents";
        Path path = Path.of(fileLocation);
        System.out.println(path.getRoot());
        System.out.println(path.normalize());


        //2. Use a method of class files to work with the path

        String writtenText = "Yes!\nYes!\nYes!\nYes!\nYes!\nYes!\nYes!\nYes!\n\"No More \"Yes!\" AGAIN";

        String location = "/home/gamp/Documents/Yes";
        try{
            Files.write(Path.of(location), writtenText.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e + " Izzz Gonee!!");
        }


        //GET A URL OF A VIDEO AND SAVE IT IN A FILE. TO SHOW THAT FILES ARE A COLLECTION OF BYTES

        //URI UNIFORM RESOURCE IDENTIFIERS.. THEY ARE SPECIFIC TO THE WEB ANY STRING OF CHARACTERS THAT IDENTIFIES A RESOURCE.
        //URL A UNIFORM RESOURCE LOCATOR .. ARE FROM THE URI THAT ARE USED TO SPECIFY AN EXACT RESOURCE.
        String videoUri = "";
        URI uri = URI.create(videoUri);

//        try(InputStream input = uri.toURL().openStream();
//            FileOutputStream outputFile =
//                    new FileOutputStream("newVideo.mp4");
//        ){
//            byte [] bytesOfExtractedVideoFile = input.readAllBytes();
//            System.out.println(Arrays.toString(bytesOfExtractedVideoFile));
//            outputFile.write(bytesOfExtractedVideoFile);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}