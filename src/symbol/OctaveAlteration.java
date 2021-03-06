package symbol;

import player.TCPlayer;

//Symbol from input text that represents an octave change.
public class OctaveAlteration extends Symbol {
	
	// Constants
	public static final int alteration = 1;
	public static final int positiveAlteration = alteration;
	public static final int negativeAlteration = -alteration;
	
	// Attribute for the alteration
	private int difference;

	// Argument constructor
	public OctaveAlteration(int value) {
		this.difference = value;
	}

	// Getter
	public int getDifference() {
		return difference;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + difference;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OctaveAlteration other = (OctaveAlteration) obj;
		if (difference != other.difference)
			return false;
		return true;
	}

	// Alteration
	public void alterPlayer(TCPlayer player) {
		player.setOctave(player.getOctave() + difference);
	}

}
