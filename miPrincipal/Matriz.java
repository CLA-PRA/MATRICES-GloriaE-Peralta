package miPrincipal;
public class Matriz {
	
	private int NumRenglones;
	private int NumColumnas;
	private int[][] Elementos;
	public Matriz(int numRenglones, int numColumnas) {
		
		
		
	}
	
	public int getNumRenglones() {
		return 0;
	}
	
	public int getNumColumnas() {
		return 0;
	}
	
	public void agregaNumero(int valor, int posX, int posY)
	{
		
	}

	@Override
	public String toString() {
		return "Matriz [NumRenglones=" + NumRenglones + ", NumColumnas=" + NumColumnas + ", "
				+ "elementos= \n"
				+ RegresaMatriz()+"]";
	}
	
	public int GetValor(int x, int y)
	{
		return 0;
	}
	public int[][] sumaMatriz(Matriz MatB)
	{
		
		return null;
	}
	
	public int[][] multiplicaMatriz(Matriz MatB)
	{
		
		return null;
	}
	public String RegresaMatriz()
	{
		String salida="";
	
		return salida;
	}

	public static boolean ComparaMatrices(int [][] matA, int[][] matB)
	{
		boolean retorno= true;
		
		
		return retorno;
	}
	
	

}
