package ch21;

public class BookTest {
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
//		for(int i =0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("태백산맥 1","조정래");
		library[1] = new Book("태백산맥 2","조정래");
		library[2] = new Book("태백산맥 3","조정래");
		library[3] = new Book("태백산맥 4","조정래");
		library[4] = new Book("태백산맥 5","조정래");
		
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		library[0].setTitle("바뀐산백");
		library[1].setAuthor("윤태검");
		
		System.out.println("== library ==");
		for(Book book : library) {
			//System.out.println(book);
			book.showInfo();
			
		}
		
		System.out.println("== Copy library ==");
		for(Book book : copyLibrary) {
			//System.out.println(book);
			book.showInfo();
			
		}
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		boolean isVaild = num1-- < 10 || num2-- < 20 || num3-- < 30;
		
		System.out.println(isVaild+" , "+num1+" , "+num2+" , "+ num3);
	}
}
