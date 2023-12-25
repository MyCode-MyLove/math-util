/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tolymy.mathutil.main;

import com.tolymy.mathutil.core.MathUtil;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        //thu nghiem hàm tính giai thua coi chay dúng nhu thiet ke ko
        //ta phai dua ra các tình huong su dung hàm trong thuc te
        // Vd: -5 coi tính duoc ko
        //     0 coi tính ra may
        //     20 coi tính ra may
        //     21 coi tính ra may/tính duoc ko
        //TEST CASE: Mot tình huong hàm/app/màn hình/ tính nang dua vào su dung
        //gia lap hành vi xài cua ai dó

        //TEST CASE: LÀ MOT TÌNH HUONG SU DUNG, XÀI APP (HÀM) MÀ NÓ BAO GOM:
        //INPUT: DATA DAU VÀO C? THE NÀO ÐÓ
        //OUTPUT ÐÀU RA UNG VOI XU LÝ CUA HÀM/CHUC NANG CUA APP, DI NHIEN DUNG DAU VÀO ÐE XU LÝ
        //KY VONG: MONG HÀM SE TRA VE VALUE NÀO ÐÓ UNG VOI INPUT TREN
        //SO SÁNH XEM KET QUA CÓ NHU MONG MUON HAY KO
        long expected = 120; //kì vong ham tra ve 120 neu tính 5!
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
