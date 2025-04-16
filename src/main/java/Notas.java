
public class Notas {
    
    //Atributos Encapsulados
    private double Nota1, Nota2, Nota3, Promedio;
    
    //Constructor 

    public Notas(double Nota1, double Nota2, double Nota3) {
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
    }
    
    //Metodos Get y Set

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }
    
    //Metodos Adicionales
    public double Promedio(){
        
        return (Nota1 + Nota2 + Nota3)/3;
    }
    
    public String MostrarInformacion(){
        
        return "Promedio: " + Promedio();
    }
    
}
