
public class methodOverloading {
	
	public static int add(int i, int j) {
		return i+j;
	}
	public static double add(double i, double j) {
		return i+j;
	}
	public static int add(int i, int j, int k) {
		return i+j+k;
	}

	public static void main(String[] args) {
		System.out.println(methodOverloading.add(2,4));
		System.out.println(methodOverloading.add(1.1,1.1));
		System.out.println(methodOverloading.add(1,2,3));
	}

}
