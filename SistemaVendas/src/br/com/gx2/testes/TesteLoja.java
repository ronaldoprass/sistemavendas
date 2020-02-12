package br.com.gx2.testes;

import java.util.List;

import br.com.gx2.entity.Loja;
import br.com.gx2.service.LojaService;
import br.com.gx2.service.ServiceFactory;

public class TesteLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Injeção de dependência
		LojaService service =ServiceFactory.createLojaService();
	    
		Loja loja = new Loja(null, "Google Play");
		
		service.cadastrarLoja(loja);
		
		List<Loja> lojas = service.exibirTodasLojas();
		
		for (Loja l : lojas) {
			System.out.print(l.getCodigoLoja());
			System.out.print(" - ");
			System.out.println(l.getNomeLoja());
		}
		
		
		
	}

}
