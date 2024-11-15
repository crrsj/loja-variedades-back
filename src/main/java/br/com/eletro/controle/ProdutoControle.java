package br.com.eletro.controle;

import br.com.eletro.dominio.Produto;
import br.com.eletro.servico.ProdutoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
@CrossOrigin(origins = "*")
public class ProdutoControle {

    @Autowired
    private ProdutoServico servico;

     @PostMapping
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto){
        var criar = servico.criarProduto(produto);
        return new ResponseEntity<>(criar, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Produto>buscarPorId(@PathVariable Long id){
         var buscar = servico.buscarPorId(id);
         return new ResponseEntity<>(buscar,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Produto>>buscarProdutos(){
         var busca = servico.buscarTodos();
         return new ResponseEntity<>(busca,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Produto>atualizarProduto(@RequestBody Produto produto){
         var atualizar = servico.atualizarProduto(produto);
         return new ResponseEntity<>(atualizar,HttpStatus.OK);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Void>excluirProduto(@PathVariable Long id){
         servico.excluirProduto(id);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
