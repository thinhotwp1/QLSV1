/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class StudentTest {


    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student std1 = new Student("B19DCCN1",9,"Hs1@gmail.com","HS1","nam",19,"Ha Noi");
        Student std2 = new Student("B19DCCN3",10,"Hs2@gmail.com","HS3","nu",11,"Ha Tay");
        Student std3 = new Student("B19DCCN2",7,"Hs3@gmail.com","HS2","nu",12,"Ha Dong");
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);
       
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
            case 1: System.out.println("Nhap vao so luong sinh vien:");
                        n=Integer.parseInt(sc.nextLine());
                        for(int i=0;i<n;i++){
                            Student std = new Student();
                            std.inputInfo();
                            studentList.add(std);
                        }   
                         break;
            case 2: for(int i=0;i<studentList.size();i++){
                        studentList.get(i).showInfo();
                     }
                    break;
            case 3: int minIndex=0,maxIndex=0;
                        float minMark,maxMark;
                        minMark=studentList.get(0).getMark();
                        maxMark=studentList.get(0).getMark();
                        for(int i=1;i<studentList.size();i++){
                            if(studentList.get(i).getMark()<minMark){
                                minIndex=i;
                                minMark=studentList.get(i).getMark();   
                            }
                        }
                            System.out.println("Sinh vien co diem thap nhat la:"+studentList.get(minIndex).getName()+"\t"+studentList.get(minIndex).getMark());
                             for(int i=1;i<studentList.size();i++){
                             if(studentList.get(i).getMark()>maxMark){
                                maxIndex=i;
                                maxMark=studentList.get(i).getMark();   
                            }         
                        }
                              System.out.println("Sinh vien co diem cao nhat la: "+studentList.get(maxIndex).getName()+"\t"+studentList.get(maxIndex).getMark());
                    break;
            case 4: System.out.println("Nhap ma sinh vien can tim kiem: ");
                        String rollNoSearch = sc.nextLine();
                        boolean found = false;
                        for(Student student:studentList)
                        {
                            if(rollNoSearch.equalsIgnoreCase(student.getRollNo())){ //equalsIgnoreCase la so sanh khong quan trong chu hoa hay chu thuong
                                student.showInfo();
                                found = true;      
                            }
                        }
                        if(found==false){
                                System.out.println("Khong tim thay !");
                        }
                    break;        
            case 5: //Buoc 1:Sap xep theo ten tu A-Z
                Collections.sort(studentList, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                        int cmp = o1.getName().compareTo(o2.getName());
                        if(cmp>=0){
                             return 1;
                         }
                         return -1;        
                    }
                });
                //Buoc 2: Hien thi
                   for(int i=0;i<studentList.size();i++){
                       studentList.get(i).showInfo();
                   }
                           
                    break;        
            case 6: 
                Collections.sort(studentList, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                        if( o1.getMark()>o2.getMark())
                        {
                            return -1;
                        }
                         return 1;        
                    }
                });
                //Buoc 2: Hien thi
                System.out.println("Danh sach sinh vien duoc nhan hoc bong");
                   for(int i=0;i<studentList.size();i++){
                       if(studentList.get(i).getMark()>=8){
                           studentList.get(i).showInfo();
                       }    
                   }
                    break;
            case 7:
                    System.out.println("Bye bye !!");
                    System.exit(chon);
            default:{
                    System.err.println("Nhap lai lua chon !!!");
                    System.out.println("");
            }
        }
        }
    }
    
}
