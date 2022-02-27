package Kasus1;

/**
 * <h1> Kasus 1 : Inventori </h1>
 * Class Inventori mengimplementasikan aplikasi untuk mendefinisikan
 * pembuatan objek-objek barang dan menampilkan objek barang yang
 * telah dibuat dan pengadaan barang baru untuk menambah stok barang.
 * Class Inventori merupakan Main Class
 * 
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-26-02
 */

public class Inventori {
	/* Instansiasi Objek */
	Barang[] barangs;
	
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10); 			// Inisialisai objek 1 berupa kode, nama, dan stok barang
		barangs[1] = new Barang("002", "Celana", 20);			// Inisialisai objek 2 berupa kode, nama, dan stok barang
	}
	
	void showBarang() {
		/* Memanggil method printShowBarang di class Barang */
		barangs[0].printShowBarang();							// Print objek 1 berupa nama dan stok barang ke layar
		barangs[1].printShowBarang();							// Print objek 2 berupa nama dan stok barang ke layar
	}
	
	void pengadaan() {
		initBarang();											// Panggil method initBarang() untuk inisialisasi objek
		barangs[0].setStok(20);									// Tambahkan stok barang dengan memanggil method setStok di class Barang
		barangs[0].setStok(30);
		barangs[0].setStok(30);
		showBarang();											// Panggil method showBarang() untuk print objek ke layar
	}
	
	public static void main(String[] args) {
		Inventori beli = new Inventori(); 
		beli.pengadaan();
	}
}
