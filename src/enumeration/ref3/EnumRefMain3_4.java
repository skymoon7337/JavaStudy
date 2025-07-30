package enumeration.ref3;

public class EnumRefMain3_4 {

    public static void main(String[] args) {
        int price = 50000;

        Grade[] values = Grade.values();
        for (Grade value : values) {
        printDiscount(value,price);
        }

    }

    private static void printDiscount (Grade grade,int price){
        System.out.println(grade.name()+" 등급의 할인 금액은: "+grade.disCount(price));
    }
}
