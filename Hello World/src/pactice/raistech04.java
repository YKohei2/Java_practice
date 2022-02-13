package pactice;

import java.util.HashMap;
import java.util.Map;


public class raistech04 {
	
	public static void main(String[]args) throws Exception {
	 try { //エラー（Ifみたいな感覚)が出た場合下記のメッセージを表示することができる	
		Integer salary = getSalary("Yamada");
		System.out.println(salary);
	 }catch (Exception e) {
		 System.out.println("Salary is null. Please correct name");
	 }
	}
   
	
	
	
	public static Integer getSalary(String name) throws Exception {
		
		Map<String, Integer> employeeSalary  = new HashMap<>();
		employeeSalary.put("Yamashita", 250000);
		employeeSalary.put("Tanaka", 500000);
		employeeSalary.put("Suzuki", 300000);
        //System.out.println(employeeSalary.get("Yamashita"));
		
		Integer salary = employeeSalary.get(name);
		if (salary == null) { //これをしないと上記エラーだとerror nullしか表示されない
			throw new Exception("Salary is null"); //例外の情報を教えてくれる
	}
		return salary;
		
		
	}
}
