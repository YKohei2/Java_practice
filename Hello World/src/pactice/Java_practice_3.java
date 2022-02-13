package pactice;

import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class Java_practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*-------------------------------------------*/	
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯します");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDを見ます");
		}
/*-------------------------------------------*/			
		boolean doorClose = true;
		while (doorClose == false) {
            System.out.println("ノックをします");
            System.out.println("1分間待ちます");
	    }
/*-------------------------------------------*/			
		LocalDateTime Date = LocalDateTime.now();
		System.out.println("Date : "+Date);
		
		DayOfWeek DW = Date.getDayOfWeek();
		System.out.println("曜日: "+DW);
		
		DayOfWeek dayafter3 = Date.plusYears(3).getDayOfWeek();
		System.out.println("3年後の今日は" +Date.plusYears(3));
		System.out.println("３年後の今日の曜日は" +dayafter3);

/*-------------------------------------------*/			
		for (int i = 0; i < 13; i++) {
		 
		if (i  < 10) {
			System.out.println("Hello World");
		} else {
			System.out.println("Hello");
		}
	}
/*-------------------------------------------*/			
		String greeting;
		greeting = "Hello World";
		    System.out.println(greeting);  

/*-------------------------------------------*/			
		    
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
	       	sum += i;
		    //System.out.println("i:" + i);
		}
            System.out.println("the sum is "+ sum);	
//--------------------------------------------
    	int sum2 = 0;
    		
    	for (int k = 1; k <= 10; k++) {
    	       	sum += k;
    		    //System.out.println("i:" + i);
    		
                System.out.println("this sum is "+ sum);	

    	}
            
 /*------------------------------------------*/
         //hello();
         
/*------------------------------------------*/
         int num1 = 0;
         int num2 = 1;
         if (num1 < 5 || num2 < 20) {
        	 System.out.println("引数が0なら偽");
         }{
        	 System.out.println("引数が1なら真");        	
     }
	
	 //source tree test!
  }
}