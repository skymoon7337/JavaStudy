package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory2 {

    private Deque<String> browserHistory = new ArrayDeque<>();
    private String currentPage;

    public void visitPage(String url) {
        if (currentPage != null) {
            browserHistory.push(currentPage);
        }
            currentPage = url;
            System.out.println("방문: " + url);

    }

    public String goBack() {
        if (!browserHistory.isEmpty()) {
            System.out.println("현재 페이지: "+currentPage);
            currentPage=browserHistory.pop();
            System.out.println("뒤로가기: "+currentPage+"에 접속합니다.");
            return currentPage;
        }
        System.out.println("뒤로 갈 페이지가 없습니다.");
        return null;
    }
}
