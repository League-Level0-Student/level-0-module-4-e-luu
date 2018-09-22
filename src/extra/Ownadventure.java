package extra;

import javax.swing.JOptionPane;

public class Ownadventure {
	public static void main(String[] args) {
		int choice = JOptionPane.showOptionDialog(null,
				"You are going by a hike by yourself. Where do you want to hike to?", "Where to hike", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "waterfall", "mountain peak" }, null);
		if (choice == 0) {
			int shoes = JOptionPane.showOptionDialog(null, "Great choice! But did you bring your hiking shoes?",
					"Are you prepared?", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "yes", "no, I forgot" }, null);

			if (shoes == 0) {
				int z = JOptionPane.showOptionDialog(null, "Good job! The path was very muddy from the rain last week. "
						+ "Your hiking shoes saved you from falling! You almost made it to the top. Would you like to go swimming?",
						"swim or no swim", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "yes", "no" },
						null);
				if (z == 0) {
					JOptionPane.showMessageDialog(null,
							"You had lots of fun swimming in the waterfall with your new friends and made it back home safely");
				}
				if (z == 1) {
					JOptionPane.showMessageDialog(null,
							"you watched other people swim in the waterfall and you felt left out but you still had fun.");
				}
			}
			if (shoes == 1) {
				JOptionPane.showMessageDialog(null,
						"The path was muddy because of the rain last week. You slipped and got a sprained ankle and had to go back home.");
			}
		}
		if (choice == 1) {
			int friends = JOptionPane.showOptionDialog(null,
					"Cool! There are some nice looking people on the trail. Do you want to introduce yourself?",
					"lets make friends", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "of course", "no." },
					null);
			if (friends == 0) {
				int hang = JOptionPane.showOptionDialog(null,
						"The people you said hi to are now your best friends. Do you want to plan a get together soon?",
						"hangout??", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "yes", "no" }, null);
				if (hang == 0) {
					JOptionPane.showMessageDialog(null,
							"Your new friends want to hangout with you again. Together, you complete the hike and have lots of fun.");
				}
				if (hang == 1) {
					JOptionPane.showMessageDialog(null,
							"You and your friends have lots of fun but, you never see them again because you didn't want to hangout with them.");
				}
			}
			if (friends == 1) {
				JOptionPane.showMessageDialog(null,
						"When you get to the top of the moutain, you see the people you saw before having fun and wished you said hi. Too bad you didn't");
			}
		}

	}
}
