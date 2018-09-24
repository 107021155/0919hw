import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入攝氏度:");
        float c = scn.nextFloat();
        float f = c*9/5+32;
        System.out.println("華氏度為:"+f);


    }

    }