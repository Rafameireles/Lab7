
public class Exercicio4{

    public String classificador(int tempoSocioAno, String posto) {

        String classificador = "";

        if(tempoSocioAno == 1) {
            classificador = "Subsídio é R$25,00";
        }
        if(tempoSocioAno == 2){
            classificador = "Subsídio é R$35,00";
        }
        if(tempoSocioAno > 2){
            classificador = "Subsídio é R$50,00";
        }
        if(posto == "LOBO"){
            classificador = "Extra de R$10,00";
        }
        if(posto == "URSO"){
            classificador = "Extra de R$15,00";
        }
        if(posto == "LEÃO"){
            classificador = "Extra de R$20,00";
        }
        if(posto == "LOBINHO"){
            classificador = "Sem subsídio extra";
        }
        return classificador;


    }
}