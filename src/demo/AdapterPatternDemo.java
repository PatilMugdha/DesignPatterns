package demo;

import classes.AudioPlayer;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();
		player.play("mp3", "shivam.mp3");
		player.play("mp4", "Khoya hai.mp4");
		player.play("vlc", "manohari.vlc");
		player.play("avi", "pre ratan dhan payo.avi");
	}
}
