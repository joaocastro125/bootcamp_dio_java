public class MinhaClass {
    public static void main(String[] args) {

        // variavel constante no java que não pode ser alterada 
        // CONSTRANTE 
        int Ano=2021;
        final String BR="Brasil";
        System.out.println(BR);
        String primeiroNome="joao";
        String segundoNome="castro";
        String nomeCompleto=nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        
    }
       // metodos 
       public static String nomeCompleto(String primeiroNome,String SegundoNome){
            return "SEU NOME :"+primeiroNome.concat(" ").concat(SegundoNome);
       }
}
