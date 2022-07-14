package String_study;

public class String_method_use {

	public static void main(String[] args) {
		
		
		//1)Length method
		String name="Velocity";
		
		System.out.println(name.length());
		
		int lengthOfString=name.length();
		
		System.out.println(lengthOfString);
		
		System.out.println("=====================");
		
		//2)toUpeerCase method
		
		System.out.println(name.toUpperCase());
		
		String m=name.toUpperCase();
		
		System.out.println(m);
		
		System.out.println("==================");
		
		//3)toLowerCase Method
		
		System.out.println(name.toLowerCase());
		
		String n=name.toLowerCase();
		
		System.out.println(n);
		System.out.println("======================");
		
		//4)equals()method use
		
		String a="Velocity";
		
		String b="Velocity";
		
		String c="VELOCITY";
		
		String d=new String("Velocity");
		
		String e=new String("VELOCITY");
		
		//====campare memory location between two string with case sensitiveness
		
		//equals method use to compare character sequence between string
		
		System.out.println(a==b);//---->true
		
		System.out.println(a==c);//----->false
		
		System.out.println(a==d);//--->false 
		
	   System.out.println(a.equals(d));//---->true
	   
	   System.out.println(c.equals(e));//----->true
	   
	   System.out.println("======================");
	   
	   //5)IgnorCase method use(boolean output)
	   
	   String dist ="Pune";
	   
	   String city="Pune";
	   
	   String locality="PUNE";
	   
	   System.out.println(dist.equalsIgnoreCase(city));//---->true
	   
	   System.out.println(city.equalsIgnoreCase(locality));//--->true
	   
	   System.out.println("======================");
	   
	   //6)contains method(boolean output)
	   
	   String k="Katraj";
	   
	   System.out.println(k.contains("tra"));//---->true
	   
	   System.out.println(k.contains("kj"));//--->false
	   
	   System.out.println("============================");
	   
	   //7)Is empty method(boolean output)
	   
	   String p="Test";
	   
	   String q=" ";
	   
	   String r=null;
	   
	   String j="";
	   
	   System.out.println(p.length());//---->length of string output
	   
	   System.out.println(p.isEmpty());//--->false
	   
	   System.out.println(q.isEmpty());//--->false space consider also same value
	   
	   
	   System.out.println(j.isEmpty());//---->true there is no any space then condition true
	   
	   //System.out.println(r.isEmpty());//---->excepation error
	   
	   System.out.println("=====================");
	   
	   //8)Is blank method
	   
	   System.out.println(q.isBlank());//---->true there is no any char then condition is true
	   
	   System.out.println(j.isBlank());//---->true
	   
	   System.out.println(p.isBlank());//----->false
	   
	   System.out.println("=============================");
	   
	   //9)charAt method use
	   
	   String Country="India";
	   
	   System.out.println(Country.charAt(2));
	   
	 //  System.out.println(Country.charAt(7));----->exceptional error because of index is out of length
	   
	   System.out.println("==========================");
	   
	   //10)endsWith method(boolean output)
	   
	   System.out.println(Country.endsWith("dia"));
	   
	   System.out.println(Country.endsWith("Ind"));
	   
	   System.out.println("============================");
	   
	   //11)StartWith method
	   
	   System.out.println(Country.startsWith("In"));
	   
	   System.out.println(Country.startsWith("In", 0));
	   
	   System.out.println(Country.lastIndexOf('i'));
	   
	   System.out.println(Country.lastIndexOf('a'));
	   
	   System.out.println("==============================");
	   
	   //12)Substring method use
	   
	   String Testing ="VELOCITYCORPORATIONTRAININGCENTER";
	   
	   String resultString= Testing.substring(28);
	   
	   System.out.println(Testing.substring(11));
	   
	   System.out.println(Testing.substring(8, 19));
	   
	   System.out.println(Testing.substring(0, 8));
	   
	   System.out.println(Testing.subSequence(19, 27));
	   
	   System.out.println("=============================");
	   
	   //13)concat method
	   
	   String x="Pune";
	   
	   String y="City";
	   
	   System.out.println(x.concat(y).concat("Katraj"));
	   
	   System.out.println("=========================");
	   
	   //14)Index of method
	   
	   String state="Maharashtra";
	   
	   System.out.println(state.indexOf('a'));//---->if there are no.af same char then that time it gives first preferance of thet first index
	   
	   System.out.println(state.indexOf('a', 4));
	   
	   System.out.println(state.lastIndexOf('a'));
	   
	   System.out.println(state.lastIndexOf('a', 4));
	   
	   System.out.println("==========================");
	   
	   //15)Replace Method us
	   
	   String tal="Pune Munbai Nagpur";
	   
	   System.out.println(tal.replace("Pu", "Om"));
	   
	   System.out.println(tal.replace('M', 'R'));
	   
	   //16)split method
	   
	   String Mystring="Good Morining";
	   String s=" ";
	   String[] output=Mystring.split(s);
	   System.out.println(output[0]);
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		

	}

}
