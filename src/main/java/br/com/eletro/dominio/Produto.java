package br.com.eletro.dominio;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produtos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       private String categoria;
       private String nome;
       private String marca;
       private String modelo;
       @Size(max = 1000)
       private String imagem;
       private Double preco;




}
