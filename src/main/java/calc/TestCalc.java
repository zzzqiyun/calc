package calc;

import java.util.Scanner;

public class TestCalc {
  public static void main(String args[]) {
    System.out.println("������Ҫѡ�������");
    System.out.println("1.�ӷ�");
    System.out.println("2.����");
    System.out.println("3.�˷�");
    System.out.println("4.����");
    Scanner scan = new Scanner(System.in);
    int choice = scan.nextInt();
    System.out.println("���������:" + choice);
    System.out.println("����������Ҫ�����ֵ���м��ÿո������");
    float n1 = scan.nextFloat();
    float n2 = scan.nextFloat();
        Calc c = new Calc();
        int end =1;
    while (end!=0) {
      if (choice == 1) {
        float result = c.addition(n1, n2);
        System.out.println("���Ϊ��" + result);
      } else if (choice == 2) {
        float result = c.subtraction(n1, n2);
        System.out.println("���Ϊ��" + result);
      } else if (choice == 3) {
        float result = c.multiplication(n1, n2);
        System.out.println("���Ϊ��" + result);
      } else if (choice == 4) {
        float result = c.division(n1, n2);
        System.out.println("���Ϊ��" + result);
      }
      System.out.println("����0������");
      end = scan.nextInt();
    }
  }
}