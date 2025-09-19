package jkl;

import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class FOODMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FoodDAO dao = new FoodDAO();
		boolean running = true;

		System.out.println("==== 국제사회교육원 식자재 관리 시스템 ====");

		while (running) {
			System.out.println("\n1. 식자재 등록");
			System.out.println("2. 식자재 목록 조회");
			System.out.println("3. 프로그램 종료");
			System.out.print("선택: ");
			String choice = sc.nextLine();

			switch (choice) {
			case "1":
				System.out.print("식자재번호 입력: ");
				String id = sc.nextLine();

				System.out.print("식자재명 입력: ");
				String name = sc.nextLine();

				System.out.print("수량 입력: ");
				int quantity;
				try {
					quantity = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("❌ 수량은 숫자만 입력해주세요.");
					break;
				}

				String regDate = LocalDate.now().toString(); // 현재 날짜 자동 등록

				FoodDTO food = new FoodDTO(id, name, quantity, regDate);
				dao.addFood(food);
				System.out.println("✅ 식자재 등록이 완료되었습니다.");
				break;

			case "2":
				List<FoodDTO> foods = dao.getAllFoods();
				if (foods.isEmpty()) {
					System.out.println("📂 등록된 식자재가 없습니다.");
				} else {
					System.out.println("\n📋 식자재 목록:");
					for (FoodDTO f : foods) {
						System.out.println(f);
					}
				}
				break;

			case "3":
				running = false;
				System.out.println("👋 프로그램을 종료합니다.");
				break;

			default:
				System.out.println("❌ 잘못된 선택입니다. 다시 입력해주세요.");
			}
		}

	}

}

