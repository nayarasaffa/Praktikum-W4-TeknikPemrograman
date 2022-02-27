package Kasus3;

/**
 * <h1> Kasus 3 : KelasSatu </h1>
 * Class KelasSatu mengimplementasikan aplikasi untuk menampilkan
 * urutan konstruksi objek
 * 
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-26-02
 */

class KelasSatu {
	{
		System.out.println(11);
	}
	
	static
	{
		System.out.println(2);		// Dibuat agar bisa dijalankan tanpa membuat objek
	}
	
	public KelasSatu(int i)			// Access modifier
	{
	System.out.println(3);
	}
	
	public KelasSatu()
	{								// Access modifier
		System.out.println(4);
	}
}
