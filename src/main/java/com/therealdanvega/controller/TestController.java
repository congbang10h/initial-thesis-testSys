package com.therealdanvega.controller;

import com.therealdanvega.domain.Test;
import com.therealdanvega.service.CourseService;
import com.therealdanvega.service.TestService;
import com.therealdanvega.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class TestController {
    private TestService testService;
    private CourseService courseService;
    private UserService userService;

    @Autowired
    public TestController(TestService testService, CourseService courseService, UserService userService) {
        this.testService = testService;
        this.courseService = courseService;
        this.userService = userService;
    }

    @RequestMapping("/admin/tests")
    public String list(Model model) {
        model.addAttribute("tests", testService.list());
        return "test/testlist";
    }

    @RequestMapping("/admin/test/delete/{id}")
    public String delete(@PathVariable Integer id, Model model, RedirectAttributes redirectAttrs) {
        testService.deleteById(id);
        redirectAttrs.addFlashAttribute("message", "Test was deleted!");
        return "redirect:/admin/tests";
    }

    @RequestMapping("/admin/test/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("test", testService.getById(id));
        return "test/testForm";
    }

    @RequestMapping(value = "admin/test/save", method = RequestMethod.POST)
    public String save(@Valid Test test, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "tests/testForm";
        }
        else {
            testService.save(test);
            return "redirect:/admin/tests/";
        }
    }

    @RequestMapping(value = "admin/test/search", method = RequestMethod.GET)
    public String search(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/admin/tests";
        }

        model.addAttribute("tests", testService.search(q));
        return "test/testlist";
    }

    @RequestMapping("/admin/test/create")
    public String create(Model model) {
        model.addAttribute("course", new Test());
        return "test/testForm";
    }
}
