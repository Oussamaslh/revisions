package revision;

import java.util.Objects;

public class Canar extends Oiseau {
	
	private String chant;

	public String getChant() {
		return chant;
	}

	public void setChant(String chant) {
		this.chant = chant;
	}
	
	public  Canar(String nom, String couleur, String taille, String chant) {
        super(nom, couleur, taille);
        this.chant = chant;
    }

	@Override
	public int hashCode() {
		return Objects.hash(chant);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Canar other = (Canar) obj;
		return Objects.equals(chant, other.chant);
	}

	@Override
	public String toString() {
		return "canar [chant=" + chant + "]";
	}
	
	public void chanter() {
        System.out.println(nom + " chante : " + chant);
    }

}
