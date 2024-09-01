
public class Reader {

	public String name;
	public int age;
	public char gender;
	
	public Reader(String name , int age , char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void setGender(char gender) {
        this.gender = gender;
    }
	
	 public char getGender() {
	        return gender;
	    }
	 
	 public void read(Book book) {
	        System.out.println(name + " is reading \"" + book.getName() + "\".");
	        System.out.println("Page count: " + book.getPage());
	        System.out.println("Price: " + book.getPrice());
	        System.out.println("Type: " + book.getType());
	        System.out.println("Hard cover: " + (book.isHardCover() ? "Yes" : "No"));
	    }
	 
}
