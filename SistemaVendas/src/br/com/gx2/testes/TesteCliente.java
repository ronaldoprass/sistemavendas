package br.com.gx2.testes;

import java.util.List;

import br.com.gx2.dao.ClienteDAO;
import br.com.gx2.dao.DAOFactory;
import br.com.gx2.entity.Cliente;
import br.com.gx2.service.ClienteService;
import br.com.gx2.service.ServiceFactory;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(null, "João Buracão","171");
		ClienteService service = ServiceFactory.createClienteService();
		service.cadastrarCliente(cliente);
		//dao.insert(cliente);
		List<Cliente> clientes = service.exibirTodosClientes();
		for (Cliente c1 : clientes) {
			System.out.print(c1.getCodigoCliente() + " - ");
			System.out.print(c1.getNomeCliente() + " - ");
			System.out.println(c1.getCpf());
		}
		
		
	}

}
