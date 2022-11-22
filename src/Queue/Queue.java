package Queue;


public class Queue {
    int max=5;
    int q[]=new int[5];//declare queue has  10 elements
    int front=0,rear=0;//queue empty
    void enqueue(int x){//insert x in to rear queue

        q[rear]=x;//insert x in to rear queue
        rear=(rear+1)%max;//increase rear
    }
    int dequeue(){//take element front queue and remove
        int x=q[front];//take element front queue
        front=(front+1)%max;//increase front
        return x;
    }
    int countElement(){//count element in queue
        return (max+rear-front)%max;
    }
    boolean isEmpty(){
        return (front==rear);
    }
    int peak(){//take front element without remove
        return q[front];
    }
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.printf("Front = %d; rear= %d " ,queue.front,queue.rear );
        int x=queue.dequeue();//take front element from queue and remove
        System.out.println("\n"+x);
        System.out.printf("\nFront = %d; rear= %d " ,queue.front,queue.rear );
        System.out.printf("\ncount elements: "+ queue.countElement());
        x=queue.peak();
        System.out.println("\n"+x);
        System.out.printf("\nFront = %d; rear= %d " ,queue.front,queue.rear );
        System.out.printf("\ncount elements: "+ queue.countElement());
    }
}
