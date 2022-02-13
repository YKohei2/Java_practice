package pactice;

import java.time.LocalDate;

public class employeeInfo {
  public static void main(String[] args) {
	  
	  //constructorを介してEmployee_raisetech02という4つの型(４つのクラス)の変数(4つのインスタンス)を作成//
	  Employee_raisetech02 Yamashita = new Employee_raisetech02 (1, "Yamashita", LocalDate.of(2020, 2, 1), LocalDate.of(2022,  2, 2), 1000);
	   //intは設定しなければdefaultは0
	  Yamashita.setAge(34);
	  System.out.println(Yamashita.getAge());
	  
	  System.out.println(Yamashita.calculateRetirementBonus());
	  
	  System.out.println("Yamashita previous salary "+ Yamashita.getSalary());
	  Yamashita.raiseSalary(1000000);//セッターで値を変更する
	  System.out.println("Yamashita raised salary  "+ Yamashita.getSalary());
	  
	  Employee_raisetech02 Nakamura = new Employee_raisetech02(2, "Nakamura", LocalDate.now(), null, 1300);
	  Employee_raisetech02 Watanabe = new Employee_raisetech02(3, "Watanabe", LocalDate.of(2021, 9, 1), null, 1500);
	  
	  //Constructorで空（ID, salary、入社退社日）の分も作る必要がある
	  Employee_raisetech02 yamada = new Employee_raisetech02();
  }
}
