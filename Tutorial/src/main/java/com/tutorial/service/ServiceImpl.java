package com.tutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.dao.TutorialDao;
import com.tutorial.model.Tutorial;

@Service
public class ServiceImpl implements TutorialService {

	@Autowired
	private TutorialDao tutioralRepository;

	@Override
	public Tutorial postTutioral(Tutorial c) {

		return tutioralRepository.save(c);
	}

	@Override
	public Tutorial getTutioral(long id) {
		// TODO Auto-generated method stub
		return tutioralRepository.findById(id).get();
	}

	@Override
	public Tutorial updateTutioral(Tutorial params, long id) {
		// TODO Auto-generated method stub
		Tutorial tutorial = tutioralRepository.findById(id).get();
		tutorial.setTitle(params.getTitle());
		tutorial.setDescription(params.getDescription());
		return tutioralRepository.save(tutorial);
	}

	@Override
	public String deleteTutioral(long id) {
		// TODO Auto-generated method stub
		tutioralRepository.deleteById(id);
		return "the tutioral with id" + id + "has been deleted.....";
	}
}
