package com.swlo;

import com.swlo.clients.Client;
import com.swlo.clients.PessoaFisica;
import com.swlo.clients.PessoaJuridica;
import com.swlo.contas.*;
import com.swlo.screens.FisicoScreen;
import com.swlo.screens.JuridicoScreen;
import com.swlo.screens.StartScreen;

import java.util.ArrayList;

public class Data {

    public static FisicoScreen fisicoScreen = new FisicoScreen();
    public static JuridicoScreen juridicoScreen = new JuridicoScreen();
    public static StartScreen startScreen = new StartScreen();
    public static ArrayList<Client> clients = new ArrayList<Client>();
    public static ArrayList<Conta> contas = new ArrayList<Conta>();


    public static void loadData() {
        clients.add(new PessoaFisica("Pedro Paulo", "62996304769","pedropaulo.srabelo@gmail.com", "0"));
        clients.add(new PessoaFisica("Marcel", "41241242","Marcel@gmail.com", "1"));
        clients.add(new PessoaFisica("Ganyu", "51412412412","adepti.Ganyu@gmail.com", "2"));
        clients.add(new PessoaJuridica("Gens", "561212312","xyniyan@Impa.net", "51"));

        contas.add(new ContaCorrente("0", (PessoaFisica) clients.get(1)));
        contas.add(new ContaPoupanca("0", (PessoaFisica) clients.get(2)));
        contas.add(new ContaEspecial("0", (PessoaFisica) clients.get(2), 1314));
        contas.add(new ContaEmpresarial("0", (PessoaJuridica) clients.get(3), 53221));
    }

}
