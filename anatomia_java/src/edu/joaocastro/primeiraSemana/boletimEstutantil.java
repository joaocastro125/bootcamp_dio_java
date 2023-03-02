/**
 * boletimEstutantil
 */
public class boletimEstutantil {

    public static void main(String[] args) {
        int Aluno1=6;
        int aluno2=10;

        double media=(Aluno1+aluno2)/2;
        if(media>=7){
            System.out.println("aluno aprovado"+" MEDIA: "+media);
        }else if(media>5){
            System.out.println("esta de recuperação"+" MEDIA: "+media);
        }else{
            System.out.println("aluno foi reprovado"+" MEDIA: "+media);
        }

       

    }
}
