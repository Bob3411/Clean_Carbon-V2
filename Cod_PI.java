package projectoPI;
import java.util.Scanner;
public class Cod_PI {
		public static void main(String args[]) {
		
//		PARTE COLETIVA      PARTE COLETIVA         PARTE COLETIVA            PARTE COLETIVA         PARTE COLETIVA          PARTE COLETIVA            PARTE COLETIVA           PARTE COLETIVA
		Scanner rec = new Scanner (System.in);
		String resp,resp2,respos3,respAv;
		double gs=0, carbon=0;
		
		
		System.out.println("Ol�, bem vindo ao Clean Carbon. Vamos começar...\n"
				+ "Digite quantas pessoas moram com voc�:");
		int fml=rec.nextInt();
		
		System.out.println("Qual o KWh da sua última conta? ");
		int kwfml=rec.nextInt();
		
		System.out.println("O g�s na sua casa � canalizdo ou � botij�o? \n"
				+ "1 - G�s canalizado \n"
				+ "2 - G�s botij�o ");
		int tpGas=rec.nextInt();
		
		if(tpGas==1) {
			System.out.printf("Qual o consumo da �ltima conta em metros cubicos? \n");
			gs=rec.nextInt();
			gs= gs*105;
		}else if(tpGas==2){
			System.out.printf("Quantos botij�es voc� compra por m�s? \n");
			gs=rec.nextInt();
			gs= (gs*5.2)*105;
		}else {
			System.out.println("Op��o inv�lida");
		}
		
		
		System.out.println("Sua fam�lia recicla alum�nio? ");
		resp2 = rec.next();
		resp2.toUpperCase();
		if(resp2.equalsIgnoreCase("N�O")) {
			carbon=+166;
		}
		System.out.println("Dados recebidos");
		
		
		System.out.println("Sua fam�lia viajou de avi�o no �ltimo ano? ");
		respos3 = rec.next();
		respos3.toUpperCase();
		
		if(respos3.equalsIgnoreCase("SIM")) {
			System.out.println("Foi uma viagem de dura��o maior que 4 horas?");
			rec.nextLine();
			respAv = rec.nextLine();
			respAv.toUpperCase();
			
			if(respAv.equalsIgnoreCase("SIM")) {
				carbon=+4400;
			}else if(respAv.equalsIgnoreCase("N�O")){
				carbon=+1100;
			}else {
				System.out.println("Op��o inv�lida");
			}
			
		}else if(respos3.equalsIgnoreCase("N�O")){
			System.out.println("Dado recebido");
		}else{
			System.out.println("Op��o inv�lida");
		}
		
		System.out.println("Sua fam�lia recicla papel?");
		resp = rec.nextLine();
		resp.toUpperCase();
				
		if(resp.equalsIgnoreCase("N�O")) {
			carbon=+184;
		}
		System.out.println("Dados recebidos");
		
	
		
//      PARTE INDIVIDUAL     PARTE INDIVIDUAL        PARTE INDIVIDUAL          PARTE INDIVIDUAL         PARTE INDIVIDUAL            PARTE INDIVIDUAL          PARTE INDIVIDUAL         PARTE INDIVIDUAL  
		String resp4;
		double consuOnibus,consuMetro,qntkilometros,qntkilometros2,ltM,consGasol,consEt;
		

		System.out.println("Voc� possui ve�culo(s)?");
		resp4=rec.nextLine();
		resp4.toUpperCase();
		
		if(resp4.equalsIgnoreCase("SIM")) {

			System.out.println("O ve�culo � carro ou moto? \n"
					+ "1.carro \n"
					+ "2.moto ");
			int tpVeicl = rec.nextInt();
			
			if(tpVeicl==1) {
				System.out.println("Qual tipo de combust�vel � usado? \n"
						+ "1.Etanol \n"
						+ "2.Gasolina");
				int tpCombut = rec.nextInt();
				
				if(tpCombut==1) {
					System.out.println("Quantos litros voc� abastece por m�s?(visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM=rec.nextInt();
					carbon =+ ltM * 0.82 * 0.75 * 3.7; //= total de kg CO2 emitido por litro.
				}else if(tpCombut==2) {
					System.out.println("Quantos litros voc� abastece por m�s?(visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM=rec.nextInt();
					carbon =+  (ltM * 789)/19.5 * 1.59;
				}else {
					System.out.println("Op��o inv�lida");
				}
				
		    }else if(tpVeicl==2) {
				System.out.println("Qual tipo de combust�vel � usado? \n"
						+ "1.Etanol \n"
						+ "2.Gasolina");
				int tpComb = rec.nextInt();
				
				if(tpComb==1) {
					System.out.println("Quantos litros voc� abastece por m�s?(visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM=rec.nextDouble();
					carbon =+ ltM * 0.82 * 0.75 * 3.7;
				}else if(tpComb==2) {
					System.out.println("Quantos litros voc� abastece por m�s?(visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM=rec.nextDouble();
					carbon =+  (ltM * 789)/19.5 * 1.59;
				}else {
					System.out.println("Op��o inv�lida");
				}
			
		    
		    }else {
				System.out.println("Op��o inv�lida");
			}
		}else if(resp4.equalsIgnoreCase("NÃO")) {
			System.out.println("Voc� usa outro meio de locomo��o?");
			String respLocom=rec.nextLine();
			respLocom.toUpperCase();
			
			if (respLocom.equalsIgnoreCase("SIM")) {
				System.out.println("Qual meio de locomo��o voc� usa? \n"
						+ "1.metro/trem \n"
						+ "2.onibus \n"
						+ "3.metro/trem e onibus");
				int meLoco=rec.nextInt();
				
				if(meLoco==1) {
					System.out.println("Quantos kilometros voc� percorre por m�s?");
					qntkilometros=rec.nextDouble();
					consuMetro=3.16*qntkilometros;
					carbon=+consuMetro;
					
				}else if (meLoco==2) {
					System.out.println("Quantos kilometros voc� percorre por m�s?");
					qntkilometros=rec.nextDouble();
					consuOnibus=1.28*qntkilometros;
					carbon=+consuOnibus;
					
				}else if(meLoco==3) {
					System.out.println("Quantos kilometros voc� percorre por m�s no metro/trem?");
					qntkilometros=rec.nextInt();
					consuMetro=3.16*qntkilometros;
					
					System.out.println("Quantos kilometros voc� percorre por m�s no onibus?");
					qntkilometros2=rec.nextInt();
					consuOnibus=3.16*qntkilometros;
					
					double consOni_Metro= consuMetro+consuOnibus;
					carbon=+consOni_Metro;
					
				}else{
					System.out.println("Op��o inv�lida");
				}	
				
				
			}else if(respLocom.equalsIgnoreCase("N�O")){
				System.out.println("Dados recebidos");
			}else {
				System.out.println("Op��o inv�lida");
			}
			
			
		}

		
		
		System.out.printf("Sua produ��o de carbono � :%.2f ",carbon);
		
		
		

	}
	
}
			
			