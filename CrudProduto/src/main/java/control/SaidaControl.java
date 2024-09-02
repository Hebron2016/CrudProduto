package control;

import java.util.List;

import model.SaidaEntity;
import persistence.GenericDao;
import persistence.SaidaDao;
public class SaidaControl {

	public SaidaControl(){
		super();
	}
	
	public void cadastrarSaida(SaidaEntity saida) {
		GenericDao gDao = new GenericDao();
		SaidaDao sDao = new SaidaDao(gDao);
		sDao.cadastrar(saida);
	}
	
	public List<SaidaEntity> consultarSaidas(SaidaEntity saida){
		GenericDao gDao = new GenericDao();
		SaidaDao sDao = new SaidaDao(gDao);
		List<SaidaEntity> saidas = sDao.listaDeSaida();
		
		return saidas;
	}
	
	public void deletarSaida(SaidaEntity saida) {
		GenericDao gDao = new GenericDao();
		SaidaDao sDao = new SaidaDao(gDao);
		sDao.cadastrar(saida);
	}
	
	public void pesquisarPorCodTransacaoSaida(SaidaEntity saida) {
		GenericDao gDao = new GenericDao();
		SaidaDao sDao = new SaidaDao(gDao);
		sDao.CodTransacao(saida.getSaiCodTransacao());
	}
}
