/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.dphus.mathutil.test;

import static org.dphus.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ROG STRIX
 */
public class MathUtilityAdvancedTest {

    //tạo mảng 2 chiều chứa data sẽ dùng cho việc assertE()
    //gồm n đưa vào và expected trả về
    //int               long -> Object(wrapper class)
    //                          integer long
    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {3, 6}, 
                               {5, 1200}};
        return testData;
    }
// nhồi data vào hàm assertE()
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFacetorialGivenRightAgurmentReturnsWell(int n, long expected){
        //assertEquals(69, 69);
        
        assertEquals(expected, getFactorial(n));
    }
}
