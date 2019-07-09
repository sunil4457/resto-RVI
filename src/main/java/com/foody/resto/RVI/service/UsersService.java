
package com.foody.resto.RVI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foody.resto.RVI.model.Users;

@Service
public interface UsersService {
	public Users getById(int id);

	public void save(Users users);

	public void update(Users users);

	public void delete(Users users);

	public List<Users> getAllUsers();

}
