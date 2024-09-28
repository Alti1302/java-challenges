
public class ConjucturaCollatz {
    public static void main(String[] args) {
        int numero = 9;
        int execucoes = 0;
        while (numero !=1){
            if (numero % 2==0){
                numero = numero / 2;
            } else {
                numero = numero * 3 + 1;
            }
            System.out.println("Calculo da sequencia:" + numero);
        }

    }

}

