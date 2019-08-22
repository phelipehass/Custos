package br.com.funcionarios;

import javax.lang.model.type.NullType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.math.*;

/**
 * Created by phelipe.pereira on 21/08/2019.
 */
public class MyCalculo implements Calculo {

    //Funcionario func1;

    @Override
    public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
        List<CustoCargo> custosCargos = new ArrayList<>();
        int i,x,z,y;
        CustoCargo custeio;
        String cargoNome = "";

        for(i=0;i<funcionarios.size();i++){
            //fazer condição para verificar se o cargo já não está registrado na lista custocargo
            BigDecimal calc = new BigDecimal(0.0);
            if(i>0){
                for(y=0;y<funcionarios.size();y++){
                    for(z=0;z<custosCargos.size();z++){
                        if(custosCargos.get(z).getCargo().equals(funcionarios.get(i).getCargo())){
                            i++;
                            if(i>=funcionarios.size()) break;
                        }
                    }
                    z=0;
                    if(i>=funcionarios.size()) break;
                }
            }
            if(i<funcionarios.size()){
                for(x=0;x<funcionarios.size();x++){
                    if(x==0){
                        cargoNome = funcionarios.get(i).getCargo();
                        calc = calc.add(funcionarios.get(i).getSalario());
                    }
                    else if(i!=x && x>0){
                        if(funcionarios.get(i).getCargo().equals(funcionarios.get(x).getCargo())){
                            cargoNome = funcionarios.get(x).getCargo();
                            calc = calc.add(funcionarios.get(x).getSalario());
                        }
                    }
                }
            }
            else if(i==funcionarios.size()) break;

            custeio = new CustoCargo(cargoNome, calc);
            custosCargos.add(custeio);

        }
        return custosCargos;
    }



    public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios){
        List<CustoDepartamento> custosDepart = new ArrayList<>();
        int x=0,i=0,z=0,y=0;
        CustoDepartamento depart;
        String departNome = "";

        for(i=0;i<funcionarios.size();i++){
            BigDecimal calcular = new BigDecimal(0.0);

            if(i>0){
                for(y=0;y<funcionarios.size();y++){
                        for(z=0;z<custosDepart.size();z++){
                            if(custosDepart.get(z).getDepartamento().equals(funcionarios.get(i).getDepartamento())){
                                i++;
                                if(i>=funcionarios.size()) break;
                            }
                        }
                    z=0;
                    if(i>=funcionarios.size()) break;
                }
            }

            if(i<funcionarios.size()){
                for(x=0;x<funcionarios.size();x++){
                    if(x==0){
                        departNome = funcionarios.get(i).getDepartamento();
                        calcular = calcular.add(funcionarios.get(i).getSalario());
                    }

                    else if(i!=x && x>0){
                        if(funcionarios.get(i).getDepartamento().equals(funcionarios.get(x).getDepartamento())){
                            departNome = funcionarios.get(x).getDepartamento();
                            calcular = calcular.add(funcionarios.get(x).getSalario());
                        }
                    }
                }
            }
            else if(i==funcionarios.size()) break;

             depart = new CustoDepartamento(departNome, calcular);
            custosDepart.add(depart);
        }

        return custosDepart;
    }
}
