import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DirFileCountWithPath
{
  public static void main(String args[])
  {
     List<String> fileNames = new ArrayList<>();
    try {
      DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("H:\\GoogleDriveOffline\\content\\Contents"));
      for (Path path : directoryStream) {
        fileNames.add(path.toString());
      }
    } catch (IOException ex) {
    }
    System.out.println("File Count:"+fileNames.size());
  }
}