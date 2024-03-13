package br.com.senac.api;

import br.com.senac.api.entitys.*;
import br.com.senac.api.useCases.clientes.impl.repositorys.ClientesRespository;
import br.com.senac.api.useCases.enderecos.impl.repositorys.EnderecosRepository;
import br.com.senac.api.useCases.palestrantes.impl.repositorys.PalestrantesRespository;
import br.com.senac.api.useCases.palestras.impl.repositorys.PalestrasRespository;
import br.com.senac.api.useCases.pedidosItens.impl.respositorys.PedidosItensRepository;
import br.com.senac.api.useCases.produtos.impl.repositorys.ProdutosRespository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ApiTesteSolidApplication {
	@Autowired
	private PalestrantesRespository palestrantesRespository;

	@Autowired
	private PalestrasRespository palestrasRespository;

	@Autowired
	private ProdutosRespository produtosRespository;

	@Autowired
	private PedidosItensRepository pedidosItensRepository;

	@Autowired
	private ClientesRespository clientesRespository;

	@Autowired
	private EnderecosRepository enderecosRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiTesteSolidApplication.class, args);
	}

	@PostConstruct
	public void posConstruct() {
		/* manytomany
		Palestrantes p1 = new Palestrantes();
		p1.setNome("Roberto");
		p1.setId(1l);

		//palestrantesRespository.save(p1);

		Palestrantes p2 = new Palestrantes();
		p2.setNome("Ramon");
		p2.setId(2l);

		//palestrantesRespository.save(p2);

		List<Palestrantes> palestrantesList = new ArrayList<>();
		palestrantesList.add(p1);
		//palestrantesList.add(p2);

		Palestras palestra = new Palestras();
		palestra.setTitulo("Teste 1");
		palestra.setDuracao(2);
		palestra.setDataHora(LocalDateTime.now());
		palestra.setPalestrantes(palestrantesList);
		palestra.setId(3l);

		palestrasRespository.save(palestra);

		//palestrasRespository.deleteById(2l);
		 */

		/* ManyToOne
		Produtos produto = new Produtos();
		produto.setNome("Teste");

		Produtos resultado = produtosRespository.save(produto);

		PedidosItens item = new PedidosItens();
		item.setQuantidade(1);
		item.setValor(10.00);

		Produtos p1 = new Produtos();
		p1.setId(resultado.getId());

		item.setProduto(p1);

		pedidosItensRepository.save(item);

		 */

		/* OneToMany
		Clientes c1 = new Clientes();
		c1.setNome("Roberto");
		c1.setEmail("sdxsxsxs");
		//c1.setEnderecos(enderecosList);

		Clientes resultado = clientesRespository.save(c1);

		Enderecos e1 = new Enderecos();
		e1.setRua("teste");

		Clientes c2 = new Clientes();
		c2.setId(resultado.getId());
		e1.setCliente(c2);

		enderecosRepository.save(e1);
		 */

	}

}
