public class MathJava{
    public static void main(String[] args) {
        
        int n=Math.min(15,5);

        System.out.println(Math.min(15,5)); //retorna o menor valor
        System.out.println(Math.max(5, 3)); //retorna o maior valor
        System.out.println(n);

        Double n1, n2, n3, n4, res;

        int n5;

        n1=64d;

        n2=-49d;

        res=(Math.sqrt(n1)); //retorna a raiz quadrada de um número

        System.out.println(res);

        n3=Math.abs(n1);

        System.out.println(Math.abs(n2)); //retorna o valor absoluto de um número

        n4=Math.random()*10; //gera um número aleatório entre 0.0 e 1.0. Se quisermos um número entre 0 e 10 podemos multiplicar por 10

        System.out.println(n4);

        n5=(int)(Math.random()*101); //gera um int random entre 0 e 100

        System.out.println(n5);

        for(int i=0; i<10; i++){ //gerandno 10 números aleatórios
            Double n6;
            n6=Math.floor(Math.random()*101);
            System.out.println(n6);
        }



        






    }
}