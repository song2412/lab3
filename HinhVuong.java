/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author songh
 */
public class HinhVuong {
private float canh;
private float dientich;
private float chuVi;
 public HinhVuong(float canh){
     this.canh=canh;
 }
 public float getienTich(){
     return dientich;
 }
public void tinhdienTich(){
    dientich = canh* canh;
}
public float getChuVi(){
    return chuVi;
}
public void tinhChuVi(){
    chuVi= canh*4;
}

    float getdienTich() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
