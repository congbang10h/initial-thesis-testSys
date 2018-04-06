package com.therealdanvega.controller;

import com.therealdanvega.service.QuestionGroupService;
import com.therealdanvega.service.QuestionService;
import com.therealdanvega.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QGroupController {
    private UserService userService;
    private QuestionGroupService questionGroupService;
    private QuestionService questionService;

    @Autowired

    public QGroupController(UserService userService, QuestionGroupService questionGroupService, QuestionService questionService) {
        this.userService = userService;
        this.questionGroupService = questionGroupService;
        this.questionService = questionService;
    }

    @RequestMapping("/admin/qgroups")
    public String list(Model model) {
        model.addAttribute("qgroups", questionGroupService.list());
        return "qgroup/qgrouplist";
    }

//    @RequestMapping("/admin/qgroup/{id}")
//    public String list(@PathVariable Integer id,Model model) {
//        model.addAttribute("questions", questionService.listByQgroupId(id));
//        return "question/list";
//    }
}
