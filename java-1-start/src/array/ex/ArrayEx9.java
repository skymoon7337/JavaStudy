package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int input=0;
        String[] productNames=new String[10];
        int[] productPrices=new int[10];
        int productCount=0;

        for (productCount=0;productCount<productNames.length;productCount++){

        System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
        input=scanner.nextInt();


        switch (input) {
            case 1:
                System.out.printf("상품 이름을 입력하세요");
                scanner.nextLine();
                productNames[productCount] = scanner.nextLine();

                System.out.println("상품 가격을 입력하세요");
                productPrices[productCount]=scanner.nextInt();
                break;

            case 2:

                for (int i=0;i<productCount;i++){
                    System.out.print(productNames[i]+",");
                }
                System.out.println("");

                for (int i=0;i<productCount;i++){
                    System.out.print(productPrices[i]+",");
                }
                System.out.println("");

                break;
            case 3:
                System.exit(0);
        }
        }
    }
}
