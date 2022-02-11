package pactice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee_raisetech02 {

	//メンバ//
	//フィールド(情報)//
	private int id;
	
	private String name;
	
	private LocalDate enteredDate;
	
	private LocalDate retiredDate;
	
	private int salary;
	
	//publicにしないと他の外部のクラス(同プロジェクト内)で使えない//
	//ただし実際はpublicなフィールドはNG,フィールドは基本privateでその場合はgetterを使う
	//カプセル化、オブジェクト指向の言葉
	//カプセル化、オブジェクト指向、多態性（ポリモーフィズム),継承
	private int age;
	
    //constructor//	
	public Employee_raisetech02(int id, String name, LocalDate enteredDate, LocalDate retiredDate, int salary) {
		this.id = id;
		this.name = name;
		this.enteredDate = enteredDate;
		this.retiredDate = retiredDate;
		this.salary = salary;
	}
	
	public Employee_raisetech02() {
		
	}
	
	//メソッド(idの情報をとる）//
	public int getId() {
		return this.id;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//メソッド名はsetterだが実務ではふるまいを単語に使う→→→↓
	public void raiseSalary(int salary) { //raiseの部分は変えれる（意味が分かる単語で
		this.salary = salary;
	}
	
	//メソッド（下記の計算ができる)//
	public int calculateRetirementBonus() {
		return 10000 * Math.toIntExact(ChronoUnit.YEARS.between(this.enteredDate, this.retiredDate));
	}



}
