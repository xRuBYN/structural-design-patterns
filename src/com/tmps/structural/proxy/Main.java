package com.tmps.structural.proxy;

import com.tmps.structural.proxy.domain.User;
import com.tmps.structural.proxy.impl.UserRepositoryImpl;
import java.util.Scanner;

public class Main {
  private static UserRepository userRepository = new UserCachedRepository(new UserRepositoryImpl());

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
      System.out.println("Please choose an option:");
      System.out.println("1. Find user by ID");
      System.out.println("2. Delete user by ID");
      System.out.println("3. Save new user");
      System.out.println("4. Exit");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter user ID:");
          long id = scanner.nextLong();
          System.out.println(userRepository.findUserById(id).orElse(null));
          break;
        case 2:
          System.out.println("Enter user ID to delete:");
          long deleteId = scanner.nextLong();
          userRepository.deleteUserById(deleteId);
          System.out.println("User deleted");
          break;
        case 3:
          System.out.println("Enter new user ID:");
          long newId = scanner.nextLong();
          scanner.nextLine();
          System.out.println("Enter new user name:");
          String newName = scanner.nextLine();
          System.out.println("Enter new user role:");
          String newRole = scanner.nextLine();
          User newUser = new User(newId, newName, newRole);
          userRepository.saveUser(newUser);
          System.out.println("User saved");
          break;
        case 4:
          running = false;
          System.out.println("Exiting program");
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }
  }
}