package ch.juventus.streams;

import ch.juventus.object.Person;
import java.io.IOException;

public class SerializeExercise {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    MyWriter myWriter = new MyWriter();
    MyReader myReader = new MyReader();

    myWriter.serializePerson(new Person("Florian", "Näpflin"), "src/main/resources/person.ser");
    myReader.deserializePerson("src/main/resources/person.ser");
  }
}
