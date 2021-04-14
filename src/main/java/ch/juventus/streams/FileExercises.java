package ch.juventus.streams;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExercises {

  public static void main(String[] args) throws IOException {
    createDirectory();
    createNewTextFile();
    renameTextFile();
    listDirectory();
    deleteAll();
  }

  public static void createDirectory() {
    File file = new File("src/main/resources/newDir");
    boolean created = file.mkdir();
    if (created) {
      System.out.println("Directory is created!");
    }
  }

  public static void createNewTextFile() throws IOException {
    File file = new File("src/main/resources/newDir/newFile.txt");
    boolean created = file.createNewFile();
    if (created) {
      System.out.println("File is created!");
    }
  }

  public static void renameTextFile() {
    File file = new File("src/main/resources/newDir/newFile.txt");
    File renamedFile = new File("src/main/resources/newDir/renamedFile.txt");
    boolean renamed = file.renameTo(renamedFile);
    if (renamed) {
      System.out.println("File is renamed!");
    }

    if (renamedFile.exists()) {
      System.out.println("Renamed file is existing!");
    }
  }

  public static void listDirectory() {
    File file = new File("src/main/resources/newDir");
    Arrays.stream(file.list()).forEach(System.out::println);
  }

  public static void deleteAll() {
    File file = new File("src/main/resources/newDir");
    deleteDir(file);
  }

  private static boolean deleteDir(File dir) {
    File[] files = dir.listFiles();

    if (files != null) {
      for (File file : files) {
        if (file.isDirectory()) {
          deleteDir(file);
        } else {
          file.delete();
        }
      }
    }
    return dir.delete();
  }
}
