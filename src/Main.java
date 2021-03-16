public class Main {
    public static void main(String args[]){
       //KalıtımSınıfı kalıtımSınıf=new KalıtımSınıfı();
       //kalıtımSınıf.kalıtım_sınıf_yazdır();
       //kalıtımSınıf.Ana_sınıfı_Yazdır();
       // Samsung samsung=new Samsung();
       // System.out.println(samsung);

      Mudur personel_mudur=new Mudur();
      personel_mudur.setIsim("Ahmet");
      personel_mudur.setDeneyimYılı(3);

      İsci personel_isci=new İsci();
      personel_isci.setIsim("Secim");
      personel_isci.setDeneyimYılı(3);

      int tazminat_mudur=personel_mudur.tazminatHesapla();
      int tazminat_isci=personel_isci.tazminatHesapla();

        System.out.println("Müdür tazminatı: "+tazminat_mudur);
        System.out.println("Isci tazminatı: "+tazminat_isci);

    }
}
