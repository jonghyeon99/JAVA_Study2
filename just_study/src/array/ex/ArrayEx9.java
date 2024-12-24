package array.ex;

import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;

public class ArrayEx9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        while (true) {
            System.out.print("1. 상품등록 | 2. 상품 목록 | 3. 종료 \n메뉴를 입력하세요:");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    if (productCount == maxProducts) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    } else {
                        System.out.print("상품 이름을 입력하세요:");
                        String priceName = scan.next();
                        productNames[productCount] = priceName;
                        System.out.print("상품 가격을 입력하세요:");
                        int price = scan.nextInt();
                        productPrices[productCount] = price;
                        productCount++;
                    }
                    break;
                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                    } else {
                        for (int i = 0; i < productCount; i++) {
                            System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                        }
                    }
                    break;
                case 3:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(1);
                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }
        }

    }
}
