public class Conta{
    public int numeroConta, agencia;
    public boolean status;
    public String nomeCliente;
    public float saldo;

    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0f;
        this.status = true;
    }

    public void deposito(float num){
        if(this.status) {
            this.saldo += num;
            System.out.println("Depositado com sucesso, segue valor atual: " + this.saldo);
        }
    }

    public void sacar(float num){
        if(this.status) {
            if (this.saldo >= num) {
                this.saldo -= num;
                System.out.println("Sacado com sucesso, valor atual: R$" + this.saldo);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Conta inativa");
        }

    }

    public void encerrarConta(){
        if(status){
            if (this.saldo > 0) {
                this.status = false;
                System.out.println("Conta desativada com sucesso");
            }else{
                 System.out.println("Conta ainda possui saldo");
            }
        }
        else{
            System.out.println("Conta inativa");
        }
    }

    public String toString(){
        return "Número da conta: " + numeroConta + " Agência: " + agencia + " Cliente: " + nomeCliente + " Saldo atual: R$" + saldo + " status: " + status;
    }



}
