package ghi;

public class ProductMain {

	public static void main(String[] args) {
	
		// 상품 객체 생성
        Product product = new Product("아이폰" , 12900);
        

        // set 메서드로 값 설정
        product.getName();
        product.getPrice();

        // toString()으로만 출력
        System.out.println(product.toString());


	}

}
