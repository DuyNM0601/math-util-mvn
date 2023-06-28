/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.duy.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.duy.mathutil.core.MathUtility;

/**
 *
 * @author ASUS
 */
public class MathUtilityAdvancedTest {
    //CHUẨN BỊ SẴN RIÊNG TEST DATA, LÁT ỒI FILL VÀO HÀM
    //DDT
    //hàm trả về mảng 2 chiều, kiểu WRAPPER CLASS/OBJECT
    //mảng chứa các cặp n -> expected, ví dụ 0! -> 1; 1! -> 1; 5 -> 120
    public static Object[][] initTestData(){
        
        Object [][] testData = {{0, 1},
                                {1, 1}, 
                                {2, 2}, 
                                {5, 120}, 
                                {6, 720}
        };
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
                //tham số hóa việc đưa test data vào hàm assertE()
                // biến đổi dữ liệu thành tham số cho tổng quát
                //PARAMETERIZED
        assertEquals(expected, MathUtility.getFactorial(n));
        
    }
}
