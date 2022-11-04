package com.jpa.demo.dao;

import java.util.List;

import com.jpa.demo.entity.Skill;

public interface IntfSkillDao {
	Skill addSkill(Skill skill);
    Skill getSkillById(int skillId);
    List<Skill> getAllSkills();
    void removeSkill(int skillId);
}
