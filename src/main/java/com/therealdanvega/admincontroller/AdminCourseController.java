package com.therealdanvega.admincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping("/admin/course/delete/{id}")
	public String delete(@PathVariable Integer id,Model model,RedirectAttributes redirectAttrs) {
		courseService.deleteById(id);
		redirectAttrs.addFlashAttribute("message", "Course was deleted!");
		return "redirect:/admin/courses";
	}
	
	@RequestMapping("/admin/course/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("course", courseService.getById(id));
		return "courses/postForm";
	}
}
