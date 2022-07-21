package exercicio1;

public class emprestimo {
    
public static double getTaxaDuasParcelas(){
        return 0.2;
    }

    public static double getTaxaTresParcelas(){
        return 0.3;
    }

    public static void calcular(double valor, int parcelas){
        if (parcelas ==2) {

            double valorFinal = valor + (valor + getTaxaDuasParcelas());
            System.out.println(valorFinal);
        }else if (parcelas == 3){

            double valorFinal = valor + (valor + getTaxaTresParcelas());
            System.out.println(valorFinal);
        }else {
            System.out.println("Quantidade de parcelas não aceita");
        }


    }


    
}
