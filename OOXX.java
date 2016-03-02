package work;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class OOXX {
	void game() {
		frm.setLayout(null);
		frm.setBounds(100,100,240,260);
		frm.setResizable(false);
		pn1.setBounds(20,50,200,180);
		for(int i=9;i>=1;i--){
			digits[i]=new Button();
			pn1.add(digits[i]);
			digits[i].addActionListener(new ActLis());
		}
		frm.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						}
					});
		frm.add(pn1);
		frm.setVisible(true);
	}
	private static Frame frm=new Frame("U10416015");
	private static Panel pn1=new Panel(new GridLayout(3,3));
	private static Button digits[]=new Button[10];
	public static void main(String args[]) {
		frm.setLayout(null);
		frm.setBounds(100,100,240,260);
		frm.setResizable(false);
		pn1.setBounds(20,50,200,180);
		for(int i=9;i>=1;i--){
			digits[i]=new Button();
			pn1.add(digits[i]);
			digits[i].addActionListener(new ActLis());
		}
		frm.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
						}
					});
		frm.add(pn1);
		frm.setVisible(true);
	}
	public static class ActLis implements ActionListener {
		public void actionPerformed(ActionEvent e)throws NumberFormatException,ArithmeticException {
			Button btn=(Button) e.getSource();
			try{
				for(int i=1;i<=9;i++){
					if(btn==digits[i]){
						if(btn.getLabel()=="O"||btn.getLabel()=="X") {
							JOptionPane.showMessageDialog(null, "�����U�o��", "Oops", JOptionPane.PLAIN_MESSAGE );
							break;
						}
						digits[i].setLabel("O");
						if(digits[1].getLabel()=="O"&&digits[2].getLabel()=="O"&&digits[3].getLabel()=="O"||
								digits[1].getLabel()=="O"&&digits[5].getLabel()=="O"&&digits[9].getLabel()=="O"||
								digits[1].getLabel()=="O"&&digits[4].getLabel()=="O"&&digits[7].getLabel()=="O"||
								digits[2].getLabel()=="O"&&digits[5].getLabel()=="O"&&digits[8].getLabel()=="O"||
								digits[3].getLabel()=="O"&&digits[5].getLabel()=="O"&&digits[7].getLabel()=="O"||
								digits[3].getLabel()=="O"&&digits[6].getLabel()=="O"&&digits[9].getLabel()=="O"||
								digits[4].getLabel()=="O"&&digits[5].getLabel()=="O"&&digits[6].getLabel()=="O"||
								digits[7].getLabel()=="O"&&digits[8].getLabel()=="O"&&digits[9].getLabel()=="O") {
							JOptionPane.showMessageDialog(null, "����", "You win", JOptionPane.PLAIN_MESSAGE );
							for(i=9;i>=1;i--){
								digits[i].setLabel("");
							}
							break;
						}
						else if((digits[1].getLabel()=="O"||digits[1].getLabel()=="X")&&
								(digits[2].getLabel()=="O"||digits[2].getLabel()=="X")&&
								(digits[3].getLabel()=="O"||digits[3].getLabel()=="X")&&
								(digits[4].getLabel()=="O"||digits[4].getLabel()=="X")&&
								(digits[5].getLabel()=="O"||digits[5].getLabel()=="X")&&
								(digits[6].getLabel()=="O"||digits[6].getLabel()=="X")&&
								(digits[7].getLabel()=="O"||digits[7].getLabel()=="X")&&
								(digits[8].getLabel()=="O"||digits[8].getLabel()=="X")&&
								(digits[9].getLabel()=="O"||digits[9].getLabel()=="X")) {
							JOptionPane.showMessageDialog(null, "����", "Not bad", JOptionPane.PLAIN_MESSAGE );
							for(i=9;i>=1;i--){
								digits[i].setLabel("");
							}
							break;
						}
						XX(digits);
						if(digits[1].getLabel()=="X"&&digits[2].getLabel()=="X"&&digits[3].getLabel()=="X"||
								digits[1].getLabel()=="X"&&digits[5].getLabel()=="X"&&digits[9].getLabel()=="X"||
								digits[1].getLabel()=="X"&&digits[4].getLabel()=="X"&&digits[7].getLabel()=="X"||
								digits[2].getLabel()=="X"&&digits[5].getLabel()=="X"&&digits[8].getLabel()=="X"||
								digits[3].getLabel()=="X"&&digits[5].getLabel()=="X"&&digits[7].getLabel()=="X"||
								digits[3].getLabel()=="X"&&digits[6].getLabel()=="X"&&digits[9].getLabel()=="X"||
								digits[4].getLabel()=="X"&&digits[5].getLabel()=="X"&&digits[6].getLabel()=="X"||
								digits[7].getLabel()=="X"&&digits[8].getLabel()=="X"&&digits[9].getLabel()=="X") {
							JOptionPane.showMessageDialog(null, "����", "You lose", JOptionPane.PLAIN_MESSAGE );
							for(i=9;i>=1;i--){
								digits[i].setLabel("");
							}
							break;
						}
					}
				}
			}
			catch(NumberFormatException ne) {
			}
		}
	}
	static void XX(Button digits[]) {
		while(true) {
			if(digits[1].getLabel()=="X"&&digits[2].getLabel()=="X"&&(digits[3].getLabel()!="X"&&digits[3].getLabel()!="O")) {
				digits[3].setLabel("X");break;
			}
			if(digits[1].getLabel()=="X"&&digits[3].getLabel()=="X"&&(digits[2].getLabel()!="X"&&digits[2].getLabel()!="O")) {
				digits[2].setLabel("X");break;
			}
			if(digits[2].getLabel()=="X"&&digits[3].getLabel()=="X"&&(digits[1].getLabel()!="X"&&digits[1].getLabel()!="O")) {
				digits[1].setLabel("X");break;
			}
			if(digits[1].getLabel()=="X"&&digits[5].getLabel()=="X"&&(digits[9].getLabel()!="X"&&digits[9].getLabel()!="O")) {
				digits[9].setLabel("X");break;
			}
			if(digits[1].getLabel()=="X"&&digits[9].getLabel()=="X"&&(digits[5].getLabel()!="X"&&digits[5].getLabel()!="O")) {
				digits[5].setLabel("X");break;
			}
			if(digits[5].getLabel()=="X"&&digits[9].getLabel()=="X"&&(digits[1].getLabel()!="X"&&digits[1].getLabel()!="O")) {
				digits[1].setLabel("X");break;
			}
			if(digits[1].getLabel()=="X"&&digits[4].getLabel()=="X"&&(digits[7].getLabel()!="X"&&digits[7].getLabel()!="O")) {
				digits[7].setLabel("X");break;
			}
			if(digits[1].getLabel()=="X"&&digits[7].getLabel()=="X"&&(digits[4].getLabel()!="X"&&digits[4].getLabel()!="O")) {
				digits[4].setLabel("X");break;
			}
			if(digits[4].getLabel()=="X"&&digits[7].getLabel()=="X"&&(digits[1].getLabel()!="X"&&digits[1].getLabel()!="O")) {
				digits[1].setLabel("X");break;
			}
			if(digits[2].getLabel()=="X"&&digits[5].getLabel()=="X"&&(digits[8].getLabel()!="X"&&digits[8].getLabel()!="O")) {
				digits[8].setLabel("X");break;
			}
			if(digits[2].getLabel()=="X"&&digits[8].getLabel()=="X"&&(digits[5].getLabel()!="X"&&digits[5].getLabel()!="O")) {
				digits[5].setLabel("X");break;
			}
			if(digits[5].getLabel()=="X"&&digits[8].getLabel()=="X"&&(digits[2].getLabel()!="X"&&digits[2].getLabel()!="O")) {
				digits[2].setLabel("X");break;
			}
			if(digits[3].getLabel()=="X"&&digits[6].getLabel()=="X"&&(digits[9].getLabel()!="X"&&digits[9].getLabel()!="O")) {
				digits[9].setLabel("X");break;
			}
			if(digits[3].getLabel()=="X"&&digits[9].getLabel()=="X"&&(digits[6].getLabel()!="X"&&digits[6].getLabel()!="O")) {
				digits[6].setLabel("X");break;
			}
			if(digits[9].getLabel()=="X"&&digits[6].getLabel()=="X"&&(digits[3].getLabel()!="X"&&digits[3].getLabel()!="O")) {
				digits[3].setLabel("X");break;
			}
			if(digits[3].getLabel()=="X"&&digits[5].getLabel()=="X"&&(digits[7].getLabel()!="X"&&digits[7].getLabel()!="O")) {
				digits[7].setLabel("X");break;
			}
			if(digits[3].getLabel()=="X"&&digits[7].getLabel()=="X"&&(digits[5].getLabel()!="X"&&digits[5].getLabel()!="O")) {
				digits[5].setLabel("X");break;
			}
			if(digits[7].getLabel()=="X"&&digits[5].getLabel()=="X"&&(digits[3].getLabel()!="X"&&digits[3].getLabel()!="O")) {
				digits[3].setLabel("X");break;
			}
			if(digits[4].getLabel()=="X"&&digits[5].getLabel()=="X"&&(digits[6].getLabel()!="X"&&digits[6].getLabel()!="O")) {
				digits[6].setLabel("X");break;
			}
			if(digits[4].getLabel()=="X"&&digits[6].getLabel()=="X"&&(digits[5].getLabel()!="X"&&digits[5].getLabel()!="O")) {
				digits[5].setLabel("X");break;
			}
			if(digits[6].getLabel()=="X"&&digits[5].getLabel()=="X"&&(digits[4].getLabel()!="X"&&digits[4].getLabel()!="O")) {
				digits[4].setLabel("X");break;
			}
			if(digits[7].getLabel()=="X"&&digits[8].getLabel()=="X"&&(digits[9].getLabel()!="X"&&digits[9].getLabel()!="O")) {
				digits[9].setLabel("X");break;
			}
			if(digits[7].getLabel()=="X"&&digits[9].getLabel()=="X"&&(digits[8].getLabel()!="X"&&digits[8].getLabel()!="O")) {
				digits[8].setLabel("X");break;
			}
			if(digits[9].getLabel()=="X"&&digits[8].getLabel()=="X"&&(digits[7].getLabel()!="X"&&digits[7].getLabel()!="O")) {
				digits[7].setLabel("X");break;
			}
			if(digits[1].getLabel()=="O"&&digits[2].getLabel()=="O"&&(digits[3].getLabel()!="X"&&digits[3].getLabel()!="O")) {
				digits[3].setLabel("X");break;
			}
			if(digits[1].getLabel()=="O"&&digits[3].getLabel()=="O"&&(digits[2].getLabel()!="X"&&digits[2].getLabel()!="O")) {
				digits[2].setLabel("X");break;
			}
			if(digits[2].getLabel()=="O"&&digits[3].getLabel()=="O"&&(digits[1].getLabel()!="X"&&digits[1].getLabel()!="O")) {
				digits[1].setLabel("X");break;
			}
			if(digits[1].getLabel()=="O"&&digits[5].getLabel()=="O"&&(digits[9].getLabel()!="X"&&digits[9].getLabel()!="O")) {
				digits[9].setLabel("X");break;
			}
			if(digits[1].getLabel()=="O"&&digits[9].getLabel()=="O"&&(digits[5].getLabel()!="X"&&digits[5].getLabel()!="O")) {
				digits[5].setLabel("X");break;
			}
			if(digits[5].getLabel()=="O"&&digits[9].getLabel()=="O"&&(digits[1].getLabel()!="X"&&digits[1].getLabel()!="O")) {
				digits[1].setLabel("X");break;
			}
			if(digits[1].getLabel()=="O"&&digits[4].getLabel()=="O"&&(digits[7].getLabel()!="X"&&digits[7].getLabel()!="O")) {
				digits[7].setLabel("X");break;
			}
			if(digits[1].getLabel()=="O"&&digits[7].getLabel()=="O"&&(digits[4].getLabel()!="X"&&digits[4].getLabel()!="O")) {
				digits[4].setLabel("X");break;
			}
			if(digits[4].getLabel()=="O"&&digits[7].getLabel()=="O"&&(digits[1].getLabel()!="X"&&digits[1].getLabel()!="O")) {
				digits[1].setLabel("X");break;
			}
			if(digits[2].getLabel()=="O"&&digits[5].getLabel()=="O"&&(digits[8].getLabel()!="X"&&digits[8].getLabel()!="O")) {
				digits[8].setLabel("X");break;
			}
			if(digits[2].getLabel()=="O"&&digits[8].getLabel()=="O"&&(digits[5].getLabel()!="X"&&digits[5].getLabel()!="O")) {
				digits[5].setLabel("X");break;
			}
			if(digits[5].getLabel()=="O"&&digits[8].getLabel()=="O"&&(digits[2].getLabel()!="X"&&digits[2].getLabel()!="O")) {
				digits[2].setLabel("X");break;
			}
			if(digits[3].getLabel()=="O"&&digits[6].getLabel()=="O"&&(digits[9].getLabel()!="X"&&digits[9].getLabel()!="O")) {
				digits[9].setLabel("X");break;
			}
			if(digits[3].getLabel()=="O"&&digits[9].getLabel()=="O"&&(digits[6].getLabel()!="X"&&digits[6].getLabel()!="O")) {
				digits[6].setLabel("X");break;
			}
			if(digits[9].getLabel()=="O"&&digits[6].getLabel()=="O"&&(digits[3].getLabel()!="X"&&digits[3].getLabel()!="O")) {
				digits[3].setLabel("X");break;
			}
			if(digits[3].getLabel()=="O"&&digits[5].getLabel()=="O"&&(digits[7].getLabel()!="X"&&digits[7].getLabel()!="O")) {
				digits[7].setLabel("X");break;
			}
			if(digits[3].getLabel()=="O"&&digits[7].getLabel()=="O"&&(digits[5].getLabel()!="X"&&digits[5].getLabel()!="O")) {
				digits[5].setLabel("X");break;
			}
			if(digits[7].getLabel()=="O"&&digits[5].getLabel()=="O"&&(digits[3].getLabel()!="X"&&digits[3].getLabel()!="O")) {
				digits[3].setLabel("X");break;
			}
			if(digits[4].getLabel()=="O"&&digits[5].getLabel()=="O"&&(digits[6].getLabel()!="X"&&digits[6].getLabel()!="O")) {
				digits[6].setLabel("X");break;
			}
			if(digits[4].getLabel()=="O"&&digits[6].getLabel()=="O"&&(digits[5].getLabel()!="X"&&digits[5].getLabel()!="O")) {
				digits[5].setLabel("X");break;
			}
			if(digits[6].getLabel()=="O"&&digits[5].getLabel()=="O"&&(digits[4].getLabel()!="X"&&digits[4].getLabel()!="O")) {
				digits[4].setLabel("X");break;
			}
			if(digits[7].getLabel()=="O"&&digits[8].getLabel()=="O"&&(digits[9].getLabel()!="X"&&digits[9].getLabel()!="O")) {
				digits[9].setLabel("X");break;
			}
			if(digits[7].getLabel()=="O"&&digits[9].getLabel()=="O"&&(digits[8].getLabel()!="X"&&digits[8].getLabel()!="O")) {
				digits[8].setLabel("X");break;
			}
			if(digits[9].getLabel()=="O"&&digits[8].getLabel()=="O"&&(digits[7].getLabel()!="X"&&digits[7].getLabel()!="O")) {
				digits[7].setLabel("X");break;
			}
			else {
				int r=(int)(Math.random()*9+1);
				while(digits[r].getLabel()=="O"||digits[r].getLabel()=="X") {
					r=(int)(Math.random()*9+1);
				}
				digits[r].setLabel("X");
				break;
			}
		}
	}
}