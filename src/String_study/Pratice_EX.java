package String_study;



public class Pratice_EX {

	public static void main(String[] args) {
	
		String s="rohinimunde98";
		String m=" ";
		String e=null;
		String f="ROHINI";
		String g="rohini";
		String h="   Munde";
		String o="";
		
		System.out.println(s.charAt(7));
        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf("munde"));
        System.out.println(f.equalsIgnoreCase(g));
        System.out.println(h.length());
        
        System.out.println(h.indexOf('u', 3));
        System.out.println(g.concat(h));
       System.out.println(o.isEmpty());
       System.out.println(o.isBlank());
       System.out.println(m.isBlank());
       System.out.println(m.isEmpty());
       System.out.println(s.contains("e98"));
       System.out.println(s.contains("rohi"));
       System.out.println(s.lastIndexOf("98"));
       System.out.println(s.substring(6, 11));        //------>when we using subtring method so then we consider lenght of 
                                                                                          //string        
       System.out.println(f.substring(3));
       System.out.println(f.substring(4));
       System.out.println(f.substring(0, 4));
       System.out.println(s.substring(6, 9));
       
       String l="Maharathwada";
       System.out.println(l.substring(8, 12));
       System.out.println(l.substring(6, 10));
       System.out.println(l.concat("Beed").concat("RuralArea"));
       
      /* StringBuffer r=new StringBuffer("Rohini");
       System.out.println(r.reverse());
       
	}
	
	
	
	

	private static char[] reverse() {
		// TODO Auto-generated method stub
		return null;*/
       
       String p="Goa Mumbai Loha";
       System.out.println(p.replace('a', 'i'));
       
       
       StringBuffer P=new StringBuffer("Rohi");
       System.out.println(P.reverse());
       
       
	}

}
