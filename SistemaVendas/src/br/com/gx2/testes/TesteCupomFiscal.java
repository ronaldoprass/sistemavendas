package br.com.gx2.testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.gx2.entity.Cliente;
import br.com.gx2.entity.CupomFiscal;
import br.com.gx2.entity.Loja;
import br.com.gx2.entity.Vendedor;
import br.com.gx2.service.ClienteService;
import br.com.gx2.service.CupomFiscalService;
import br.com.gx2.service.LojaService;
import br.com.gx2.service.ServiceFactory;
import br.com.gx2.service.VendedorService;
import br.com.gx2.util.JavaDate;

public class TesteCupomFiscal {

	public static void main(String[] args) throws ParseException {

		String emissao = "02/15/2020 12:29:09";
		
		LojaService lojaService = ServiceFactory.createLojaService();
		Loja loja = lojaService.pesquisarLojaId(1);

		ClienteService clienteService = ServiceFactory.createClienteService();
		Cliente cliente = clienteService.pesquisarClienteId(1);

		VendedorService vendedorService = ServiceFactory.createVendedorService();
		Vendedor vendedor = vendedorService.pesquisarVendedorId(1);

		CupomFiscalService cupomService = ServiceFactory.createCupomFiscalService();
		CupomFiscal cupom = new CupomFiscal(null, 100.0, JavaDate.getDate(emissao), loja, cliente, vendedor);

		cupomService.cadastrarCupomFiscal(cupom);

	}

}
