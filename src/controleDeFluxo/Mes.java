package src.controleDeFluxo;

public class Mes {

 private String mes;
 private int dias;

    public void setMes(String mes) {
         this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void nossasFerias(Mes mes) {
        if(getMes()=="janeiro" ||getMes()=="julho") {
            System.out.println("mes das ferias");
        }else {
            System.out.println("não estamos de ferias");
        }
    }

    public int mesEmDias(int dia) {
        this.dias = dia;
        return dias;
    }
}
