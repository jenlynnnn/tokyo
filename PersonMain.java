package ghi;

public class PersonMain  {

	public static void main(String[] args) {

		

			//객체 생성
            Person[] people = new Person[5];

            // 각 객체를 생성하고 값 저장
            for (int i = 0; i < people.length; i++) {
                people[i] = new Person();
                
            people[i].setName("사람" + (i + 1));
            people[i].setAge(20 + i); // 20, 21, ...
        }

            people[0].setName("전공주");
            people[0].setAge(25);

            people[1].setName("전공주");
            people[1].setAge(30);

            people[2].setName("전공주");
            people[2].setAge(22);

            people[3].setName("전공주");
            people[3].setAge(28);

            people[4].setName("전공주");
            people[4].setAge(35);

            
        for (int i = 0; i < people.length; i++) {
            System.out.println("이름: " + people[i].getName());
            System.out.println("나이: " + people[i].getAge() + "세\n");
        }
    }

}
	
