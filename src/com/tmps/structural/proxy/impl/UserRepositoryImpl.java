package com.tmps.structural.proxy.impl;

import com.tmps.structural.proxy.domain.User;
import com.tmps.structural.proxy.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {

  private List<User> users;
//  new ArrayList<>(
//      new User(1L, "MARIK221", "USER"),
//      new User(2L, "DORIN221", "ADMIN"),
//      new User(3L, "AnaKrolik", "USER")
//  );

  public UserRepositoryImpl() {
    this.users = new ArrayList<>();
    users.add(new User(1L, "MARIK221", "USER"));
    users.add(new User(2L, "DORIN221", "ADMIN"));
    users.add(new User(3L, "AnaKrolik", "USER"));
  }

  @Override
  public Optional<User> findUserById(Long id) {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    Optional<User> user = users.stream().filter(u -> u.getId().equals(id)).findFirst();
    return user;
  }

  @Override
  public void saveUser(User user) {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    users.add(user);
  }

  @Override
  public void deleteUserById(Long id) {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    Optional<User> user = users.stream().filter(u -> u.getId().equals(id)).findFirst();
    if(user.isPresent()) {
      users.remove(user.get());
      System.out.println("Deleted: " + user);
    }

  }
}
