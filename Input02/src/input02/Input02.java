
package input02;
import java.util.Scanner;

public class Input02 {

    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
        int hari;
        System.out.println("Masukkan Angka 1-7 : ");
        hari=masuk.nextInt();
        if(hari == 1){
            System.out.println("senin");
        }
        if(hari == 2){
            System.out.println("selasa");
        }
        if(hari == 3){
            System.out.println("rabu");
        }
        if(hari == 4){
            System.out.println("kamis");
        }
        if(hari == 5){
            System.out.println("jumat");
        }
        if(hari == 6){
            System.out.println("sabtu");
        }
        if(hari == 7){
            System.out.println("minggu");
        }
        
        
    }
    
}
