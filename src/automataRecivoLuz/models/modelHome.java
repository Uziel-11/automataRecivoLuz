package automataRecivoLuz.models;

import automataRecivoLuz.controllers.controllerHome;

import java.util.ArrayList;
import java.util.List;

public class modelHome {
    List<String> list = new ArrayList<String>();
    String[] diccionario = {"0","1","2","3","4","5","6","7","8","9"};
    String[] result = new String[3];


    public String[] particion(String cadena){
        result[0] = "error";

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

        return result;
    }

    public void q1(){
        if (list.get(1).equals("1")){
            System.out.println("pasando a q2");
            q2alq13();
        }
        list.clear();
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
    public void q30(){
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre",
        "Noviembre","Diciembre"};
        if(list.size() == 30) {

            int mes = Integer.parseInt(list.get(16) + Integer.parseInt(list.get(17)));
            String dia = list.get(18) + list.get(19);
            String anio = "20" + list.get(14) + list.get(15);
            String cantidad = "";
            String servicio = "";


            for (int i = 2; i <= 13; i++) {
                servicio += list.get(i);

            }

            System.out.print("No. de Servicio: " + servicio);

            for (int l = 20; l < 29; l++) {
                if (list.get(l).equals("0")) {

                } else {
                    for (int j = l; j < 29; j++) {
                        cantidad += list.get(j);
                    }
                    break;
                }

            }

            System.out.println("\n Fecha Limite de Pago: " + dia + " " + meses[mes - 1] + " " + anio);
            System.out.println("La cantidad a Pagar es: $" + cantidad);

            result[0] = servicio;
            result[1] = dia + " de " + meses[mes - 1] + " " + anio;
            result[2] = "$" + cantidad;
        }
    }

}
