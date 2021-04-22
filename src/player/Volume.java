package player;

import symbol.VolumeAlteration;
import symbol.VolumeDoubleAlteration;

//Represents a volume.
public class Volume {
 private static final int defaultVolume= 10;
 private static final int maxVolume = 100;
 private static final int minVolume = 0;
 
 private int volume;

 public Volume(int volume) {
	 this.volume = volume;
 }
 public Volume() {
	 this.volume = defaultVolume;
 }

 public void update(VolumeAlteration alterVolume) {
	 
 }
 public void update(VolumeDoubleAlteration alterVolume) {
	 
 }

 public int getVolume() {
	 return volume;
 }
}