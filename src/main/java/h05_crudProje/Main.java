package h05_crudProje;

public class Main {

	public static void main(String[] args) {
		
		// Crud islemleri için gereli olan class objesi oluşturmak
		CrudMetotlar metot = new CrudMetotlar();
		
		// Tüm Crud islemleri için bir session factory oluşturan methodu çalıştır. 
		metot.sessionFactoryOlustur(); 
		
		// Veri tabanına yeni personel ekle
	//	metot.personelEkle("Ahmet", "Yilmaz", 5500);
	//	metot.personelEkle("Ilyas", "Kaya", 9500);
	//	metot.personelEkle("Bawer", "Zinar", 3500);
		
		
	//	metot.idIlePersonelSil(22L);
	//	metot.idIlePersonelSil(24L);
		
		
		metot.tumPersoneliListele ();

	}

}
