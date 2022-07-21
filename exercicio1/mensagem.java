package exercicio1;



public class mensagem {

public static void mensagem(int hora){

   if ((5>hora) && (hora<12)){
        mensagemBomDia();
   }else if((13>hora) && (hora<17)){
        mensagemBoaTarde();
   }else {
        mensagemBoaNoite();
   }
   Default:
   System.out.println("não foi");
}

public static void mensagemBomDia() {
    System.out.println("Bom dia");
}
public static void mensagemBoaTarde() {
    System.out.println("Boa tarde");
}
public static void mensagemBoaNoite() {
    System.out.println("Boa noite");
}
}
