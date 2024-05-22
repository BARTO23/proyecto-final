import javax.swing.JOptionPane;

public class app {
  public static void main(String[] args) {
    fnt_menuPrincipal(true);
  }

  public static void fnt_paciente(){
    String opcionesPacientes = JOptionPane.showInputDialog(null, "MENU PACIENTES\n" +
                "1. Registrar\n" +
                "2. Consultar\n" +
                "3. Salir");
        if (opcionesPacientes.equals("1")) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente: ");
            String id = JOptionPane.showInputDialog(null, "Ingrese el id del paciente: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del paciente: "));
            String contacto = JOptionPane.showInputDialog(null, "Ingrese el contacto del paciente: ");
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