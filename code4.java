package Day2;

public class code4 {
	public static void main(String[] args) {
	int a = 10, b = 20;
	char grade = 'A';
	boolean check = true;
	a = a + b;
	b = a - b;
	a = a - b;
    System.out.println("After: a=" + a + ", b=" + b);
    System.out.println("Grade: " + grade + " | Status: " + check);
	}
}
