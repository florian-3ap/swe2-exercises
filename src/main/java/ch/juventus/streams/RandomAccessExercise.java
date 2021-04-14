package ch.juventus.streams;

import java.io.IOException;

public class RandomAccessExercise {

  public static void main(String[] args) throws IOException {
    MyReader myReader = new MyReader();
    MyWriter myWriter = new MyWriter();

    myReader.readAtPosition("src/main/resources/hello_world.txt", 6);
    myWriter.writeAtPosition("src/main/resources/RandomAccessExerciseOut.txt", 5);
  }
}
