package ch.juventus.exceptions;

import ch.juventus.object.Person;

public class PersonRepository {

  public void findById(int id) throws PersonNotFoundException {
    throw new PersonNotFoundException(String.format("Person with id %s not found!", id));
  }

  public void addPerson(Person person) {
    throw new IllegalArgumentException("Something is wrong with the person: " + person.toString());
  }
}
