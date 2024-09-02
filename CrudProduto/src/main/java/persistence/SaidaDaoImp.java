package persistence;

public class SaidaDaoImp implements SaidaDao {

	private GenericDao gDao;
	
	public void SaidaDaoImp(GenericDao gDao) {
		this.gDao = gDao;
	}
	
	@Override
	public void inserir(SaidaEntity se)throws SQLException, ClassNotFoundException{
		Connection c = gDao.getConnection();
		String sql = "INSERT INTO " 
	}
	
	@Override
	public void atualizar(SaidaEntity se)throws SQLException, ClassNotFoundException{
		Connection c = gDao.getConnection();
		String sql = "UPDATE Saida SET codigo_"
		PreaparedStatement ps = c.prepareStatement(sql);
		ps.setString(1)
	}
}
