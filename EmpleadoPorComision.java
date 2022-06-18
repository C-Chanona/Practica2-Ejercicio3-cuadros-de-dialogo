
package c2ejercicio3;


public class EmpleadoPorComision {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión

    //Constructor por defecto
    public EmpleadoPorComision(){   
    }
    
    // constructor con cinco argumentos
    public EmpleadoPorComision(String nombre, String apellido, String nss, 
            double ventas, double tarifa) { // la llamada implícita al constructor de Object ocurre aquí
        this.primerNombre = nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
        establecerVentasBrutas(ventas); // valida y almacena las ventas brutas
        establecerTarifaComision(tarifa); // valida y almacena la tarifa de comisión
    } // fin del constructor de EmpleadoPorComision3 con cinco argumentos

    // establece el primer nombre
    public void setNombre(String nombre ){
        primerNombre = nombre;
    } // fin del método establecerPrimerNombre

    // devuelve el primer nombre
    public String getNombre(){
        return primerNombre;
    } // fin del método obtenerPrimerNombre

    // establece el apellido paterno
    public void setApellido(String apellido ){
        apellidoPaterno = apellido;
    } // fin del método establecerApellidoPaterno

    // devuelve el apellido paterno
    public String getApellido(){
        return apellidoPaterno;
    } // fin del método obtenerApellidoPaterno

    // establece el número de seguro social
    public void setNumeroSeguroSocial(String nss ){
        numeroSeguroSocial = nss; // debe validar
    } // fin del método establecerNumeroSeguroSocial

    // devuelve el número de seguro social
    public String getNumeroSeguroSocial(){
        return numeroSeguroSocial;
    } // fin del método obtenerNumeroSeguroSocial

    // establece el monto de ventas brutas
    public void setVentasBrutas( double ventas ){
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
    } // fin del método establecerVentasBrutas

    // devuelve el monto de ventas brutas
    public double getVentasBrutas(){
        return ventasBrutas;
    } // fin del método obtenerVentasBrutas

    // establece la tarifa de comisión
    public void setTarifaComision( double tarifa ){
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    } // fin del método establecerTarifaComision

    // devuelve la tarifa de comisión
    public double getTarifaComision(){
        return tarifaComision;
    } // fin del método obtenerTarifaComision

    // calcula los ingresos
    //método polimórfico
    public double ingresos(){
        return getTarifaComision() * getVentasBrutas();
    } // fin del método ingresos

    // devuelve representación String del objeto EmpleadoPorComision3
    @Override
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "empleado por comision", getNombre(), getApellido(),
                "numero de seguro social", getNumeroSeguroSocial(),
                "ventas brutas", getVentasBrutas(),
                "tarifa de comision", getTarifaComision(),
                "sueldo más comisión",ingresos()); 
    } // fin del método toString
}