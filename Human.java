import java.util.*;

public class Human{
    public String ten;
    public int tuoi;
    public String address;
    
    public Human() {}

    public Human(String ten, int tuoi, String address) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.address = address;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen() {
        this.ten = ten;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public void setTuoi() {
        this.tuoi = tuoi;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress() {
        this.address = address;
    }

    public String toString() {
        return "(" + ten + ":" + tuoi + ")";
    }

    public static void main(String[] args) {
        Human a = new Human("Phuc",22,"HCm");
        System.out.println("human:" + a.toString());
    }
}