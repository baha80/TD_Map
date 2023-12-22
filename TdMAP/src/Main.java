
public class Main {
    public static void main(String[] args) {
        // Create instances of SocieteHashMap and SocieteTreeMap
        InterfaceSociete societeHashMap = new SocieteHashMap();
        InterfaceSociete societeTreeMap = new SocieteTreeMap();

        // Create employees and departments
        Employee employe1 = new Employee("123", "E001", 123456, "Doe");
        Employee employe2 = new Employee("456", "E002", 125896, "Doe");

        DEpartement departement1 = new DEpartement(1, "HR");
        DEpartement departement2 = new DEpartement(2, "IT");

        // Add employees and departments to SocieteHashMap
        societeHashMap.ajouterEmployeDepartement(employe1, departement1);
        societeHashMap.ajouterEmployeDepartement(employe2, departement2);

        // Add employees and departments to SocieteTreeMap
        societeTreeMap.ajouterEmployeDepartement(employe1, departement1);
        societeTreeMap.ajouterEmployeDepartement(employe2, departement2);

        // Display all employees and their departments
        System.out.println("Employees and their departments (HashMap):");
        societeHashMap.afficherLesEmployesLeursDepartements();

        System.out.println("Employees and their departments (TreeMap):");
        societeTreeMap.afficherLesEmployesLeursDepartements();

        // Remove an employee
        societeHashMap.supprimerEmploye(employe1);

        // Display all employees and their departments after removal
        System.out.println("Employees and their departments after removal (HashMap):");
        societeHashMap.afficherLesEmployesLeursDepartements();

        // Search for an employee
        System.out.println("Is employe1 in the HashMap? " + societeHashMap.rechercherEmploye(employe1));
        System.out.println("Is employe1 in the TreeMap? " + societeTreeMap.rechercherEmploye(employe1));
    
    }
}