package com.example;

public class helloGit {
	
	public static void main(String[] args){
		//for infinite loop
		while(true)
		{
			System.out.println("Hello Git");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
