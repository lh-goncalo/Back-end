package entity;

public class aluno1 {

    public String name;
    public double notaA, notaB, notaC;

    public double aproved(){
        return notaA + notaB + notaC;
    }

    public String toString(){
        return "Final Grade:" + aproved();
    }
    
}
