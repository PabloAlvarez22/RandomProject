
public class Hash {

	 public int id;

	    public String name;

	    public Emp next;

	    public Emp(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "Emp{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                '}';
	    }
	
}
