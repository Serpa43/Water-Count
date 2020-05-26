package classes;

public class Informacoes {

    //inicia as variaveis
    private int pessoas;
    private double chuveiro;
    private double privada;
    private double piaBanheiro;
    private double MaquinaLavarRoupa;
    private double tanque;
    private double piaCozinha;
    private double MaquinaLavarLouca;
    private double Calcada;
    private double Carro;
    private double Plantas;
    private double totalLitros;
    private double totalm3;
    private double valorAgua;
    private double valorEsgoto;

    //inicia os getters e setters
    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public double getChuveiro() {
        return chuveiro;
    }

    public void setChuveiro(double chuveiro) {
        this.chuveiro = chuveiro;
    }

    public double getPrivada() {
        return privada;
    }

    public void setPrivada(double privada) {
        this.privada = privada;
    }

    public double getPiaBanheiro() {
        return piaBanheiro;
    }

    public void setPiaBanheiro(double piaBanheiro) {
        this.piaBanheiro = piaBanheiro;
    }

    public double getMaquinaLavarRoupa() {
        return MaquinaLavarRoupa;
    }

    public void setMaquinaLavarRoupa(double MaquinaLavarRoupa) {
        this.MaquinaLavarRoupa = MaquinaLavarRoupa;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getPiaCozinha() {
        return piaCozinha;
    }

    public void setPiaCozinha(double piaCozinha) {
        this.piaCozinha = piaCozinha;
    }

    public double getMaquinaLavarLouca() {
        return MaquinaLavarLouca;
    }

    public void setMaquinaLavarLouca(double MaquinaLavarLouca) {
        this.MaquinaLavarLouca = MaquinaLavarLouca;
    }
    
    public double getCalcada() {
        return Calcada;
    }

    public void setCalcada(double Calcada) {
        this.Calcada = Calcada;
    }

    public double getCarro() {
        return Carro;
    }

    public void setCarro(double Carro) {
        this.Carro = Carro;
    }

    public double getPlantas() {
        return Plantas;
    }

    public void setPlantas(double Plantas) {
        this.Plantas = Plantas;
    }

    //Métodos para os cálculos
    //Fonte: http://www.rotogine.com.br/site/?page_id=205
    //Fonte: http://site.sabesp.com.br/site/interna/Default.aspx?secaoId=595
    
    public double calcularChuveiroCasa(int minutos) {
        //São gastos aproximadamente 9 litros por minuto (registro meio aberto)
        return minutos * 9 * 30;
    }

    public double calcularChuveiroApartamento(int minutos) {
        //São gastos aproximadamente 16 litros por minuto (registro meio aberto)
        return minutos * 16 * 30;
    }

    public double calcularPrivada(int quantidade) {
        //São gastos aproximadamente 9 litros por acionamento
        return quantidade * 9 * 30;
    }

    public double calcularPiaBanheiro(int minutos) {
        //São gastos aproximadamente 9 litros por minuto
        return minutos * 9 * 30;
    }

    public double calcularMaquinaLavarRoupa(int quantidade) {
        //São gastos aproximadamente 135 litros por lavagem em máquinas com capacidade para 5Kg
        return quantidade * 135 * 30;
    }

    public double calcularTanque(int quantidade) {
        //São gastos aproximadamente 19 litros por minuto
        return quantidade * 19 * 30;
    }

    public double calcularPiaCozinha(int minutos) {
        //São gastos aproximadamente 8 litros por minuto (torneira meio aberta)
        return minutos * 8 * 30;
    }

    public double calcularMaquinaLavarLouca(int quantidade) {
        //São gastos aproximadamente 40 litros numa lavadora com capacidade para 44 utensílios e 40 talheres
        return quantidade * 40 * 30;
    }
    
    public double calcularCalcada(int minutos) {
        //São gastos aproximadamente 19 litros por minuto
        return minutos * 19 * 30;
    }
    
    public double calcularCarro(int minutos) {
        //São gastos aproximadamente 14 litros por minuto
        return minutos * 14 * 30;
    }
    
    public double calcularPlantas(int minutos) {
        //São gastos aproximadamente 19 litros por minuto
        return minutos * 19 * 30;
    }

    public double getTotalLitros() {
        return totalLitros;
    }

    public void setTotalLitros() {
        this.totalLitros = getChuveiro() + getPrivada() + getMaquinaLavarLouca() + getMaquinaLavarRoupa() + getPiaBanheiro() + getPiaCozinha() + getTanque() + getCalcada() + getCarro() + getPlantas();
    }

    public double getTotalm3() {
        return totalm3;
    }

    public void setTotalm3() {
        this.totalm3 = getTotalLitros() / 1000;
    }
    
    public double getValorAgua() {
        return valorAgua;
    }

    public void setValorAgua(double valorAgua) {
        this.valorAgua = valorAgua;
    }

    public double getValorEsgoto() {
        return valorEsgoto;
    }

    public void setValorEsgoto(double valorEsgoto) {
        this.valorEsgoto = valorEsgoto;
    }
}