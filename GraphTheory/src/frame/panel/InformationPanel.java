package frame.panel;

import javax.swing.JPanel;

import object.Node;

import javax.swing.JLabel;

public class InformationPanel extends JPanel {
	private JLabel posXlbl;
	private JLabel posYlbl;
	public InformationPanel() {
		setLayout(null);
		
		posXlbl = new JLabel("x: ");
		posXlbl.setBounds(10, 11, 173, 14);
		add(posXlbl);
		
		posYlbl = new JLabel("y: ");
		posYlbl.setBounds(10, 36, 173, 14);
		add(posYlbl);
		
	}

	public void update(Node nodeTemp) {
		posXlbl.setText("x: " + nodeTemp.getPostion().getX());
		posYlbl.setText("y: " + nodeTemp.getPostion().getY());
	}
}