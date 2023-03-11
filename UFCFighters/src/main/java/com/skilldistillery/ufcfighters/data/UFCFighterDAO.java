package com.skilldistillery.ufcfighters.data;

import java.util.List;

import com.skilldistillery.ufcfighters.entities.UFCFighter;

public interface UFCFighterDAO {
	UFCFighter findById(int id);
	List<UFCFighter> findAll();
	UFCFighter create(UFCFighter ufc);
	UFCFighter update(int id, UFCFighter ufc);
	boolean deleteById(int id);
	
	
}
