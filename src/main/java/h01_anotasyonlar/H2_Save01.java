package h01_anotasyonlar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H2_Save01 {

	public static void main(String[] args) {
		
		// Tabloya eklenecek verileri (kayıt, record) oluşturmamız gerekiyor.
		// H1_Ogrenci class dan object oluşturduk. Bu bilgler tabloya eklencektir
		H1_Ogrenci ogrenci1 = new H1_Ogrenci(101, "Canan Can", 95);
		H1_Ogrenci ogrenci2 = new H1_Ogrenci(101, "Ilyas Kaya", 98);
		
		// Veri tabanı baglantı ayarlarını Hibernate'ye göstermeliyiz. 
		// Configuration classından configresiyon objesi oluşturuyoruz. 
		Configuration con = new Configuration().
				configure("hibernate.cfg.xml").addAnnotatedClass(H1_Ogrenci.class);
		
		// sesion factory oluşturakark 
		// con objesinden bir oturum grubu oluşturduk. 
		SessionFactory sf = con.buildSessionFactory();
		
		// oturum grubundan bir oturum başlattık.
		Session session = sf.openSession();
		
		// Açılan session içerisinde işlemlere başlamak için Transaction açıyoruz,
		Transaction tx = session.beginTransaction();
		
		// Veri tabanına kayıtların eklemesi
		session.save(ogrenci1);
		session.save(ogrenci1);
		
		// işlemlerin veri tabanına aktarılması
		tx.commit();
		
		// Oturumların kapanması. 
		sf.close();
		session.close();
	
	}

}
