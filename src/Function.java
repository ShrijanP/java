
    import java.util.Scanner;

    public class Function {
        public static void main(String[] args) {
            numInt();
        }
        public static void numInt() {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter principle : ");
            float principle=scanner.nextFloat();

            System.out.println("Enter rate: ");
            float rate=scanner.nextFloat();

            System.out.println("Enter  time: ");
            float time=scanner.nextFloat();

            float interest =(principle*time*rate)/100;
            System.out.println(interest);
        }
    }

     class simpleInterest {
        public static void main (String []args) {
            floatNum();
        }
        public static void floatNum() {

            float p, r, t, si;
            p = 13;
            r = 12;
            t = 2;
            si = (p * r * t) / 100;
            System.out.println("Simple Interest is: " + si);
        }
        }

     class Area1 {
        public static void main(String[] args) {
            intAreaa();
        }
        public static void intAreaa(){
            int r;
            double pi = 3.14, area;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter radius of circle:");
            r = s.nextInt();
            area = pi * r * r;
            System.out.println("Area of circle:"+area);
        }
    }

    class Primee{
        public static void main(String args[]) {
            primeCheck();
        }
        public static void primeCheck(){
            int num,i;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number");
            num=sc.nextInt();
            prime(num);
        }

        static void prime(int num)
        {
            int i,c=0;
            for(i=1;i<= num;i++)
            {
                if(num%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(num+" is a Prime number");
            }
            else
            {
                System.out.println(num+" is not a Prime number");
            }
        }
    }

    class ProductOfNumber3{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1=sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2=sc.nextInt();

            System.out.println("Enter the third number:");
            int num3=sc.nextInt();

            calcProduct(num1,num2,num3);
        }

        public static void calcProduct(int x,int y,int z){
            int result=0;
            result=x*y;
            System.out.println("product of three numbers  "+result);
        }
    }