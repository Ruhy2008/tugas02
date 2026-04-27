package com.mycompany.server;


    
public class main {
    public static void main(String[] args) {
        
        System.out.println("--- Data Server Utama ---");
        Server serverUtama = new Server("Dell PowerEdge", 64, 45000000.0);
        serverUtama.tampilkanInfo();
        
        double hargaDiskonUtama = serverUtama.hitungHargaDiskon(10);
        System.out.printf("Harga setelah diskon 10%%: Rp%.0f\n", hargaDiskonUtama);
        System.out.println("-------------------------\n");

        System.out.println("--- Data Server Backup ---");
        Server serverBackup = new Server("HP ProLiant", 32);
        serverBackup.tampilkanInfo();
        
        double hargaDiskonBackup = serverBackup.hitungHargaDiskon(5);
        System.out.printf("Harga setelah diskon 5%%: Rp%.0f\n", hargaDiskonBackup);
        System.out.println("-------------------------");
    }
}
