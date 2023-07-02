package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Matriz MatrizA;
    static Matriz MatrizB;
   final static int [][] MatSuma= {{5,8} ,
                             {-2,0}};
    final static int [][] MatMultiplica= {{1,5} ,
                             {-4,-5}};
    int[][] matResultadoSuma;
    int[][] matResultadoMultiplica;
    @BeforeAll public static void setUp() {
        MatrizA=CreaMatrizA();
        MatrizB= CreaMatrizB();

       
    }

    public static Matriz CreaMatrizA()
    {
        MatrizA= new Matriz(2,2);
        MatrizA.agregaNumero(1,0, 0 );
        MatrizA.agregaNumero(3, 0, 1);
        MatrizA.agregaNumero(-1, 1, 0);
        MatrizA.agregaNumero(0, 1, 1);

        return MatrizA;
    }

    public static Matriz CreaMatrizB()
    {
        MatrizB= new Matriz(2,2);
        MatrizB.agregaNumero(4,0, 0 );
        MatrizB.agregaNumero(5, 0, 1);
        MatrizB.agregaNumero(-1, 1, 0);
        MatrizB.agregaNumero(0, 1, 1);

        return MatrizB;
    }

    @Test public void testSuma() {
        matResultadoSuma=new int[MatrizA.getNumRenglones()][MatrizA.getNumColumnas()];
        
        matResultadoSuma=MatrizA.sumaMatriz(MatrizB);
        //Imprime(matResultadoSuma);
       
        assertTrue(Matriz.ComparaMatrices(MatSuma, matResultadoSuma));
    }

    @Test public void testMultiplica() {
       
        matResultadoMultiplica=new int[MatrizA.getNumRenglones()][MatrizB.getNumColumnas()];
        
        matResultadoMultiplica=MatrizA.multiplicaMatriz(MatrizB);
        //Imprime(matResultadoMultiplica);
        //Imprime(MatMultiplica);
        assertTrue(Matriz.ComparaMatrices(MatMultiplica, matResultadoMultiplica));

    }

    @Test public void testCompruebaMultiplicacion() {
        assertTrue(MatrizA.getNumRenglones()==MatrizB.getNumColumnas());
    }


    public static void Imprime(int [][]matResultado)
    {
        System.out.println("IMPRIMIENDO RESULTADOS");

        String salida="";
		for (int x=0; x<MatrizA.getNumRenglones();x++)
		{
			for (int y=0; y<MatrizA.getNumColumnas();y++)
			{
				salida+=matResultado[x][y]+ " ";
				
			}
			if (x<(MatrizA.getNumRenglones()-1))
				salida+="\n";
	   }
       System.out.println(salida);

    } 


    
    
    

    
   
}