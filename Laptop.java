public class Laptop {
    // Thuộc tính
    private String maSo;
    private String tenLaptop;
    private double giaBan;
    private boolean quaTangKem;

    // Phương thức khởi tạo không đối số
    public Laptop() {
        this.maSo = "";
        this.tenLaptop = "";
        this.giaBan = 0.0;
        this.quaTangKem = false;
    }

    // Phương thức khởi tạo có đối số
    public Laptop(String maSo, String tenLaptop, double giaBan, boolean quaTangKem) {
        this.maSo = maSo;
        this.tenLaptop = tenLaptop;
        this.giaBan = giaBan;
        this.quaTangKem = quaTangKem;
    }

    // Phương thức get và set cho maSo
    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    // Phương thức get và set cho tenLaptop
    public String getTenLaptop() {
        return tenLaptop;
    }

    public void setTenLaptop(String tenLaptop) {
        this.tenLaptop = tenLaptop;
    }

    // Phương thức get và set cho giaBan
    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    // Phương thức get và set cho quaTangKem
    public boolean isQuaTangKem() {
        return quaTangKem;
    }

    public void setQuaTangKem(boolean quaTangKem) {
        this.quaTangKem = quaTangKem;
    }

    // Phương thức khuyến mãi (giả sử giảm giá 10% nếu có quà tặng kèm)
    public double khuyenMai() {
        if (quaTangKem) {
            return giaBan * 0.9; // Giảm giá 10%
        }
        return giaBan;
    }

    // Phương thức kiểm tra quà tặng kèm
    public String kiemtraQua() {
        if (quaTangKem) {
            return "Co qua tang kem";
        }
        return "Khong co qua tang kem";
    }

    // Phương thức toString để hiển thị thông tin laptop
    @Override
    public String toString() {
        return "Laptop{" +
                "Ma so='" + maSo + '\'' +
                ", Ten Laptop='" + tenLaptop + '\'' +
                ", Gia ban=" + giaBan +
                ", Qua tang kem=" + ( ? "Co" : "Khong") +
                '}';
    }

    // Phương thức main để kiểm tra lớp Laptop
    public static void main(String[] args) {
        // Tạo đối tượng Laptop sử dụng phương thức khởi tạo có đối số
        Laptop laptop1 = new Laptop("L001", "Laptop A", 1500.0, true);
        System.out.println(laptop1.toString());
        System.out.println("Gia sau khuyen mai: " + laptop1.khuyenMai());
        System.out.println("Kiem tra qua tang: " + laptop1.kiemtraQua());

        // Tạo đối tượng Laptop sử dụng phương thức khởi tạo không đối số
        Laptop laptop2 = new Laptop();
        laptop2.setMaSo("L002");
        laptop2.setTenLaptop("Laptop B");
        laptop2.setGiaBan(1200.0);
        laptop2.setQuaTangKem(false);
        System.out.println(laptop2.toString());
        System.out.println("Gia sau khuyen mai: " + laptop2.khuyenMai());
        System.out.println("Kiem tra qua tang: " + laptop2.kiemtraQua());
    }
}
