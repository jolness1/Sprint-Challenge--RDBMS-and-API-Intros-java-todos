package com.lambdaschool.todos.repository;

import com.lambdaschool.todos.models.Todos;
import org.springframework.data.repository.CrudRepository;

public interface ToDosRepository extends CrudRepository<Todos, Long> {
}
