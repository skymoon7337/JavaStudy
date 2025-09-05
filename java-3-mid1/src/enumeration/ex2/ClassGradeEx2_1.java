package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 20000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC,price);
        int gold = discountService.discount(ClassGrade.GOLD,price);
        int diamond = discountService.discount(ClassGrade.DIAMOND,price);

        //ClassGrade nclassGrade = new ClassGrade();

        System.out.println("basic 할인금액 = " + basic);
        System.out.println("gold 할인금액 = " + gold);
        System.out.println("diamond 할인금액 = " + diamond);


    }
}
