class MinStack {

    /** initialize your data structure here. */
    private final Integer MIN = 2147483647;
    private Integer min;
    private List<Integer> mins;
    private List<Integer> stack; 
    
    
    public MinStack() {
        min = MIN;
        stack = new ArrayList<>();
        mins = new LinkedList<>();
    }
    
    public void push(int x) {
        stack.add(x);
        min = (x < min) ? x : min;
        mins.add(min);
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
        mins.remove(mins.size()-1);
        if (stack.size() == 0) {
            min = MIN;
        } else {
            min = this.getMin();
        }
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return mins.get(mins.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
