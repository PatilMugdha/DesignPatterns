package abstraction;

public abstract class Book implements Cloneable {
	
	private String id;
	protected String type;

	public abstract void draw();

	public Object clone() {

		Object clone = null;

		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
