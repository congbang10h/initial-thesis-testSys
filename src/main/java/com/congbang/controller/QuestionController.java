package com.congbang.controller;

import com.congbang.domain.Question;
import com.congbang.domain.QuestionTypeDict;
import com.congbang.repository.BloomLevelRepository;
import com.congbang.service.BloomLevelService;
import com.congbang.service.QuestionService;
import com.congbang.service.QuestionTypeDictService;
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
public class QuestionController {
    private QuestionService questionService;
    private BloomLevelService bloomLevelService;
    private QuestionTypeDictService questionTypeDictService;

    @Autowired

    public QuestionController(QuestionService questionService, BloomLevelService bloomLevelService, QuestionTypeDictService questionTypeDictService) {
        this.questionService = questionService;
        this.bloomLevelService = bloomLevelService;
        this.questionTypeDictService = questionTypeDictService;
    }

    @RequestMapping("/admin/questions")
    public String list(Model model) {
        model.addAttribute("questions", questionService.list());
        return "question/list";
    }

    @RequestMapping("/admin/question/delete/{id}")
    public String delete(@PathVariable Integer id, Model model, RedirectAttributes redirectAttrs) {
        questionService.deleteById(id);
        redirectAttrs.addFlashAttribute("message", "Câu hỏi đã được xóa thành công!!");
        return "redirect:/admin/questions";
    }

    @RequestMapping("/admin/question/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("question", questionService.getById(id));
        model.addAttribute("bloomLevels", bloomLevelService.list());
        model.addAttribute("questionTypeDicts", questionTypeDictService.list());
        return "question/questionForm";
    }

    @RequestMapping(value = "admin/question/save", method = RequestMethod.GET)
    public String save(@Valid Question question, BindingResult bindingResult, Model model, RedirectAttributes redirectAttrs) {
        if(bindingResult.hasErrors()) {
            return "question/questionForm";
        }
        else {
            Question savedquestion = questionService.save(question);
            redirectAttrs.addFlashAttribute("message", "Câu hỏi đã được cập nhật thành công!!");
            return "redirect:/admin/questions/";
        }
    }

    @RequestMapping("/admin/question/create")
    public String create(Model model) {
        model.addAttribute("question", new Question());
        model.addAttribute("bloomLevels", bloomLevelService.list());
        model.addAttribute("questionTypeDicts", questionTypeDictService.list());
        return "question/questionForm";
    }

    @RequestMapping(value = "admin/question/search", method = RequestMethod.GET)
    public String search(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/admin/questions";
        }

        model.addAttribute("questions", questionService.search(q));
        return "question/list";
    }
}
