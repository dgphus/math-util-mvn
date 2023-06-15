/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dphus.mathutil.core;

//class này, clone lại cái class huyền thoại java.util.Math với các hàm nổi tiếng Math.sqrt() Math.sin()
public class MathUtility {

    public static final double PI = 3.1415;

    // class này chứa hàm static. chấm xài luôn
    // tính n giai thừa n! = 1.2.3....n
    // quy ước thiết kế hàm này như sau
    //0! = 1! = 1
    // không có giai thừa số âm, nếu đưa số âm, chửi
    //giai thừa tăng nhanh, 20! vừa khớp full kiểu long
    //do đó 21! không dùng kiểu long được. nếu đưa > 21, chửi 
    //chửi: không trả về giá trị gì cả mà ném ra ngoại lệ exception
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        if (n == 0 || n == 1) {
            return 1;
        }
        long  product = 1;// tích nhân dồn khởi động từ 1
        
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

//TDD: Test Driven Development(phát triển phần mềm theo phong cách
//code đến đâu kiểm thử đến đó, viết code, test case/test run diễn ra song song)
//cứ có hàm là có test case
// viết ra các test case đủ bao quát các tình huống xài hàm
//test case: là bộ dữ liệu dùng để đưa vào app/hàm để mô phỏng lại
// 1 tình huống xài app/hàm.Nó có input data, giải thích cách dùng hàm và có giá trị trả về expected
//lát hồi run( test run/ test excecution) để luận đúng sai
//Dân Dev giống dân QC ở chỗ này
//đều phải viết/ tạo ra test case, đều phải tiến hàn run/chạy test và đều phải đọc kết quả đúng sai
//Dev khác tester là phải viết code làm app
//Test case không viết tự do mà viết theo template
//viết tự do:0! -> 1, 1! -> 1, 2! -> 2, 3! -> 6
//viết chuaannr lại test case(xuất hiện trong đề thi PE, khóa luận tốt nghiệp và đi làm)
//Test case #1: (mục tiêu) check getF() with n = 0
//Steps-Procedures (cách tiến hành test - input/output...)
//                  1. give n = 0
//                  2. Call the getF(n) (getF(0))
//Expected results:(kết quả kì vọng)
//                     getF(0) must return 1
//Test case #1: (mục tiêu) check getF() with n = 1
//Steps-Procedures (cách tiến hành test - input/output...)
//                  1. give n = 1
//                  2. Call the getF(n) (getF(1))
//Expected results:(kết quả kì vọng)
//                     getF(1) must return 1

//DDT là 1 phần mở rộng của các unit test framework
//data driven testing
// không nhầm với TDD: test driven development : viết code và viết test case song hành với nhau
// nhưng code test bốc mùi ( bad smells) trùng code nhiều
//nên người ta chế ra cách viết code test đẹp hơn, gọn hơn, dễ bảo trì