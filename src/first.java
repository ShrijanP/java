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
