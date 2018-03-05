package com.therealdanvega.admincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.therealdanvega.service.CourseService;

@Controller
public class AdminCourseController {
	private CourseService courseService;
	
	@Autowired
	public AdminCourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@RequestMapping("/admin/courses")
	public String list(Model model) {
		model.addAttribute("courses", courseService.list());
		return "courses/list";
	}
}
