public class IT25100728Lab2Q1 {
	
	//Main method
	public static void main (String[] args){
		double width, length, widthRatio;
		int perimeter = 100;
		widthRatio = 0.75;
		length = perimeter / (2 * (1+widthRatio));
		width = widthRatio * length;
			
		//concat
		System.out.println("Length of the fence is: "+ length);
		System.out.println("Width of the fence is: "+ width);
		
	}
	
	}