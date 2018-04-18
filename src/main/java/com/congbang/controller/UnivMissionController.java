package com.congbang.controller;

import com.congbang.domain.UnivMission;
import com.congbang.service.UnivMissionService;
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
public class UnivMissionController {
    private UnivMissionService univMissionService;

    @Autowired
    public UnivMissionController(UnivMissionService univMissionService) {
        this.univMissionService = univMissionService;
    }

    @RequestMapping("/admin/university/mission/{id}")
    public String listMission(@PathVariable Integer id, Model model, RedirectAttributes redirectAttrs) {
        model.addAttribute("univmissions",univMissionService.findAllByUnivId(id));
        return "university/univmission";
    }

    @RequestMapping("/admin/univmission/delete/{id}")
    public String delete(@PathVariable Integer id, Model model, RedirectAttributes redirectAttrs) {
        univMissionService.deleteById(id);
        redirectAttrs.addFlashAttribute("message", "University was deleted!");
        return "redirect:/admin/universities";
    }

    @RequestMapping("/admin/univmission/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("univmission", univMissionService.getById(id));
        return "university/uniForm";
    }

    @RequestMapping(value = "admin/univmission/save", method = RequestMethod.POST)
    public String save(@Valid UnivMission univMission, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "university/uniForm";
        }
        else {
            univMissionService.save(univMission);
            return "redirect:/admin/universities/";
        }
    }

    @RequestMapping("/admin/univmission/create")
    public String create(Model model) {
        model.addAttribute("univmission", new UnivMission());
        return "university/uniForm";
    }
}
