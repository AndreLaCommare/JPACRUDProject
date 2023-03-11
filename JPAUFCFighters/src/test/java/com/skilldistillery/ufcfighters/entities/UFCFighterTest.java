package com.skilldistillery.ufcfighters.entities;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UFCFighterTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private UFCFighter fighter;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAUFCFighters");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em  = emf.createEntityManager();
		fighter = em.find(UFCFighter.class, 2);
	}
	

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		fighter = null;
	}

	@Test
	void test_basic_mapping() {
		assertNotNull(fighter);
		assertEquals("Khabib Nurmagomedov", fighter.getName());
		assertEquals(155, fighter.getWeightClass());
		assertEquals("Orthodox", fighter.getStance());
		assertEquals("Wrestling", fighter.getBackground());
	}

}
