package ch.juventus.exceptions;

import ch.juventus.object.Person;

public class Application {

  public static void main(String[] args) {
    final PersonRepository personRepository = new PersonRepository();

    try {
      personRepository.findById(42);
    } catch (PersonNotFoundException e) {
      e.printStackTrace();
    }

    final Person person = new Person();
    // personRepository.addPerson(person);

    try {
      personRepository.addPerson(person);
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
  }
}
