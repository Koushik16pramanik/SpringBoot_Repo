package com.springrest.Springrst.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.Springrst.dao.Dao;
import com.springrest.Springrst.entity.Course;

@Service
public class ServiceImpl implements ServiceDemo {

	@Autowired
	private Dao dao;
//	List<Course> list;

	public ServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(111, "JavaCore", "this course contains basic java"));
//		list.add(new Course(222, "Python", "this course contains basic python"));
//		list.add(new Course(333, "C++", "this course contains basic c++"));
	}

	@Override
	public List<Course> getCourses() {
		return dao.findAll();
//		return list;
	}

	@Override
	public Course singleCourse(long cid) {
		/*
		 * Course course = null; for (Course c : list) { if (c.getId() == cid) { course
		 * = c; } } return course;
		 */
		return dao.getOne(cid);
	}

	public Course addCourse(Course obj) {
//		list.add(obj);
//		return obj;
		dao.save(obj);
		return obj;
	}

	@Override
	public Course updateCourse(Course obj) {
//		list.add(obj);
//		return obj;

		/*
		 * list.forEach(up -> { if (up.getId() == obj.getId()) {
		 * up.setTitle(obj.getTitle()); up.setDescription(obj.getDescription()); } });
		 * return obj;
		 */
		dao.save(obj);
		return obj;
	}

	public void deleteCourse(long cid) {
//		list = this.list.stream().filter(del -> del.getId() != cid).collect(Collectors.toList());  //cpllectors collect
		// match id
		Course del = dao.getOne(cid);
		dao.delete(del);
	}

}
