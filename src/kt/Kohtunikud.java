package kt;

public class Kohtunikud {
	
	public static void main(String[] args) {
	      System.out.println (result (new double[]{0., 1., 2., 3., 4.}));
	}

	  public static double result (double[] marks) {
	      double summa = 0;
	      double min = Double.MAX_VALUE;
	      double max = Double.MIN_VALUE;
		  for(int i = 0; i<marks.length;i++){
			  summa = summa + marks[i];
			  if(marks[i]<min){
				  min = marks[i];
			  }
		  }
		  for(int i = 0; i<marks.length;i++){
			  if(marks[i]>max){
				  max = marks[i];
			  }
		  }
		  
		  summa = summa - max - min;
		  double punktid = summa/(marks.length-2);
		  
		  return punktid;  
	   }
	
}
