package Praktikum7;

public class Premium extends Salon {

    private double layanan, produk;

    public Premium(String nama, String member, double layanan, double produk) {
        super(nama, member);
        setLayanan(layanan);
        setProduk(produk);
    }

    public void setLayanan(double layanan) {
        this.layanan = layanan;
    }

    public double getLayanan() {
        return layanan;
    }

    public void setProduk(double produk) {
        this.produk = produk;
    }

    public double getProduk() {
        return produk;
    }

    @Override
    public double diskon() {
        return (getLayanan() * 20 / 100) + (getProduk() * 10 / 100);
    }

    @Override
    public double total() {
        return getLayanan() + getProduk() - diskon();
    }

    public String toString() {
        return (super.toString() + "\nBiaya\t: Rp." + getLayanan() + "\nBarang\t: Rp." + getProduk() + "\nDiskon\t: Rp." + diskon() + "\nTotal\t: Rp." + total());
    }
}
