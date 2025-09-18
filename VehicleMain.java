package ghi;

public class VehicleMain {

	public static void main(String[] args) {
		  Car car = new Car();
	        car.setSpeed(120);
	        car.move();
	        
	        System.out.println("자동차 속도: " + car.getSpeed() + "km/h");

	        System.out.println();

	        // 자전거 객체 생성 및 설정
	        Bicycle bicycle = new Bicycle();
	        bicycle.setSpeed(25);
	        bicycle.move();
	        System.out.println("자전거 속도: " + bicycle.getSpeed() + "km/h");
	    }

	}


