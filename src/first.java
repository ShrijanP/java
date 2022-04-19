import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int maths=95;
        int English=92;
        int Science=77;
        int Nepali=61;
        int Sum=maths+ English+Science+Nepali;
        int percent= Sum/4;
        System.out.println(percent + "%");
        if (percent>=70) {
            System.out.println("first Class");
        }else if(percent>59){
            System.out.println("Second Class");
        }
        else if (percent>49){
            System.out.println("Third Class");
        }
        else if (percent>39){
            System.out.println("Fourth Class");
        }
        else{
            System.out.println("Fail");
        }
    }
}


// area of trianlge

class Area{
    public static void main(String[] args) {
        double length=30;
        double breadth=10;
        double Area=(0.5)*(length*breadth);
        System.out.println(Area+" square cm");
    }
}

class Volume_cube{
    public static void main(String[] args) {

        double length=10.23;
        double Volume=length*length*length;
        System.out.println("The volume of cube is "+ Volume);
    }
}
class Volume_cuboid{
    public static void main(String[] args) {

        double length=25.5;
        double breadth=10;
        double height=5.5;
        double Volume= length*breadth*height;
        System.out.println("The volume of cuboid is "+ Volume);
    }
}

class  Result {
    public static void main(String[] args) {
        double maths=80;
        double English=60;
        double Science=77;
        double Nepali=81;
        double Sum=maths+ English+Science+Nepali;
        double percent= Sum/4;
        System.out.println(percent + "%");
        String result;
        result=(percent>70)? "First class": (percent>59)? "Second class" :(percent>49)?
                "Third class":(percent>39)?"Fourth class" :"fail";
        System.out.println(result);

    }
}

class Name{
    public static void main(String[] args) {
        System.out.println("Shrijan");
        System.out.println("pokharel");
    }
}

class Input{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a= scanner.nextLine();
        System.out.println(a);

    }
}


class Sum{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the name: ");
        String A=scanner.nextLine();

        System.out.println("enter the age: ");
        int B=scanner.nextInt();

        System.out.println("enter the Address: ");
        scanner.nextLine();
        String c=scanner.nextLine();


        System.out.println(A+" "+B+" "+c);

//        System.out.println("my name is "+ A);
//        System.out.println("    my Age is "+ B);
//        System.out.println("        my Addeess is "+ c);
    }

}

class Si{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the Principle: ");
        String A=scanner.nextLine();

        System.out.println("enter the Time: ");
        String B=scanner.nextLine();

        System.out.println("enter the Rate: ");
        String C=scanner.nextLine();

        int AA=Integer.parseInt(A);
        int Ab=Integer.parseInt(B);
        int Ac=Integer.parseInt(C);
        float SI=(AA*Ab*Ac)/100;
        System.out.println(SI);

    }
}


import java.util.Scanner;

public class Secondjava {
     import java.util.Scanner;


