;public class fluxos {

    public static void main(String [] args) {
        
        ifFlecha();
        ifSemFlexa();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        ifFerias();

    }


    private static void switchNumero() {

        //
        int numero =4;
        switch(numero){
            case 1 :
            case 2 :
            case 3 :
            System.out.println("Certo");
            break;
            case 4 :
            System.out.println("Errado");
            break;
            case 5 :
            System.out.println("Talvez");
            break;
            default :
            System.out.println("Valor indefinido");
            break;

        }
    }

    private static void switchSemana() {

        //deixa somente uma variavel e saber quais valores essa variavel pode assumir
        String dia = "Terça";
        switch(dia) {
            case "Segunda":
            System.out.println(2);
            break;
            case "Terça":
            System.out.println(3);
            break;
            case "Quarta":
            System.out.println(4);
            break;
            case "Quinta" :
            System.out.println(5);
            break;
            case "Sexta":
            System.out.println(6);
            break;
            case "Sabado":
            System.out.println(7);
            break;
            case "Domingo":
            System.out.println(1);
            break;
            default : 
            System.out.println("Dia invalido");
            break;


        }
    }

    private static void ifMenor() {

        // melhora os if's

        double salarioMensal = 11983.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        // solução que deve ser evitada
        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)){
            System.out.println("Funcionario deve receber auxilio");
        }
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        //melhor maneira de utilizar 
        if((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionario deve receber auxilio");
        }
        boolean recebeAuxilo = (salarioBaixo) && (muitosDependentes);
        if(recebeAuxilo){
            System.out.println("Funcionario deve receber auxilo");
        } else {
            System.out.println("Funcionario não deve receber auxilio");    
            }
        }
    
    private static void ifFerias() {

        // evitar o if

        String mes ="Julho";
        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
            System.out.println("Férias");
        }
    }

    private static void ifSemFlexa() {
        int mes = 9;
        if ( mes == 1){
            System.out.println("Janeiro");
        } else if(mes ==2){
            System.out.println("Fevereio");
        } else if (mes == 3){
            System.out.println("Março");
        } else if ( mes == 4){
            System.out.println("Abril");
        }  else if ( mes == 5){
            System.out.println("Maio");
        } else if(mes == 6){
            System.out.println("Junho");
        } else if (mes == 7){
            System.out.println("Julho");
        } else if ( mes == 8){
            System.out.println("Agosto");
        } else if ( mes ==  9 ){
            System.out.println("Setembro");            
        } else if ( mes ==10 ) {
            System.out.println("Outubro");
        }  else if(mes == 11) {
            System.out.println("Novembro");
        } else if ( mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês indefinido");
        }
}

    private static void ifFlecha() {
        int mes = 9;
        if(mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes ==2) {
            System.out.println("fevereiro");
        } else {
            if(mes == 3) {
                System.out.println("Março");
            } else {
                if (mes == 4) {
                    System.out.println("Abril");
                } else {
                    if ( mes == 5) {
                        System.out.println("Maio");
                    } else { 
                        if (mes == 6 ){
                            System.out.println("Junho");
                        } else {
                            if ( mes == 7){
                                System.out.println("Julho");
                            } else {
                                if(mes == 8) {
                                System.out.println("Agosto");
                            } else {
                                if (mes == 9){
                                    System.out.println("Setembro");
                                }else {
                                    if (mes == 10){
                                        System.out.println("Outubro");
                                    } else {
                                        if (  mes == 11){
                                            System.out.println("Novembro");
                                        } else {
                                            if ( mes == 12){
                                                System.out.println("Dezembro");
                                            }
                                        else {
                                            System.out.println("Mês indefinido");
                                        }
                                        }
                                    }
                                }
                                }
                            }
                        }

                    }
                    
                }
            }
        }
    }
}
}



