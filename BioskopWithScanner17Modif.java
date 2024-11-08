import java.util.Scanner;

public class BioskopWithScanner17Modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("==== MENU ====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                System.out.println("==== Input data penonton ====");
                    boolean tambahPenonton = true;
                    while (tambahPenonton) {
                        System.out.print("Masukkan nama: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan baris (1-4): ");
                        int baris = input.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        int kolom = input.nextInt();
                        input.nextLine();

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                            } else {
                                System.out.println("Kursi sudah terisi, silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Baris atau kolom kursi tidak tersedia.");
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = input.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            tambahPenonton = false;
                        }
                    }
                    break;

                case 2:
                    System.out.println("==== Daftar Penonton ====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            }else{
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program. Terima kasih!");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
            System.out.println();
        }
    }
}
