package LList;
class Node{//declare nodes
    int data;//data
    Node next;//address next node
}
public class LList {

    Node head=null,tail=null;//declare empty list
    void AddFist(int x){//add x into head of list
        Node p=new Node();//Create new Node
        p.data=x;//insert x into p's data
        p.next=null;
        if (head==null){//if list is empty
            head=tail=p;
        }else {
            p.next=head;
            head=p;
        }
    }
    void AddLast(int x){
        Node p=new Node();//Create new Node
        p.data=x;//insert x into p's data
        p.next=null;
        if (head==null){//if list is empty
            head=tail=p;
        }else
        {
            tail.next=p;
            tail=p;
        }
    }
    void print(){
        Node p=head ;//Create new Node
        while (p!=null){
            System.out.println(p.data);//print data
            p=p.next;//move to next node
        }
    }
    int getSize(){//number elements in list
        Node p=head;
        int count=0;
        while  (p!=null){
            count++;
            p=p.next;
        }
        return count;
    }
    int Search(int x){// return place find x else return 0
        int place=-1;
        Node p=head;
        while(p!=null){
            place++;
            if (p.data==x){
                return place;
            }
            p=p.next;
        }
        return place;
    }
    void deleleFirst(){//remove first element
        head=head.next;
    }
    void deleteLast(){//remove last element
        Node p=head ;
       while(p.next.next!=null){
            p=p.next;
       }
        p.next=null;


    }

    public static void main(String[] args) {
        LList lList= new LList();
        lList.AddFist(1);
        lList.AddFist(2);
        lList.AddFist(3);
        lList.print();//3 2 1
        System.out.println();
        lList.AddLast(0);
        lList.print();//3 2 1 0
        System.out.println("Size of list: "+ lList.getSize());
        lList.deleleFirst();
        System.out.println();
        lList.print();
        lList.deleteLast();
        System.out.println();
        lList.print();
//        System.out.println(lList.Search(0));
    }
}
