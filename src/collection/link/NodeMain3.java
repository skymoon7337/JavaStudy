package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode.item);

        // 특정 index의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item); //to String 있어서 그냥도 되긴함

        // 데이터 추가하기
        System.out.println("== 추가 전: "+first+" ==");
        Node lastAdded = add(first, "D");
        System.out.println("데이터 추가하기: "+lastAdded.item);
        System.out.println("== 추가 후: "+first+" ==");


    }

    private static void printAll(Node node) {
        Node x = node;
        while(x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static Node add(Node node, String param) {
        Node x = node;
        while(x.next != null){
            x = x.next;
        }
        x.next = new Node(param);
        return x.next;
    }
}
