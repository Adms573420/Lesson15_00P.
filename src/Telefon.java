public class Telefon {
    public Telefon(){
        System.out.println("Telefon");
    }
}
class AkıllıTelefon extends Telefon{
    public AkıllıTelefon(){
        System.out.println("AkıllıTelefon");
    }
}
class CepTelefonu extends AkıllıTelefon{
    public CepTelefonu(){
        System.out.println("CepTelefonnu");
    }
}

class Samsung extends CepTelefonu{
    public Samsung(){
        System.out.println("Samsung");
    }
}
