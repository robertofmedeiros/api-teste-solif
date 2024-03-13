package br.com.senac.api.useCases.produtos.impl.repositorys;

import br.com.senac.api.entitys.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRespository extends JpaRepository<Produtos, Long> {
}
