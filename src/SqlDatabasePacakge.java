public class SqlDatabasePacakge extends Package{

	@Override
	protected void createPackage() {
		dbList.add(new MySql());
		dbList.add(new Oracle());
		}

}
