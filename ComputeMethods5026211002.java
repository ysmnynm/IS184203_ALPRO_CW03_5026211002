import java.util.Random;

public class ComputeMethods5026211002 {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public double fToC(double degreesF) {
           double degreesC = 5 * (degreesF - 32) / 9;
           System.out.println("Temp in celsius is " + degreesC);
           return degreesC;
    }
    public  double hypotenuse(int a, int b) {
            double  c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
            System.out.println("Hypotenuse is " +c);
            return c;
    }
    public int roll() {
            Random rndm = new Random();
            int dice1 = rndm.nextInt(6)+1;
            int dice2 = rndm.nextInt(6)+1;
            int sum = dice1 + dice2;
            System.out.println("The sum of the dice values is " + sum);
            return sum; 
    }        
}