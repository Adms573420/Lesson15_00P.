public class Personel {
    String isim;
    int deneyimYılı;
    int tazminat;

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setDeneyimYılı(int deneyimYılı) {
        this.deneyimYılı = deneyimYılı;
    }

    public int tazminatHesapla() {
        int tazminat = deneyimYılı * 5;
        return tazminat;


    }
}
