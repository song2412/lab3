/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author songh
 */
public class Main { 
   public void nhapTin(){
         Scanner sc= new Scanner(System.in);
     System.out.println("Nhap ten nhan vien:");
     sc.nextLine();
     System.out.println("Nhap luong co ban:");
       double luongCoBan = sc.nextDouble();
     System.out.println("Nhap so luong:");
       double heSoLuong = sc.nextDouble();
     }
   public static void main(String[] args) {
       Nhanvien sh =new Nhanvien(" ");
       sh.getLuongNhanVien();
       float luongNhanVien=sh.getLuongNhanVien();
        System.out.println("Luong nhan vien la :"+luongNhanVien);
    }
    }
