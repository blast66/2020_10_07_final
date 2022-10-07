import java.util.Scanner;
public class bbc {
    public static void main(String []args) {
	while(true){
		int grade;
		Scanner intput = new Scanner(System.in);
		System.out.println("ENTER YOU grade");
		grade = intput.nextInt();
	
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

		
}		
}	
	}

}