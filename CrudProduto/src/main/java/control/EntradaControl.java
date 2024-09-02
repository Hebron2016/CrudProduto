package control;
import java.util.List;

import model.EntradaEntity;
import persistence.GenericDao;

public class EntradaControl {
	
	public EntradaControl() {
		super();
	}
	
	public void cadastrarEntrada(EntradaEntity entrada) {
		GenericDao gDao = new GenericDao();
		EntradaDao eDao = new EntradaDao(gDao);
		eDao.cadastrar(entrada);
	}
	
	public List<EntradaEntity> consultarEntradas(){
		GenericDao gDao = new GenericDao();
		EntradaDao eDao = new EntradaDao(gDao);
		List<EntradaEntity> entradas = eDao.listaDeEntrada();
		
		return entradas;
	}
	
	public void deletarEntrada(EntradaEntity entrada) {
		GenericDao gDao = new GenericDao();
		EntradaDao eDao = new EntradaDao(gDao);
		eDao.atualizar(entrada);
	}
	
	public EntradaEntity pesquisarPorCodTransacaoEntrada(EntradaEntity entrada) {
		GenericDao gDao = new GenericDao();
		EntradaDao eDao = new EntradaDao(gDao);
		
		return eDao.CodTransacao(entrada.getEntCodTransacao());
		
		
	}
}


