package p3asm1;

import java.util.Objects;
import java.util.Scanner;

class Employee{
        String name,id;
        int age;
        float salary, commission;
        public Employee(){}
        public Employee( String name,String id,int age,float salary,float commission)
        {
            this.name=name;
            this.id=id;
            this.age=age;
            this.commission =commission;
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
    public float getCommission() {
        return commission;
    }
    public void setCommission(float commission) {
        this.commission = commission;
    }
}

public class ListEmployees {
        Employee[] listEmployee =new Employee[100];
        int count=0;

        void add(){
            int index=1;
            int i=0;
            do {

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
                i++;
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
            System.out.println("ID\t\t Name\t Age\tSalary\t\t Commision");
           for(int i=0;i<count;i++){
               Employee employee=listEmployee[i];
               System.out.printf("%5s %8s  %2d    ",employee.id,employee.name,employee.age);
               System.out.printf("%5s %10s\n",employee.salary,employee.commission);
           }
        }
        void SearchByName(String name){
            for (int i = 0; i < count; i++) {
                if (Objects.equals(listEmployee[i].name, name)){
                    Employee employee=listEmployee[i];
                    System.out.printf("%5s %8s  %2d    ",employee.id,employee.name,employee.age);
                    System.out.printf("%5s %10s\n",employee.salary,employee.commission);
                }
            }
        }
        void SortByName(){
            System.out.println("sort by name");
            String temp;
            for (int i = 0; i < count; i++) {
                int min=i;
                for (int j = i; j < count; j++) {
                    if (listEmployee[j].name.compareTo(listEmployee[min].name)>0){
                      min=j;
                    }
                    Employee employee=listEmployee[i];
                    listEmployee[i]=listEmployee[min];
                    listEmployee[min]=employee;
                }
            }
        }
        void updateCommission(float newCommission,String id){
            for (int i = 0; i < count; i++) {
                if (listEmployee[i].id.compareToIgnoreCase(id)==0){//found
                    listEmployee[i].commission =listEmployee[i].commission +newCommission;
                    System.out.println("Update commission");
                }
            }
        }
        void printZeroCommission(){
            System.out.println("List employees zero commission");
            System.out.println("ID\t\t Name\t Age\tSalary\t\t Commision");
            for(int i=0;i<count;i++){
                Employee employee=listEmployee[i];
                if (listEmployee[i].commission==0) {
                    System.out.printf("%5s %8s  %2d    ", employee.id, employee.name, employee.age);
                    System.out.printf("%5s %10s\n", employee.salary, employee.commission);
                }
            }
        }
    public static void main(String[] args) {
        ListEmployees listEmployees=new ListEmployees();
        listEmployees.add();
        listEmployees.print();
//        System.out.println("Name? ");
//        String name=sc.nextLine();
//        listEmployees.SearchByName(name);
//        listEmployees.SortByName();
//        listEmployees.print();
//        String id ="201889";
//        float newCommission=100;
//        listEmployees.updateCommission(newCommission,id);
//        listEmployees.print();
        listEmployees.printZeroCommission();
    }

    public static Scanner sc = new Scanner(System.in);
}
