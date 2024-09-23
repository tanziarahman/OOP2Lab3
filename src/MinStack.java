import java.util.Stack;

public class MinStack {
    private Stack<Integer>st;
    private int min;
    public MinStack(){
        st = new Stack<>();
        min = 10000;
    }

    public void push(int a){
        st.push(a);
        min(a);
    }
    private void min(int a){
        if(a<min){
            min=a;
        }
    }
    public void pop(){
        st.pop();
    }
    public int showMin(){
        return min;
    }
}
