public class Switch {
    public static void main(String args[]){
        char nilai ='a';
        String predikat;
        switch(nilai){
            case 'a':predikat="Excelent";break;
            case 'b':predikat="Good";break;
            case 'c':predikat="Defuq";break;
            default:predikat="No Such Grade";
        }
        System.out.println("Nilai : "+nilai);
        System.out.println("Predikat :"+predikat);
    }
}
