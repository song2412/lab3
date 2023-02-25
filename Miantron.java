/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author songh
 */
public class Miantron {
    public static void main(String[] args) {
        Hinhtron ht=new Hinhtron(30);
        ht.tinhchuvi();
        ht.tinhDienTich();
        float chuVi=ht.getChuvi();
        float dienTich=ht.getDienTich();
        System.out.println("Chu vi hinh tron: "+chuVi+"; dien tich : "+dienTich);
    }
}
