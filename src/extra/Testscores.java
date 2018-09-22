package extra;

import javax.swing.JOptionPane;

public class Testscores {
public static void main(String[] args) {
	Float score = Float.parseFloat(JOptionPane.showInputDialog("What is your test score?"));
	if(score>70&&score<80){
		JOptionPane.showMessageDialog(null, "you got a C");
	}else if(score>79&&score<90) {
		JOptionPane.showMessageDialog(null, "you got a B");
	}else if(score<70&&score>60) {
		JOptionPane.showMessageDialog(null,"you got a D");
	}else if(score<60) {
		JOptionPane.showMessageDialog(null, "you failed");
	}else if(score>89) {
		JOptionPane.showMessageDialog(null, "you got an A");
	}
}
}
