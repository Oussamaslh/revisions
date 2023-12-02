package revision;

import java.util.Objects;

public class Oiseau implements Comparable<Oiseau>, Cloneable {
	protected String nom;
    protected String couleur;
    protected String taille;
    
    public Oiseau(String nom2, String couleur2, String taille2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(couleur, nom, taille);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oiseau other = (Oiseau) obj;
		return Objects.equals(couleur, other.couleur) && Objects.equals(nom, other.nom)
				&& Objects.equals(taille, other.taille);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " nom=" + nom + ", couleur=" + couleur + ", taille=" + taille + "";
	}

	public void Oiseau(String nom, String couleur, String taille) {
        this.nom = nom;
        this.couleur = couleur;
        this.taille = taille;
    }

    public void voler() {
        System.out.println(nom + " vole dans le ciel.");
    }
    
    public int compareTo(Oiseau o) {
        return this.nom.compareTo(o.nom);
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
    
    
    
}

