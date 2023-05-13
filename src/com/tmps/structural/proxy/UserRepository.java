package com.tmps.structural.proxy;

import com.tmps.structural.proxy.domain.User;
import java.util.Optional;

public interface UserRepository {

  Optional<User> findUserById(Long id);

  void saveUser(User user);

  void deleteUserById(Long id);
}
