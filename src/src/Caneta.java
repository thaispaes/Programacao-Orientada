
package src;

/**
 *
 * @author Thais
 */
public class Caneta {
    
    //Aqui é criado os atributos da classe Caneta
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    protected boolean tampada; //Protected ainda pode ser mexido em outra classe que chama a principal
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public int getCarga(){
        return this.carga;
    }
    
    public void setCarga(int c){
        this.carga = c;
    }
    
    //Aqui é criado os metodos da classe Caneta
    
   public Caneta(String m, String c, float p, int cg){ //Constructor
       this.tampar();
       this.setPonta(p);
       this.setCor(c);
       this.setModelo(m);
       this.setCarga(cg);
   }
   
   public void status(){
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Carga: "+this.getCarga()+"%");
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println(" Olá mundo posso escrever");
        }else{
            System.out.println(" ERROR ");
        }
    }
    private void tampar(){
        this.tampada=true;
    }
    
    private void destampar(){
        this.tampada=false;
    }
}
