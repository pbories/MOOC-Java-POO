import java.util.Date;
public class Adoption{
  // variables
  Personne adulte1;
  Personne adulte2;
  Personne enfant;
  Date dateAdopte;
  
  // constructeur
  public Adoption(Personne adopte, Personne adoptant1, Personne adoptant2){
    enfant = adopte;
    int anneeNaissanceEnfant = enfant.getDateNaissance().getYear();
    adulte1 = adoptant1;
    int anneeNaissanceAdulte1 = adulte1.getDateNaissance().getYear();
    adulte2 = adoptant2;
    int anneeNaissanceAdulte2 = adulte2.getDateNaissance().getYear();
    Date dateAdoption = new Date();
    int anneeAdoption = dateAdoption.getYear();    
    
    if (anneeNaissanceEnfant>=anneeAdoption-15 && anneeAdoption-anneeNaissanceAdulte1>28 && anneeNaissanceAdulte1-anneeNaissanceEnfant>15){
      if (adulte2 != null && anneeAdoption-anneeNaissanceAdulte2>28){
        dateAdopte = dateAdoption;
      } else {
        throw new IllegalArgumentException("Les conditions d'âge ne sont pas remplies");
      }
      dateAdopte = dateAdoption;
    } else {
      throw new IllegalArgumentException("Les conditions d'âge ne sont pas remplies");
    }   
  }
  
  // méthodes
  public String toString(){
    String res = enfant + " a été adopté par " + adulte1;
    if (adulte2 != null){
      res = res + " et " + adulte2;
    }
    res = res + " le " + dateAdopte;
    return res;
  }
  
  public Date getDate(){
    return dateAdopte;
  }
  
  public Personne getAdopte(){
    return enfant;
  }
}