public class Break {
    public static void main(String args[]){
        int C=0;
        while(C<10){
            C++;
            if(C==7) {break;} else{
                System.out.println("While ke- "+C);
            }
        }
    }
}
