package br.com.felipe.desafio_todo.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.felipe.desafio_todo.entity.Todo;
import br.com.felipe.desafio_todo.repository.TodoRepository;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    String createTodo(Todo todo) {
        todoRepository.save(todo);
        return "Tarefa criada com sucesso!";
    }

    List<Todo> getAllTodos() {
        Sort todoSort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
        return todoRepository.findAll(todoSort);
    }

    Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    List<Todo> updateTodo(Todo todo) {
        todoRepository.save(todo);
        return getAllTodos();
    }

    void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

}
