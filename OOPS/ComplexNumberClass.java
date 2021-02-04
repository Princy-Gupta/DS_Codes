/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/


public class ComplexNumbers 
{
    
	int real;
    int imagine;
   
    
    public  ComplexNumbers(int real,int imagine)
    {
        this.real=real;
        this.imagine=imagine;
    }
    
    public void plus(ComplexNumbers c2)
    {
        this.real= this.real+c2.real;
        this.imagine= this.imagine+c2.imagine;
        
       // return this.real,this.imagine;
    }
    public void multiply(ComplexNumbers c2)
    {
        int sum=0;
        int sum1=0;
        
        sum = sum + (this.real*c2.real);
        sum1 = sum1 + (this.real*c2.imagine);
        
        sum = sum  -(this.imagine*c2.imagine);
        sum1= sum1 +(this.imagine*c2.real);
        
        this.real=sum;
        this.imagine=sum1;
        
    }
    public void print()
    {
        System.out.print(this.real + " + " + "i" + this.imagine);
    }
	
}

