package com.modulith.produto.repositorio;

import com.modulith.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto,Long> {


}
