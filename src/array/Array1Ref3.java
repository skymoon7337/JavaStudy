package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        students[0]=90;
        students[1]=80;
        students[2]=70;
        students[3]=60;
        students[4]=50;


        for(int i=0; i<= students.length-1;i++){
            System.out.println("학생"+(i+1)+"번째의 성적은 : "+students[i]);
        }
    }
}
