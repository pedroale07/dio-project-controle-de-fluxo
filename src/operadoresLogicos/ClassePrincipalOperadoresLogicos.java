package src.operadoresLogicos;

public class ClassePrincipalOperadoresLogicos {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: "+(b1 && b2));
        System.out.println("b1 && b2: "+(b1 && b3));

        System.out.println("b1 || b3: "+(b1 || b3));
        System.out.println("b1 || b3: "+(b2 || b4));

        System.out.println("b1 ^ b3: "+(b1 ^ b3));
        System.out.println("b4 ^ b1: "+(b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        double f1 = 20f;
        double f2 = 50f;
        System.out.println("(i1+i2)<(f2-f1)&& true: "+ (((i1+i2)<(f2-f1))&&true));
        System.out.println(""+((i1>i2)||(f2<f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario =1500d;

        int quantidadesDepentendes = 4;
        double mediaDependentes = 2;

        System.out.println(salarioMensal<mediaSalario && quantidadesDepentendes>=mediaDependentes);

        boolean salarioBaixo = salarioMensal <mediaSalario;
        boolean muitosDepentendes = quantidadesDepentendes>=mediaDependentes;

        System.out.println((salarioBaixo)&&(muitosDepentendes));

        boolean receberAuxilio = (salarioBaixo) && (muitosDepentendes);
        System.out.println("recebeAuxilio: "+receberAuxilio);
    }
}
