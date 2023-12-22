import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {

     private Map<Employee, DEpartement> employeDepartementMap = new HashMap<>();

    @Override
    public void ajouterEmployeDepartement(Employee e, DEpartement d) {
        employeDepartementMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employee e) {
        employeDepartementMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employee, DEpartement> entry : employeDepartementMap.entrySet()) {
            System.out.println("Employe: " + entry.getKey() + ", Departement: " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employee e : employeDepartementMap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (DEpartement d : employeDepartementMap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employee e) {
        DEpartement d = employeDepartementMap.get(e);
        if (d != null) {
            System.out.println("Departement de l'employe " + e + ": " + d);
        } else {
            System.out.println("Employe non trouvé.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employee e) {
        return employeDepartementMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(DEpartement d) {
        return employeDepartementMap.containsValue(d);
    }
}