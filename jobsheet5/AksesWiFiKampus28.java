import java.util.Scanner;

public class AksesWiFiKampus28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lain): ");
        String jenis_pengguna = input.nextLine();

        if (jenis_pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenis_pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            int jumlah_SKS = input.nextInt();

            if (jumlah_SKS >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }

        input.close();
    }
}
