package hw2.chapter3;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Name",100);
        Employee employee1 = new Employee("Name1",1000);
        Employee employee2 = new Employee("Name2",10);
        Employee employee3 = new Employee("Name3",0);

        System.out.println( employee.getMeasure());
        Employee[] employees1 =new  Employee[] {employee,employee1,employee2,employee3};
        System.out.println(Measurable.average(employees1));
        System.out.println(Measurable.largest(employees1));


    }
}