    //Question 1
    public class Second {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the Name of student: ");
            String A=scanner.nextLine();
            System.out.println("enter the marks of student: ");
            int B=scanner.nextInt();
            if (B>=70) {
                System.out.println(A+" has Scored "+" First division");
            }
            else if(B>=50){
                System.out.println(A+" has Scored "+"Second division");
            }
            else if (B>=40){
                System.out.println(A+" has Scored "+"Third division");
            }
            else {
                System.out.println(A+" has Scored "+"Fail");
            }
        }
    }

    class Question2{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int A=scanner.nextInt();
            System.out.println("Enter the Second number: ");
            int B=scanner.nextInt();
            System.out.println("Enter the Third number: ");
            int C=scanner.nextInt();
            System.out.println("Enter the Fourth number: ");
            int D=scanner.nextInt();

            int Sum=A+B+C+D;
            System.out.println("The sun is "+Sum);

        }
    }

    class question3{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the Marks of Maths: ");
            double A=scanner.nextDouble();
            System.out.println("Enter the Marks of English: ");
            double B=scanner.nextDouble();
            System.out.println("Enter the Marks of Nepali: ");
            double C=scanner.nextDouble();
            System.out.println("Enter the Marks of Science: ");
            double D=scanner.nextDouble();
            double sum = A+B+C+D;
            System.out.println("The total marks is "+ sum);
            double percent=sum/4;
            String result;
            result=(percent>70)? "First class": (percent>59)? "Upper Second class" :(percent>49)?
                    "Second class":(percent>39)?"third class" :"fail";
            System.out.println(result);


        }
    }

    class question4{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int A=scanner.nextInt();
            System.out.println("Enter the second number: ");
            int B=scanner.nextInt();
            int sum =A+B;
            int product=A*B;
            System.out.println("The sum of given number is "+ sum);
            System.out.println("The product of given number is "+ product);
        }
    }

    class question5{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int A=scanner.nextInt();
            System.out.println("Enter the second number: ");
            int B=scanner.nextInt();
            float sum =A+B;
            float product=A*B;
//        float SUM=Integer.parseInt(sum);
            float Division=product/sum;
            System.out.println("The Answer is "+ Division);

        }
    }

    class question6{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the length: ");
            double A=scanner.nextDouble();
            System.out.println("Enter the breadth: ");
            double B=scanner.nextDouble();
            double Area =A*B;
            System.out.println("The area of rectangle is "+ (int)Area);
        }
    }
    class question7{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Name: ");
            String A = scanner.nextLine();
            System.out.println("Enter the roll number: ");
            int B=scanner.nextInt();
            System.out.println("Enter the Field of interest: ");
            scanner.nextLine();
            String C = scanner.nextLine();
            System.out.println("My name is "+A+ " and my roll number is "+B+" " +
                    "and my field of interest is "+C+".");
        }
    }

    class question8{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System .in);
            System.out.println("Enter the length of square: ");
            float A=scanner.nextFloat();
            float Area=A*A;
            float perimeter=4*A;
            System.out.println("the area is "+Area);
            System.out.println("the perimeter is "+perimeter);


        }
    }
    class Simple{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the Principle: ");
            String A=scanner.nextLine();

            System.out.println("enter the Time: ");
            String B=scanner.nextLine();


            System.out.println("enter the Rate: ");
            String C=scanner.nextLine();

            int AA=Integer.parseInt(A);
            int Ab=Integer.parseInt(B);
            int Ac=Integer.parseInt(C);
            float SI=(AA*Ab*Ac)/100;
            System.out.println(SI);

        }
    }
    class AreaTriangle{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the length: ");
            double length=scanner.nextDouble();
            System.out.println("Enter the breadth: ");
            double breadth  =scanner.nextDouble();
            double Area=(0.5)*(length*breadth);
            System.out.println(Area+" square cm");
        }
    }

    class Volumecube{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the length of cube: ");
            double length=scanner.nextDouble();
            double Volume=length*length*length;
            System.out.println("The volume of cube is "+ Volume);
        }
    }

    class Volumecuboid{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the length: ");
            double length=scanner.nextDouble();
            System.out.println("Enter the breadth: ");
            double breadth  =scanner.nextDouble();
            System.out.println("Enter the height: ");
            double height  =scanner.nextDouble();

            double Volume= length*breadth*height;
            System.out.println("The volume of cuboid is "+ Volume);
        }
    }

    class question9{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number: ");
            float  A= scanner.nextFloat();
            double Square =A*A;
            System.out.println("The square of "+A+" is "+ Square);
        }
    }
    class question10{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the First Name: ");
            String A = scanner.next();
            System.out.println("Enter the Last Name: ");
            String B = scanner.next();
            System.out.println(A+" "+B);
        }
    }
    class question11{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first number : ");
            int A=scanner.nextInt();
            System.out.println("Enter the Second Number: ");
            int B=scanner.nextInt();
            System.out.println("Enter the third Number: ");
            int C=scanner.nextInt();

            String check=((A==B)&&(A==C)) ?"All three are equal": (A==B)?"A and B are equal":(A==C)?"A and C are Equal":(B==C)?"B ans C are equal":"no thing is equal";
            System.out.println(check);
        }
    }

    class question12{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first number : ");
            int A=scanner.nextInt();
            System.out.println("Enter the Second Number: ");
            int B=scanner.nextInt();
            System.out.println((A<B)&& (A<50));
        }
    }

    class question13{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first Marks : ");
            float A = scanner.nextFloat();
            System.out.println("Enter the Second Marks: ");
            float B = scanner.nextFloat();
            System.out.println("Enter the Second Marks: ");
            float C = scanner.nextFloat();
            float sum = A + B + C;
            System.out.println("the total marks is " + sum);
            float percent=sum/3;
            System.out.println("the percent scored is "+percent);
        }
    }{
    }

}

