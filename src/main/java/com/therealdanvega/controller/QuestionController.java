package com.therealdanvega.controller;

import com.therealdanvega.domain.Question;
import com.therealdanvega.repository.BloomLevelRepository;
import com.therealdanvega.service.BloomLevelService;
import com.therealdanvega.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class QuestionController {
    private QuestionService questionService;
    private BloomLevelService bloomLevelService;

    @Autowired

    public QuestionController(QuestionService questionService, BloomLevelService bloomLevelService) {
        this.questionService = questionService;
        this.bloomLevelService = bloomLevelService;
    }

    @RequestMapping("/admin/questions")
    public String list(Model model) {
        model.addAttribute("questions", questionService.list());
        return "question/list";
    }

    @RequestMapping("/admin/question/delete/{id}")
    public String delete(@PathVariable Integer id, Model model, RedirectAttributes redirectAttrs) {
        questionService.deleteById(id);
        redirectAttrs.addFlashAttribute("message", "question was deleted!");
        return "redirect:/admin/questions";
    }

    @RequestMapping("/admin/question/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("question", questionService.getById(id));
        return "question/questionForm";
    }

    @RequestMapping(value = "admin/question/save", method = RequestMethod.POST)
    public String save(@Valid Question question, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "question/questionForm";
        }
        else {
            Question savedquestion = questionService.save(question);
            return "redirect:/admin/questions/";
        }
    }

    @RequestMapping("/admin/question/create")
    public String create(Model model) {
        model.addAttribute("question", new Question());
        return "questions/questionForm";
    }
}
