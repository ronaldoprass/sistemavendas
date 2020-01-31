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
		
		Grupo grupo = new Grupo(null, "Eletrodomésticos");
		boolean retorno = service.cadastrarGrupo(grupo);
		
		assertTrue(retorno);
		
	}
	
	
	

	
	
	
}
