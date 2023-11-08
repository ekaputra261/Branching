class Luar{
    void cetakLuar(){
        System.out.println("Cetak Luar....");
    }
class Tengah{
    void cetakTengah(){
        cetakLuar();
        System.out.println("Cetak Tengah....");
    }
class Dalam{
    void cetakDalam(){
        cetakLuar();
        cetakTengah();
        System.out.println("Cetak Dalam...");
      }
    }
  }
}

public class Nested {
    public static void main(String[] args){
        Luar l=new Luar();
        Luar.Tengah t=l.new Tengah();
        Luar.Tengah.Dalam d=t.new Dalam();
        l.cetakLuar();
        t.cetakTengah();
        d.cetakDalam();
    }
}
