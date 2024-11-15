package br.com.eletro.servico;

import br.com.eletro.dominio.Produto;
import br.com.eletro.repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServico {

    @Autowired
    private ProdutoRepositorio repositorio;

    public Produto criarProduto(Produto produto){
        return repositorio.save(produto);
    }

    public Produto buscarPorId(Long id){
        Optional<Produto> buscar = repositorio.findById(id);
        return buscar.get();
    }

    public List<Produto>buscarTodos(){
        return repositorio.findAll();
    }

    public Produto atualizarProduto(Produto produto){
        return repositorio.save(produto);
    }

    public void excluirProduto(Long id){
        repositorio.deleteById(id);
    }
}
