package br.com.senac.api.useCases.palestrantes.impl.repositorys;

import br.com.senac.api.entitys.Palestrantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalestrantesRespository extends JpaRepository<Palestrantes, Long> {
}
