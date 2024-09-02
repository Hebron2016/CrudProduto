package persistence;

import java.sql.SQLException;
import java.util.List;

public interface SaidaDao<SaidaEntity> {
	public void inserir(SaidaEntity se)throws SQLException, ClassNotFoundException;
	public void atualizar(SaidaEntity se)throws SQLException, ClassNotFoundException;
	public void excluir(SaidaEntity se)throws SQLException, ClassNotFoundException;
	public void consultar(SaidaEntity se)throws SQLException, ClassNotFoundException;
	public List<SaidaDao> listar()throws SQLException, ClassNotFoundException;
}
