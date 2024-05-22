public class cls_pacientes{
  private String nombreMascotaStr;
  private String idStr;
  private int edadInt;
  private String contactoStr;
  private String historiaStr;

  public cls_pacientes(String nombreMascotaStr, String idStr, int edadInt, String contactoStr, String historiaStr){
    this.nombreMascotaStr = nombreMascotaStr;
    this.idStr = idStr;
    this.edadInt = edadInt;
    this.contactoStr = contactoStr;
    this.historiaStr = historiaStr;
  }

  public String getNombreMascotaStr() {
    return nombreMascotaStr;
  }

  public void setNombreMascotaStr(String nombreMascotaStr) {
    this.nombreMascotaStr = nombreMascotaStr;
  }

  public String getIdStr() {
    return idStr;
  }

  public void setIdStr(String idStr) {
    this.idStr = idStr;
  }

  public int getEdadInt() {
    return edadInt;
  }

  public void setEdadInt(int edadInt) {
    this.edadInt = edadInt;
  }

  public String getContactoStr() {
    return contactoStr;
  }

  public void setContactoStr(String contactoStr) {
    this.contactoStr = contactoStr;
  }

  public String getHistoriaStr() {
    return historiaStr;
  }

  public void setHistoriaStr(String historiaStr) {
    this.historiaStr = historiaStr;
  }
}