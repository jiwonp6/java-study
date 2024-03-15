package ch25_collection;

import java.util.*;

public class N3_LifoFifo {
    public static void main(String[] args) {
        // LIFO (Last In First Out) : 후입선출  => stack
        // FIFO (First In First Out) : 선입선출 => Queue

        /*
           1. Stack
            : 마지막에 추가 된 요소가 먼저 제거됨
            - push : 스택에 요소를 추가
            - pop : 스택에서 요소를 꺼냄 (제거 + 반환)
            - peek : 스택에서 요소를 반환

            ex. 함수 호출의 콜스텍, DFS(깊이 우선 탐색)

            Java 에서 Stack 클래스는 컬렉션 프레임워크와 일관성이 떨어지는 문제로 사용X
                -> 모던 자바에서는 ArrayDeque 를 사용
         */
        Stack<Integer> stack = new Stack<>();
        // push() : 요소 추가
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("stack = " + stack);

        // pop() : 가장 마지막에 있는 것부터 삭제하면서 반환
        Integer popNum = stack.pop();
        System.out.println("popNum = " + popNum);
        System.out.println("stack = " + stack);

        // peek() : 가장 마지막에 있는 것 반환, 삭제 X
        Integer peekNum = stack.peek();
        System.out.println("peekNum = " + peekNum);
        System.out.println("stack = " + stack);

        /*
            2. Queue
             : 대기열, 가장 먼저 추가된 요소가 가장 먼저 제거
             - offer : 큐의 끝에 요소를 추가
             - poll : 큐의 시작 부분 요소를 제거하고 반환
             - peek : 큐의 시작 부분 요소를 확인하고 제거하지 않음

             ex. 웹 서버의 요청 처리 대기, BFS(너비 우선 탐색)

             Queue 인터페이스 구현 객체 : LinkedList, ArrayDeque
         */
        Queue<String> queue = new LinkedList();

        // offer() : 요소 추가
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");

        System.out.println("queue = " + queue);

        // poll() : 가장 앞 요소 반환하며 삭제
        String pollAlphabet = queue.poll();
        System.out.println("pollAlphabet = " + pollAlphabet);
        System.out.println("queue = " + queue);

        // peek() : 가장 앞 요소 반환, 삭제 X
        String peekAlphabet = queue.peek();
        System.out.println("peekAlphabet = " + peekAlphabet);
        System.out.println("queue = " + queue);

        /*
            3. Deque(데크, Double Ended Queue)
             : queue 자료 구조에서 양 쪽 끝 요소를 추가하거나 제거할 수 있는 유연한 자료 구조,
               FIFO 와 LIFO 방식 모두 지원
             - addFirst : 앞 쪽에 요소 추가
             - addLast(), offerLast() : 뒤 쪽에 요소 추가
             - removeFirst(), pollFirst() : 앞 쪽에서 요소 제거 (FIFO)
             - removeLast(), pollLast() : 뒤 쪽에서 요소 제거 (LIFO)

             Deque 인터페이스 구현 객체 : LinkedList, ArrayDeque
         */
        Deque<Integer> deque = new ArrayDeque<>(
                Arrays.asList(3, 4, 5)
        );
        System.out.println("deque = " + deque);

        // addFirst : 앞 쪽에 요소 추가
        deque.addFirst(2);
        System.out.println("deque = " + deque);
        deque.addFirst(1);
        System.out.println("deque = " + deque);

        // addLast(), offerLast() : 뒤 쪽에 요소 추가
        deque.addLast(6);
        System.out.println("deque = " + deque);
        deque.offerLast(7);
        System.out.println("deque = " + deque);

        // removeFirst(), pollFirst() : 앞 쪽에서 요소 제거 (FIFO)
        deque.removeFirst();
        System.out.println("deque = " + deque);
        deque.pollFirst();
        System.out.println("deque = " + deque);

        // removeLast(), pollLast() : 뒤 쪽에서 요소 제거 (LIFO)
        deque.removeLast();
        System.out.println("deque = " + deque);
        deque.pollLast();
        System.out.println("deque = " + deque);

    }
}
