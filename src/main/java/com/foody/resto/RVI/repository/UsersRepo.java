package com.foody.resto.RVI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.foody.resto.RVI.model.Users;

@Repository
public interface UsersRepo extends CrudRepository<Users, Integer> {

}
