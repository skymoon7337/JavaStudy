package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProccessor processor = new BatchProccessor(list);
        processor.logic(50_000);
    }
}
