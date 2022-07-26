public class Test {

	public static void main(String[] args) {

	
			Package db= DatabaseFactory.crateDatabaseConnectionObject(PackageType.SQL);
			
			System.out.println(db);
			
            Package db1= DatabaseFactory.crateDatabaseConnectionObject(PackageType.NOSQL);
			
			System.out.println(db1);
			
			
	}

}
