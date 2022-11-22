package Stack;

public class Stack {
    int S[] =new int[10];//define S has 10 elements
    int top=-1;// list Stack(top=-1 => S=⊘)
    void Push (int x){
        top++;
        S[top]=x;
    }
    int Pop(){//Take element on top Stack and remove
        int x=S[top];
        top--;
        return x;
    }
    int Peak()// Take element on top without remove
    {
        return S[top] ;
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        System.out.printf("Top: %d ", stack.top);
        int x=stack.Pop();
        System.out.printf("\nx = pop() = %d",x);
        System.out.printf("\nTop: %d ", stack.top);
        stack.Peak();
        System.out.printf("\nTop: %d ", stack.top);
    }
}
