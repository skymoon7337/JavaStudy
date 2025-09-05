package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title="인셉션";
        movieReview1.review="인생은 무한 루프";

        MovieReview mr2= new MovieReview();
        mr2.title="어바웃 타임";
        mr2.review="인생 시간 영화";

        System.out.println(movieReview1.title+movieReview1.review);
        System.out.println(mr2.title+mr2.review);
    }
}
