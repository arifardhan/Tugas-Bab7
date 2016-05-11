package Praktikum7;

public abstract class Salon {

    private String nama;
    private String member;

    public Salon(String nama, String member) {
        this.nama = nama;
        this.member = member;
    }

    public String getName() {
        return nama;
    }

    public String getMember() {
        return member;
    }

    public String toString() {
        return ("Nama\t: " + getName() + "\nMember\t: " + getMember());
    }

    public abstract double diskon();

    public abstract double total();
}
