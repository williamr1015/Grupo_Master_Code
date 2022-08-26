package com.example.mastercode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Master_Code_App {
	public static void main(String[] args) {
		SpringApplication.run(Master_Code_App.class, args);

		Rol administrador = new Rol("Administrador", 1);

		Rol operativo = new Rol("Operativo", 2);

		Perfil perfil1 = new Perfil(1, null,"1111111", LocalDate.of(2022, 8, 26), LocalDate.of(2022, 8, 26));

		Transaccion transaccion1 = new Transaccion(1, "venta", 111.1,null, LocalDate.of(2022, 8, 26), LocalDate.of(2022, 8, 26));

		Empresa empresa1 = new Empresa(1,"empresa_1", "1-1-1", 1111111, "carreara_1",null,transaccion1);

		Empleado empleado1 = new Empleado(1, "empleado_1@", perfil1, administrador, empresa1, transaccion1, LocalDate.of(2022, 8, 26), LocalDate.of(2022, 8, 26));

		System.out.println(empleado1);
	}
}
