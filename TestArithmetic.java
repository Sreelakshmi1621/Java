import Arithmetic.Addition;
import Arithmetic.Subtraction;
import Arithmetic.Multiplication;
import Arithmetic.Division;

public class TestArithmetic{
    public static void main(String[] args) {
        Addition add = new Addition(10,5);
        Subtraction sub = new Subtraction(10,5);
        Multiplication mul = new Multiplication(10,5);
        Division div = new Division(10,5);
        
        System.out.println("Sum:"+add.calculateSum());
        System.out.println("Difference:"+sub.calculateDifference());
        System.out.println("Product:"+mul.calculateProduct());
        System.out.println("Quotient:"+div.calculateQuotient());
    }
}