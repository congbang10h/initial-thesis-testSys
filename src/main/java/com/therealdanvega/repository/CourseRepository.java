package com.therealdanvega.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.therealdanvega.domain.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

	List<Course> findAllByOrderByCourseCodeAsc();

}
