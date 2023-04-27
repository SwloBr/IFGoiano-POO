package com.swlo.contas;

public abstract class Conta {

    private final String numeroDaConta;
    private double saldo = 0;

    public Conta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double valor) {
        this.saldo = valor;
        return saldo;
    }


    public boolean sacar(double valor, Conta conta) {

        if (conta instanceof ContaEspecial) {
            ContaEspecial contaEspecial = (ContaEspecial) conta;
            if ((getSaldo() - valor) < -contaEspecial.getCheckEspecial()) {
                return false;
            }
        }
        if (conta instanceof ContaEmpresarial) {
            ContaEmpresarial contaEmpresarial = (ContaEmpresarial) conta;
            if ((getSaldo() - valor) < -contaEmpresarial.getCheckEspecial()) {
                return false;
            }
        }
        if ((getSaldo() - valor) < 0) {
            return false;
        }
        return true;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }
}
