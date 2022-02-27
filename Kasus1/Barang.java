package Kasus1;

/**
 * <h1> Kasus 1 : Barang </h1>
 * Class Barang mengimplementasikan aplikasi untuk mendefinisikan
 * struktur data yang diperlukan oleh Objek Barang
 * 
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-26-02
 */

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;										/* Variabel stok dibungkus supaya tidak bisa dilakukan 
															   operasi aritmatika selain tambah saja*/
	
	public int getStok() {									// Method getStok untuk mengembalikan nilai barang
		return stok;
	}

	public void setStok(int stok) {							// Method setStok untuk menambahkan stok barang
		this.stok += stok;									// Dilakukan proses aritmatika berupa penjumlahan untuk menambah stok barang
	}
	
	public Barang(String kode, String nama, int stk) { 		// Method Barang untuk inisialisasi objek
		kode_barang = kode;
		nama_barang = nama; 
		stok = stk;
	}
	
	void printShowBarang(){									// Method printShowBarang untuk Print objek berupa nama dan stok barang ke layar
		System.out.println(this.nama_barang + "(" + this.stok + ")");
	}
}
