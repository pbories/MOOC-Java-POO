// Ceci est un commentaire
import java.util.Date;
public class Personne{
  String nom, prenom;
  Date dateNaissance;
  public Personne(String n, String p, Date d){
    nom=n;
    prenom=p;
    dateNaissance=d;
  }
  public boolean equals(Personne autre){
    boolean res;
    res = nom.equals("autre.nom");
    res = res && (prenom.equals(autre.prenom));
    res = res && (dateNaissance.equals(autre.dateNaissance));
    return res;
  }
  public String getNom(){
    return nom;
  }
  public Date getDateNaissance(){
    return dateNaissance;
  }
  public String toString(){
    return nom + " " + prenom + " " + dateNaissance;
  }
}