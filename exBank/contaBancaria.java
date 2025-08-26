class contaBancaria{
    private String titular;
    private String numeroConta;
    private double saldo;

    contaBancaria(String tit, String nConta, double sd){
        if(sd<0){
            sd=0.0;
        }
        this.titular=tit;
        this.numeroConta=nConta;
        this.saldo=sd;
    }

    public void depositar(double valor){
        if(valor>0){
            this.saldo+=valor;
        }else{
            throw new InvalidArgumentException("Valor informado precisa ser positivo\n");
        }
    }

    public void sacar(double valor){
        if(valor>0 && saldo<=valor){
            this.saldo-=valor;
        }else{
             throw new InvalidArgumentException("Valor informado precisa ser positivo\n");
        }
    }

    public void exibirInfo(){
        System.out.println("##################################");
        System.out.println("       CONTA BANCÁRIA       \n");
        System.out.println("##################################");
        System.out.println("TÍTULAR | \t N. CONTA | \t  SALDO ");

        System.out.println();
        System.out.println(this.titular+"\t"+this.numeroConta+"\t"+this.saldo);


    }


}

class main{
    public static void main(String[] args) {
        //to be impl
    }
}