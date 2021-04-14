package ch.juventus.streams;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioExercises {

  public static void main(String[] args) throws IOException {
    createDirectory();
    createTexFile();
    renameTextFile();
    listDirectory();
    deleteAll();
  }

  public static void createDirectory() throws IOException {
    Path path = Paths.get("src/main/resources/newDir");
    Files.createDirectory(path);
  }

  public static void createTexFile() throws IOException {
    Path path = Paths.get("src/main/resources/newDir/newFile.txt");
    Files.createFile(path);
  }

  public static void renameTextFile() throws IOException {
    Path path = Paths.get("src/main/resources/newDir/newFile.txt");
    Path renamed = Paths.get("src/main/resources/newDir/renamedFile.txt");
    Files.move(path, renamed);
  }

  public static void listDirectory() throws IOException {
    Path path = Paths.get("src/main/resources/newDir");
    Files.list(path).forEach(System.out::println);
  }

  private static void deleteAll() throws IOException {
    Path dir = Paths.get("src/main/resources/newDir");
    deleteDir(dir);
  }

  private static void deleteDir(Path dir) throws IOException {
    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dir);
    for (Path path : directoryStream) {
      if (Files.isDirectory(path)) {
        deleteDir(path);
      } else {
        Files.delete(path);
      }
    }
    Files.delete(dir);
  }
}
