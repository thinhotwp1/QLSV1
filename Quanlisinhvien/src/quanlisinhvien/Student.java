/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

import java.util.Scanner;

/**
 *
 * @author onthi
 */
public class Student extends Person{
    
    Scanner sc=new Scanner(System.in);
    
    private String rollNo;
    private float mark;
    private String email;

    public Student() {
    }

    public Student(String rollNo, float mark, String email, String name, String gender, int birthday, String address) {
        super(name, gender, birthday, address);
        this.rollNo = rollNo;
        this.mark = mark;
        this.email = email;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo(); 
        System.out.println("Nhap ma sinh vien");
        while(true){
            rollNo = sc.nextLine();
            if(rollNo != null && rollNo.length()==8){
                break;
            }
            else{
                System.err.println("Nhap lai ma sinh vien:");
            }   
        }
        System.out.println("Nhap diem:");
        while(true){
            mark = Float.parseFloat(sc.nextLine());
            if(mark >= 0 && mark <= 10){
                break;
            }
            else{
                System.err.println("Nhap lai diem sinh vien:");
            }   
        }
        System.out.println("Nhap email:");
        while(true){
            email = sc.nextLine();
            if(email != null && email.contains("@") && !email.contains(" ")){
                break;
            }
            else{
                System.err.println("Nhap lai email sinh vien:");
            }   
        }
    }

    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.print("\t"+"Ma sinh vien: "+rollNo+"\t"+"Diem sinh vien: "+mark+"\t"+"Email sinh vien: "+email);
        System.out.println("");
    }
    
    public boolean checkMark(){
        if(mark>=8){
            return true;
        }
        else
            return false;
    }
}
