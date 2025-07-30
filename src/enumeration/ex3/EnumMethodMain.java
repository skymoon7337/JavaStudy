package enumeration.ex3;

public class EnumMethodMain {
    public static void main(String[] args) {
        for (Grade grade : Grade.values()) {
            System.out.println("name= "+grade.name()+" ,ordinal= "+grade.ordinal());
        }

        //String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade userGrade = Grade.valueOf(input);
        System.out.println("회원님의 등급은: "+userGrade);
    }
}

