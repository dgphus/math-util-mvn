/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.dphus.mathutil.test;

import static org.dphus.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ROG STRIX
 */
public class MathUtiilityTest {
   
    
    @Test
    public void testFacetorialGivenRightAgurmentReturnsWell(){
        //assertEquals(69, 69);
        
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(720, getFactorial(6));
        
        
    }
    
}
// TDD: Test Driven Development là kĩ thuật lập trình mà nó được gắn với việc viết các test case để kiểm thử ngay những hàm
//      dev mình vừa viết, viết code chính và viết code test(JUnit, Unit Test) xen kẽ với nhau. 2 màu xanh đỏ liên tục diễn ra

// DDT: Data Driven Testing sự mở rộng thêm cho quá trình viết code test (JUnit)
//      kĩ thuật tách bộ test data ra 1 chỗ riêng, tách vào mảng, tách vào file excel, hay table, sau đó nhồi/fill/map data từ mảng
//      vào trong hàm so sánh assertEquals(), giúp code dễ đọc hơn, dễ kiểm tra xem còn thiếu test case nào hay không?