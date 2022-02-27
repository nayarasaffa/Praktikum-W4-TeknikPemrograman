package Kasus2;

/**
 * <h1> Kasus 2 : Item </h1>
 * Class Item mengimplementasikan aplikasi untuk menampilkan
 * string ke layar tanpa mengikuti isi Stirng di main class
 * 
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-27-02
 */

public class Item {
	private String name;
	
	private Item() {
		name = "Ipin";					// Isi variabel name dengan kata "Ipin"
	}

	public Item(String name) {
		/*this.name = new Item().name;*/	/* Panggil method Item, agar output yang dihasilkan adalah "Ipin"
										   dan tidak mengikuti isi String di main class */
		System.out.println(this.name);	// Tampilkan isi string ke layar
	}

}
