package projectoPI;
import java.util.Scanner;
public class Cod_PI {
	static Scanner rec = new Scanner (System.in);
    	public static void main(String args[]) {
        
        int fml=prgtFml();
    	double carbonCol=partColt();
    	partIndv(fml, carbonCol);
    	
}
    	public static int prgtFml() {
    		System.out.println("Ol�, bem vindo ao Clean Carbon. Vamos come�ar...\n"
                	+ "Digite quantas pessoas moram com voc�:");
        	int fml=rec.nextInt();
        	
        	return fml;
    	}
    	
    	public static double partColt() {
        	double gs=0, carbonCol=0;
        	int tpBand, tpGas, resp2,resp3,resp4,resp5;
        	int cont=0,cont01=0,cont1=0, cont2=0, cont3=0,cont4=0;
            
        	System.out.println("Qual o KWh da sua �ltima conta? ");
        	int kwfml=rec.nextInt();
            
        	do {
            	if(cont01>0){
                	System.out.println("Op��o inv�lida");
            	}
            	System.out.println("Qual bandeira qua aparece na sua conta? \n"
                    	+ "1. Verde \n"
                    	+ "2. Amarela \n"
                    	+ "3. Vermelha");
            	tpBand=rec.nextInt();
            	cont01++;
        	}while((tpBand!=1) && (tpBand!=2) && (tpBand!=3));
             
        	if(tpBand==1) {
             	carbonCol=+ 0.2*kwfml;
         	}else if(tpBand==2) {
             	carbonCol=+ 0.7*kwfml;
         	}else {
             	carbonCol=+ 0.9*kwfml;
         	}
            
        	do {
            	if (cont>0) {
                	System.out.println("Op��o Inv�lida");
            	}
            	System.out.println("O g�s na sua casa � canalizdo ou � botij�o? \n"
                	+ "1 - G�s canalizado \n"
                	+ "2 - G�s botij�o ");
            	tpGas=rec.nextInt();   //RESPOSTA 1
            	cont++;
            
        	}while((tpGas!=1) && (tpGas!=2));
            
        	if(tpGas==1) {
            	System.out.printf("Qual o consumo da �ltima conta em metros cubicos? \n");
            	gs=rec.nextInt();
            	gs= gs*105;
        	}else{
            	System.out.printf("Quantos botij�es voc� compra por m�s? \n");
            	gs=rec.nextInt();
            	gs= (gs*5.2)*105;
        	}
            
            
        	do {
            	if(cont1>0) {
                	System.out.println("Op��o inv�lida");
            	}
            	System.out.println("Sua fam�lia recicla alum�nio? \n"
                    	+ "1. SIM \n"
                    	+ "2. N�O");
            	resp2 = rec.nextInt();	//RESPOSTA 2
            	cont1++;
                
        	}while( (resp2!=1) && (resp2!=2) ) ;
            
            
        	if(resp2==2 ) {
            	carbonCol=+166;
        	}
        	System.out.println("Dados recebidos");
            
     
        	do {
            	if(cont4>0) {
                	System.out.println("Op��o inv�lida");
            	}
            	System.out.println("Sua fam�lia recicla papel? \n"
                    	+ "1. SIM \n"
                    	+ "2. N�O");
            	resp5=rec.nextInt(); 	//RESPOSTA 5
            	cont4++;
        	}while((resp5!=1) && (resp5!=2));
                    
        	if(resp5==2) {
            	carbonCol=+184;
        	}
        	System.out.println("Dados recebidos");
            
            
        	do {
            	if (cont2>0) {
                	System.out.println("Op��o inv�lida");
            	}
            	System.out.println("Sua fam�lia viajou de avi�o no �ltimo ano? \n"
                    	+ "1. SIM \n"
                    	+ "2. N�O");
            	resp3 = rec.nextInt();  	//RESPOSTA 3
            	cont2++;
        	}while((resp3!=1) && (resp3!=2));
            
        	if(resp3==1) {
            	do {
                	if(cont3>0) {
                    	System.out.println("Op��o inv�lida");
                	}
                	System.out.println("Foi uma viagem de dura��o maior que 4 horas? \n"
                        	+ "1. SIM \n"
                        	+ "2. N�O");
                	resp4=rec.nextInt();  //RESPOSTA 4
                	cont3++;
                    
            	}while((resp4!=1) && (resp4!=2));
                
            	if(resp4==1) {
                	carbonCol=+4400;
            	}else{
                	carbonCol=+1100;
            	}
            	System.out.println("Dado recebido");
        	}else{
            	System.out.println("Dado recebido");
        	}
        	
        	return carbonCol;
    	}
    	
    	
    	public static void partIndv(int fml, double carbonCol) {
    		double carbonInd=0, consuOnibus,consuMetro,qntkilometros,qntkilometros2,ltM;
        	int tpCombut,tpVeicl,resp6,resp7,resp8;
        	int cont5=0,cont6=0, cont7=0,cont8=0,cont9=0,cont10=0,cont11=0,cont12=0;
        	
        	do {
            	if(cont5>0) {
                	System.out.println("Op��o inv�lida");
            	}
            	System.out.println("Voc� possui ve�culo(s)? \n"
                    	+ "1. SIM \n"
                    	+ "2. N�O ");
            	resp6=rec.nextInt();
            	cont5++;
        	}while((resp6!=1) && (resp6!=2));
                    
        	if(resp6==1) {
     
            	do {
                	if(cont6>0) {
                    	System.out.println("Op��o inv�lida");
                	}
                	System.out.println("O ve�culo � carro ou moto? \n"
                        	+ "1.carro \n"
                        	+ "2.moto \n"
                        	+ "3.carro e moto");
                	tpVeicl = rec.nextInt();
                	cont6++;
            	}while((tpVeicl!=1) && (tpVeicl!=2) && (tpVeicl!=3));
                
            	if(tpVeicl==1) {
                	do {
                    	if(cont7>0) {
                        	System.out.println("Op��o inv�lida");
                    	}
                    	System.out.println("Qual tipo de combust�vel � usado? \n"
                            	+ "1.Etanol \n"
                            	+ "2.Gasolina");
                    	tpCombut = rec.nextInt();
                    	cont7++;
                	}while((tpCombut!=1) && (tpCombut!=2));
                    
                	if(tpCombut==1) {
                    	System.out.println("Quantos litros voc� abastece por m�s? (visto que o consumo m�dio no Brasil � de 12km por litro)");
                    	ltM=rec.nextInt();
                    	carbonInd =+ ltM * 0.82 * 0.75 * 3.7; //= total de kg CO2 emitido por litro.
                	}else{
                    	System.out.println("Quantos litros voc� abastece por m�s? (visto que o consumo m�dio no Brasil � de 12km por litro)");
                    	ltM=rec.nextInt();
                    	carbonInd =+  (ltM * 789)/19.5 * 1.59;
                	}
                    
            	}else if(tpVeicl==2){
                	do {
                    	if(cont8>0) {
                        	System.out.println("Op��o inv�lida");
                    	}
                    	System.out.println("Qual tipo de combust�vel � usado? \n"
                            	+ "1.Etanol \n"
                            	+ "2.Gasolina");
                    	tpCombut = rec.nextInt();
                    	cont8++;
                	}while((tpCombut!=1) && (tpCombut!=2));
                    
                	if(tpCombut==1) {
                    	System.out.println("Quantos litros voc� abastece por m�s? (visto que o consumo m�dio no Brasil � de 12km por litro)");
                    	ltM=rec.nextDouble();
                    	carbonInd =+ ltM * 0.82 * 0.75 * 3.7;
                	}else{
                    	System.out.println("Quantos litros voc� abastece por m�s? (visto que o consumo m�dio no Brasil � de 12km por litro)");
                    	ltM=rec.nextDouble();
                    	carbonInd =+  (ltM * 789)/19.5 * 1.59;
                	}
                
                
            	}else {
                	do {
                    	if(cont9>0) {
                        	System.out.println("Op��o inv�lida");
                    	}
                    	System.out.println("Qual tipo de combust�vel � usado no carro? \n"
                            	+ "1.Etanol \n"
                            	+ "2.Gasolina");
                    	tpCombut = rec.nextInt();
                    	cont9++;
                	}while((tpCombut!=1) && (tpCombut!=2));
                    
                	if(tpCombut==1) {
                    	System.out.println("Quantos litros voc� abastece por m�s no carro? (visto que o consumo m�dio no Brasil � de 12km por litro)");
                    	ltM=rec.nextInt();
                    	carbonInd =+ ltM * 0.82 * 0.75 * 3.7; //= total de kg CO2 emitido por litro.
                	}else{
                    	System.out.println("Quantos litros voc� abastece por m�s no carro? (visto que o consumo m�dio no Brasil � de 12km por litro)");
                    	ltM=rec.nextInt();
                    	carbonInd =+  (ltM * 789)/19.5 * 1.59;
                	}
                    
                	do {
                    	if(cont10>0) {
                        	System.out.println("Op��o inv�lida");
                    	}
                    	System.out.println("Qual tipo de combust�vel � usado na moto? \n"
                            	+ "1.Etanol \n"
                            	+ "2.Gasolina");
                    	tpCombut = rec.nextInt();
                    	cont10++;
                	}while((tpCombut!=1) && (tpCombut!=2));
                    
                	if(tpCombut==1) {
                    	System.out.println("Quantos litros voc� abastece por m�s na moto? (visto que o consumo m�dio no Brasil � de 12km por litro)");
                    	ltM=rec.nextInt();
                    	carbonInd =+ ltM * 0.82 * 0.75 * 3.7; //= total de kg CO2 emitido por litro.
                	}else{
                    	System.out.println("Quantos litros voc� abastece por m�s na moto? (visto que o consumo m�dio no Brasil � de 12km por litro)");
                    	ltM=rec.nextInt();
                    	carbonInd =+  (ltM * 789)/19.5 * 1.59;
                	}
                    
                    
            	}
                
        	}else{
            	do {
                	if(cont11>0) {
                    	System.out.println("Op��o inv�lida");
                	}
                	System.out.println("Voc� usa outro meio de locomo��o? \n"
                        	+ "1.SIM \n"
                        	+ "2.N�O");
                	resp7=rec.nextInt();
                	cont11++;/////////////
                    
            	}while((resp7!=1) && (resp7!=2));
                
            	if (resp7==1) {
                	do {
                    	if(cont12>0) {
                        	System.out.println("Op��o inv�lida");
                    	}
                    	System.out.println("Qual meio de locomo��o voc� usa? \n"
                            	+ "1.metro/trem \n"
                            	+ "2.onibus \n"
                            	+ "3.metro/trem e onibus");
                    	resp8=rec.nextInt();
                    	cont12++;
                	}while((resp8!=1) && (resp8!=2) && (resp8!=3));
                    
                	if(resp8==1) {
                    	System.out.println("Quantos kilometros voc� percorre por m�s?");
                    	qntkilometros=rec.nextDouble();
                    	consuMetro=3.16*qntkilometros;
                    	carbonInd=+consuMetro;
                        
                	}else if (resp8==2) {
                    	System.out.println("Quantos kilometros voc� percorre por m�s?");
                    	qntkilometros=rec.nextDouble();
                    	consuOnibus=1.28*qntkilometros;
                    	carbonInd=+consuOnibus;
                        
                	}else{
                    	System.out.println("Quantos kilometros voc� percorre por m�s no metro/trem?");
                    	qntkilometros=rec.nextInt();
                    	consuMetro=3.16*qntkilometros;
                        
                    	System.out.println("Quantos kilometros voc� percorre por m�s no onibus?");
                    	qntkilometros2=rec.nextInt();
                    	consuOnibus=3.16*qntkilometros2;
                        
                    	double consOni_Metro= consuMetro+consuOnibus;
                    	carbonInd=+consOni_Metro;
                        
                	}
                    
              	}else{
                	System.out.println("Dados recebidos");
            	}
                            
        	}
     
        	carbonInd=carbonInd*fml;
            
        	System.out.printf("Sua produ��o de carbono coletiva �: %.2f \n"
                	+ "Sua produ��o individual �: %.2f \n \n", carbonCol,carbonInd);
        	
        	double carbonTL= carbonCol+carbonInd;
        	
        	        	
        	if(carbonTL>7000) {
        		System.out.printf("A jun��o de produ��o individual e coletiva � : %.2f \n"
        				+ "Voc� est� produzindo muito carbono, procure diminuir rapidamente a produ��o de carbono. ",carbonTL);
        	}else if((carbonTL>3000) && (carbonTL<=6999)) {
        		System.out.printf("A jun��o de produ��o individual e coletiva � : %.2f \n"
        				+ "Voc� est� produzindo carbono de forma moderada, tome cuidado com a produ��o de carbono.",carbonTL);
        	}else {
        		System.out.printf("A jun��o de produ��o individual e coletiva � : %.2f \n"
        				+ "Voc� est� produzindo pouquiss�ma qunatidade de carbono. \n"
        				+ "Parab�ns, o planeta te agradece.",carbonTL);
        	}

    	}

    
}
            
            
