public class employee extends person{

    int salary;

    employee(String first,String last,int salary){
       super(first,last);
        this.salary=salary;
    }

    void showSalary() {
        System.out.println(this.first+"'s salary is $"+this.salary);
    }
}
