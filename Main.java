import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Sistema de contagem de votos
        int qntVotoCandidato1 = 0;
        int qntVotoCandidato2 = 0;
        int qntVotoCandidato3 = 0;

        System.out.println("Informe quantos eleitores vao votar: ");
        int qntEleitores = sc.nextInt();

        for (int i = 1; i <= qntEleitores; i++) {
            System.out.println("Escolha seu candidato: 1 | 2 | 3 ");
            int voto = sc.nextInt();

            if(voto == 1){
                qntVotoCandidato1 ++;
            }else if(voto == 2){
                qntVotoCandidato2++;
            }else{
                qntVotoCandidato3++;
            }

        }

        //checagem de vencedor, fora da repeticao para nao checar a cada voto.Recebe os votos primeiro, depois checa
        //por isso nao esta dentro da estrutura de repeticao
        
        if (qntVotoCandidato1 > qntVotoCandidato2 && qntVotoCandidato1 > qntVotoCandidato3){
            System.out.println("Candidato 1 venceu!");
        }else if(qntVotoCandidato2 > qntVotoCandidato1 && qntVotoCandidato2 > qntVotoCandidato3){
            System.out.println("Candidato 2 venceu!");
        }else{
            System.out.println("Candidato 3 venceu.");
        }
    }
}