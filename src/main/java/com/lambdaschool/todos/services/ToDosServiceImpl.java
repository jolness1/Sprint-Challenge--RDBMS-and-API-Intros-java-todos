package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.ToDosRepository;
import com.lambdaschool.todos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "todosService")
public class ToDosServiceImpl implements ToDosService {

    @Autowired
    private ToDosRepository todosrepos;
    @Autowired
    UserRepository usersrepo;
    @Autowired UserAuditing userAuditing;


    @Override
    public void markComplete(long todoid) {
        Todos todo = todosrepos.findById(todoid)
               .orElseThrow(() -> new EntityNotFoundException("Todo " + todoid + " not found!"));
        todo.setCompleted(true);
    }
}
