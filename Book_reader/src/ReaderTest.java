
public class ReaderTest {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.name = "Araba Sevdası";
		book1.page = 256;
		book1.price = 35.50;
		book1.type = "Realist";
		book1.isHardCover = false;
		
		Book book2 = new Book();
		book2.name = "Çalıkuşu";
		book2.page = 423;
		book2.price = 140.00;
		book2.type = "Realist";
		book2.isHardCover = true;
		
		book1.setName("Kiralık Konak");
		System.out.println("Kitabın adı: " + book1.getName());
		book1.setPage(224);
		System.out.println("Kitabın sayfa sayısı: " + book1.getPage());
		book1.setPrice(131.25);
		System.out.println("Kitabın fiyatı: " + book1.getPrice());
		System.out.println("Kitabın türü: " + book1.type);
		System.out.println("Kitabının kapağı sert kapak mı: " + book1.isHardCover);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Kitabın adı: " + book2.name);
		System.out.println("Kitabın sayfa sayısı: " + book2.page);
		System.out.println("Kitabın fiyatı: " + book2.price);
		System.out.println("Kitabın türü: " + book2.type);
		System.out.println("Kitabın kapağı sert kapak mı: " + book2.isHardCover);
		
		System.out.println("-----------------------------------------");
		
		 Reader reader1 = new Reader("Kaan", 21, 'M');
		 System.out.println("Okuyucunun adı: " + reader1.name);
	     System.out.println("Yaşı: " + reader1.age);
	     System.out.println("Cinsiyeti: " + (reader1.getGender() == 'M' ? "Erkek" : "Kadın"));
	     
	     System.out.println("-----------------------------------------");

	     Reader reader2 = new Reader ("Ada", 21, 'W');
	     System.out.println("Okuyucunun adı: " + reader2.name);
	     System.out.println("Yaşı: " + reader2.age);
	     System.out.println("Cinsiyeti: " + (reader2.getGender() == 'M' ? "Erkek" : "Kadın"));
	     
	     System.out.println("-----------------------------------------");
	        
	     reader1.read(book1);
	        
	     System.out.println("-----------------------------------------");
	        
	     reader2.read(book2);
	        
	     System.out.println("-----------------------------------------");
	     
	    
	     Author author1 = new Author("Yakup Kadri Karaosmanoğlu", 1974, "Kahire-Mısır");
	     book1.author = author1;
	     Author author2 = new Author("Reşat Nuri Gültekin", 1956, "İstanbul");
	     book2.author = author2;
	     System.out.println("Kitap 1 Yazarının Adı: " + author1.name);
	     System.out.println("Kitap 2 Yazarının Adı: " + author2.name);

	}

}
