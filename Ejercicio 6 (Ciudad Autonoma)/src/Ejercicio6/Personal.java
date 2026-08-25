package Ejercicio6;

public class Personal {
    private String dni;
    private String nombre;
    private String direccion;
    private float sueldo;
    private String telefono;
    private String nroSegSocial;
    private Parque parqueTrabajo;

    private RolCelador rolCelador;
    private RolGuardia rolGuarda;
    private RolInvestigador rolInvestigador;

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public float getSueldo() { return sueldo; }
    public void setSueldo(float sueldo) { this.sueldo = sueldo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getNroSegSocial() { return nroSegSocial; }
    public void setNroSegSocial(String nroSegSocial) { this.nroSegSocial = nroSegSocial; }

    public Parque getParqueTrabajo() { return parqueTrabajo; }
    public void setParqueTrabajo(Parque parqueTrabajo) { this.parqueTrabajo = parqueTrabajo; }

    public RolCelador getRolCelador() { return rolCelador; }
    public void setRolCelador(RolCelador rolCelador) { this.rolCelador = rolCelador; }

    public RolGuardia getRolGuarda() { return rolGuarda; }
    public void setRolGuarda(RolGuardia rolGuarda) { this.rolGuarda = rolGuarda; }

    public RolInvestigador getRolInvestigador() { return rolInvestigador; }
    public void setRolInvestigador(RolInvestigador rolInvestigador) { this.rolInvestigador = rolInvestigador; }
}