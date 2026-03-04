import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome:");
        String nome = sc.nextLine();

        System.out.pritln("Informe o endereço: ");
        String endereco = sc.nextLine();
        

        System.out.println("Informe o telefone fixo: ");
        String telefoneFixo = sc.nextLine();

        System.out.println("Informe o número de celular: ");
        String celular = sc.nextLine();

        System.out.println("Informe o email: ");
        String email = sc.nextLine();


     

        if(nome.isEmpty() || endereco.isEmpty() ||  email.isEmpty()  || celular.isEmpty()|| telefoneFixo.isEmpty() ){
            System.out.println("\nPreencha todos os campos");
        } else  {
            if (celular.equalsIgnoreCase(telefoneFixo)){
                System.out.println("Os dados para contato não podem ser igual.");
            } else if (!email.contains("@") || !email.endsWith(".com")){
                System.out.println("Email precisa conter @ e .com");
            }else{
                String quebra = System.lineSeparator();
                System.out.print("Nenhuma inconsistência encontrada no cadastro!" + quebra +
                 "Dados:" + quebra + "Nome: " + nome + quebra + "Endereco: " + endereco + quebra + "Telefone Fixo" + telefoneFixo + quebra +
                 "Celular: " + celular + quebra + "E-mail: " + email);

            }
        }

        sc.close();
    }
}