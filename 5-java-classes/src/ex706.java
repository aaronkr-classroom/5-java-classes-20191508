public class ex706 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.breed = "포메라니언"; //public 변수
		d.color = "갈색";     //public 변수

		System.out.println("강아지 품종:"+d.breed);
		System.out.println("강아지 색상"+d.color);
		
		d.sound(); //public 메서드
		d.age = 10; //protected
		System.out.println("강아지 나이"+d.age);
		d.run(); //protected 메서드
		
		 d.name = "다운"; // 
		 System.out.println("강아지 이름"+d.name); //
		 d.sleep(); //
	}
}
