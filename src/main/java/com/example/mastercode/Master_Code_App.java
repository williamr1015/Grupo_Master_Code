package com.example.mastercode;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Master_Code_App {

	public static void main(String[] args) {
		SpringApplication.run(Master_Code_App.class, args);
		
		Transactions t = new Transactions(1, 100, "Ingreso", "Empresa1", LocalDate.now(), LocalDate.now());
		Transactions t2 = new Transactions(2, 200, "Ingreso", "Empresa2", LocalDate.now(), LocalDate.now());
		System.out.println(t.toString());
		System.out.println(t2.toString());

		EmpleadoMC e = new EmpleadoMC(1, "Juan", "Perez", "juan.p@gmail.com", "Administrador", "Perfil1", "Empresa1", 30, LocalDate.now(), LocalDate.now());
		EmpleadoMC e2 = new EmpleadoMC(2, "Pedro", "Perez", "pedro.p@gmail.com", "Administrador", "Perfil2", "Empresa2", 30, LocalDate.now(), LocalDate.now());
		System.out.println(e.toString());
		System.out.println(e2.toString());

		Empresa em = new Empresa("colanta", "1000020033", "32123020020", "Calle falsa 123");
		System.out.println(em.toString());

	}

}
