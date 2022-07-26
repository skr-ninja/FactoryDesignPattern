public class DatabaseFactory {

	public DatabaseFactory() throws IllegalStateException{
		
		throw new IllegalStateException("Can not be created");
	} 
	
	public static Package crateDatabaseConnectionObject(PackageType dbType) {
		
		switch (dbType) {
		case SQL:
			
			return new SqlDatabasePacakge();
		

        case NOSQL:
			
			return new NoSqlDatabasePackage();
			
       
        	
			default:
				return null;
		
		}
	}
}
