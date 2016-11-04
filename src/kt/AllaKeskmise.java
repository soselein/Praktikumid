package kt;

public class AllaKeskmise {

	public static void main(String[] args) {
		
		double[] d = {1,2,3,4,5,6,7,8,9};
		int arv = allaKeskmise(d);
		System.out.println(arv);

	}

	private static int allaKeskmise(double[] d) {
		double keskmine = 0;
		int j =0;
		for(int i=0; i<d.length; i++){
			keskmine = keskmine + d[i];
		}
		keskmine = keskmine/d.length;
		for(int i = 0; i<d.length; i++){
			if(d[i]<keskmine){
				j++;
			}
		}
		return j;
	}

}
