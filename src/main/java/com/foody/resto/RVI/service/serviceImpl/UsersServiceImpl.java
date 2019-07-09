package com.foody.resto.RVI.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.foody.resto.RVI.model.Users;
import com.foody.resto.RVI.repository.UsersRepo;
import com.foody.resto.RVI.service.UsersService;
@Configuration
public class UsersServiceImpl implements UsersService {
	
	@Autowired
     private UsersRepo usersRepo;
	
	@Override
	public Users getById(int id) {
		return usersRepo.findById(id).get();
	}

	@Override
	public void save(Users users) {
       usersRepo.save(users);
	}

	@Override
	public void update(Users users) {
		 usersRepo.save(users);
	}

	@Override
	public void delete(Users users) {
		 usersRepo.delete(users);
	}

	@Override
	public List<Users> getAllUsers() {
		return (List<Users>) usersRepo.findAll();
	}

}
