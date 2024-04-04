package Day3;

public class Constructor {
	private String name;
	private int age;
	private int id;
	 public  Constructor() {//default constructor
		 System.out.println("default constructor");
		 
	}
	public Constructor(String name,int age)//paramerised con
	{
		this();
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Constructor [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	


}
