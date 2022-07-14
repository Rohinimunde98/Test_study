package interface_study;

public class child implements mother, father{
	
	//child class implements to interface father and mother
	
	//two parents one child ------>Multiple concept acheived
	
	public void receipe() {//mother property
		System.out.println("receipe method completed by child");
	}
	public void look() {//mathers property
		System.out.println("look method completd by child");
	}
	public void money() {//father property
		System.out.println("money method completed by child");
	}
	public void property() {//father property
		System.out.println("property completed by child");
		
	}
	public void laptop() {//child own property
		System.out.println("child own property");
	}
	

}
