package ejercicio8;

class Persona {
    protected String numSegSocial;
    protected String nombre;
    protected String direccion;
    protected String telefono;

    public Persona(String numSegSocial, String nombre, String direccion, String telefono) {
        this.numSegSocial = numSegSocial;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNumSegSocial() { return numSegSocial; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
}