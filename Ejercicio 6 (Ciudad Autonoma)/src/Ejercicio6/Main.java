package Ejercicio6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // 1. Crear el Parque y su infraestructura base
        Parque parqueNacional = new Parque();
        parqueNacional.setNombre("Parque Nacional Nahuel Huapi");

        Area areaBosque = new Area();
        areaBosque.setNombre("Area Bosque Central");
        areaBosque.setParque(parqueNacional);

        Entrada entradaPrincipal = new Entrada();
        entradaPrincipal.setNumero(1);
        entradaPrincipal.setParque(parqueNacional);

        // 2. Crear a la persona física (Juan)
        Personal juan = new Personal();
        juan.setNombre("Juan");
        juan.setDni("32143352");
        juan.setParqueTrabajo(parqueNacional);




        RolCelador juanCelador = new RolCelador();
        juanCelador.setPersonal(juan);
        juanCelador.setEntradaDestino(entradaPrincipal);
        juan.setRolCelador(juanCelador);


        Vehiculo camioneta = new Vehiculo();
        camioneta.setMatricula("AB123CD");

        RolGuardia juanGuarda = new RolGuardia();
        juanGuarda.setPersonal(juan);
        juanGuarda.setAreaAsignada(areaBosque);
        juanGuarda.setVehiculo(camioneta);
        juan.setRolGuarda(juanGuarda);


        RolInvestigador juanInvestigador = new RolInvestigador();
        juanInvestigador.setPersonal(juan);
        juanInvestigador.setTitulacion("Licenciado en Biologia");
        juan.setRolInvestigador(juanInvestigador);


        Proyecto proyectoFauna = new Proyecto();
        proyectoFauna.setNombre("Monitoreo de Pumas");
        proyectoFauna.setFechaInicio(new Date());

        Carnivora puma = new Carnivora();
        puma.setNombreVulgar("Puma");
        puma.setNombreCientifico("Puma concolor");


        Investigacion investigacionTernaria = new Investigacion();
        investigacionTernaria.setInvestigador(juanInvestigador);
        investigacionTernaria.setProyecto(proyectoFauna);
        investigacionTernaria.setEspecie(puma);

        juanInvestigador.getInvestigaciones().add(investigacionTernaria);


        System.out.println("--- REGISTRO DE PERSONAL ---");
        System.out.println("Empleado: " + juan.getNombre());
        System.out.println("Parque asignado: " + juan.getParqueTrabajo().getNombre());

        System.out.println("\n--- ROLES ASIGNADOS SIMULTANEAMENTE ---");
        if (juan.getRolCelador() != null) {
            System.out.println("- Es Celador en la entrada " + juan.getRolCelador().getEntradaDestino().getNumero());
        }
        if (juan.getRolGuarda() != null) {
            System.out.println("- Es Guarda en el " + juan.getRolGuarda().getAreaAsignada().getNombre());
        }
        if (juan.getRolInvestigador() != null) {
            System.out.println("- Es Investigador con titulo de " + juan.getRolInvestigador().getTitulacion());
        }

        System.out.println("\n--- DETALLE DE INVESTIGACION TERNARIA ---");
        System.out.println("Proyecto: " + investigacionTernaria.getProyecto().getNombre());
        System.out.println("Investigador a cargo: " + investigacionTernaria.getInvestigador().getPersonal().getNombre());
        System.out.println("Especie investigada: " + investigacionTernaria.getEspecie().getNombreVulgar() +
                " (" + investigacionTernaria.getEspecie().getNombreCientifico() + ")");
    }
}