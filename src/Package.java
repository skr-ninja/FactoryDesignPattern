import java.util.ArrayList;
import java.util.List;

public abstract class Package {

	protected List<Database> dbList=new ArrayList<Database>();
	
	public Package() {
		createPackage();
	}

	protected abstract void createPackage();

	
	@Override
	public String toString() {
		return "Package [dbList=" + dbList + "]";
	}
	
	
}
