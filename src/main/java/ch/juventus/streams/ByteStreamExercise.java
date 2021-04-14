package ch.juventus.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExercise {

  public static void main(String[] args) throws IOException {
    copy(
        "/Users/floriannapflin/Downloads/Download.jpeg",
        "/Users/floriannapflin/Downloads/some_new_file.jpeg");
  }

  private static void copy(String from, String to) throws IOException {
    FileInputStream fileInputStream = new FileInputStream(from);
    FileOutputStream fileOutputStream = new FileOutputStream(to);

    int b;
    while ((b = fileInputStream.read()) != -1) {
      fileOutputStream.write(b);
    }

    /*
    byte[] bytes = fileInputStream.readAllBytes();
    fileOutputStream.write(bytes);
     */

    fileInputStream.close();
    fileOutputStream.close();
  }
}
