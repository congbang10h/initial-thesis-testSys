package com.congbang.controller;

import com.congbang.domain.Faculty;
import com.congbang.service.FacultyService;
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
public class FacultyController {
    private FacultyService facultyService;
    private UniversityService universityService;

    @Autowired

    public FacultyController(FacultyService facultyService, UniversityService universityService) {
        this.facultyService = facultyService;
        this.universityService = universityService;
    }

    @RequestMapping("/admin/faculties")
    public String list(Model model) {
        model.addAttribute("faculties", facultyService.list());
        return "faculty/listFaculty";
    }

    @RequestMapping("/admin/faculty/delete/{id}")
    public String delete(@PathVariable Integer id, Model model, RedirectAttributes redirectAttrs) {
        facultyService.deleteById(id);
        redirectAttrs.addFlashAttribute("message", "Đã xóa thành công!!");
        return "redirect:/admin/faculties";
    }

    @RequestMapping("/admin/faculty/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("faculty", facultyService.getById(id));
        model.addAttribute("universities", universityService.list());
        return "faculty/facultyForm";
    }

    @RequestMapping(value = "admin/faculty/save", method = RequestMethod.POST)
    public String save(@Valid Faculty faculty, BindingResult bindingResult, Model model, RedirectAttributes redirectAttrs) {
        if(bindingResult.hasErrors()) {
            return "faculty/facultyForm";
        }
        else {
            facultyService.save(faculty);
            redirectAttrs.addFlashAttribute("message", "Thao tác thành công!!");
            return "redirect:/admin/faculties/";
        }
    }

    @RequestMapping(value = "admin/faculty/search", method = RequestMethod.GET)
    public String search(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/admin/faculties";
        }

        model.addAttribute("faculties", facultyService.search(q));
        return "faculty/listFaculty";
    }

    @RequestMapping("/admin/faculty/create")
    public String create(Model model) {
        model.addAttribute("faculty", new Faculty());
        model.addAttribute("universities", universityService.list());
        return "faculty/facultyForm";
    }
}
