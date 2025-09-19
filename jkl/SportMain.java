package jkl;

import java.util.List;
import java.util.Scanner;

public class SportMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SportDAO dao = new SportDAO();
		boolean run= true;

		System.out.println("==== 체육센터 건강관리 시스템 ====");

		while(run) {
			System.out.println("\n1. 회원 등록");
			System.out.println("2. 회원 목록 조회");
			System.out.println("3. 프로그램 종료");
			System.out.print("선택: ");
			String choice = sc.nextLine();
		
			switch (choice) {
			case "1":
				System.out.print("회원명 입력: ");
				String name = sc.nextLine();

				System.out.print("회원번호 입력: ");
				String memberId = sc.nextLine();

				int baseCal, burnedCal;
			
				try {
					System.out.print("기준칼로리 입력: ");
					baseCal = Integer.parseInt(sc.nextLine());

					System.out.print("소비칼로리 입력: ");
					burnedCal = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("❌ 칼로리는 숫자만 입력해주세요.");
					break;
				}

				SportDTO dto = new SportDTO(name, memberId, baseCal, burnedCal);
				dao.addSport(dto);
				System.out.println("✅ 회원 등록이 완료되었습니다.");
				break;

			case "2":
				List<SportDTO> sport = dao.getALLSport();
				if (sport.isEmpty()) {
					System.out.println("📂 등록된 회원이 없습니다.");
				} else {
					System.out.println("\n📋 회원 목록:");
					for (SportDTO m : sport) {
						System.out.println(m);
					}
				}
				break;

			case "3":
				run = false;
				System.out.println("👋 프로그램을 종료합니다.");
				break;

			default:
				System.out.println("❌ 잘못된 입력입니다. 다시 선택해주세요.");
			}
		}

	}
	

}
