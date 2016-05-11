package Praktikum7;

public class NonMember extends Salon {

    private double layanan, produk;

    public NonMember(String nama, String member, double layanan, double produk) {
        super(nama, member);
        this.layanan = layanan;
        this.produk = produk;
    }

    public double getLayanan() {
        return layanan;
    }

    public double getProduk() {
        return produk;
    }

    @Override
    public double diskon() {
        return 0;
    }

    @Override
    public double total() {
        return getLayanan() + getProduk();
    }

    public String toString() {
        return super.toString() + "\nTotal\t: Rp." + total();
    }
}


