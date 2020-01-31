package br.com.gx2.testes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.gx2.entity.Grupo;
import br.com.gx2.entity.Produto;
import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ProdutoService;
import br.com.gx2.service.ServiceFactory;

public class TesteProdutoService {
	
	
	private ProdutoService produtoService = ServiceFactory.createProdutoService();
	private GrupoService grupoService = ServiceFactory.createGrupoService();

	@Test
	public void cadastrarProdutoService() {
		
		Grupo grupo = grupoService.pesquisarGrupoId(4);
		
		Produto produto = new Produto(null, "sj5345ias","Batedeira",grupo);
		boolean retorno = produtoService.cadastrarProduto(produto);
		assertTrue(retorno);
		
	}
	
	

}
