import java.util.Scanner;

public class Switch2 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String nilai;
        String predikat;
        System.out.print("Nilai : ");nilai=in.nextLine();
        switch(nilai){
            case "a":predikat="Excelent";break;
            case "b":predikat="Good";break;
            case "c":predikat="Defuq";break;
            default:predikat="No Such Grade";
        }
        System.out.println("Nilai : "+nilai);
        System.out.println("Predikat :"+predikat);

    }
}
