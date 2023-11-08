public class If{
    public static void main(String args[]){
        char nilai = 'a';
        String predikat;
        if(nilai=='a'){
            predikat="Excellent";
        }
        else if(nilai=='b'){
            predikat="Good";
        }
        else if(nilai=='c'){
            predikat="Defuq";
        }
        else{
            predikat="NO Such Grade";
        }
        System.out.println("Nilai : "+nilai);
        System.out.println("Predikat : "+predikat);
    }
}