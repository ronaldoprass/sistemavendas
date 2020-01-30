package br.com.gx2.testes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.gx2.entity.Grupo;
import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ServiceFactory;

public class TestGrupoService {
	
	
	private GrupoService service = ServiceFactory.createGrupoService();
	
	@Test
	public void cadastrarGrupoTest() {
		Grupo grupo = new Grupo(null, "Teste JUnit");
		assertTrue(service.cadastrarGrupo(grupo));
		
	}
	
	@Test
	public void apagarGrupoTest() {
		
		assertTrue(service.apagarGrupo(4));
		
	}
	
	@Test
	public void alterarGrupoTest() {
		Grupo grupo = new Grupo(5, "Alterar grupo");
		assertTrue(service.alterarGrupo(grupo));
		
	}
	
	@Test
	public void exibirTodosGruposTest() {
		
		assertTrue(service.exibirTodosGrupos().size()>0);
	}
	
	
}
