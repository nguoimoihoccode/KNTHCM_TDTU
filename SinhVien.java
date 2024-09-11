class SinhVien {
    private String MSSV;
    private String hoten;
    private double diemHK1;
    private double diemHK2;

    public SinhVien(String MSSV, String hoten, double diemHK1, double diemHK2) {
        this.MSSV = MSSV;
        this.hoten = hoten;
        this.diemHK1 = diemHK1;
        this.diemHK2 = diemHK2;
    }

    public double tinhdiemtrungbinh() {
        double tb = (diemHK1 + diemHK2)/2;
        return tb;
    }

    public String loaiSV() {
        if(tinhdiemtrungbinh() >= 8) return "Gioi";
        else if(tinhdiemtrungbinh() >= 6.5) return "Kha";
        else if(tinhdiemtrungbinh() >= 5) return "TB kha";
        else return "Trung binh";
    }

    public String toString() {
        return "(" + MSSV + "," + hoten + "," + tinhdiemtrungbinh() + ")";
    }

    public static void main(String[] args) {
        SinhVien a = new SinhVien("52000789", "NguyenThucPhuc", 5.5, 6.5);
        System.out.println(a.tinhdiemtrungbinh());
        System.out.println(a.loaiSV());
        System.out.println(a.toString());
    }
}