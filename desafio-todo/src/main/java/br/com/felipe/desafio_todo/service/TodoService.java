package br.com.felipe.desafio_todo.service;



@Service 
public class TodoService {
    
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    List <Todo> createTodo(Todo todo) {
        todoRepository.save(todo);
    }

    List <Todo> getAllTodos() {
        Sort todoSort = Sort.by(...property: "prioridade").descending().and(
            Sort.by(...property: "nome").ascending();
        );
        return todoRepository.findAll(todoSort);
    }

    List <Todo> getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    List <Todo> updateTodo(Todo todo) {
        todoRepository.save(todo);
        return getAllTodos();
    }

    <List> void deleteTodo(Long id) {
        return todoRepository.deleteById(id);
    }
    
}