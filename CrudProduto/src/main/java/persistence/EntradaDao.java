package persistence;

import java.sql.SQLException;
import java.util.List;

public interface EntradaDao<EntradaEntity> {
	public void inserir(EntradaEntity ee)throws SQLException, ClassNotFoundException;
	public void atualizar(EntradaEntity ee)throws SQLException, ClassNotFoundException;
	public void excluir(EntradaEntity ee)throws SQLException, ClassNotFoundException;
	public void consultar(EntradaEntity ee)throws SQLException, ClassNotFoundException;
	public List<EntradaEntity> listar()throws SQLException, ClassNotFoundException;
}
