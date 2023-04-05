package ibf2022.paf.assessment.server.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ibf2022.paf.assessment.server.models.Task;
import ibf2022.paf.assessment.server.models.User;
import ibf2022.paf.assessment.server.repositories.TaskRepository;
import ibf2022.paf.assessment.server.repositories.UserRepository;

// TODO: Task 7

@Service
public class TodoService {
    @Autowired
    private UserRepository userRepo;
    private TaskRepository taskRepo;

    @Transactional
    public void upsertTask(String username, List<Task> tasks) {
        // Check if the user exists
        Optional<User> userOptional = userRepo.findUserByUsername(username);

        User user;
        if (userOptional.isPresent()) {
            user = userOptional.get();
        } else {
            
            user = new User();
            user.setUsername(username);
            user.setName(""); 
            user.setUserId(userRepo.insertUser(user));
        }
        
        for (Task task : tasks) {
            taskRepo.insertTask(task);
        }
    }

}



