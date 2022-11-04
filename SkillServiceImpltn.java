package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.dao.IntfSkillDao;
import com.jpa.demo.dao.SkillDaoImpltn;
import com.jpa.demo.entity.Skill;

public class SkillServiceImpltn implements IntfSkillService{
	IntfSkillDao skillDao = new SkillDaoImpltn();
	@Override
	public Skill addSkill(Skill skill) {
		
		return skillDao.addSkill(skill);
	}

	@Override
	public Skill getSkillById(int skillId) {
		
		return skillDao.getSkillById(skillId);
	}

	@Override
	public List<Skill> getAllSkills() {
		
		return null;
	}

	@Override
	public void removeSkill(int skillId) {
		
		
	}
	
	

}
