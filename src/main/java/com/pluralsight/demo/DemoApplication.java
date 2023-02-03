package com.pluralsight.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pluralsight.demo.builder.LunchOrder;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LunchOrder.Builder builder = new LunchOrder.Builder();

		builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

		LunchOrder lunchOrder = builder.build();

		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());

	}

}
