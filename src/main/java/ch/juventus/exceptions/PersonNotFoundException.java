package ch.juventus.exceptions;

public class PersonNotFoundException extends Exception {

  public PersonNotFoundException(String errorMessage) {
    super(errorMessage);
  }

  public PersonNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
