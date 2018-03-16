package com.therealdanvega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.therealdanvega.domain.Course;
import com.therealdanvega.repository.CourseRepository;

@Service
public class CourseService {

	private CourseRepository courseRepository;
	
	@Autowired
	public CourseService(CourseRepository courseRepository){
		this.courseRepository = courseRepository;
	}
	
	public List<Course> list(){
		return courseRepository.findAllByOrderByCourseCodeAsc();
	}
	
	public void deleteById(Integer id) {
		courseRepository.delete(id);
	}
	
	public Course getById(Integer id) {
		return courseRepository.findOne(id);
	}
	
	public Course save(Course course) {
		return courseRepository.save(course);
	}
}
