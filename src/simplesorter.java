 import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

public class simplesorter {
public static void main(String[] args) {
	/*int []arr=new int[3];
	for(int i=0;i<arr.length;i++) {
	   String number = JOptionPane.showInputDialog("Number");
	   arr[i] = Integer.parseInt(number);
	   System.out.println(arr[i]);
	}
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) { 
		System.out.println(arr[i]);
	}
	for(int i=arr.length-1;i>=0;i--) { 
		System.out.println(arr[i]);
	}*/
	int a = Integer.parseInt(JOptionPane.showInputDialog("Number"));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Number"));
	int c = Integer.parseInt(JOptionPane.showInputDialog("Number"));
	
	System.out.println(a+"  "+b+"  "+c);
	if(b>c) {
		int h;
		h=c;
		c=b;
		b=h;
		System.out.println(a+"  "+b+"  "+c);
	}
	if(a>b) {
		int h;
		h=b;
		b=a;
		a=h;
		System.out.println(a+"  "+b+"  "+c);
	}
	
	
}
}
