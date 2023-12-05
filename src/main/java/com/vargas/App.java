package com.vargas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@RestController

public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    	
     //   System.out.println( "Hello World!" );
    }
    @GetMapping("/hellopipeline")
    public String mavenRest() {
    	
    	final int n = 8;
    	 int fibo = calculateFibonacci(n);
           
    	
    	return "Hello from the pipeline and Git  " + fibo;
    }
	static int calculateFibonacci(int n) {
		// TODO Auto-generated method stub
		 if (n < 0) {
             throw new IllegalArgumentException("n must be a positive integer.");
         }	else if  (n == 0) {
         	return 0;
         } else if (n == 1) {
             return 1;
         } else {
             return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
         }
	}
}
