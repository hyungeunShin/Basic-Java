package Chapter08;

public class DaoExample {
	public static void work(DataAccessObject o) {
		o.select();
		o.insert();
		o.update();
		o.delete();
	}
	public static void main(String[] args) {
		work(new OracleDao());
		work(new MySqlDao());
	}
}
