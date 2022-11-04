package com.jpa.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.demo.entity.Employee;
import com.jpa.demo.entity.Skill;

public class SkillDaoImpltn implements IntfSkillDao {

	@Override
	public Skill addSkill(Skill skill) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU1");   //persistence unit name PU1 have the configuration info.
		EntityManager em = emf.createEntityManager();    //using factory manager reference object emf.
		System.out.println(skill);
		em.getTransaction().begin();   //required only when want to insert or update something.
		System.out.println(skill);
		em.persist(skill);
		
		em.getTransaction().commit();  //required only when want to insert or update something.
		
		return skill;           //return as a success response.
	}

	@Override
	public Skill getSkillById(int skillId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU1");   //persistence unit name PU1 have the configuration info.
		EntityManager em = emf.createEntityManager();    //using factory manager reference object emf.
		
		em.getTransaction().begin();
		
//		Get skill by id
		Skill skill = em.find(Skill.class, skillId);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		return skill;
	}

	@Override
	public List<Skill> getAllSkills() {
		
		return null;
	}

	@Override
	public void removeSkill(int skillId) {
		
		
	}

}
