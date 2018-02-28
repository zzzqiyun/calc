package calc;

import java.util.Scanner;

public class TestCalc {
  public static void main(String args[]) {
    System.out.println("输入你要选择的运算");
    System.out.println("1.加法");
    System.out.println("2.减法");
    System.out.println("3.乘法");
    System.out.println("4.除法");
    Scanner scan = new Scanner(System.in);
    int choice = scan.nextInt();
    System.out.println("你输入的是:" + choice);
    System.out.println("输入两个你要计算的值，中间用空格隔开：");
    float n1 = scan.nextFloat();
    float n2 = scan.nextFloat();
        Calc c = new Calc();
        int end =1;
    while (end!=0) {
      if (choice == 1) {
        float result = c.addition(n1, n2);
        System.out.println("结果为：" + result);
      } else if (choice == 2) {
        float result = c.subtraction(n1, n2);
        System.out.println("结果为：" + result);
      } else if (choice == 3) {
        float result = c.multiplication(n1, n2);
        System.out.println("结果为：" + result);
      } else if (choice == 4) {
        float result = c.division(n1, n2);
        System.out.println("结果为：" + result);
      }
      System.out.println("输入0结束！");
      end = scan.nextInt();
    }
  }
}