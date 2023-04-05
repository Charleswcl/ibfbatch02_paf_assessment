package ibf2022.paf.assessment.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ibf2022.paf.assessment.server.repositories.UserRepository;

// TODO: Task 4, Task 8
@Controller
@RequestMapping
public class TasksController {

    @Autowired
    private UserRepository userRepo;

    // @PostMapping (path="/task")
    // public String addToDo(@RequestParam String description, @RequestParam int priority, @RequestParam String dueDate){
        
    // }

    
}
