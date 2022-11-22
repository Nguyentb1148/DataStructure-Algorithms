package P3Asm;

    class Student {//create class Student
        String Id, Name, Phone, Class;
        Student(){

        }
        Student(String Id, String Name, String Phone, String Class){
            this.Id=Id;
            this.Class=Class;
            this.Name= Name;
            this.Phone=Phone;
        }
    }
    class Node{
        Student data;//data=1 Student;
        Node next;
    }
public class ListStudent {
        Node head=null,tail=null;
    void AddFist(Student x){//add x into head of list
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
    void print(){
        Node p=head ;//Create new Node
        System.out.println("Id\t\t\t\t   Name\t\tPhone\t\t\t Class");
        while (p!=null){
            System.out.printf("%8s\t%12s\t",p.data.Id,p.data.Name);
            System.out.printf("%8s\t%12s\t",p.data.Phone,p.data.Class);
            System.out.println();
            p=p.next;//move to next node
        }
    }
    //more add ,edit,remove,search
    public static void main(String[] args) {
        ListStudent student=new ListStudent();
        Student student1=new Student("Gcd201888","A B C","1234567890","Gcd1001");
        student.AddFist(student1);
        Student student2=new Student("Gcd201889","X Y Z","0987654321","Gcd1001");
        student.AddFist(student2);
        student.print();
    }
}
