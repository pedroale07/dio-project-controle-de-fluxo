package src;

public class ClassePrincipalDoProjeto {

    public static void main(String[] args) {

        //trabalhando com numeros inteiros
        int numeroInteiro1 = 2;
        int numeroInteiro2 = 10;
        System.out.println("numeroInteiro1 == numeroInteiro2: "+(numeroInteiro1==numeroInteiro2));
        System.out.println("numeroInteiro1 != numeroInteiro2: "+(numeroInteiro1!=numeroInteiro2));
        System.out.println("numeroInteiro1 >= numeroInteiro2: "+(numeroInteiro1>=numeroInteiro2));
        System.out.println("numeroInteiro1 <= numeroInteiro2: "+(numeroInteiro1<=numeroInteiro2));
        System.out.println("numeroInteiro1 > numeroInteiro2: "+(numeroInteiro1>numeroInteiro2));
        System.out.println("numeroInteiro1 < numeroInteiro2: "+(numeroInteiro1<numeroInteiro2));

        //trabalhando com tipo double
        double primeiroDouble = 12.5;
        double segundoDouble = 5.5;
        System.out.println("primeiroDouble == segundoDouble "+(primeiroDouble==segundoDouble));
        System.out.println("primeiroDouble != segundoDouble "+(primeiroDouble!=segundoDouble));
        System.out.println("primeiroDouble >= segundoDouble "+(primeiroDouble>=segundoDouble));
        System.out.println("primeiroDouble <= segundoDouble "+(primeiroDouble<=segundoDouble));
        System.out.println("primeiroDouble > segundoDouble "+(primeiroDouble>segundoDouble));
        System.out.println("primeiroDouble < segundoDouble "+(primeiroDouble<segundoDouble));

        //trabalhando com tipo byte
        byte a = '1';
        byte b = '3';
        System.out.println("a==b "+(a==b));
        System.out.println("a!=b "+(a!=b));
        System.out.println("a>=b "+(a>=b));
        System.out.println("a<=b "+(a<=b));
        System.out.println("a>b "+(a>b));
        System.out.println("a<b "+(a<b));

        //trabalhando com tipo short
        short e = 32;
        short n = 19;
        System.out.println("e==n "+(e==n));
        System.out.println("e!=n "+(e!=n));
        System.out.println("e>=n "+(e>=n));
        System.out.println("e<=n "+(e<=n));
        System.out.println("e>n "+(e>n));
        System.out.println("e<n "+(e<n));

        //trabalhando com tipo float
        float w = 32.22f;
        float  q = 25.65f;
        System.out.println("w==q "+(w==q));
        System.out.println("w!=q "+(w!=q));
        System.out.println("w>=q "+(w>=q));
        System.out.println("w<=q "+(w<=q));
        System.out.println("w>q "+(w>q));
        System.out.println("w<q "+(w<q));


        //trabalhando com tipo char
        char g = 'A';
        char d = 'v';
        System.out.println("A==v "+(g==d));
        System.out.println("A!=v "+(g!=d));
        System.out.println("A>=v "+(g>=d));
        System.out.println("A<=v "+(g<=d));
        System.out.println("A>v "+(g>d));
        System.out.println("A<v "+(g<d));

        //trabalhando com tipo String
        String primeiroNome = "Pedro";
        String segundoNome = "João";
        System.out.println("Os nomes são iguais: "+primeiroNome==segundoNome);
        System.out.println("Os nomes são diferentes: "+primeiroNome!=segundoNome);

    }

}
