package Corretor1;


public class Correcao1 {
    private int nQuestao;
    private boolean sit;
    private int nTentativas;

    

    public Correcao1(int nQuestao, boolean sit, int nTentativas){
       this.nQuestao = nQuestao;
       this.sit = sit;
       this.nTentativas = nTentativas;
       




    }


    public int getQuestao(){
        return nQuestao;
    }

    public boolean getSituacao(){
        return sit;
    }
    

    public int getTentativas(){
        return nTentativas;
    }
    
}
