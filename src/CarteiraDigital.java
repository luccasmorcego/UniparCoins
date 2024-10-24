import java.util.ArrayList;
import java.util.List;

public class CarteiraDigital {

       ArrayList<String> historico = new ArrayList<>();
       int indice = 0;
    private double saldo = 0;


    public void exibirSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    public void addSaldo (double x){
        historico.add("Adição de saldo: " + saldo + " = " + (saldo+x));
        System.out.println(historico.get(indice));
        indice++;
        saldo += x;
        System.out.println("Saldo adicionado!");
    }
    public void pagar(double x) {
        if (x > saldo) {
            System.out.println("Erro: Saldo insuficiente.");
        } else {
            historico.add("Pagamento recebido " + saldo + "-" + x + " = " + (saldo - x));
            System.out.println("Pagamento recebido " + saldo + "-" + x + " = " + (saldo - x));
            indice++;
            saldo -= x;
        }
    }
        public void verExtrato(){
            System.out.println("Foram realizadas " + historico.size() + " transações:");

            for (int i = 0; i < historico.size(); i++) {
                System.out.println(historico.get(i));
            }


        }

       }



