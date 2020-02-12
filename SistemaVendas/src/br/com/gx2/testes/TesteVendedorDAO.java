package br.com.gx2.testes;

import java.util.List;

import br.com.gx2.entity.Vendedor;
import br.com.gx2.service.ServiceFactory;
import br.com.gx2.service.VendedorService;

public class TesteVendedorDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vendedor vendedor = new Vendedor(null, "12345678","Ronaldinho XXX");
		VendedorService service = ServiceFactory.createVendedorService();
		service.cadastrarVendedor(vendedor);
		
		//dao.insert(vendedor);
		List<Vendedor> vendedores = service.exibirTodosVendedores();
		for (Vendedor v1 : vendedores) {
			System.out.print(v1.getNomeVendedor() + " - ");
			System.out.println(v1.getMatricula());
		}
		

	}

}
