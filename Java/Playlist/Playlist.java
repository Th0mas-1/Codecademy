import java.util.ArrayList;

public class Playlist {
	public static void main(String[] args) {
		// playlist creation
		ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
		desertIslandPlaylist.add("Creed of Chaos");
		desertIslandPlaylist.add("Ain't Nobody");
		desertIslandPlaylist.add("Flow");
		desertIslandPlaylist.add("Adagio for Strings Op 11");
		desertIslandPlaylist.add("M4 Pt II");
		desertIslandPlaylist.add("Miss Summer");

		// printing playlist
		System.out.println(desertIslandPlaylist);
		
		// printing playlist size
		System.out.println(desertIslandPlaylist.size());

		// remove songs to 5
		desertIslandPlaylist.remove("Creed of Chaos");

		// printing playlist
		System.out.println(desertIslandPlaylist);

		// switching the order of two songs
		int a = desertIslandPlaylist.indexOf("M4 Pt II");
		int b = desertIslandPlaylist.indexOf("Miss Summer");
		String tempA = "M4 Pt II";
		String tempB = "Miss Summer";
		desertIslandPlaylist.set(a, tempB);
		desertIslandPlaylist.set(b, tempA);

		// printing playlist
		System.out.println(desertIslandPlaylist);

	}
}

