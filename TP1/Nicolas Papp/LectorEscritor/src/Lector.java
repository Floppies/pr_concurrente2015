
public class Lector implements Runnable {
	VectorConcurrente v;
	int indice;
	
	Lector(VectorConcurrente v, int indice){
		this.v = v;
		this.indice = indice;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Se ley� el valor " + v.leer(indice) + " en el lugar " + indice);
	}
}
