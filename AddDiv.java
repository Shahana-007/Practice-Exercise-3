import java.util.Scanner;
class AddDiv {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the 1st number:");
int n1 = sc.nextInt();
System.out.println("Enter the 2nd number:");
int n2 = sc.nextInt();
int sum = n1+n2;
if (sum % 2 == 0) {
System.out.println("The sum of the two numbers is even.");
}
else {
System.out.println("The sum of the two numbers is odd.");
}
System.out.println("The sum of two numbers is:" + sum);
sc.close();
}
}