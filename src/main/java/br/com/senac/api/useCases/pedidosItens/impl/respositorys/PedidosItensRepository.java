package br.com.senac.api.useCases.pedidosItens.impl.respositorys;

import br.com.senac.api.entitys.PedidosItens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidosItensRepository extends JpaRepository<PedidosItens, Long> {
}
