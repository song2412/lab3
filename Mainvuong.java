/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author songh
 */
public class Mainvuong {
    public static void main(String[] args) {
        HinhVuong hv=new HinhVuong(20);
       hv.tinhdienTich();
       hv.tinhChuVi();
      float chuVi=hv.getChuVi();
      float dientich=hv.getdienTich();
        System.out.println("chu vi la:" +chuVi );
        System.out.println("dien tich la:" +dientich);
                }   
}
