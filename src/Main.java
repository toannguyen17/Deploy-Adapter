import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter file or folder path: ");

		String path = scanner.nextLine();

		FileCalcolatorAdapter fileCalcolatorAdapter = new FileCalcolatorAdapter();

		Client client = new Client(fileCalcolatorAdapter);
		client.printFileSize(path);


	}
}
