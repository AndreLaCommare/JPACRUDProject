package com.skilldistillery.ufcfighters.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.ufcfighters.entities.UFCFighter;

@Service
@Transactional
public class UFCFighterDaoImpl implements UFCFighterDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public UFCFighter findById(int id) {
		// TODO Auto-generated method stub
		return em.find(UFCFighter.class, id);
	}

	@Override
	public List<UFCFighter> findAll() {
		// TODO Auto-generated method stub
		String query = "SELECT f FROM UFCFighter f";
		return em.createQuery(query, UFCFighter.class).getResultList();
	}

	// NO begin/commit
	// NO em.close()
	@Override
	public UFCFighter create(UFCFighter ufc) {
		// TODO Auto-generated method stub
		em.persist(ufc);
		return ufc;
	}

	@Override
	public UFCFighter update(int id, UFCFighter ufc) {
		// TODO Auto-generated method stub
		UFCFighter managed = em.find(UFCFighter.class, id);
		
		
		managed.setName(ufc.getName());
		managed.setWeightClass(ufc.getWeightClass());
		managed.setHomeCountry(ufc.getHomeCountry());
		managed.setImageurl(ufc.getImageurl());
		managed.setStrikeAvg(ufc.getStrikeAvg());
		managed.setBackground(ufc.getBackground());
		managed.setLastFight(ufc.getLastFight());
		managed.setStance(ufc.getStance());
		
		
		return managed;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		if (em.contains(em.find(UFCFighter.class, id))) {
			em.remove(em.find(UFCFighter.class, id));
			return true;
		} else {
			System.out.println("There is no such fighter.");
			return false;
		}
	}

}
