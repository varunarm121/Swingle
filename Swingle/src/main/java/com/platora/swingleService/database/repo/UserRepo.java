package com.platora.swingleService.database.repo;

import com.platora.swingleService.database.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, String> {

}
