package prog2.vista;

import prog2.model.*;

import java.util.Scanner;

public class VistaCamping {
    private Camping camping;
    private Scanner sc;


    static private enum OpcionsMenu {
        LLISTAR_TOTS_ALLOTJAMENTS,
        LLISTAR_ALLOTJAMENTS_OPERATIUS,
        LLISTAR_ALLOTJAMENTS_NO_OPERATIUS,
        LLISTAR_ACCESSOS_OBERTS,
        LLISTAR_ACCESSOS_TANCATS,
        LLISTAR_TASQUES_MANTENIMENT_ACTIVES,
        AFEGIR_TASCA_MANTENIMENT,
        COMPLETAR_TASCA_MANTENIMENT,
        ACCESSOS_NO_VEHICLE,
        ACCESSOS_TERRA,
        GUARDAR_CAMPING,
        RECUPERAR_CAMPING,
        SORTIR
    }

    static private String[] descOpcionsMenu = {
            "Llistar la informació de tots els allotjaments",
            "Llistar la informació dels allotjaments operatius",
            "Llistar la informació dels allotjaments no operatius",
            "Llistar la informació dels accessos oberts",
            "Llistar la informació dels accessos tancats",
            "Llistar la informació de les tasques de manteniments actives",
            "Afegir una tasca de manteniment",
            "Completar una tasca de manteniment",
            "Calcular i mostrar el número total d'accessos que NO proporcionen accessibilitat amb vehicle",
            "Calcular i mostrar el número total de metres dels accessos de terra",
            "Guardar càmping",
            "Recuperar càmping",
            "Sortir de l'aplicació"
    };





    public VistaCamping(String nomCamping) {
        sc = new Scanner(System.in);
        camping = new Camping(nomCamping);
        camping.inicialitzaDadesCamping();
    }

    public void gestioCamping() {
        Menu<OpcionsMenu> menu = new Menu<OpcionsMenu>("Menu", OpcionsMenu.values());
        menu.setDescripcions(descOpcionsMenu);

        // obtenim una opció des del menú i fem accions pertinents
        OpcionsMenu opcio = null;

        do{
            menu.mostrarMenu();

            opcio = menu.getOpcio(sc);
            switch (opcio) {
                case LLISTAR_TOTS_ALLOTJAMENTS:
                    System.out.println(camping.llistarAllotjaments("Tots"));
                    break;
                case LLISTAR_ALLOTJAMENTS_OPERATIUS:
                    System.out.println(camping.llistarAllotjaments("Operatiu"));
                    break;
                case LLISTAR_ALLOTJAMENTS_NO_OPERATIUS:
                    System.out.println(camping.llistarAllotjaments("No Operatiu"));
                    break;
                case LLISTAR_ACCESSOS_OBERTS:
                    System.out.println(camping.llistarAccessos("Obert"));
                    break;
                case LLISTAR_ACCESSOS_TANCATS:
                    System.out.println(camping.llistarAccessos("Tancat"));
                    break;
                case LLISTAR_TASQUES_MANTENIMENT_ACTIVES:
                    System.out.println(camping.llistarTasquesManteniment());
                    break;
                case AFEGIR_TASCA_MANTENIMENT:
                    afegirTascaManteniment();
                    System.out.println("Tasca manteniment afegida correctament");
                    break;
                case COMPLETAR_TASCA_MANTENIMENT:
                    completarTascaManteniment();
                    System.out.println("Tasca manteniment completada correctament");
                    break;
                case ACCESSOS_NO_VEHICLE:
                    System.out.println("Accessos sense vehicle: " + camping.calculaAccessosNoAccessibles());
                    break;
                case ACCESSOS_TERRA:
                    System.out.println("Total metres terra: " + camping.calculaMetresTerra());
                    break;
                case GUARDAR_CAMPING:
                    camping.save("Camping.dat");
                    System.out.println("Càmping guardat correctament");
                    break;
                case RECUPERAR_CAMPING:
                    camping.load("Camping.dat");
                    System.out.println("Càmping recuperat correctament");
                    break;
                case SORTIR:
                    System.out.println("Fins aviat!");
                    break;
            }
        }while(opcio!=OpcionsMenu.SORTIR);
    }

    private void completarTascaManteniment() {
        System.out.println(camping.llistarTasquesManteniment());
        System.out.println("Dóna el número de tasca a completar: ");
        int num = sc.nextInt();
        camping.completarTascaManteniment(num);
    }

    private void afegirTascaManteniment() {
        System.out.println("Introdueix el número de la tasca");
        int num = sc.nextInt();
        System.out.println("Introdueix el nom del allotjament on es vol realitzar la tasca: ");
        String allotjament = sc.next();
        System.out.println("Digues el tipus de tasca (Reparacio, Neteja, RevisioTecnica, Desinfeccio): ");
        String tipus = sc.next();
        System.out.println("Digues la data: ");
        String data = sc.next();
        System.out.println("Digues els dies esperats per realitzar la tasca: ");
        int dies = sc.nextInt();

        camping.afegirTascaManteniment(num, tipus, allotjament, data, dies);

    }
}
