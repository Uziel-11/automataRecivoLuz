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
            System.out.println("pasando a q1");
            q1();
        }

    }

    public void q1(){
        if (list.get(1).equals("1")){
            System.out.println("pasando a q2");
            q2alq13();
        }
    }
    public void q2alq13(){
        int contadorError = 0;
        boolean status = false;
        boolean error = true;
        for (int i=2; i<14; i++){
            try {
                int pos = Integer.parseInt(list.get(i));
                if (pos>=0 && pos<=9){
                    System.out.println("pasando a q"+(i+1));
                     status = true;
                }
            }catch (Exception e){
                contadorError= i;
                error = false;
                System.out.println("No se Aceptan letras en esta area xd");
                break;
            }
        }
        if (status && error){
            q14();
        }else{
            System.out.println("No esta dentro de Nuestro Rango");
            System.out.println("error en q"+contadorError);
        }


    }
// evalua el año solo del 2000 al 2022
    public void q14(){
        if( list.get(14).equals("0") || list.get(14).equals("1") || list.get(14).equals("2")){
            System.out.println("pasando a q15");
            q15();
        }else{
            System.out.println("Esta fuera del rango");
        }
    }
    public void q15(){
        boolean error = true;
        for (String s : diccionario) {
            if (list.get(15).equals(s)) {
                error = false;
                q16();
            }
        }
        if(error){
            System.out.println("algunos caracteres no son correctos");
        }
    }

// evalua el mes
    public void q16(){
        if(list.get(16).equals("0") || list.get(16).equals("1")){
            System.out.println("pasando a q17");
            q17();
        }else{
            System.out.println("Esta fuera del rango");
        }
    }
    public void q17(){
        boolean error = true;
        for (String s : diccionario) {
            if (list.get(17).equals(s)) {
                if (list.get(16).equals("0") && list.get(17).equals("0")) {
                    System.out.println("no existe un mes que empiece en 00");
                    break;
                }
                if(list.get(16).equals("1") && Integer.parseInt(list.get(17))>2){
                    System.out.println("no hay ningun mes mayor a diciembre");
                    break;
                }
                error = false;
                q18();
            }
        }
        if(error){
            System.out.println("algunos caracteres no son correctos");
        }
    }
    // evalua el dia
    public void q18(){
        if(list.get(18).equals("0") || list.get(18).equals("1") || list.get(18).equals("2")) {
            System.out.println("pasando a q19");
            q19();
        }else{
            System.out.println("Esta fuera del rango");
        }
    }
    public void q19(){
        boolean error = true;
        for (String s : diccionario) {
            if (list.get(19).equals(s)) {
                if (list.get(18).equals("0") && list.get(19).equals("0")) {
                    System.out.println("no existe una fecha que empiece en 00 dias");
                    break;
                }
                error = false;
                q20al28();
            }
        }
        if(error){
            System.out.println("algunos caracteres no son correctos");
        }
    }
    public void q20al28(){
        int contadorError = 0;
        boolean status = false;
        boolean error = true;
        for (int i=20; i<29; i++){
            try {
                int pos = Integer.parseInt(list.get(i));
                if (pos>=0 && pos<=9){
                    System.out.println("pasando a q"+(i+1));
                    status = true;
                }
            }catch (Exception e){
                contadorError= i;
                error = false;
                System.out.println("No se Aceptan letras en esta area xd");
                break;
            }
        }
        if (status && error){
            q29();
        }else{
            System.out.println("No esta dentro de Nuestro Rango");
            System.out.println("error en q"+contadorError);
        }
    }

    public void q29(){
        boolean error = true;
        for (String s : diccionario) {
            if (list.get(29).equals(s)) {
                error = false;
                q30();
            }
        }
        if(error){
            System.out.println("algunos caracteres no son correctos");
        }
    }
    public void q30(){}

}
