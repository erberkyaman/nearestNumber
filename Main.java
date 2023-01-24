import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] list = {8,520,-15,-5,1,85};
        Arrays.sort(list);
        int min = list[0];
        int max = list[list.length-1];
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Girilen Sayı : ");
        number = input.nextInt();

        for (int i=0 ; i<list.length;i++){
        if(list[i]<number){
            if (list[i]>min) {
                min = list[i];
            }
        }}
        for (int j=0; j< list.length;j++){
            if(list[j]>number){
                if (list[j]<max) {
                    max = list[j];
                }
            }

        }




        System.out.println("Girilen sayıdan küçük en yakın sayı : "+ min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+ max);
    }



}
