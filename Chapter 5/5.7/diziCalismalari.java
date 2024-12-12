package sercan;

public class diziCalismalari {

	public static void main(String[] args) {
// Dizi oluşturma 
//Belirtilen dizinin elemanlarını alt alta sıralama 
	/*String [] isimdizisi	={"Ali","Veli", "Enes", "Yakup","Bilal","Oğuz"};
		System.out.println("Dizinin elemanları");
		System.out.println("-----------");
		for (int i = 0; i < isimdizisi.length; i++) {
			System.out.println(isimdizisi[i]);
		}
	*/	
		
// yukarıdaki ile aynıdır sadece lenght kullanılmadı dizinin eleman sayısı kadar demek oldugu icin 
// direkt dizinin eleman sayısı yazıldı <=olsaydı 6 sayısına karşılık gelen bir deger olmadıgı icin 
// orada hata verirdi cünku indexler 0 dan baslar 6 elemanlı oldugu icin 5 te biterdi 6 sayısına 
//karsılık gelen index olmadığı icin hata verirdi .
		/*String [] isimdizisi	={"Ali","Veli", "Enes", "Yakup","Bilal","Oğuz"};
		System.out.println("Dizinin elemanları");
		System.out.println("-----------");
		for (int i = 0; i < 6; i++) {
			System.out.println(isimdizisi[i]);
		
		}
	*/
	
	// int cinsinden olusturulmustur bu dizimiz yukarıdakı gibi kısa olarakta yapılabilirdi
	/*int	[] sayilar = new int[6];  //dizi oluşturmanın başka bir yolu
	sayilar[0]=15;
	sayilar[1]=19;
	sayilar[2]=27;
	sayilar[3]=14;
	sayilar[4]=38;
	sayilar[5]=40;
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i]);
		}
	*/	
	
	
		
	// char cinsinden tanımlandıgı icin tek tırnak icnde degerler alındı.    aynı degerler alta bırden 
//fazla kez yazılabilir aşagıda gosterildigi gibi T harfi iki kez yazılabiliir. 	
	/*	char[] karakterDizi = {'S','E', 'R','C','A','N','Ö','Z','T','T','Ü','R','K'};
		for (int i = 0; i <karakterDizi.length; i++) {
			System.out.println(karakterDizi[i]);
		
		}	
		*/
		
		
		// double cinsinden dizi tanımlama yapılmıştır
		/*double[] doubleDizi = { 13.5 , 45.6 , 24.9 , 89.3};
		for (int i = 0; i < doubleDizi.length; i++) {
			System.out.println(doubleDizi[i]);
		}
		
		*/
		
		
	}

}









