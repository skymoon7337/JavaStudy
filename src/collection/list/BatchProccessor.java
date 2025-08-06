package collection.list;

public class BatchProccessor {

    private final Mylist<Integer> list;

    public BatchProccessor(Mylist<Integer> list) {
        this.list = list;
    }


    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: "+ size+ ", 계산 시간: "+(endTime-startTime)+"ms");
    }
}