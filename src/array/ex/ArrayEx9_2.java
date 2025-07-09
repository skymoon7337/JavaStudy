package array.ex;

import java.util.Scanner;

public class ArrayEx9_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int input = scanner.nextInt();

            switch (input){
            case 1:
                if (productCount >= productNames.length) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    break;
                }
                System.out.print("상품 이름을 입력하세요: ");
                scanner.nextLine();
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
                break;

            case 2:
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                } else {
                    System.out.println("상품 목록:");
                    for (int i = 0; i < productCount; i++) {
                        System.out.printf("%d. %s - %d원\n", i + 1, productNames[i], productPrices[i]);
                    }
                }
                break;

            case 3:
                System.out.println("프로그램을 종료합니다.");
                return;

            default:
                System.out.println("올바른 메뉴 번호를 입력하세요!");
        }

        }


    }
}
