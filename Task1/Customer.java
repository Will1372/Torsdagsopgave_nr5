package Task1;

public class Customer{

    // 1.d klasser gjort private - intet / public før
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    public Customer(String firstName, String lastName, String username){ // 1.b klassens konstruktør, der tager kundes navn og brugernavn som paramtre

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter++; // 1.c counter / id counter bliver øget med 1 konstant
        this.id = ++counter;

    }

    public String getFirstName(){ // 1.d getters

        return firstName;

    }

    public String getLastName(){

        return lastName;

    }

    public String getUsername(){

        return username;

    }

    public int getId(){

        return id;


    }

    @Override // 1.d toString metoden
    public String toString(){

        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName'" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                '}';

    }
}