package br.com.funcionarios;

import java.util.List;

/**
 * Created by phelipe.pereira on 21/08/2019.
 */
public interface Calculo {

    public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios);

    public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios);
}
