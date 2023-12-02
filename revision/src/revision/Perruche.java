package revision;

import java.util.Arrays;
import java.util.Collections;

public class Perruche extends Oiseau{
	
	private Oiseau[] tableauOiseaux;
	
	public Perruche(String nom2, String couleur2, String taille2, Oiseau[] tableauOiseaux) {
		super(nom2, couleur2, taille2);
		this.tableauOiseaux = tableauOiseaux;
		// TODO Auto-generated constructor stub
	}

	public Oiseau[] getTableauOiseaux() {
		return tableauOiseaux;
	}

	public void setTableauOiseaux(Oiseau[] tableauOiseaux) {
		this.tableauOiseaux = tableauOiseaux;
	}
	
	
	public void trierTableau() {
        Arrays.sort(tableauOiseaux);
    }

	public void ajouterElement(Oiseau newOiseau) {
        tableauOiseaux = Arrays.copyOf(tableauOiseaux, tableauOiseaux.length + 1);
        tableauOiseaux[tableauOiseaux.length - 1] = newOiseau;
    }
	
	public void supprimerElement(int index) {
        if (index >= 0 && index < index) {
            for (int i = index; i < index - 1; i++) {
                tableauOiseaux[i] = tableauOiseaux[i + 1];
            }
            tableauOiseaux[index - 1] = null;
            index--;
        } else {
            System.out.println("Index invalide. Impossible de supprimer la machine."  );
        }
	}
	
	public int nombreElements() {
        return tableauOiseaux.length;
    }
	 public void inverserOrdreTableau() {
	        Collections.reverse(Arrays.asList(tableauOiseaux));
	    }
	 public void afficherElements() {
	        for (Oiseau o : tableauOiseaux) {
	            System.out.println(o.nom + " - " + o.couleur);
	        }
	    }

	 public Oiseau elementPlusGrand() {
	        if (tableauOiseaux.length > 0) {
	            Arrays.sort(tableauOiseaux);
	            return tableauOiseaux[tableauOiseaux.length - 1];
	        } else {
	            return null;
	        }
	    }
	 
	 public boolean testerEgalite(Oiseau[] autreTableau) {
	        return Arrays.equals(tableauOiseaux, autreTableau);
	    }
	 
}