import javax.swing.*;
        import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Third {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int A=scanner.nextInt();
//        System.out.println("Enter the number");
//        int B=scanner.nextInt();
        scanner.nextLine();
        int sum =A;
        JOptionPane.showMessageDialog(null,"the sum is: "+sum);
//        System.exit(0);
    }
}
class Gui{
    public static void main(String[] args) {
        String name="error404";
        JOptionPane.showMessageDialog(null,name);
    }
}

class gui{
    public static void main(String[] args) {
        String first=((JOptionPane.showInputDialog("enter your name: " )));
        String third=((JOptionPane.showInputDialog("enter your Address: " )));

        int Second=Integer.parseInt((JOptionPane.showInputDialog("enter your Phone: " )));
        JOptionPane.showMessageDialog(null,"My name is "+first+"\n My address is "
                +third+"\n my phone number is "+Second);
    }
}
class marks{
    public static void main(String[] args) {
        double A=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of maths: ")));
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double D=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Social: ")));
        double sum=A+B+C+D;
        double per= sum/4;
        int percentint=(int)per;
//         JOptionPane.showMessageDialog(null,"Your percent is: "+ percentint+"%" );
        JOptionPane.showMessageDialog(null,"Your percent is: "+ percentint +"/U0025");
    }
}




//    questions for day 3
class q1{
    public static void main(String[] args) {
        String first=((JOptionPane.showInputDialog("enter your name: " )));
        String third=((JOptionPane.showInputDialog("enter your Address: " )));
        int Second=Integer.parseInt((JOptionPane.showInputDialog("enter your Phone: " )));
        int Fourth=Integer.parseInt((JOptionPane.showInputDialog("enter your marks scored: " )));

        JOptionPane.showMessageDialog(null,"My name is "+first+"\n My address is "
                +third+"\n my phone number is "+Second+"\n"+first+" has scored "+Fourth+" marks.");
    }
}

class q2{
    public static void main(String[] args) {
        int First=Integer.parseInt((JOptionPane.showInputDialog("enter the first number: " )));
        int Second=Integer.parseInt((JOptionPane.showInputDialog("enter the second number: " )));
        int Third=Integer.parseInt((JOptionPane.showInputDialog("enter the third number: " )));
        int Fourth=Integer.parseInt((JOptionPane.showInputDialog("enter your fouth number: " )));

        int sum=First+Second+Third+Fourth;
        JOptionPane.showMessageDialog(null,"The sum of given inputs is "+sum);
    }
}
class q3{
    public static void main(String[] args) {
        String name=((JOptionPane.showInputDialog("enter your name: " )));
        double A=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of maths: ")));
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double D=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Social: ")));
        double sum=A+B+C+D;
        double per= sum/4;
        int percentint=(int)per;
        if (percentint>=70) {
            JOptionPane.showMessageDialog(null ,name+" has Scored "+" First division");
        }
        else if(percentint>=50){
            JOptionPane.showMessageDialog(null,name+" has Scored "+"Second division");
        }
        else if (percentint>=40){
            JOptionPane.showMessageDialog(null,name+" has Scored "+"Third division");
        }
        else {
            JOptionPane.showMessageDialog(null,name+" has Scored "+"Fail");
        }
    }
}



