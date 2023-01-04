package Corretor1;

import java.util.Random;

public class Questao1{
   private String enunciado;
   private int gabarito;
   private static int nQuestao;

   public Questao1(){
      nQuestao++;
      Random numA = new Random();
      int num1  = numA.nextInt(10);
      int num2 = numA.nextInt(10);
      enunciado = ("Questão"+" "+nQuestao+" "+ "Quanto é"+" "+ num1 +"x"+num2+"  ?");
      gabarito = num1*num2;
    
      
    
   }


  public String getEnunciado(){
           return enunciado;
  }


  public boolean corrige(int r){
     int resposta = r;

      if(r==gabarito){
            return true;
                           }

      else{
            return false;
                         }
  }
   

}