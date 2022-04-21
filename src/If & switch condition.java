
    import java.util.Scanner;



    //1. Write a JAVA program to find maximum between two numbers.
    public class Ifcondition {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int A=scanner.nextInt();
            System.out.println("enter the number: ");
            int B=scanner.nextInt();

            if (A>=B){
                System.out.println("A is greater");
            }
            else{
                System.out.println("B is greater");
            }
        }
    }

    //2. Write a JAVA program to find maximum between three numbers.
    class Question2{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int A=scanner.nextInt();
            System.out.println("enter the number: ");
            int B=scanner.nextInt();
            System.out.println("enter the number: ");
            int C=scanner.nextInt();
            if (A>B && B>C){
                System.out.println("A is greater.");
            }
            else if (B>A && A>B){
                System.out.println("B is greater. ");
            }
            else{
                System.out.println("c is greater.");
            }

        }
    }

    //3. Write a JAVA program to check whether a number is negative, positive or zero.
    class Question3{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int A=scanner.nextInt();
            if (A<0){
                System.out.println("Number is negative");
            }
            else if(A==0){
                System.out.println("Number is zero");
            }
            else{
                System.out.println("Number is positive");
            }
        }
    }

    //4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
    class Question4{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int A=scanner.nextInt();
            if ((A%5==0)&& (A%11==0)){
                System.out.println("The given number is divisible by both 5 and 11.");
            }
            else{
                System.out.println("The number is not divisible by 5 and 11.");
            }
        }
    }

    //5. Write a JAVA program to check whether a number is even or odd.
    class Question5{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int A = scanner.nextInt();
            if (A % 2 == 0) {
                System.out.println("The number is even.");
            }
            else {
                System.out.println("The number is odd.");
            }
        }
    }

    //6. Write a JAVA program to check whether a year is leap year or not.
    class question6 {

        public static void main(String[] args) {


            int year = 1979;
            boolean leap = false;


            if (year % 4 == 0) {


                if (year % 100 == 0) {


                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }


                else
                    leap = true;
            }

            else
                leap = false;

            if (leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
    }

    //7. Write a JAVA program to check whether a character is alphabet or not.
    class Question7{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a Character : ");
            char character = scanner.next().charAt(0);

            if((character>='a' && character<='z') || (character>='A' && character<='Z')){
                System.out.print(character + " is an alphabet.");
            }else{
                System.out.print(character + " is not an alphabet.");
            }

        }
    }
    //8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
    class Question8{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a Character : ");
            char character = scanner.next().charAt(0);

            if((character>='a' && character<='z') || (character>='A' && character<='Z')){
                if((character>='a' ||character<='A'||character>='E' && character<='e'
                        ||character>='I' ||character<='i'||character>='O' && character<='o'
                        ||character>='U' && character<='u')){
                    System.out.println(character+" is a vowel alphabet.");
                }
                else{
                    System.out.println(character+" is a consonant alphabet.");
                }
            }
            else{
                System.out.print(character + " is not an alphabet.");
            }
        }
    }

    //9. Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
    class Question9{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a Character : ");
            char character = scanner.nextLine().charAt(0);

            if((character>='a' && character<='z') || (character>='A' && character<='Z')){
                System.out.print(character + " is an alphabet.");
            }
            else if (character>0 && character<0 && character==0){
                System.out.print(character + " is an digit.");
            }
            else{
                System.out.print(character + " is a special character.");
            }}}


    //10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
    class Question10{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a Character : ");
            char character = scanner.nextLine().charAt(0);

            if((character>='A' && character<='Z')){
                System.out.print(character + " is an upper case alphabet.");
            }
            else if(character>='a' && character<='z'){
                System.out.print(character + " is an lower case alphabet.");
            }
            else{
                System.out.print(character + " is not an alphabet.");
            }
        }
    }

    class Question11{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the digit: ");
            int day=scanner.nextInt();
            if (day==1){
                System.out.println("sunday");
            }
            else if (day==2){
                System.out.println("monday");
            }
            else if (day==3){
                System.out.println("tuesday");
            }
            else if (day==4){
                System.out.println("wednesday");
            }
            else if (day==5){
                System.out.println("Thursday");
            }
            else if (day==6){
                System.out.println("friday");
            }
            else if (day==7){
                System.out.println("saturday");
            }
            else{
                System.out.println("default");
            }
        }
    }

    //12. Write a JAVA program to input month number and print number of days in that month.
    class Question12{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the digit: ");
            int day=scanner.nextInt();
            if (day==1){
                System.out.println("january");
            }
            else if (day==2){
                System.out.println("february");
            }
            else if (day==3){
                System.out.println("march");
            }
            else if (day==4){
                System.out.println("april");
            }
            else if (day==5){
                System.out.println("may");
            }
            else if (day==6){
                System.out.println("june");
            }
            else if (day==7){
                System.out.println("july");
            }
            else if (day==8){
                System.out.println("august");
            }
            else if (day==9){
                System.out.println("september");
            }
            else if (day==10){
                System.out.println("october");
            } else if (day==11){
                System.out.println("november");
            } else if (day==12){
                System.out.println("december");
            }
            else{
                System.out.println("default month");
            }
        }
    }



    //14. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
    class Question14{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the angle: ");
            int angel1 = scanner.nextInt();
            System.out.println("enter the angle: ");
            int angle2 = scanner.nextInt();
            System.out.println("enter the angle: ");
            int angle3 = scanner.nextInt();
            int sum=angel1+angle3+angle2;
            if (sum==180) {
                System.out.println("Triangle is valid.");
            }
            else{
                System.out.println("triangle is invalid");
            }}}

    class Que15{

    }


    //16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
    class Question16{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the side: ");
            int side1 = scanner.nextInt();
            System.out.println("enter the side: ");
            int side2 = scanner.nextInt();
            System.out.println("enter the side: ");
            int side3 = scanner.nextInt();
            if ((side1 == side2) && (side3 == side2)) {
                System.out.println("Triangle is equilateral.");
            }
            else if ((side1 == side2) || (side3 == side2)) {
                System.out.println("Triangle is isosceles.");
            }
            else{
                System.out.println("Triangle is scalene.");
            }
        }
    }


    //18. Write a JAVA program to calculate profit or loss.
    class Question18{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the imported price: ");
            int ip = scanner.nextInt();
            System.out.println("enter the outgoing price: ");
            int op = scanner.nextInt();
            if (op > ip) {
                System.out.println("Your in  profit.");
            }
            else{
                System.out.println("Your in loss.");
            }
        }
    }
}


//Switch
 class Questioneleven{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int day=scanner.nextInt();
            switch(day) {
                case 0:
                    System.out.println("january");
                    break;
                case 1:
                    System.out.println("february");
                    break;
                case 2:
                    System.out.println("march");
                    break;
                case 3:
                    System.out.println("april");
                    break;
                case 4:
                    System.out.println("may");
                    break;
                case 5:
                    System.out.println("june");
                    break;
                case 6:
                    System.out.println("july");
                    break;
                case 7:
                    System.out.println("august");
                    break;
                case 8:
                    System.out.println("september");
                    break;
                case 9:
                    System.out.println("october");
                    break;
                case 10:
                    System.out.println("november");
                    break;
                case 11:
                    System.out.println("december");
                    break;

                default:
                    System.out.println("error");
                    break;

            }
        }
    }




    class Questionten{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number: ");
            int day=scanner.nextInt();
            switch(day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("error");
                    break;

            }
        }
    }