class q4{
    public static void main(String[] args) {

        int First = Integer.parseInt((JOptionPane.showInputDialog("enter the first number: ")));
        int Second = Integer.parseInt((JOptionPane.showInputDialog("enter the second number: ")));
        int sum = First + Second;
        int Pro = First * Second;
        JOptionPane.showMessageDialog(null,"The sum is: "+sum);
        JOptionPane.showMessageDialog(null,"The product is: "+Pro);
    }
}
class q5{
    public static void main(String[] args) {
        int First = Integer.parseInt((JOptionPane.showInputDialog("enter the first number: ")));
        int Second = Integer.parseInt((JOptionPane.showInputDialog("enter the second number: ")));
        int sum = First + Second;
        int Pro = First * Second;
        float div= sum/Pro;
        JOptionPane.showMessageDialog(null,"The division is: "+div);
    }
}
class q6{
    public static void main(String[] args) {
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double Area=B*C;
        int AA=(int)Area;
        JOptionPane.showMessageDialog(null,"The area is: "+AA);

    }
}
class q7{
    public static void main(String[] args) {
        String A=((JOptionPane.showInputDialog("enter your name: " )));
        int B = Integer.parseInt((JOptionPane.showInputDialog("enter the roll number: ")));
        String C=((JOptionPane.showInputDialog("enter field of intrest: " )));
        JOptionPane.showMessageDialog(null,"My name is "+A+ " and my roll number is "+B+" " +
                "and my field of interest is "+C+".");

    }
}
class q8{
    public static void main(String[] args) {
        float A= Float.parseFloat(JOptionPane.showInputDialog("enter the length of square: "));
        float Area=A*A;
        float perimeter=4*A;
        JOptionPane.showMessageDialog(null,"The area of square is "+Area +" and the perimeter is "+perimeter);
    }
}

class q9{
    public static void main(String[] args) {
        double A=Double.parseDouble(JOptionPane.showInputDialog("Enter the number: "));
        double Square =A*A;
        JOptionPane.showMessageDialog(null,"The square of "+A+" is "+Square);
    }
}

class q10{
    public static void main(String[] args) {
        String first=((JOptionPane.showInputDialog("enter your First Name: " )));
        String Second=((JOptionPane.showInputDialog("enter your Second Name: " )));
        JOptionPane.showMessageDialog(null,first+" "+Second);

    }
}
class q11{
    public static void main(String[] args) {
        int A = Integer.parseInt((JOptionPane.showInputDialog("enter the First number: ")));
        int B = Integer.parseInt((JOptionPane.showInputDialog("enter the Second number: ")));
        int C = Integer.parseInt((JOptionPane.showInputDialog("enter the Third number: ")));
        String check=((A==B)&&(A==C)) ?"All three are equal": (A==B)?"A and B are equal":(A==C)?"A and C are Equal":(B==C)?"B ans C are equal":"nothing is same";

        JOptionPane.showMessageDialog(null,check);
    }
}

class q12{
    public static void main(String[] args) {
        int A = Integer.parseInt((JOptionPane.showInputDialog("enter the First number: ")));
        int B = Integer.parseInt((JOptionPane.showInputDialog("enter the Second number: ")));
        boolean AA=(A<B)&& (A<50);
        JOptionPane.showMessageDialog(null,AA);
    }
}

class q13{
    public static void main(String[] args) {
        double B=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of English: ")));
        double C=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Science: ")));
        double D=Double.parseDouble((JOptionPane.showInputDialog("Enter the marks of Social: ")));
        double sum=B+C+D;
        double per= sum/4;
        int percentint=(int)per;
        JOptionPane.showMessageDialog(null,"error has scored: "+ percentint +"%");
    }
}