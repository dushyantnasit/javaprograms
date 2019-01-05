package com.oops.absinter;

class a{  
  
   a(){
	   System.out.println("Contructore called");
   }
	
   void run(){
	   System.out.println("running");
   }  
}  
     
class Honda extends a{  
	
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
	   a honda= new Honda();  
   honda.run();
   
   a honda1= new a();  
   honda1.run();
   }  
}  