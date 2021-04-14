package ch.juventus.object;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

  private String firstName;
  private String lastName;
  private Address address;
  private int age;
  private boolean hasPet;

  public Person() {}

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Person(String firstName, String lastName, Address address, int age, boolean hasPet) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.age = age;
    this.hasPet = hasPet;
  }

  @Override
  public String toString() {
    return "Person{"
        + "firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + ", address="
        + address
        + ", age="
        + age
        + ", hasPet="
        + hasPet
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return age == person.age
        && hasPet == person.hasPet
        && Objects.equals(firstName, person.firstName)
        && Objects.equals(lastName, person.lastName)
        && Objects.equals(address, person.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, age, hasPet);
  }
}
