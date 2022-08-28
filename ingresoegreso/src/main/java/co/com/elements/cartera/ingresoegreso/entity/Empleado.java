package co.com.elements.cartera.ingresoegreso.entity;

public class Empleado {
   private long idEmpleado;
   private String nombre;
   private String apellido;
   private String email;
   private Empresa empresaEmpleado;
   private Rol rolEmpleado;
   private TipoDocumento tipoDocumento;
   private String numeroDocumento;
   private boolean estado;


   public long getIdEmpleado() {
      return idEmpleado;
   }

   public void setIdEmpleado(long idEmpleado) {
      this.idEmpleado = idEmpleado;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Empresa getEmpresaEmpleado() {
      return empresaEmpleado;
   }

   public void setEmpresaEmpleado(Empresa empresaEmpleado) {
      this.empresaEmpleado = empresaEmpleado;
   }

   public Rol getRolEmpleado() {
      return rolEmpleado;
   }

   public void setRolEmpleado(Rol rolEmpleado) {
      this.rolEmpleado = rolEmpleado;
   }

   public TipoDocumento getTipoDocumento() {
      return tipoDocumento;
   }

   public void setTipoDocumento(TipoDocumento tipoDocumento) {
      this.tipoDocumento = tipoDocumento;
   }

   public String getNumeroDocumento() {
      return numeroDocumento;
   }

   public void setNumeroDocumento(String numeroDocumento) {
      this.numeroDocumento = numeroDocumento;
   }

   public boolean isEstado() {
      return estado;
   }

   public void setEstado(boolean estado) {
      this.estado = estado;
   }


   @Override
   public String toString() {
      return "Empleado{" +
              "idEmpleado=" + idEmpleado +
              ", nombre='" + nombre + '\'' +
              ", email='" + email + '\'' +
              ", empresaEmpleado=" + empresaEmpleado +
              ", rolEmpleado=" + rolEmpleado +
              ", tipoDocumento=" + tipoDocumento +
              ", numeroDocumento='" + numeroDocumento + '\'' +
              ", estado=" + estado +
              '}';
   }
}
