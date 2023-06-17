/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khanh.mathutil.core;

/**
 *
 * @author ASUS
 */
public class MathUtility {

    //hàm tính n! = 1.2.3.4.   n
    //thiết kế hàm này như sau:
    //0! = 1! = 1
    //ko có giai thừa cho số âm -1 -2 bị chửi, ném ra exception
    //giai thừa tăng nhanh, 21! kiểu long bị tràn, chưa ko nổi
    //chỉ tính giai thừa  từ 0..20
    //>= 21! BỊ CHỬI, NÉM RA NGOAI LỆ
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, pls.");
        if(n == 0 || n == 1)
            return 1;
        long product = 1; //tích nhân dồn 1 2 3 4 5...
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
    }
}
