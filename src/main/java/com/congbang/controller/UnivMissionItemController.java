package com.congbang.controller;

import com.congbang.domain.UnivMissionItem;
import com.congbang.service.UnivMissionItemService;
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
public class UnivMissionItemController {
    private UnivMissionItemService univMissionItemService;

    @Autowired
    public UnivMissionItemController(UnivMissionItemService univMissionItemService) {
        this.univMissionItemService = univMissionItemService;
    }

    @RequestMapping("/admin/univmission/view/{id}")
    public String listMission(@PathVariable Integer id, Model model, RedirectAttributes redirectAttrs) {
        model.addAttribute("umitems",univMissionItemService.listByUmId(id));
        return "university/univMissionItem";
    }

    @RequestMapping("/admin/umitem/delete/{id}")
    public String delete(@PathVariable Integer id, Model model, RedirectAttributes redirectAttrs) {
        univMissionItemService.deleteById(id);
        redirectAttrs.addFlashAttribute("message", "Umi was deleted!");
        return "redirect:/admin/universities";
    }

    @RequestMapping("/admin/umitem/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("univmission", univMissionItemService.getById(id));
        return "university/uniForm";
    }

    @RequestMapping(value = "admin/umitem/save", method = RequestMethod.POST)
    public String save(@Valid UnivMissionItem univMissionItem, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "university/uniForm";
        }
        else {
            univMissionItemService.save(univMissionItem);
            return "redirect:/admin/universities/";
        }
    }

    @RequestMapping("/admin/umitem/create")
    public String create(Model model) {
        model.addAttribute("univmission", new UnivMissionItem());
        return "university/uniForm";
    }
}
