package br.com.gx2.testes;

import java.util.List;

import br.com.gx2.entity.Grupo;
import br.com.gx2.entity.Produto;
import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ProdutoService;
import br.com.gx2.service.ServiceFactory;

public class TesteService {

	public static void main(String[] args) {
		
	 GrupoService g1 = ServiceFactory.createGrupoService();
	 ProdutoService p1 = ServiceFactory.createProdutoService();
	 
	 Produto produto = new Produto(null,"hashjk21","produto do paraguai",g1.pesquisarGrupoId(1));
	 p1.cadastrarProduto(produto);
	 System.out.println(p1.exibirTodosProdutos().toString());
	 
		
		
		
		
		/*CupomFiscalService service =  ServiceFactory.createCupomFiscalService();
		
		List<CupomFiscal> cupons = service.exibirTodosCuponsFiscais();
		for (CupomFiscal c1 : cupons) {
			System.out.print(c1.getCodigoCupom() + " - ");
			System.out.print(c1.getEmissao() + " - ");
			System.out.print(c1.getLoja().getNomeLoja() + " - ");
			System.out.print(c1.getVendedor().getNomeVendedor() + " - ");
			System.out.print(c1.getCliente().getNomeCliente() + " - ");
			System.out.println(c1.getCliente().getCpf());
		}*/
		
		
	}

}
