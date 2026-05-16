class Pair{
    int first;
    int second;
    
    Pair( int first, int second ) {
        this.first = first;
        this.second = second;
    }
}

class StockSpanner {
    Stack<Pair> st;
    public StockSpanner() {
        st = new Stack();
    }
    
    public int next(int price) {
        int span = 1;   

        while( !st.isEmpty() && st.peek().first <= price ) {
            span += st.peek().second;
            st.pop();
        }

        st.push( new Pair(price, span) );

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */