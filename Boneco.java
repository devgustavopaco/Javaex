public class Boneco {
    public String nome;
    public int dataFabricacao;
    public String cor;
    public double altura;
    public double peso;

    public Boneco(){
        altura = 0.25;
        peso = 0.300;
         dataFabricacao = 2023;
    }

    public  Boneco(String nome, int dataFabricacao, String cor, double altura, double peso){
        this.nome = nome;
        this.dataFabricacao = dataFabricacao;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void pular() {
        System.out.println(nome + " está pulando.");
    }

    public void atacar() {
        System.out.println(nome + " está atacando");
    }

    public void defender() {
        System.out.println(nome + " está defendendo");
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void falar(String mensagem) {
        System.out.println(nome + " diz: " + mensagem);
    }

}


