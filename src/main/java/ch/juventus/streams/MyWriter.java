package ch.juventus.streams;

import ch.juventus.object.Person;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Writer;

public class MyWriter {

  public void write(String path) throws IOException {
    Writer writer = new BufferedWriter(new FileWriter(path));

    String output = "Let's write some stuff in this new file! \nHello dude";

    writer.write(output);
    writer.close();
  }

  public void writeAtPosition(String path, int position) throws IOException {
    RandomAccessFile file = new RandomAccessFile(path, "rw");
    file.seek(position);

    file.write("-huhu-".getBytes());
    file.close();
  }

  public void serializePerson(Person person, String path) throws IOException {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
    out.writeObject(person);
    out.close();
  }
}
