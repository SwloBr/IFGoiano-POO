package com.swlo;

import com.swlo.contas.Conta;
import com.swlo.contas.ContaPoupanca;

import java.util.stream.Stream;

public class UpdateThread extends Thread{
    public void run() {
        try {

            for(Conta conta : Data.contas) {
                if (conta instanceof ContaPoupanca) {
                    ContaPoupanca contaPoupanca = (ContaPoupanca) conta;

                    contaPoupanca.setSaldo((contaPoupanca.getSaldo()*1.005));
                    contaPoupanca.addRendimento(contaPoupanca.getSaldo()*0.005);
                }
            }

//            Data.contas.stream().filter(conta -> conta instanceof ContaPoupanca).forEach(conta -> conta.setSaldo((conta.getSaldo()*1.005)));
//
//            Data.contas.stream().filter(conta -> conta instanceof ContaPoupanca).forEach(conta -> {
//                ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
//
//                contaPoupanca.setSaldo((contaPoupanca.getSaldo()*1.005));
//                contaPoupanca.addRendimento(contaPoupanca.getSaldo()*0.005);
//            });


            Thread.sleep(24000L);

        } catch (InterruptedException e) {
            return;
        }
    }
}
