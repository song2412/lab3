/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author songh
 */
public class Hinhtron {
    private final float PI=3.14f;
    private float banKinh;
    private float chuVi;
    private float dienTich;
    public Hinhtron(float banKinh){
        this.banKinh=banKinh;
    }
    public float getChuvi(){
        return chuVi;
    }
    public float getDienTich(){
        return dienTich;
    }
    public void tinhchuvi(){
        chuVi=2*PI*banKinh;
    }
    public void tinhDienTich(){
        dienTich=PI*banKinh*banKinh;
    }
}
