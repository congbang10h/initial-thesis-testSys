package com.congbang.admincontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.congbang.domain.Post;
import com.congbang.service.AuthorService;
import com.congbang.service.PostService;

@Controller
public class AdminPostController {
	private PostService postService;
	private AuthorService authorService;
	
	@Autowired
	public AdminPostController(PostService postService, AuthorService authorService) {
		this.postService = postService;
		this.authorService = authorService;
	}
	
	@RequestMapping("/admin/posts")
	public String list(Model model) {
		model.addAttribute("posts", postService.list());
		return "admin/post/list";
	}
	
	@RequestMapping("/admin/post/create")
	public String create(Model model) {
		model.addAttribute("post", new Post());
		model.addAttribute("authors", authorService.list());
		return "admin/post/postForm";
	}
	
	@RequestMapping("/admin/post/{id}")
	public String view(@PathVariable Long id, Model model) {
		model.addAttribute("post", postService.getById(id));
		return "admin/post/view";
	}
	
	@RequestMapping(value = "admin/post/save", method = RequestMethod.POST)
	public String save(@Valid Post post, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("authors", authorService.list());
			return "admin/post/postForm";
		}
		else {
			Post savedPost = postService.save(post);
			return "redirect:/admin/post/" + savedPost.getId();
		}
	}
	
	@RequestMapping("admin/post/delete/{id}")
	public String delete(@PathVariable Long id, Model model, RedirectAttributes redirectAttrs) {
		postService.deleteById(id);
		redirectAttrs.addFlashAttribute("message", "Post was deleted!");
		return "redirect:/admin/posts";
	}
	
	@RequestMapping("/admin/post/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("post", postService.getById(id));
		model.addAttribute("authors", authorService.list());
		return "admin/post/postForm";
	}
}
