import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số n"); 
		int n = Integer.parseInt(scan.nextLine());
       changeNumber(n);
	}

	public static void changeNumber(int n) {
		int firstNumber = n; // tạo bản sao của n để xử lý
		int numberSplit; // tách dần theo thứ tự từ hàng đơn vị trở về trước
		int sumesNumber = 0;
		int count = 0;
		do {
			numberSplit = firstNumber % 10;
			count++;
			sumesNumber += numberSplit;
			firstNumber /=  10;
		} while (firstNumber != 0);
		System.out.println("Số " + n + " có " + count + " chữ số");
		System.out.println("Chữ số cuối cùng là: " + n % 10);
		System.out.println("Chữ số hàng đầu tiên: " + numberSplit);
		System.out.println("Tổng các chữ số: " + sumesNumber);

		// Đảo ngược số n
		System.out.println("Số đạo ngược của n = " + n + " là: ");
		// loại bỏ các số 0
		while (n % 10 == 0) {
			n /= 10;
		}
		do {
			System.out.print("" + n%10);
			n /= 10;
		}while(n != 0);
	}
}
