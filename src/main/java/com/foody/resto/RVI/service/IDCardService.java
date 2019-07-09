
package com.foody.resto.RVI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foody.resto.RVI.model.IDCard;

@Service
public interface IDCardService {
	public IDCard getById(int id);

	public void save(IDCard iDCard);

	public void update(IDCard iDCard);

	public void delete(IDCard iDCard);

	public List<IDCard> getAllIDCards();

}
