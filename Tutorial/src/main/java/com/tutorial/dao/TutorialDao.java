package com.tutorial.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.model.Tutorial;

public interface TutorialDao extends JpaRepository<Tutorial, Long> {

	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String Title);
}
