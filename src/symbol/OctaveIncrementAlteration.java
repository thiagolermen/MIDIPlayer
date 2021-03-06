package symbol;

import player.TCPlayer;
import player.Octave;

//Symbol from input text that represents an octave increment.
public class OctaveIncrementAlteration extends Symbol {
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	// Alteration
	public void alterPlayer(TCPlayer player) {
		int newOctave = player.getOctave() + 1;
		if (newOctave > Octave.maxOctave)
			player.setOctave(Octave.defaultOctave);
		else
			player.setOctave(newOctave);
	}
}
