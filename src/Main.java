import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login untuk mahasiswa
        System.out.println("1. Mahasiswa");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
        int opt = scanner.nextInt();
        scanner.nextLine(); // Membersihkan karakter newline

        switch (opt) {
            case 1:
                System.out.print("Masukkan NIM (panjang 15 karakter): ");
                String nim = scanner.nextLine();

                if (nim.length() == 15) {
                    // Proses login mahasiswa
                    System.out.println("Login berhasil sebagai mahasiswa");
                } else {
                    System.out.println("Panjang NIM tidak valid. Harap masukkan NIM dengan panjang 15 karakter.");
                }
                break;
            case 2:
                // Login untuk admin
                System.out.println("\nLogin Admin");
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                // Proses login admin
                if (isAdmin(username, password)) {
                    System.out.println("Login berhasil sebagai admin");
                } else {
                    System.out.println("Username atau password admin tidak valid.");
                }
                break;
            case 3:
                System.out.println("Thank u");
                break;
        }
    }

    // Fungsi untuk memeriksa login admin
    private static boolean isAdmin(String username, String password) {
        // Implementasi validasi admin
        return username.equals("admin") && password.equals("admin123");
    }
}
