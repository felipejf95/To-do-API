package br.com.felipe.desafio_todo.controller;

@RestController
@RequestMapping()"/todos")
public class TodoController {
    
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @POSTMapping
    List <Todo> createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @GETMapping
    List <Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GETMapping("/{id}")
    List <Todo> getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    @PutMapping
    List <Todo> updateTodo(@RequestBody Todo todo) {
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/{id}")
    <List> void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}