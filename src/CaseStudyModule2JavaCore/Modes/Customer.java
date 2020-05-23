package CaseStudyModule2JavaCore.Modes;

public class Customer {
    private String HoVaTen;
    private String NgaySinh;
    private long CMND;
    private String GioiTinh;
    private long SDT;
    private String Email;
    private String LoaiKhach;
    private String DiaChi;
    private Services services;
    private String IdCard;
    // va phuong thuc show info

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    public Customer(String IdCard, String hoVaTen, String ngaySinh, long CMND, String gioiTinh, long SDT, String email, String loaiKhach, String diaChi, Services services) {
        this.IdCard = IdCard;
        HoVaTen = hoVaTen;
        NgaySinh = ngaySinh;
        this.CMND = CMND;
        GioiTinh = gioiTinh;
        this.SDT = SDT;
        Email = email;
        LoaiKhach = loaiKhach;
        DiaChi = diaChi;
        this.services = services;
    }
    public Customer(){};

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        HoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public long getCMND() {
        return CMND;
    }

    public void setCMND(long CMND) {
        this.CMND = CMND;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public long getSDT() {
        return SDT;
    }

    public void setSDT(long SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLoaiKhach() {
        return LoaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        LoaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "HoVaTen='" + HoVaTen + '\'' +
                ", NgaySinh='" + NgaySinh + '\'' +
                ", CMND=" + CMND +
                ", GioiTinh='" + GioiTinh + '\'' +
                ", SDT=" + SDT +
                ", Email='" + Email + '\'' +
                ", LoaiKhach='" + LoaiKhach + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", services=" + services +
                '}';
    }
    public String ShowInfo() {
        return "Customer{" +
                "HoVaTen='" + HoVaTen + '\'' +
                ", NgaySinh='" + NgaySinh + '\'' +
                ", CMND=" + CMND +
                ", GioiTinh='" + GioiTinh + '\'' +
                ", SDT=" + SDT +
                ", Email='" + Email + '\'' +
                ", LoaiKhach='" + LoaiKhach + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", services=" + services +
                '}';
    }
}
