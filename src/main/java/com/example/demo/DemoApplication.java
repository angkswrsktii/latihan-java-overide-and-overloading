package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		OverrideMain overrideMain = new OverrideMain();
		overrideMain.main(args);
	}

	public static class OverrideMain {
		public void main(String args[]) {
			Mobil mobil = new Mobil();

			Kendaraan kendaraan = new Kendaraan();
			mobil.jalan();
			kendaraan.jalan();

			Matematika matematika1 = new Matematika();

			int result1 = matematika1.perkalian1(2, 3);
			System.out.println("Result dua integer value: " + result1);

			int result2 = matematika1.perkalian2(2, 3, 4);
			System.out.println("Result tiga integer value: " + result2);

			matematika1.hasil(true, "Halo", 5);
		}
	}
}