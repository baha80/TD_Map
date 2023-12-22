public class Employee implements Comparable<Employee>{
    private String name, prenom ; 
    private int cin ; 
    private String matricule ; 


    public Employee(String name, String prenom, int cin, String matricule) {
        this.name = name;
        this.prenom = prenom;
        this.cin = cin;
        this.matricule = matricule;
    }


    
        @Override
        public int compareTo(Employee other) {
            // Implement comparison logic here. For example, if Employee has a field 'name':
            return this.name.compareTo(other.name);
        }

    public Employee() {
    }   
    //getters et setters 
    public String getName() {
        return name;
    }
    public String getPrenom() {
        return prenom;
    }
    public int getCin() {
        return cin;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setCin(int cin) {
        this.cin = cin;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    //toString
    @Override
    public String toString() {
        return "Employee [cin=" + cin + ", matricule=" + matricule + ", name=" + name + ", prenom=" + prenom + "]";
    }
    //methode equals 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee other = (Employee) obj;
        return cin == other.cin && matricule == other.matricule && name == other.name && prenom == other.prenom;
    }
}
