package com.kylemoore;

import java.io.Console;

/**
 * Created by kmoore on 2019-03-06.
 */
public class UserInteraction {

  public static void main(String[] args) {
    Console c = System.console();
    System.out.println("Enter something:");
    char[] password = c.readPassword(); //FIXME c is null when invoked from Gradle JavaExec task
    System.out.println("You typed: " + String.valueOf(password));
  }

}
