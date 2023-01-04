package Corretor1;

import java.util.Scanner;
import java.util.ArrayList;

public class Prova1{
   private Questao1 q[];
   private ArrayList<Correcao1> c;
   
   
   public Prova1(){
    q = new Questao1[5];
    for(int i=0;i<5;i++){
       q[i]= new Questao1();
    }   
    c = new ArrayList<>();

   }


  public void aplicar(){
  Scanner entrada = new Scanner(System.in);
  boolean sit = false;
  for(int i=0;i<5;i++){
  System.out.println(q[i].getEnunciado());
  int r = entrada.nextInt();
  int cont = 0;
  
  if(q[i].corrige(r)==true){
      sit = true;
      cont++;
      System.out.printf("Você tentou %d vezes e acertou! \n",cont);
      
 }
  else{
    cont++;
    System.out.println("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
     r = entrada.nextInt();

      if(q[i].corrige(r)==true){
        sit=true;
        cont++;
        System.out.printf("Você tentou %d vezes e acertou! \n",cont);
        
   }

   else{
    cont++;
    System.out.printf("Você tentou %d vezes e errou! \n",cont);
    sit = false;
   }

 }

 c.add(new Correcao1(i, sit, cont));
}
  }
      

 public void gerarRelatorio(){
    String situacao= null;
    System.out.println("##########Relatório Final##########");

    for (Correcao1 x : c) {
        if(x.getSituacao()==true){
            situacao = "acertou";
        }
        else if(x.getSituacao()==false){
            situacao = "errou";
        }
        System.out.println("Questão | Situação | Número de tentativas");
        System.out.printf("%d | %s | %d",x.getQuestao()+1,situacao, x.getTentativas());
        System.out.println();
        
    }
    System.out.println("#################################");
 }  

}