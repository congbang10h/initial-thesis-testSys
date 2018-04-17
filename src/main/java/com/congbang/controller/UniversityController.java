package com.congbang.controller;

import com.congbang.domain.University;
import com.congbang.service.UniversityService;
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
public class UniversityController {
    private UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @RequestMapping("/admin/universities")
    public String list(Model model) {
        model.addAttribute("universities", universityService.list());
        return "university/unilist";
    }

    @RequestMapping("/admin/university/delete/{id}")
    public String delete(@PathVariable Integer id, Model model, RedirectAttributes redirectAttrs) {
        universityService.deleteById(id);
        redirectAttrs.addFlashAttribute("message", "University was deleted!");
        return "redirect:/admin/universities";
    }

    @RequestMapping("/admin/university/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("university", universityService.getById(id));
        return "university/uniForm";
    }

    @RequestMapping(value = "admin/university/save", method = RequestMethod.POST)
    public String save(@Valid University university, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "university/uniForm";
        }
        else {
            University savedUniversity = universityService.save(university);
            return "redirect:/admin/universities/";
        }
    }

    @RequestMapping(value = "admin/university/search", method = RequestMethod.GET)
    public String search(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/admin/universities";
        }

        model.addAttribute("universities", universityService.search(q));
        return "university/unilist";
    }

    @RequestMapping("/admin/university/create")
    public String create(Model model) {
        model.addAttribute("university", new University());
        return "university/uniForm";
    }
}
