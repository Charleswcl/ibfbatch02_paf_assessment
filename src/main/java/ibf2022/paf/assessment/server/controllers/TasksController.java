package ibf2022.paf.assessment.server.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ibf2022.paf.assessment.server.models.Task;
import ibf2022.paf.assessment.server.models.User;
import ibf2022.paf.assessment.server.repositories.UserRepository;
import ibf2022.paf.assessment.server.services.TodoService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// TODO: Task 4, Task 8


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@Controller
public class TasksController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    public String showTodoList(Model model) {
        model.addAttribute("task", new Task());
        return "index";
    }

    @PostMapping("/task")
    public String addTask(@ModelAttribute Task task, Model model) {
        try {
            todoService.upsertTask(User);
            return "result";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    
}

    

    

