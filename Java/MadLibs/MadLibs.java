public class MadLibs {
	/*
	 * This program generates a mad libbed story. Author: Thomas Date: 11/07/2021
	 */
	public static void main(String[] args) {

		// Variables declarations and assignments
		String name1 = "Micky";
		String adjective1 = "energetic";
		String adjective2 = "popular";
		String adjective3 = "funny";
		String verb1 = "dance";
		String noun1 = "cat";
		String noun2 = "dog";
		String noun3 = "computer";
		String noun4 = "car";
		String noun5 = "gym";
		String noun6 = "plane";
		String name2 = "Kimi";
		int number = 42;
		String place1 = "Mars";

		// The template for the story
		String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
				+ adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep "
				+ noun2 + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3
				+ ", which made all the " + noun4 + "s very " + adjective3 + ". Concerned, " + name1
				+ " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1
				+ " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number
				+ ", in a world where " + noun6 + "s ruled the world.";

		// Output of the story on the terminal
		System.out.println(story);

	}
}
