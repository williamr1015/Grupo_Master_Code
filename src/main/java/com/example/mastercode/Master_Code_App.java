package com.example.mastercode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Master_Code_App {

	public static void main(String[] args) {
		SpringApplication.run(Master_Code_App.class, args);
		Transactions t = new Transactions(1, 100, "Ingreso", "Empresa 1", "2020-01-01", "2020-01-01");
		System.out.println(t.getId());
		System.out.println(t.getAmount());
		System.out.println(t.getConcept());
		System.out.println(t.getEnterprise());
		System.out.println(t.getCreated_at());
		System.out.println(t.getUpdated_at());

		Transactions t2 = new Transactions(2, 200, "Ingreso", "Empresa 2", "2020-01-01", "2020-01-01");
		System.out.println(t2.getId());
		System.out.println(t2.getAmount());
		System.out.println(t2.getConcept());
		System.out.println(t2.getEnterprise());
		System.out.println(t2.getCreated_at());
		System.out.println(t2.getUpdated_at());

		Transactions t3 = new Transactions(3, 50, "Retiro", "Empresa 3", "2020-01-01", "2020-01-01");
		System.out.println(t3.getId());
		System.out.println(t3.getAmount());
		System.out.println(t3.getConcept());
		System.out.println(t3.getEnterprise());
		System.out.println(t3.getCreated_at());
		System.out.println(t3.getUpdated_at());
		
	}

}
