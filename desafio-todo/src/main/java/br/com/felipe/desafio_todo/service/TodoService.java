package br.com.felipe.desafio_todo.service;



@Service 
public class TodoService {
    
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    <List> Todo createTodo(Todo todo) {
        todoRepository.save(todo);
    }

    <List> List<Todo> getAllTodos() {
        Sort todoSort = Sort.by(Sort.Direction.DESC, "id");
        return todoRepository.findAll();
    }

    <List> Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    <List> Todo updateTodo(Long id, Todo todo) {
        return todoRepository.findById(id).map(existingTodo -> {
            existingTodo.setTitle(todo.getTitle());
            existingTodo.setCompleted(todo.isCompleted());
            return todoRepository.save(existingTodo);
        }).orElse(null);
    }

    <List> void deleteTodo(Long id) {
        return todoRepository.deleteById(id);
    }
    
}