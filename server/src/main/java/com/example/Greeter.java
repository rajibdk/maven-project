package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
  
  String generateSecretToken() {
    Random r = new Random();
    return Long.toHexString(r.nextLong());
  }
}
