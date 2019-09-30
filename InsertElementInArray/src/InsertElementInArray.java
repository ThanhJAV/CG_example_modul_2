package InsertElementInArray.src;

import java.util.Scanner;


public class InsertElementInArray {
    public static void main(String[] args) {
        int []array = {4 , 12 , 7 , 8 , 1 , 6 , 9 , 32 , 0 , 10};
        int location = 0;
        int value = 0;
        int max = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap vi tri ban muon chen phan tu ( Vi tri bat dau tu 0 ): ");
        location = sc.nextInt();
        System.out.println(" Nhap phan tu ban muon chen : ");
        value = sc.nextInt();

        for(int i=max ; i>location ; i--){
            array[i] = array[i - 1];
        }
        array[location] = value;
        System.out.println(" Gia tri trong mang sau khi them : " + value + " Tai vi tri " + location);

        for(int i=0; i<=max ; i++){
            System.out.println(array[i]);
        }
    }
}
