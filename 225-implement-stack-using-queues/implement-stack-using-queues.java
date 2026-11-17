class MyStack {
    Deque<Integer> q1;
    Deque<Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        //add or insert element in q2 
        //then copy the elements of q1 in q2
        //then swap the q1 with q2
        //inser done
        q2.offer(x);
        // transfer done
        while(!q1.isEmpty()){
           int element = q1.poll();
           q2.offer(element);
        }
        // swap done
        Deque<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    public int pop() {
      return  q1.poll();

    }
    
    public int top() {
      return  q1.peek();
    }
    
    public boolean empty() {
      return  q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */