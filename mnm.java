import java.util.Scanner;

public class mnm {
    public static void main(String []args) {
		while(true){
			int grade;
			Scanner intput = new Scanner(System.in);
			
			System.out.println("ENTER YOU grade");
			grade = intput.nextInt();
			if (grade>100||grade<= -1) {
				System.out.println("try again");
			}
			else {
				
				switch(grade/10){	
					case 10 :
						System.out.println("A");
						break; 
					case 9 :
						System.out.println("A");
						break; 
					case 8:
						System.out.println("B");
						break; 
					case 7:
						System.out.println("C");
						break; 
					case 6:
						System.out.println("D");
						break; 
					default : 
						System.out.println("E");
						break;
				}
			}		
		}	
	}
}