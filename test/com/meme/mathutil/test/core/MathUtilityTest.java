/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.meme.mathutil.test.core;

import com.meme.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author HP
 */
public class MathUtilityTest {
    //day là class se su dung các hàm cua thu vien/frameword JUnit
    //de kiem thu/kiem tra code chính - hàm tínhGiaiThua() bên 
    //class core.MathUtil
    //viet code de test code chính  bên kia

    //có nhieu quy tac dat tên hàm kiem thu
    //nhung thuong se là nói len muc dich cua các case/tình huong kiem thu
    //tình huong xài hàm theo kieu thành cong và that bai
    //hàm duoi day là tinh huong test hàm chay thành cong, tra ve ngon
    //ta se xài hàm kieu well - dua 5!, 6!, ko choi dua -5!, 30!
    //@Test JUnit se phoi hop vs JVM de chay hàm này
    //@Test phía hau truong chính là public static void main()
    //có nhieu @Test ung vs nhieu case khác nhau de kiem thu hàm tính giai thua
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test thu tình huong tu te dau vào
        long expected = 1; // hy vong 0! = 1
        //long actual = ; //goi hàm can test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);

        //so sánh expected vs actual dùng xanh do, framework
        Assert.assertEquals(expected, actual);

        //gop them vài case thành cong/dua dau vào ngon!!! hàm phai tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1)); //muon 1! = 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); //muon 2! = 2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); //muon 3! = 6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); //muon 4! = 24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); //muon 5! = 120
        Assert.assertEquals(720, MathUtil.getFactorial(6)); //muon 6! = 720
    } //hàm giúp so sánh 2 giá tri nào dó có giong nhau ko
    //neu giong nhau -> thay màu xanh dèn duong - duong thông, code ngon ít nhat cho case dang test
    //neu ko giong nhay -> thay màu do dèn duong, hàm ý expected vad actual ko giong nhau

    //hàm getF() ta thiet ke có 2 tình huong xu lí
    //1. dua data tu te trong [0...20] -> tính dúng dc n! - done
    //2. dua data vào lôi, âm, > 20, THIÊT KÊ CUA HÀM LÀ NÉM RA NGOAI LE
    //KÌ VONG NGOAI LE XUAT HIEN KHI N < 0 || N > 20
    //mong ngoai le xuat hien voi n cà chon này
    //nêu hàm nhan vào n < 0 hoac n > 20 và hàm ném ra ngoai le
    //HÀM CHAY DUNG NHU THIET KE -> XANH PHAI XUAT HIEN
    //nêu hàm nhan vào n < 0 hoac n > 20 và hàm ko ném ra ngoai le
    //HÀM CHAY SAI THIET KE, SAI KI VONG, MÀU ĐO
    //Test case:
    //input: -5
    //expected: IllegalArgumentException xuat hien
    //tinh huong bat thuong, ngoai le, ngoài dư tính, dư liêu
    //là nhưng thư ko the đo lương so sánh theo kieu value
    //assertEquals() ko dùng đê so sánh 2 ngoai lê
    //      equals() là băng nhau hay ko trên value!!!
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowException() {
        MathUtil.getFactorial(-5); //hàm @Test chay, hay hàm getF() chay se ném ve ngoai le NumberFormat...
    }

    //hàm có ngoai le mà ko băt nên se ra do
//    @Test //(expected = IllegalArgumentException.class)
//    public void testGetFactorialGivenWrongArgumentThrowException(){
//        MathUtil.getFactorial(-5); //hàm @Test chay, hay hàm getF() chay se ném ve ngoai le NumberFormat...
//    }
    //cách khác dê bat ngoai lê xuât hiên, viêt tu nhiên hon!!!
    //xài lambda
    //Test case: hàm se ném vê ngoai lê nêu nhân vào 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_LambdaVesion() {
        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
    }

    //Bat ngoai lê, xem hàm có ném vê ngoai le hay ko khi n cà chon
    //có ném, tuc là chay dúng thiêt kê -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_TryCatch() {
        //chu dong kiêm soát ngoai lê!!!
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bat try-catch là JUnit se ra xanh do dã chu dông kiêm soát ngoai lê
            //nhung ko chac ngoai lê mình cân có xuât hiên hay ko???
            //có doan code kiêm soát dúng ngoai lê IllegalArgumentException
            Assert.assertEquals("Invalid argument. N must be between 0...20", e.getMessage()); //e tra vê thông tin báo lôi
        }
    }

}
