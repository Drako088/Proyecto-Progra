/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author drako
 */
public class Login1 {
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static Profesor profesorLogeado = new Profesor();
    
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Alumno alumnoLogeado = new Alumno();
    
    public static ArrayList<Curso> cursos = new ArrayList<>();
    public static Curso cursoLogeado = new Curso();
    
    public static boolean ValidPassword (String password){
     String expresion = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{5,}$";
     
     Pattern pattern = Pattern.compile(expresion);
     Matcher matcher = pattern.matcher(password);
     
     return matcher.matches();
    }
    
    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);

    }
}
