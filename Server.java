package com.mycompany.server;

public class Server {

    String merek;
    int kapasitasRAM;
    double harga;

    public Server(String merek, int kapasitasRAM, double harga) {
        this.merek = merek;
        this.kapasitasRAM = kapasitasRAM;
        this.harga = harga;
    }

    public Server(String merek, int kapasitasRAM) {
        this.merek = merek;
        this.kapasitasRAM = kapasitasRAM;
        this.harga = 15000000.0;
    }

    public void tampilkanInfo() {
        System.out.println("Merek Server: " + merek);
        System.out.println("Kapasitas RAM: " + kapasitasRAM + " GB");
        System.out.printf("Harga: Rp%.0f\n", harga);
    }

    public double hitungHargaDiskon(double diskonPersen) {
        double potongan = harga * (diskonPersen / 100);
        return harga - potongan;
    }
}
