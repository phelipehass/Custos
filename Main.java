package br.com.funcionarios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
        Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
        Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
        Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
        Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
        Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
        Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
        Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
        Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
        Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));

        //custo total assistente: 4100.8
        //custo total gerente:24001,2
        //custo total diretor:34000,45
        //custo total estagiário:700,4

        //custo total administrativo: 18001,15
        //custo total financeiro: 19800,9
        //custo total juridico: 25001,8

        List<Funcionario> listaFuncionario = new ArrayList<>();
        listaFuncionario.add(funcionario1);
        listaFuncionario.add(funcionario2);
        listaFuncionario.add(funcionario3);
        listaFuncionario.add(funcionario4);
        listaFuncionario.add(funcionario5);
        listaFuncionario.add(funcionario6);
        listaFuncionario.add(funcionario7);
        listaFuncionario.add(funcionario8);
        listaFuncionario.add(funcionario9);
        listaFuncionario.add(funcionario10);

        List<CustoCargo> custos = new ArrayList<>();
        List<CustoDepartamento> custoDepart = new ArrayList<>();

        MyCalculo calc = new MyCalculo();
        custos = calc.custoPorCargo(listaFuncionario);
        System.out.println("---Custo total por cargo---");
        for(int i=0;i<custos.size();i++){
            System.out.println("Cargo: "+custos.get(i).getCargo()+"; ---- Custo: "+custos.get(i).getCusto());
        }

        custoDepart = calc.custoPorDepartamento(listaFuncionario);
        System.out.println();
        System.out.println("---Custo total por departamento---");
        for(int i=0;i<custoDepart.size();i++){
            System.out.println("Departamento: "+custoDepart.get(i).getDepartamento()+"; ---- Custo: "+custoDepart.get(i).getCusto());
        }


    }
}
