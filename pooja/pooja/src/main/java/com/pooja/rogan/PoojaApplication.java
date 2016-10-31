package com.pooja.rogan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

@SpringBootApplication
public class PoojaApplication {

	public static void main(String[] args) throws IOException {

		int withdraw;
		double deposit;

		double result;

		Scanner input = new Scanner(System.in);

		System.out.print("how much do u want withdraw ? :");
		withdraw = input.nextInt();

		System.out.print("how much do u have deposit ? :");
		deposit = input.nextDouble();
		// 비교 로직
		if (0 < withdraw && withdraw <= 2000 &&
				withdraw % 5 == 0 &&
				withdraw <= deposit &&
				withdraw  > deposit + 0.50 ) {
					
			result = deposit - withdraw - 0.50;

			// 계산 후 결과값 출력
			//System.out.printf("%.2f", result);
			// new 연산자를 사용해서 DecimalFormat 클래스 객체를 생성해서 사용.
			// 사용 패턴 형식은 "0","#"을 지정해서 사용.
			System.out.println(new DecimalFormat("#0.00").format(result)); 
			
			// input이라는 Scanner변수를 다 사용했기 때문에 반환(반환이 제대로 안되면 무한 대기, 꼬여 버릴 가능성이 있음.)
			input.close(); 
			
		} else {

			System.out.println(new DecimalFormat("#0.00").format(deposit));
			
		}
		

	}
}