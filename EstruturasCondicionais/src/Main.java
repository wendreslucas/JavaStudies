public class Main {
    public static void main(String[] args) {

        int nota = 80;
        String graduacao;
        
        // A 80 B 70 C 60 D 0
        if (nota >= 80) {
//            System.out.println("Graduação A");
            graduacao = "A";
        } else if (nota <80 && nota >= 70) {
            graduacao = "B";
//            System.out.println("Graduação B");
        } else if (nota <70 && nota >= 60) {
            graduacao = "C";
//            System.out.println("Graduação C");
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
//            System.out.println("Graduação D");
        } else {
            graduacao = "";
//            System.out.println("Nota invalida");
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno não aprovado");
                break;
            default:
                System.out.println("Graduação invalida");
        }

        // se nota maior ou igual a 70, então aprovado
        // if-else

//        if(nota >=70) {
//            System.out.println("Aluno aprovado");
//        } else {
//            System.out.println("Aluno reprovado");
//        }
    }
}