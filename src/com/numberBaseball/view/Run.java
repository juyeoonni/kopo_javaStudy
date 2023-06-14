package com.numberBaseball.view;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		System.out.println("숫자 야구 게임을 시작합니다.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요: ");
		String inputNum = scanner.nextLine();
		// 결과?
		
		
		
		
		
		
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
		
		int restart = scanner.nextInt();
		System.out.println("게임을 새로 시작하려면1, 종료하려면 2을 입력하세요.");
		
		switch(restart) {
			case 1: 
				//r
				break;
			
			case 2:
				
				break;
		}
		
	}

}

