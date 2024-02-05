package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		OverrideMain overrideMain = new OverrideMain();
		overrideMain.main(args);
	}

	public static class Hewan {
		void makan() {
			System.out.println("makan.");
		}
	}

	public static class Kambing extends Hewan {
		@Override
		void makan() {
			System.out.println("Kambing itu makan");
		}
	}

	public static class Aritmatika {
		public int perkalian(int a, int b) {
			int resultKali = a * b;
			return resultKali;
		}

		public int perkalian(int a, int b, int c) {
			int resultKali = a * b * c;
			return resultKali;
		}

		public void hasil(boolean b, String s, int no) {
			System.out.println("Boolean: " + b);
			System.out.println("String: " + s);
			System.out.println("Integer: " + no);
		}
	}

	public static class OverrideMain {
		public void main(String args[]) {
			Kambing kambing1 = new Kambing();
			Hewan hewan1 = new Hewan();

			kambing1.makan();
			hewan1.makan();

			Hewan hewan = new Hewan();
			hewan.makan();

			Aritmatika aritmatika1 = new Aritmatika();

			int result1 = aritmatika1.perkalian(2, 3);

			System.out.println("Result dua integer value: " + result1);

			int result2 = aritmatika1.perkalian(2, 3, 4);

			System.out.println("Result of the three integer value: " + result2);

			aritmatika1.hasil(true, "Halo", 5);
		}
	}
}