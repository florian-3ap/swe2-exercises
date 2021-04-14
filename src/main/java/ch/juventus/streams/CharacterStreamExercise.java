package ch.juventus.streams;

import java.io.IOException;

public class CharacterStreamExercise {

  public static void main(String[] args) throws IOException {
    MyReader myReader = new MyReader();
    MyWriter myWriter = new MyWriter();

    myReader.read("src/main/resources/hello_world.txt");
    myWriter.write("src/main/resources/new_hello_world.txt");
  }
}
