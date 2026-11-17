class MyQueue {
    Deque<Integer> s1;
    Deque<Integer> s2;

    public MyQueue() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }

    public void push(int x) {
        while (!s1.isEmpty()) {
            int element = s1.pop();
            s2.push(element);
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            int element = s2.pop();
            s1.push(element);
        }

    }

    public int pop() {
       return s1.poll();
    }

    public int peek() {
       return s1.peek();
    }

    public boolean empty() {
       return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */