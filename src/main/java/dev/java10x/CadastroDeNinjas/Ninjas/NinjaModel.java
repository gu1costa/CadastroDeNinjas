package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity transforma uma classe em uma entidade do BD.
//JPA = Java Persistence API.
@Entity
@Table(name= "tb_cadastro")
@NoArgsConstructor //Cria um construtor vazio.
@AllArgsConstructor //Cria um construtor cheio.
@Data //Cria todos os getter's e os setter's.
public class NinjaModel {

    @Id //Informa que o atributo logo abaixo é uma chave primária.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Informa a estratégia de geração de ID's.
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //Muitos ninjas para uma missão e uma missão para muitos ninjas.
    @ManyToOne
    @JoinColumn(name ="missoes_id") //Foreign key.
    private MissoesModel missoes;
}
