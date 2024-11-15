package br.com.eletro.repositorio;

import br.com.eletro.dominio.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto,Long> {
}
