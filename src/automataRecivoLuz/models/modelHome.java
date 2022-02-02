package automataRecivoLuz.models;

import java.util.ArrayList;
import java.util.List;

public class modelHome {
    List<String> list = new ArrayList<String>();
    String[] diccionario = {"0","1","2","3","4","5","6","7","8","9"};


    public void particion(String cadena){

        for (int i=0; i<cadena.length(); i++){
            list.add(cadena.substring(i,i+1));
        }

//        for (int l=0; l<list.size(); l++){
//            System.out.println(list.get(l));
//        }
        if (list.get(0).equals("0")){
            q1();
            System.out.println("pasando a q1");
        }

    }

    public void q1(){
        if (list.get(1).equals("1")){
            q2alq12();
            System.out.println("pasando a q2");
        }
    }
    public void q2alq12(){
        for (int i=0; i< list.size(); i++){

        }
    }
    public void q3(){}
    public void q4(){}
    public void q5(){}
    public void q6(){}
    public void q7(){}
    public void q8(){}
    public void q9(){}
    public void q10(){}
    public void q11(){}
    public void q12(){}
    public void q13(){}
    public void q14(){}
    public void q15(){}
    public void q16(){}
    public void q17(){}
    public void q18(){}
    public void q19(){}
    public void q20(){}
    public void q21(){}
    public void q22(){}
    public void q23(){}
    public void q24(){}
    public void q25(){}
    public void q26(){}
    public void q27(){}
    public void q28(){}
    public void q29(){}
    public void q30(){}

}
