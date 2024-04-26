package Controller;

public class AplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]values;
		values = new double[10];
		values[4]=35;
		
		System.out.println(values[4]);
		
		int i=6;
		
		values[i]=62;
		System.out.println("Valor de la posicion 6 = "+ i +" - "+ values[i]);
		
		int[]scores = { 10, 9, 7, 4, 5};
		int[]values2 = scores;
		
		scores[3]=10;
		System.out.println(values2[3]);

	}

}
