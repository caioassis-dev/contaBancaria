package Classes;

import java.util.HashMap;

public class bancoConta {
    private HashMap<String, Conta> contas;

    public bancoConta() {
        contas = new HashMap<>();
    }

    public void criarConta(String nome, String tipoConta) {
        double saldoInicial = (tipoConta.equals("Conta Corrente")) ? 50.0 : 150.0;
        Conta novaConta = new Conta(nome, tipoConta, saldoInicial);
        contas.put(nome, novaConta);
    }

    public Conta getConta(String nome) {
        return contas.get(nome);
    }

    public boolean fecharConta(String nomeUsuario) {
        Conta conta = contas.get(nomeUsuario);
        if (conta != null && conta.getSaldo() == 0) {
            contas.remove(nomeUsuario);
            return true;
        }
        return false;
    }

    public boolean debitarBoleto(String nome, double valorBoleto) {
        Conta conta = contas.get(nome);
        
        if (conta != null) {
            double saldo = conta.getSaldo();
            double taxa = 0.0;
            
            if (conta.getTipoConta().equals("Conta Corrente")) {
                taxa = 12.0;
            } else if (conta.getTipoConta().equals("Conta Poupança")) {
                taxa = 20.0;
            } else {
                return false;
            }
            
            double valorTotal = valorBoleto + taxa;

            if (saldo >= valorTotal) {
                saldo -= valorTotal;
                conta.setSaldo(saldo);
                return true;
            }
        }
        return false;
    }


    public class Conta {
        private String nome;
        private double saldo;
        private String tipoConta;

        public void setSaldo(double novoSaldo) {
            this.saldo = novoSaldo;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                this.saldo += valor;
            }
        }

        public Conta(String nome, String tipoConta, double saldoInicial) {
            this.nome = nome;
            this.tipoConta = tipoConta;
            this.saldo = saldoInicial;
        }

        public String getNome() {
            return nome;
        }

        public String getTipoConta() {
            return tipoConta;
        }

        public double getSaldo() {
            return saldo;
        }

        public boolean pagarConta(double valorConta) {
            double taxa = 0.0;
            if (tipoConta.equals("Conta Corrente")) {
                taxa = 12.0;
            } else if (tipoConta.equals("Conta Poupança")) {
                taxa = 20.0;
            } else {
                return false;
            }

            double valorTotal = valorConta + taxa;

            if (saldo >= valorTotal) {
                saldo -= valorTotal;
                return true;
            } else {
                return false;
            }
        }
    }
    
    public boolean existeConta(String nomeUsuario) {
        return contas.containsKey(nomeUsuario);
    }

    public boolean depositar(String nome, double valor) {
        Conta conta = getConta(nome);

        if (conta != null) {
            conta.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean sacar(String nome, double valor) {
        Conta conta = getConta(nome);

        if (conta != null) {
            if (conta.getSaldo() >= valor) {
                conta.setSaldo(conta.getSaldo() - valor);
                return true;
            }
        }
        return false;
    }
}
