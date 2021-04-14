package ch.juventus.json;

import ch.juventus.object.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonExample {

  public static void main(String[] args) throws IOException {
    Gson gson = new GsonBuilder().create();

    // Object to JSON
    Person person = new Person("Florian", "Näpflin");
    String personJsonFromObject = gson.toJson(person);
    System.out.println(personJsonFromObject);

    // JSON String to Object
    String personAsJson =
        "{\"firstName\":\"Florian\",\"lastName\":\"Näpflin\",\"age\":0,\"hasPet\":false}";
    Person personFromJson = gson.fromJson(personAsJson, Person.class);
    System.out.println(personFromJson);

    // JSON File to Object
    JsonReader jsonReader =
        new JsonReader(
            new FileReader(
                "/Users/floriannapflin/Development/workspace/swe2-exercises/src/main/java/ch/juventus/json/person.json"));
    Person personFromFile = gson.fromJson(jsonReader, Person.class);
    System.out.println(personFromFile);
  }
}
