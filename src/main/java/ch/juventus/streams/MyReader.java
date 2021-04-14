package ch.juventus.streams;

import ch.juventus.object.Person;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.io.Reader;

public class MyReader {

  public void read(String path) throws IOException {
    Reader reader = new BufferedReader(new FileReader(path));

    int data = reader.read();
    while (data != -1) {
      System.out.print((char) data);
      data = reader.read();
    }

    reader.close();
  }

  public void readAtPosition(String path, int position) throws IOException {
    RandomAccessFile file = new RandomAccessFile(path, "r");
    file.seek(position);

    int data = file.read();
    while (data != -1) {
      System.out.print((char) data);
      data = file.read();
    }

    file.close();
  }

  public void deserializePerson(String path) throws IOException, ClassNotFoundException {
    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
    Person person = (Person) inputStream.readObject();

    System.out.println(person);
    inputStream.close();
  }
}
