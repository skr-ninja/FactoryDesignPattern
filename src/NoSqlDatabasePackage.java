public class NoSqlDatabasePackage extends Package{

	@Override
	protected void createPackage() {
		dbList.add(new MongoDb());
		
	}

}
