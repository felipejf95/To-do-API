package br.com.felipe.desafio_todo.entity;


@Getters
@Setters
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private String nome;
    private String descricao;
    private int prioridade;
    private boolean completed = false;

    
    
}