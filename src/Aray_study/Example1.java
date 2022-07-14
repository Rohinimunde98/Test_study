package Aray_study;

public class Example1 {

	public static void main(String[] args) {

		String ar[]=new String[5];
		ar[0]="Velocity";
		ar[1]="Rohini";
		ar[2]="Munde";
		ar[3]="Rohith";
		ar[4]="Navin";
		
		System.out.println(ar.length);
		
		//System.out.println(ar[0]);
		
		for (int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("=============");
		char grade[]=new char[3];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		
		for(int i=0;i<=grade.length-1;i++) {
			System.out.println(grade[i]);
		}
		System.out.println("================");
		int Rollno[]=new int[3];
		Rollno[0]=90;
		Rollno[1]=80;
		Rollno[2]=70;
		
		for(int i=0;i<=Rollno.length-1;i++)
		{
			System.out.println(Rollno[i]);
		}
		
		

	}

}
