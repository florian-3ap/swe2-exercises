package ch.juventus.object;

public class Main {

  public static void main(String[] args) {
    Address address = new Address("Zwirnereistrasse", 1, 8304, "Wallisellen");
    Person person1 = new Person("Florian", "Näpflin", address, 25, false);

    Person person2 = new Person("Florian", "Näpflin", address, 25, false);

    System.out.println(person1);

    System.out.println(person1.equals(person2));
  }
}
