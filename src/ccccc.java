
interface ccccc {
	
	int a = 10;
	void show();

}

class D implements ccccc{
	
	public void show() {
		
		System.out.println("Show" + a);
	}
	
}


class E{
	
	public static void main(String[] args) {
		
		ccccc d = new D();
		
		d.show();
		
		
	}
	
	
}