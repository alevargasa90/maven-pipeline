package com.vargas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }

    @PostMapping("/calculateFibonacci")
    public String calculateFibonacci(@RequestParam(value = "n", defaultValue = "0") int n, Model model) {
        try {
    	
    	int fibo = calculateFibonacciRecursive(n);
        model.addAttribute("result", "The Fibonacci sequence for n=" + n + " is " + fibo);
        }	catch (IllegalArgumentException e) {
	        	System.out.println("Error: " + e.getMessage());
	        
	    }
        
        return "menu";
    }

     static int calculateFibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacciRecursive(n - 1) + calculateFibonacciRecursive(n - 2);
        }
    }
}
