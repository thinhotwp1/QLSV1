/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author onthi
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        
        while(true){
        System.out.println("----------So good homie----------");
        System.out.println("1.Nhap vao n sinh vien (n la so luong sinh vien)");
        System.out.println("2.Hien thi thong tin tat ca sinh vien");
        System.out.println("3.Hien thi sinh vien co diem trung binh cao nhat va thap nhat");
        System.out.println("4.Tim kiem sinh vien theo ma sinh vien");
        System.out.println("5.Hien thi tat ca sinh sinh vien theo thu tu ten trong bang chu cai");
        System.out.println("6.Hien thi tat ca sinh vien duoc hoc bong va sap xep theo diem cao xuong thap");
        System.out.println("7.Thoat chuong trinh");
        System.out.println("------------Thanks homie------------");
        
        Scanner sc = new Scanner(System.in);
        
        int n;
        int chon = Integer.parseInt(sc.nextLine()); 
        switch(chon){
            case 1: System.out.println("Nhap vao n:");
                    n=Integer.parseInt(sc.nextLine());
                    break;
            case 2: 
                    break;
            case 3: 
                    break;
            case 4: 
                    break;        
            case 5: 
                    break;        
            case 6: 
                    break;
            case 7:
                    System.out.println("Bye bye !!");
                    break;  
            default:
                    System.err.println("Nhap sai roi nhap lai di !!!");
        }
        
        }
    }
    
}
