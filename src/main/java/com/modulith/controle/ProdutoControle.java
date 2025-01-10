package com.modulith.controle;

import com.modulith.produto.Produto;
import com.modulith.produto.produtoServico.ProdutoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produto")
public class ProdutoControle {

    @Autowired
    private ProdutoServico servico;

    @PostMapping
    public ResponseEntity<Void>criarProduto(@RequestBody Produto produto){
         servico.criarProduto(produto);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }
}
