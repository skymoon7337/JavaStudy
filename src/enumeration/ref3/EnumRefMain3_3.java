package enumeration.ref3;

public class EnumRefMain3_3 {

    public static void main(String[] args) {
        int price = 50000;

        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.disCount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.disCount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.disCount(price));

        }

    private static void printDiscount (Grade grade,int price){
        System.out.println(grade.name()+" 등급의 할인 금액은: "+grade.disCount(price));
    }
}
