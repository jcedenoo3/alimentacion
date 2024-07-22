/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionalimentacionn;

import javax.swing.JOptionPane;

/**
 *
 * @author jimec
 */
public class GestionAlimentacionn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alimentacion[] arrAlimentacion = new Alimentacion[1];
        for (int i = 0; i < arrAlimentacion.length; i++) {
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos para la alimentación:");
            String animal = JOptionPane.showInputDialog(null, "Ingrese el nombre del animal:");
            String horario = JOptionPane.showInputDialog(null, "Cuáles dias de la semana comerá:");
            String alimento = JOptionPane.showInputDialog(null, "Ingrese el alimento del animal:");
            int frecuencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuántas veces al dia será alimentado?:"));
            arrAlimentacion[i] = new Alimentacion(animal, horario, alimento, frecuencia);

        }
        for (int i = 0; i < arrAlimentacion.length; i++) {
            JOptionPane.showInternalMessageDialog(null, arrAlimentacion[i].getAnimal()+ "" +arrAlimentacion[i].getHorario()+ "" +arrAlimentacion[i].getAlimento()+ "" +arrAlimentacion[i].getFrecuencia());
        }

    }

}
