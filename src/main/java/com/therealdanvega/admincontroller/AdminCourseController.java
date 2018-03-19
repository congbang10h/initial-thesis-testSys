package com.therealdanvega.admincontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.therealdanvega.domain.Course;
import com.therealdanvega.domain.Post;
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
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("course", courseService.getById(id));
		return "courses/postForm";
	}
	
	@RequestMapping(value = "admin/course/save", method = RequestMethod.POST)
	public String save(@Valid Course course, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "courses/postForm";
		}
		else {
			Course savedCourse = courseService.save(course);
			return "redirect:/admin/courses/";
		}
	}

	@RequestMapping(value = "admin/course/search", method = RequestMethod.GET)
	public String search(@RequestParam("q") String q, Model model) {
		if (q.equals("")) {
			return "redirect:/admin/courses";
		}

		model.addAttribute("courses", courseService.search(q));
		return "courses/list";
	}
	
	@RequestMapping("/admin/course/create")
	public String create(Model model) {
		model.addAttribute("course", new Course());
		return "courses/postForm";
	}
}
