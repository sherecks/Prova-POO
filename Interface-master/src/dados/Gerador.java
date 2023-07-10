package dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Gerador implements Sequencia{

    protected List<Integer> sequencia = new ArrayList<Integer>();

    public abstract void gerar(int quantidade);

    public List<Integer> getSequencia(){
        return sequencia;
    }

    //Aplicando os Métodos

    //Sortear!!!
    public int sortear(){

        Random r = new Random();

        return sequencia.get(r.nextInt(sequencia.size()));
    }

    //Somatorio!!!
    public long somatorio(){
        
        long somatorio = 0;

        for(int i = 0; i < sequencia.size() ; i++){
            somatorio += sequencia.get(i);
        }

        return somatorio;
    }

    //Media Aritmetica!!!
    public double mediaAritmetica(){
        return (double) somatorio()/sequencia.size();
    }

    //Media Geometrica!!!
    public double mediaGeometrica(){
        
        double produtorio=1;
        
        for( int i=0; i<sequencia.size(); i++){
            produtorio *=  sequencia.get(i);
        }
        
        return (double) Math.pow(produtorio, (double) 1/sequencia.size());
    } 

    //Variancia!!!
    public double variancia(){

        double variancia = 0;
        double media = mediaAritmetica();

        for(int i = 0; i < sequencia.size() ; i++){
            variancia += Math.pow(Math.pow(sequencia.get(i),i) - media, 2);
        }
        variancia = variancia/(sequencia.size() - 1);

        return (double) Math.pow(variancia, (double) 1/2);
    }

    //Desvio!!!
    public double desvioPadrao(){
        return Math.pow(variancia(), (double) 1/2);
    }

    //Amplitude!!!
    public long amplitude(){
        return (long) max()-min();
    }

    //MAX!!!
    private int max(){
        
        int maior = sequencia.get(0);
        
        for(Integer n: sequencia){
            if(n > maior){
                maior = n;
            }
        }

        return maior;
    }

    //MIN!!!
    private int min(){
        
        int menor = sequencia.get(0);
        
        for(Integer n: sequencia){
            if(n < menor){
                menor = n;
            }
        }

        return menor;
    }
}