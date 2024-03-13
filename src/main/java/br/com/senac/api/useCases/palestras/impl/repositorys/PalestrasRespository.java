package br.com.senac.api.useCases.palestras.impl.repositorys;

import br.com.senac.api.entitys.Palestras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalestrasRespository extends JpaRepository<Palestras, Long> {
}
