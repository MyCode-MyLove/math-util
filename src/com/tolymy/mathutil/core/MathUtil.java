/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tolymy.mathutil.core;

/**
 *
 * @author HP
 */
public class MathUtil {
    //trong class nay cung cap cho ai do nhieu ham xu lý toán hoc
    //clone class Math cua JDK
    //ham thu vien sài chung cho ai dó, khong can luu lai trang thái/giá tri
    //chon thiet ke là hàm static
    
    //hàm tính giai thua!!!
    //n! = 1*2*3*4*...*n
    //khong co giai thua so am
    //0! = 1! = 1 quy uoc
    //giai thua do thi goc dung, tang nhanh ve gia tri
    //20 giai thua 8 con so 0, vua kip du cho kieu long cua java
    //21 giai thua tràn kieu long
    // bài này quy uoc tính n! trong khoang tu 0..20
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0...20");
        if(n == 0 || n == 1)
            return 1; 
        //hàm có lenh return thì ko dùng else
        long product = 1; //tích nhân don
        for (int i = 2; i <= n; i++) {
            product *= i; //product = product * i;
        }
        return product;
    }
}

