class Main{

public static void main(String[] args) {
    Teacher teacObj[] = new Teacher[2];
    teacObj[0] = new Teacher("1","A","AA",11,"AAA","AAAA");
    teacObj[1] = new Teacher("2","B","BB",11,"BBB","BBBB");
    teacObj[0].display();
    teacObj[1].display();
    }
}  

    class Employees {
     String Empid;
    String Name;
    String Address;
     int Salary;
    
     Employees(String id,String name,String addr,int salary){
     this.Empid  = id;
    this.Name = name;
    this.Address = addr;
     this.Salary = salary;
    }
     void display(){
     System.out.println("EmpID  : " + this.Empid);
     System.out.println("Name : " + this.Name);
     System.out.println("Address : " + this.Address);
     }
    }