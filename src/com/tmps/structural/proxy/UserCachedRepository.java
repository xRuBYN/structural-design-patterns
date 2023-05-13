package com.tmps.structural.proxy;

import static java.util.Objects.nonNull;

import com.tmps.structural.proxy.domain.User;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserCachedRepository implements UserRepository {

  private Map<Long, User> cachedUsers;

  private UserRepository userRepository;

  public UserCachedRepository(UserRepository userRepository) {
    this.cachedUsers = new HashMap<>();
    this.userRepository = userRepository;
  }

  @Override
  public Optional<User> findUserById(Long id) {
    User user = cachedUsers.get(id);
    if(nonNull(user)) {
      return Optional.of(user);
    } else {
      Optional<User> fromDbUser = userRepository.findUserById(id);
      fromDbUser.ifPresent(value -> cachedUsers.put(value.getId(), value));
      return fromDbUser;
    }
  }

  @Override
  public void saveUser(User user) {
    userRepository.saveUser(user);
    cachedUsers.put(user.getId(), user);
  }

  @Override
  public void deleteUserById(Long id) {
    userRepository.deleteUserById(id);
    cachedUsers.remove(id);
  }
}
