package br.gov.unipe;

public class CalculoIMC 
{
	
	public float calculoIMC( float peso, float altura){
		
		imc = peso / (altura * 2);
		
		return imc;
	}
	
    public static void main( String[] args )
    {
        System.out.println(calculoIMC(70.0,1.69));
    }
	
}
