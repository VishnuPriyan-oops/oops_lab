class Methodoverloading1{
	
	public void add(int a,int b){
		System.out.println("Addn of two integers:"+(a+b));
	}	
	public void add(int a,double b){
		System.out.println("Addn of a int and double  values"+(a+b));
	}
	public void add(double a,double b){
		System.out.println("Addn of two double vals:"+(a+b));
	}
	
	public void add(int a,double b,double c){
		System.out.println("Addn of a single int and two double values:"+(a+b+c));
	}
	public static void main(String[] args){
		Methodoverloading1 m=new Methodoverloading1();
		int a=5;
		int e=2;
		double b=7.55;
		double c=9.45;
		double d=11.25;
		
		m.add(a,b);
		m.add(c,d);
		m.add(a,e);
		m.add(a,b,c);
	}
}
			