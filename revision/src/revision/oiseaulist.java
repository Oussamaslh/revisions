package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class oiseaulist {
	public static final Oiseau newoiseau = null;
	public Object oiseau;

	public class oiseaulistclass {
		 List<Oiseau> oiseaux;
		  public oiseaulistclass( List<Oiseau> oiseaux) {
		    this.oiseaux = oiseaux;
		  }
		  
		  public void alimenterListe(Oiseau o) {
			    oiseaux.add(o);
			  }
		  
		  public void afficherListe() {
			    for(Oiseau o : oiseaux){
			      System.out.println(o.toString());
			    }
			  }
		  
		  public void parcourirListe() {
			    Iterator<Oiseau> it = oiseaux.iterator();
			    while (it.hasNext()) {
			      Oiseau a = it.next();
			      System.out.println(a.toString());
			    }
			  }
		  
		  public void insererElement(Oiseau newooiseau, int index) {
			    oiseaux.add(index, newoiseau);
			  }
		  
		  public Oiseau recupererElement(int index) {
			    return oiseaux.get(index);
		  }
		  public void supprimerElement(int index) {
		        oiseaux.remove(index);
		        
		      }
		  
		  public int rechercherElement(Oiseau o) {
		        return oiseaux.indexOf(oiseau);
		      }
		  
		  
		  public List<Oiseau> copierListe() {
			    return new ArrayList<Oiseau>(oiseaux);
			  }
		  
		  public void melangerListe() {
			    Collections.shuffle(oiseaux);
			  }
		  
		  public void inverserListe() {
			    Collections.reverse(oiseaux);
			  }
		  
		  public List<Oiseau> extrairePartieListe(int fromIndex, int toIndex) {
			    return oiseaux.subList(fromIndex, toIndex);
			  }
		  
		  public boolean comparerListes(List<Oiseau> otherList) {
			    return oiseaux.equals(otherList);
			  }
		  
		  public void echangerElements(int index1, int index2){
			    Collections.swap(oiseaux, index1, index2);
			  }
			public void viderListe() {
			    oiseaux.clear();
			  }
			public boolean testerVideListe() {
			    return oiseaux.isEmpty();
			  }
	}
}
