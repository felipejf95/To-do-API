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

    public String createTodo(Todo todo) {
        todoRepository.save(todo);
        return "Tarefa criada com sucesso!";
    }

    public List<Todo> getAllTodos() {
        Sort todoSort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
        return todoRepository.findAll(todoSort);
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    public List<Todo> updateTodo(Todo todo) {
        todoRepository.save(todo);
        return getAllTodos();
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

}
