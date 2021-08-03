package ProjectA;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s= "Harika";
				String R ="";
				//String r = null;
				
			int i=	s.length();
			
			for(int j=i-1;j>=0;j--){
				R =R + s.charAt(j);
			}
		
		
		System.out.println("reverse string is:" + " " +R);
		
		
		
		
		
	}

}
