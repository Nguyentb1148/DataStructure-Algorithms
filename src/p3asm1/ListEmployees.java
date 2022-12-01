package p3asm1;

import java.util.EnumMap;
import java.util.Scanner;

class Employee{
        String name,id;
        int age;
        float salary,commision;
        public Employee(){}
        public Employee( String name,String id,int age,float salary,float commision)
        {
            this.name=name;
            this.id=id;
            this.age=age;
            this.commision=commision;
            this.salary=salary;
        }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public float getCommision() {
        return commision;
    }
    public void setCommision(float commision) {
        this.commision = commision;
    }
}

public class ListEmployees {
        Employee listEmployee[]=new Employee[100];
        int count=0;

        void add(){
            int index=1;
            int i=-1;
            do {
                i++;
                System.out.println("Input information");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("id: ");
                String id = sc.nextLine();
                System.out.print("age: ");
                int age = sc.nextInt();
                System.out.print("salary: ");
                float salary = sc.nextFloat();
                System.out.print("commision: ");
                float commision = sc.nextFloat();
                Employee employee=new Employee(name, id, age, salary, commision);
                listEmployee[i]=employee;
                System.out.println("Add success.");
                System.out.println("Do you want continue?(0/1) ");
                index= sc.nextInt();
                sc.nextLine();
            }
            while(index==1);
            count=i;
        }
        void print(){
            System.out.println("List employees");
            System.out.println("ID\t\t Name\t Age \t Salary\t Commision");
           for(int i=0;i<=count;i++){
               Employee employee=listEmployee[i];
               System.out.printf("%5s %8s  %2d    ",employee.id,employee.name,employee.age);
               System.out.printf("%5s %10s\n",employee.salary,employee.commision);
           }
        }
    public static void main(String[] args) {
        ListEmployees listEmployees=new ListEmployees();
        listEmployees.add();
        listEmployees.print();
    }

    public static Scanner sc = new Scanner(System.in);
}
