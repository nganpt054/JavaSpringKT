package org.o7planning.hellospringmvc.bean;

public class bean_NguyenKimNgan {
	private String Masv;
	private String HoTen;
	private String DiaChi;
	private long DTB;
	public bean_NguyenKimNgan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bean_NguyenKimNgan(String masv, String hoTen, String diaChi, long dTB) {
		super();
		this.Masv = masv;
		this.HoTen = hoTen;
		this.DiaChi = diaChi;
		this.DTB = dTB;
	}
	public String getMasv() {
		return Masv;
	}
	public void setMasv(String masv) {
		this.Masv = masv;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		this.HoTen = hoTen;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		this.DiaChi = diaChi;
	}
	public long getDTB() {
		return DTB;
	}
	public void setDTB(long dTB) {
		this.DTB = dTB;
	}
	
}
