package com.foody.resto.RVI.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.foody.resto.RVI.model.IDCard;
import com.foody.resto.RVI.repository.IDCardRepo;
import com.foody.resto.RVI.service.IDCardService;
@Configuration
public class IDCardServiceImpl implements IDCardService {
	@Autowired
	private IDCardRepo iDCardRepo;

	@Override
	public IDCard getById(int id) {
		return iDCardRepo.findById(id).get();
	}

	@Override
	public void save(IDCard iDCard) {
		iDCardRepo.save(iDCard);
	}

	@Override
	public void update(IDCard iDCard) {
		iDCardRepo.save(iDCard);
	}

	@Override
	public void delete(IDCard iDCard) {
		iDCardRepo.delete(iDCard);
	}

	@Override
	public List<IDCard> getAllIDCards() {
		return (List<IDCard>) iDCardRepo.findAll();
	}

}
