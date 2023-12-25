/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.tolymy.mathutil.test.core;

import com.tolymy.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author HP
 */

//câu lênh này cua JUnit báo hiêu rang se cân loop qua tâp data de lây cap data input/expected nhôi vao hàm test
//biên class này thành class tham sô hóa
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //ta se tra vê mang 2 chiêu gôm nhiêu cap Expected|Input
    @Parameterized.Parameters  //JUnit se ngâm chay loop qua tung dòng cua mang de lây ra dc cap data input/expected
    //tên ko quan trong, quan trong là @
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
        };
    }
    //gia su loop qua tung mang, ta vân cân gán tung value cua côt
    //vào biên tuong ung input, expected de lát hôi feed cho hàm
    
    //lây tung cái ra so sánh nên ko có s
    @Parameterized.Parameter(value = 0)  //là map vs mang data
    public int n; //biên map vs value cua côt 0 cua mang
    @Parameterized.Parameter(value = 1)
    public long expected; //kiêu long vì giá tri tra ve cua hàm getF() là long
    
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
