import java.util.Scanner;

public class My {
    public static void main(String[] args) {
        /*
//Q1. Print Z
        System.out.println("the value of a is " + a)
        System.out.println("*******");
        System.out.println("     *");
        System.out.println("    *");
        System.out.println("   *");
        System.out.println(" *");
        System.out.println("*******");

// Q2. GRADING SYSTEM
// You are given as input marks of a student.
//  	  2.1 for marks above 90, print excellent.
//  	  2.2 for marks above 80 and less than equal to 90, print good.
//  	  2.3 for marks above 70 and less than equal to 80, print fair.
//  	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
//  	  2.5 for marks less than equal to 60, print below par.

        Scanner scn = new Scanner(System.in);
        System.out.println("enter students marks : ");
        int marks = scn.nextInt();

        if(marks>90) {
            System.out.println("excellent");
        }
        else if(marks>80 && marks<=90) {
            System.out.println("good");
        } else if(marks>70 && marks<=80) {
            System.out.println("fair");
        } else if(marks>60 && marks<=70) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }


//Q3. to check if a number is a prime number
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scn.nextInt();
        int i = num / 2;

        for (i = 2; i <= 10; i++) {
            if (num % i == 0) {
                System.out.println("it is not a prime number");
            } else {
                System.out.println("it is a prime value");
            }
            break;
        }*/

//Q.4 to print prime numbers till n
        Scanner scn= new Scanner(System.in);
        System.out.println("enter the starting no");
        int low = scn.nextInt();
        System.out.println("Enter the value of N");
        int N=scn.nextInt();
        for(int n = low; n<=N;n++) {
            int count = 0;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break;

                    }
                }
            if (count == 0) {
                System.out.println(n);
            }
        }
// print factorial of numbers
       /* int n = 5,i;
        for(i=2;i<n;i++) {
            int fct=n*i;
        }
        System.out.println(n * i);

//Q5. write a code to count digits in a number
        System.out.print("enter any number: ");
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int digit=0;
        while(n!=0){
            n= n/10;
            digit++;
        }
        System.out.println("total digits in the given number is " + digit);
//Q6. Reverse a number
        System.out.print("enter any number: ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int rem,rev=0;
        while(num>0) {
             rem = num%10;
             rev= rev*10+rem;
            num=num/10;
        }
        System.out.print( "the reverse of the given number is " + rev);


//Q7. Inverse of a number
        System.out.println("enter any value");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        double inv=0;
        int dig=0,invpl,invdig;
        int pl=1;
        while(n!=0){
            dig=n%10;
            n=n/10;
            invdig=pl;invpl=dig;
            inv=invdig * Math.pow(10,invpl-1)+inv;
            pl++;
        }
        System.out.println(inv);

//Q8. Rotate a number
        System.out.println("enter any number");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println("by what factor the number should be rotated?");
        int f=scn.nextInt();
        int dig=0;
        //double div = 1;
        //double quo=1;
        while(n!=0){
            n=n/10;
            dig++;
        } int mult=1;
        int div=1;
        for(int i=1;i<=dig;i++){
            if(i<=f){
                div=div/10;
            } else{
                mult=mult%10;
            }
        } int q = n/div; int r= n%div;
        int rot=(r*mult)+q;
            /*div=n%Math.pow(10,f);
            quo= (n/Math.pow(10,f));
        } double rot= div*Math.pow(10,(dig-f)) + quo;

        System.out.println(rot);


//Q9. GCD and LCM of a number
        Scanner scn= new Scanner(System.in);
        System.out.print("number 1 is ");
        int num1= scn.nextInt();
        System.out.print("number 2 is ");
        int num2 = scn.nextInt();
        int og1=num1; int og2=num2;
        while(num1%num2!=0){
            int rem=num1%num2;
            num1=num2; num2=rem;
        } int gcd= num2;
        int lcm= (og1*og2)/gcd;
        System.out.println("The GCD and LCM of the two numbers is " + gcd +" and "+lcm+" respectively.");

//Q10. Prime factorization of a number
Scanner scn= new Scanner(System.in);
        System.out.println("enter the number");
int n = scn.nextInt();
int div = 2;
while(div<=n){
    while(n%div==0){
        n=n/div;
        System.out.print(div+" ");
    }
    div++;
}*/

    }
}