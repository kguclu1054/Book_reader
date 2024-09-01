
public class Book {

	public String name;
	public int page;
	public double price;
	public String type;
	public boolean isHardCover;
	public Author author;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setPage(int page){
		this.page = page;
	}
	
	public int getPage(){
		return this.page;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return this.price;
	}

	public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setHardCover(boolean isHardCover) {
        this.isHardCover = isHardCover;
    }
    
    public boolean isHardCover() {
        return this.isHardCover;
    }
       
}
