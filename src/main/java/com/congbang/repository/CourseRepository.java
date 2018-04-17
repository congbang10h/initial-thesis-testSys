package com.congbang.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.congbang.domain.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

	List<Course> findAllByOrderByCourseCodeAsc();

	List<Course> findByCourseNameVnContaining(String q);

}
