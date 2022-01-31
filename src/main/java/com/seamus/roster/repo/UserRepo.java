package com.seamus.roster.repo;

import com.seamus.roster.data.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
