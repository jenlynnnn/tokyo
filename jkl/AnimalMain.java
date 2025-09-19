package jkl;
import java.util.List;
import java.util.Scanner;
public class AnimalMain {

	public static void main(String[] args) {

	

	Scanner sc = new Scanner(System.in);
	AnimalDAO dao = new AnimalDAO();
	boolean run = true;

	System.out.println("==== 동물 병원 환자 관리 시스템 ====");

	while(run){
		System.out.println("\n1. 환자 등록");
		System.out.println("2. 환자 목록 조회");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택: ");
		String choice = sc.nextLine();

		switch (choice) {
		case "1":
			System.out.print("아이디 입력: ");
			String id = sc.nextLine();

			System.out.print("보호자명 입력: ");
			String ownerName = sc.nextLine();

			System.out.print("반려 동물명 입력: ");
			String petName = sc.nextLine();

			System.out.print("반려 동물 나이 입력: ");
			int petAge = Integer.parseInt(sc.nextLine());

			System.out.print("연락처 입력: ");
			String phoneNumber = sc.nextLine();

			AnimalDTO newPatient = new AnimalDTO(id, ownerName, petName, petAge, phoneNumber);
            dao.addPatient(newPatient);
			System.out.println("✅ 환자 등록이 완료되었습니다.");
			break;

		case "2":
			List<AnimalDTO> animal = dao.getAllPatients();
			if (animal.isEmpty()) {
				System.out.println("📂 등록된 환자가 없습니다.");
			} else {
				System.out.println("\n📋 등록된 환자 목록:");
				for (AnimalDTO p : animal) {
					System.out.println(p);
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
	





