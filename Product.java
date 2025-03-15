class Product{
    int pcode;
    String pname;
    double price;

    Product(int pcode,String pname,double price)
    {
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
    
    public void display()
    {
        System.out.println("Product code:"+ pcode);
        System.out.println("Product name:"+ pname);
        System.out.println("Product price:"+ price);
    }

    public static void main(String[] args) {
        Product p1=new Product(1, "SmartPhone", 15000);
        Product p2=new Product(2, "Laptop", 45000);
        Product p3=new Product(3, "Watching machine", 25000);

        if ( p1.price < p2.price && p1.price < p2.price) 
        {
           p1.display();
        }
        else if (p2.price < p3.price)
        {
            p2.display();
        }
        else
        {
            p3.display();
        }
  
    }

}

