package com.modulith.produto.produtoServico;

import com.modulith.notificacao.Notificacao;
import com.modulith.produto.Produto;
import com.modulith.produto.repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProdutoServico {
    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void criarProduto (Produto produto){
        produtoRepositorio.save(produto);
        applicationEventPublisher.publishEvent(new Notificacao(produto.getId(), produto.getNome(), new Date(),"email"));
    }

}
