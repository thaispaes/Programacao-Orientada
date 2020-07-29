
package Lutadores;

/**
 *
 * @author Thais
 */
public class Lutador {
    //Atributos 
    private String nome, nascionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates;
    
    //Metodos Especiais 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso<52.2){
            this.categoria ="Inválido";
        }else if (this.peso<=70.3){
            this.categoria ="Leve";
        }else if (this.peso<=83.9){
            this.categoria ="Médio";
        }else if (this.peso<=120.2){
            this.categoria ="Pesado";
        }else{
            this.categoria ="Inválido";
        }
        
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

    public Lutador(String nome, String nas, int id, float al, float pe, int vit, int de, int em) {
        setNome(nome);
        setNascionalidade(nas);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vit);
        setDerrotas(de);
        setEmpates(em);
    }
    
    //Metodos públicos
    public void ganhouLuta() {
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perdeuLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empatouLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    public void status(){
        System.out.println(this.getNome() +" é um peso "+this.getCategoria());
        System.out.println("Ganhou um total de "+this.getVitorias()+" lutas");
        System.out.println("Perdeu "+this.getVitorias()+" lutas");
        System.out.println("Empatou "+this.getEmpates()+" vezes");
    }
    
    public void apresentar(){
        System.out.println("------------------------------");
        System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR "+this.getNome());
        System.out.println("Diretamente de "+this.getNascionalidade());
        System.out.println("com "+this.getIdade()+" anos e "+this.getAltura()+" de altura");
        System.out.println("pesando um total de "+this.getPeso()+" Kg");
        System.out.println("Ele possui "+this.getVitorias()+" vitórias na sua caategoria de peso "+this.getCategoria());
        System.out.println("com "+this.getDerrotas()+" derrotas e "+this.getEmpates()+" empates");
    }
}
