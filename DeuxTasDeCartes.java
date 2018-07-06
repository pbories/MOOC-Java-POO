public class DeuxTasDeCartes{
    Carte[] tab1, tab2;
    public DeuxTasDeCartes(Carte[] t1, Carte[] t2){
        tab1 = t1;
        tab2 = t2;
    }
    public boolean t1ContientCarte(Carte d){
      boolean res = false;
      for (int i=0; i<tab1.length; i++){
           if (tab1[i].equals(d)){
             res = true;
           }
      }
      return res;
    }
    public boolean t1ContientObjet(Carte d){
      boolean res = false;
      for (int i=0; i<tab1.length; i++){
           if (tab1[i]==d){
             res = true;
           }
      }
      return res;
    }
    public int compteCartesCommunes(){
      int nb = 0;
      for (int i=0; i<tab1.length; i++){
        for (int j=0; j<tab2.length; j++){
          if (tab1[i].equals(tab2[j])) {
            nb++;
          }
        }
      }
      return nb;
    }
    public int compteObjetsCommuns(){
      int nb = 0;
      for (int i=0; i<tab1.length; i++){
        for (int j=0; j<tab2.length; j++){
          if (tab1[i]==tab2[j]) {
            nb++;
          }
        }
      }
      return nb;
    }
    public String toString(){
        String res = "t1: ";
        for (int i=0; i<tab1.length; i++){
            res = res + tab1[i].toString() + ", ";
        }
        res = res + "\nt2: ";
        for (int i=0; i<tab2.length; i++){
            res = res + tab2[i].toString() + ", ";
        } 
        res = res + "\n";
        return res;
    }

}