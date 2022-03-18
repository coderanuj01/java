package MatchRegularExpression;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetPath {
    public static void getPath(Path path, String extension) throws IOException {
        if (!Files.isDirectory(path)) {
            throw new IllegalArgumentException("Path must be a directory!");
        }

        Stream<Path> walk = Files.walk(path);

        String[] listOfFile = path.toFile().list();

        if(listOfFile.length == 0){
            System.out.println("Empty directory : ");

        }
        else{
            for(String file : listOfFile){
                //System.out.println(file);
                // for multiple file add (jpg|JPG|gif) instead of txt
                boolean matches = Pattern.matches("^.*\\.(txt)$",file);
                if(matches){
                    System.out.println(path + "\\" + file);
                }
            }
        }


    }
}
