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
public class Person {
    private String name,gender;
    private int birthday;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, int birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void inputInfo(){
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        gender = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        birthday =Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dia chi:");
        address = sc.nextLine();
    }
    public void showInfo(){
        System.out.print("Ten:"+name+"\t"+"Gioi tinh:"+gender+"\t"+"Ngay sinh:"+"\t"+birthday+"\t"+"Dia chi:"+address);
    }
}
