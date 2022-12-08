package P3Asm;

import java.util.Scanner;

class Student {//create class Student
        String Id, Name, Phone, AClass;
        Student(){}
        Student(String id, String name, String phone, String aClass){
            this.Id=id;
            this.AClass=aClass;
            this.Name= name;
            this.Phone=phone;
        }
}
    class Node{
        Student data;//data=1 Student;
        Node next;
    }
public class ListStudent {
        Node head=null,tail=null;
    void AddFirst(Student x){//add x into head of list
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
    void AddLast(Student x){
        Node p= new Node();
        p.data=x;
        p.next=null;
        if ( head==null){//if list is empty => head =tail
            head=tail=p;
        }else {
            tail.next=p;
            tail=p;
        }
    }
    void Add(){
        String  id,name,phone ,aClass;
        int index=0;
        Scanner sc= new Scanner(System.in);
        while (index==0) {
            System.out.print("Enter Id: ");
            id = sc.nextLine();
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            System.out.print("Enter Phone: ");
            phone = sc.nextLine();
            System.out.print("Enter Class: ");
            aClass = sc.nextLine();
            Student student = new Student(id, name, phone, aClass);//Create student
            AddLast(student);//will add new student to the end list
            System.out.println("Do you want continue?(0/1) ");
            index= sc.nextInt();
            sc.nextLine();
        }
    }
    void print(){
        Node p=head ;//Create new Node
        System.out.println("Id\t\t\t\t   Name\t\tPhone\t\t\t Class");
        while (p!=null){
            System.out.printf("%8s\t%12s\t",p.data.Id,p.data.Name);
            System.out.printf("%8s\t%12s\t",p.data.Phone,p.data.AClass);
            System.out.println();
            p=p.next;//move to next node
        }
    }

    int getSize(){
        Node p=head;
        int count =0;
        while(p!=null){
            count++;
            p=p.next;
        }
        return  count;
    }

    void searchId(String id){
        Node p=head;
        System.out.println("ID\t\t\t\t   Name\t\tPhone\t\tClass");
        while (p!=null){
            if (id.compareToIgnoreCase(p.data.Id)==0){
                System.out.printf("%8s\t%12s\t",p.data.Id,p.data.Name);
                System.out.printf("%8s\t%12s\t",p.data.Phone,p.data.AClass);
                System.out.println();
            }
            p=p.next;
        }
    }
    void  SearchName(String name){
        Node p=head;
        System.out.println("ID\t\t\t\t   Name\t\tPhone\t\tClass");
        while (p!=null){
            if (name.compareToIgnoreCase(p.data.Name)==0){
                System.out.printf("%8s\t%12s\t",p.data.Id,p.data.Name);
                System.out.printf("%8s\t%12s\t",p.data.Phone,p.data.AClass);
                System.out.println();
            }
            p=p.next;
        }
    }
    void SearchClass(String aClass){
        Node p=head;
        System.out.println("ID\t\t\t\t   Name\t\tPhone\t\tClass");
        while (p!=null){
            if (aClass.compareToIgnoreCase(p.data.AClass)==0){
                System.out.printf("%8s\t%12s\t",p.data.Id,p.data.Name);
                System.out.printf("%8s\t%12s\t",p.data.Phone,p.data.AClass);
                System.out.println();
            }
            p=p.next;
        }
    }
    void DeleteFisrt(){
        head=head.next;
    }
    void DeleteLast(){
        Node p=head;
        while(p.next.next!=null){
            p=p.next;
        }
        p.next=null;
    }
    //more add ,edit,remove,search
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ListStudent student=new ListStudent();
        student.Add();
        student.print();
        System.out.print("Id?  ");
        String id=sc.nextLine();
        student.searchId(id);
        System.out.println("Delete First: ");
        student.DeleteFisrt();
        student.print();
        System.out.println("Delete Last: ");
        student.DeleteLast();
        student.print();
    }
}
