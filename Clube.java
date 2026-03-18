// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Clube {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Clube(String nome, int vitorias, int derrotas, int empates)
    {
        this.nome = nome;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
       return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }

    public int getVitorias() {
       return vitorias;
    }

    public void setVitorias(int vitorias) {
       this.vitorias = vitorias;
    }

    public int getDerrotas() {
       return derrotas;
    }

    public void setDerrotas(int derrotas) {
       this.derrotas = derrotas;
    }

    public int getEmpates() {
       return empates;
    }

    public void setEmpates(int empates) {
       this.empates = empates;
    }
    
    public int totalDeJogos()
    {
        return vitorias + derrotas + empates;
    }
    
    public int pontosGanhos()
    {
        return vitorias*3 + empates;
    }
    
    public int postosPerdidos()
    {
        return derrotas*3 + empates*2;
    }
    
    public double Aproveitamento()
    {
        return (pontosGanhos() / (totalDeJogos()*3.0)) * 100.0;
    }
}