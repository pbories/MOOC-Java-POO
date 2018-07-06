

public class Carte{
    String valeur, couleur;
    public Carte(String val, String coul){
        int i;
        String[] valeursOk = {"as", "sept", "huit", "neuf", "dix", "valet",
                           "dame", "roi"};
        String[] couleursOk = {"pique", "coeur", "carreau", "trefle"};
        i=0;
        while (i < valeursOk.length && val.compareTo (valeursOk[i]) != 0)
            i++;
        if (i == valeursOk.length)
            throw new IllegalArgumentException();
        i=0;
        while (i < couleursOk.length && coul.compareTo (couleursOk[i]) != 0)
            i++;
        if (i == couleursOk.length)
            throw new IllegalArgumentException(); 

        valeur = val;
        couleur = coul;
    }
    public String toString(){
        return valeur + " de " + couleur;
    }
    public String getValeur(){
        return valeur;
    }
    public String getCouleur(){
        return couleur;
    }
    public boolean equals(Carte carte){
        return valeur.equals(carte.getValeur()) && 
            couleur.equals(carte.getCouleur());
    }
}

