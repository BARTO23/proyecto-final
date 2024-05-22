import java.util.LinkedList;

import javax.swing.JOptionPane;
public class app {
  static LinkedList <cls_pacientes> pacientes = new LinkedList<>();
  public static void main(String[] args) {
    fnt_menuPrincipal(true);
  }

  public static void fnt_paciente(){
    String opcionesPacientes = JOptionPane.showInputDialog(null, "MENU PACIENTES\n" +
                "1. Registrar\n" +
                "2. Consultar\n" +
                "3. Salir");
        if (opcionesPacientes.equals("1")) {
            boolean sw = false;

            String id = JOptionPane.showInputDialog(null, "Ingrese el id del paciente: ");
            for (int i = 0; i < pacientes.size(); i++){
              if(pacientes.get(i).getIdStr().equals(id)){
                sw = true;
                break;
              }
            }
            if(sw == false){
              String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente: ");
              int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del paciente: "));
              String contacto = JOptionPane.showInputDialog(null, "Ingrese el contacto del paciente: ");
              String historia = JOptionPane.showInputDialog(null, "Ingrese la historia del paciente: ");
              pacientes.add(new cls_pacientes(nombre, id, edad, contacto, historia));
              JOptionPane.showMessageDialog(null,"Paciente registrado con exito");
            }
            else{
              JOptionPane.showMessageDialog(null, "Este paciente con id: " + id + " Ya existe");
            }            
}

        if (opcionesPacientes.equals("2")) {
          boolean sw = false;
          int pos = 0;

          String id = JOptionPane.showInputDialog(null, "Igrese el ID del paciente a consultar ");
          for (int i = 0; i < pacientes.size(); i++){
            if(pacientes.get(i).getIdStr().equals(id)){
              sw = true;
              pos = i;
              break;
            }
            if ( sw == true) {
              JOptionPane.showMessageDialog(null, "Nombre: " + pacientes.get(pos).getNombreMascotaStr() + "\n" +
              "Edad: " + pacientes.get(pos).getEdadInt() + "\n" +
              "Contacto: " + pacientes.get(pos).getContactoStr() + "\n" +
              "Historia: " + pacientes.get(pos).getHistoriaStr());
            }
            else{
              JOptionPane.showMessageDialog(null, "Paciente no encontrado");
            }
          }
        }
  }// The backticks (`) in the code snippet you provided are not doing anything. They are simply used as a formatting convention in some Markdown or plain text environments to denote code or code snippets. In this case, the backticks are not affecting the functionality of the Java code.
  

  private static void fnt_menuPrincipal(boolean m){
    while (m) {
            String opcionesStr = JOptionPane.showInputDialog(null, "Menu Principal\n"+
            "1. Nuevo paciente\n" +
            "2. Nueva cita\n" +
            "3. Reporte\n" +
            "4. Salir");

            if (opcionesStr.equals("1")){
                fnt_paciente();
      }
    }
  }
}