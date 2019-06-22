import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JFormattedTextField;

/**
 * Sample_OracleApp
 * 
 */
public class Sample_OracleApp extends JFrame {

	// ======= Member Variable =======

	// ----- Container -----

	private Container con = null;
	private JScrollPane scrollPane = null;
	private JPanel panel = null;
	private JPanel panel_SwingComponents = null;
	private JPanel panel_SwingComponents_1;
	private JPanel panel_AwtComponents = null;
	private GridBagLayout gbl_panel_SwingComponents = null;

	// ----- JButton Sample -----

	private JLabel lbl_JButton = null;
	private JButton btn_JButton = null;
	private JLabel lbl_JButtonValue = null;

	private GridBagConstraints gbc_lbl_JButton = null;
	private GridBagConstraints gbc_btn_JButton = null;
	private GridBagConstraints gbc_lbl_JButtonValue = null;

	// ----- JTextField -----

	private JLabel lbl_JTextField = null;
	private JTextField textField = null;
	private JLabel lbl_JTextFieldValue = null;

	private GridBagConstraints gbc_lbl_JTextField = null;
	private GridBagConstraints gbc_textField = null;
	private GridBagConstraints gbc_lbl_JTextFieldValue = null;

	// ----- JCheckBox -----

	private JLabel lbl_CheckBox = null;
	private JCheckBox chckbxCheckBox = null;
	private JLabel lbl_JCheckBoxValue = null;

	private GridBagConstraints gbc_lbl_JCheckbox = null;
	private GridBagConstraints gbc_chckbxCheckBox = null;
	private GridBagConstraints gbc_lbl_JCheckBoxValue = null;

	// ----- JRadioButton -----

	private JLabel lbl_JRadioButton = null;
	private ButtonGroup btnGroup = null;
	private JRadioButton rdbtnRadioButton_1 = null;
	private JRadioButton rdbtnRadioButton_2 = null;
	private JRadioButton rdbtnRadioButton_3 = null;
	private JLabel lbl_JRadioButtonValue_1 = null;
	private JLabel lbl_JRadioButtonValue_2 = null;
	private JLabel lbl_JRadioButtonValue_3 = null;

	private GridBagConstraints gbc_lbl_JRadioButton = null;
	private GridBagConstraints gbc_rdbtnRadioButton_1 = null;
	private GridBagConstraints gbc_rdbtnRadioButton_2 = null;
	private GridBagConstraints gbc_rdbtnRadioButton_3 = null;
	private GridBagConstraints gbc_lbl_JRadioButtonValue_1 = null;
	private GridBagConstraints gbc_lbl_JRadioButtonValue_2 = null;
	private GridBagConstraints gbc_lbl_JRadioButtonValue_3 = null;

	// ----- JToggleButton -----

	private JLabel lbl_Jtogglebutton = null;
	private JToggleButton tglbtnJToggleButton = null;
	private JLabel lbl_JToggleButtonValue = null;

	private GridBagConstraints gbc_lbl_Jtogglebutton = null;
	private GridBagConstraints gbc_tglbtnJToggleButton = null;
	private GridBagConstraints gbc_lbl_JToggleButtonValue = null;
	
	
	//----- JTextArea -----
	
	private JLabel lblJTextArea = null;
	private JTextArea textArea = null;
	private JLabel lblJTextAreaValue = null;
	
	private GridBagConstraints gbc_lblJTextArea = null;
	private GridBagConstraints gbc_textArea = null;
	private GridBagConstraints gbc_lblJTextAreaValue = null;

	/**
	 * Sample_OracleApp
	 * 
	 */
	public Sample_OracleApp() {

		super();

		// ======= Prepare Container =======

		// ----- Set Container -----

		con = this.getContentPane();
		scrollPane = new JScrollPane();
		panel = new JPanel();
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// ----- Set Panel -----

		panel_SwingComponents_1 = new JPanel();
		panel_SwingComponents_1.setBorder(
				new TitledBorder(null, "Swing Components", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		gbl_panel_SwingComponents = new GridBagLayout();
		gbl_panel_SwingComponents.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0 };
		gbl_panel_SwingComponents.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0 };
		panel_SwingComponents_1.setLayout(gbl_panel_SwingComponents);

		// ======= Prepare Swing Components =======

		setJButtonComponents();
		setJTextFieldComponents();
		setJCheckBoxComponents();
		setJRadioButtonComponents();
		setJToggleButtonComponents();
		setJTextAreaComponents();

		// ======= Prepare AWT Components =======

		panel_AwtComponents = new JPanel();
		panel_AwtComponents.setBorder(
				new TitledBorder(null, "AWT Components", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		// ======= Place Panels onto container =======

		panel.add(panel_SwingComponents_1);
		panel.add(panel_AwtComponents);
		scrollPane.setViewportView(panel);
		con.add(scrollPane);

		// ======= Window Setting =======

		this.setTitle("Sample_SwingApp");
		this.setSize(800, 600);
		this.setVisible(true);
	}

	/**
	 * setJTextAreaComponents
	 * 
	 */
	private void setJTextAreaComponents() {

		
		// ----- 3rd Line / 4th Row -----

		lblJTextArea = new JLabel("JTextArea");
		gbc_lblJTextArea = new GridBagConstraints();
		gbc_lblJTextArea.insets = new Insets(0, 0, 5, 5);
		gbc_lblJTextArea.gridx = 6;
		gbc_lblJTextArea.gridy = 2;
		panel_SwingComponents_1.add(lblJTextArea, gbc_lblJTextArea);

		
		// ----- 3rd Line / 5th Row -----

		textArea = new JTextArea();		
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String value = textArea.getText();
				lblJTextAreaValue.setText(value);
			}
		});
		gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 7;
		gbc_textArea.gridy = 2;
		panel_SwingComponents_1.add(textArea, gbc_textArea);

		// ----- 3rd Line / 6th Row -----

		lblJTextAreaValue = new JLabel("");
		gbc_lblJTextAreaValue = new GridBagConstraints();
		gbc_lblJTextAreaValue.insets = new Insets(0, 0, 5, 5);
		gbc_lblJTextAreaValue.gridx = 8;
		gbc_lblJTextAreaValue.gridy = 2;
		panel_SwingComponents_1.add(lblJTextAreaValue, gbc_lblJTextAreaValue);
	}

	/**
	 * setJToggleButtonComponents
	 * 
	 */
	private void setJToggleButtonComponents() {

		// ----- 2nd Line / 4th Row -----

		lbl_Jtogglebutton = new JLabel("JToggleButton");
		gbc_lbl_Jtogglebutton = new GridBagConstraints();
		gbc_lbl_Jtogglebutton.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Jtogglebutton.gridx = 6;
		gbc_lbl_Jtogglebutton.gridy = 1;
		panel_SwingComponents_1.add(lbl_Jtogglebutton, gbc_lbl_Jtogglebutton);

		// ----- 2nd Line / 5th Row -----
		tglbtnJToggleButton = new JToggleButton("JToggleButton");
		gbc_tglbtnJToggleButton = new GridBagConstraints();
		gbc_tglbtnJToggleButton.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnJToggleButton.gridx = 7;
		gbc_tglbtnJToggleButton.gridy = 1;
		panel_SwingComponents_1.add(tglbtnJToggleButton, gbc_tglbtnJToggleButton);

		// ----- 2nd Line / 6th Row -----
		lbl_JToggleButtonValue = new JLabel("");
		gbc_lbl_JToggleButtonValue = new GridBagConstraints();
		gbc_lbl_JToggleButtonValue.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_JToggleButtonValue.gridx = 9;
		gbc_lbl_JToggleButtonValue.gridy = 1;
		panel_SwingComponents_1.add(lbl_JToggleButtonValue, gbc_lbl_JToggleButtonValue);

		tglbtnJToggleButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Boolean value = tglbtnJToggleButton.isSelected();
				lbl_JToggleButtonValue.setText(String.valueOf(value));
			}
		});

	}

	/**
	 * setJRadioButtonComponents
	 * 
	 */
	private void setJRadioButtonComponents() {

		btnGroup = new ButtonGroup();

		// ----- 3rd-5th Line / 1st Row -----

		lbl_JRadioButton = new JLabel("JRadioButton");
		gbc_lbl_JRadioButton = new GridBagConstraints();
		gbc_lbl_JRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JRadioButton.gridx = 0;
		gbc_lbl_JRadioButton.gridy = 2;
		panel_SwingComponents_1.add(lbl_JRadioButton, gbc_lbl_JRadioButton);

		// ----- 3rd-5th Line / 2nd Row -----

		rdbtnRadioButton_1 = new JRadioButton("JRadioButton#1");
		btnGroup.add(rdbtnRadioButton_1);
		gbc_rdbtnRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnRadioButton_1.gridx = 1;
		gbc_rdbtnRadioButton_1.gridy = 2;
		panel_SwingComponents_1.add(rdbtnRadioButton_1, gbc_rdbtnRadioButton_1);

		rdbtnRadioButton_2 = new JRadioButton("JRadioButton#2");
		btnGroup.add(rdbtnRadioButton_2);
		gbc_rdbtnRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnRadioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnRadioButton_2.gridx = 1;
		gbc_rdbtnRadioButton_2.gridy = 3;
		panel_SwingComponents_1.add(rdbtnRadioButton_2, gbc_rdbtnRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 6;
		gbc_lblNewLabel.gridy = 3;
		panel_SwingComponents_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 7;
		gbc_formattedTextField.gridy = 3;
		panel_SwingComponents_1.add(formattedTextField, gbc_formattedTextField);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 8;
		gbc_lblNewLabel_1.gridy = 3;
		panel_SwingComponents_1.add(lblNewLabel_1, gbc_lblNewLabel_1);

		rdbtnRadioButton_3 = new JRadioButton("JRadioButton#3");
		btnGroup.add(rdbtnRadioButton_3);
		gbc_rdbtnRadioButton_3 = new GridBagConstraints();
		gbc_rdbtnRadioButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnRadioButton_3.gridx = 1;
		gbc_rdbtnRadioButton_3.gridy = 4;
		panel_SwingComponents_1.add(rdbtnRadioButton_3, gbc_rdbtnRadioButton_3);

		// ----- 3rd-5th Line / 3rd Row -----

		lbl_JRadioButtonValue_1 = new JLabel("");
		gbc_lbl_JRadioButtonValue_1 = new GridBagConstraints();
		gbc_lbl_JRadioButtonValue_1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JRadioButtonValue_1.gridx = 3;
		gbc_lbl_JRadioButtonValue_1.gridy = 2;
		panel_SwingComponents_1.add(lbl_JRadioButtonValue_1, gbc_lbl_JRadioButtonValue_1);

		rdbtnRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Boolean value = rdbtnRadioButton_1.isSelected();
				lbl_JRadioButtonValue_1.setText(String.valueOf(value));
			}
		});

		lbl_JRadioButtonValue_2 = new JLabel("");
		gbc_lbl_JRadioButtonValue_2 = new GridBagConstraints();
		gbc_lbl_JRadioButtonValue_2.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JRadioButtonValue_2.gridx = 3;
		gbc_lbl_JRadioButtonValue_2.gridy = 3;
		panel_SwingComponents_1.add(lbl_JRadioButtonValue_2, gbc_lbl_JRadioButtonValue_2);

		rdbtnRadioButton_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Boolean value = rdbtnRadioButton_2.isSelected();
				lbl_JRadioButtonValue_2.setText(String.valueOf(value));
			}
		});

		lbl_JRadioButtonValue_3 = new JLabel("");
		gbc_lbl_JRadioButtonValue_3 = new GridBagConstraints();
		gbc_lbl_JRadioButtonValue_3.insets = new Insets(0, 0, 0, 5);
		gbc_lbl_JRadioButtonValue_3.gridx = 3;
		gbc_lbl_JRadioButtonValue_3.gridy = 4;
		panel_SwingComponents_1.add(lbl_JRadioButtonValue_3, gbc_lbl_JRadioButtonValue_3);

		rdbtnRadioButton_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Boolean value = rdbtnRadioButton_3.isSelected();
				lbl_JRadioButtonValue_3.setText(String.valueOf(value));
			}
		});
	}

	/**
	 * setJCheckBoxComponents
	 * 
	 */
	private void setJCheckBoxComponents() {
		// ----- 2nd Line / 1st Row -----

		lbl_CheckBox = new JLabel("JCheckBox");
		gbc_lbl_JCheckbox = new GridBagConstraints();
		gbc_lbl_JCheckbox.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JCheckbox.gridx = 0;
		gbc_lbl_JCheckbox.gridy = 1;
		panel_SwingComponents_1.add(lbl_CheckBox, gbc_lbl_JCheckbox);

		// ----- 2nd Line / 2nd Row -----

		chckbxCheckBox = new JCheckBox("CheckBox");
		gbc_chckbxCheckBox = new GridBagConstraints();
		gbc_chckbxCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxCheckBox.gridx = 1;
		gbc_chckbxCheckBox.gridy = 1;
		panel_SwingComponents_1.add(chckbxCheckBox, gbc_chckbxCheckBox);

		// ----- 2nd Line / 3rd Row -----

		lbl_JCheckBoxValue = new JLabel("False");
		gbc_lbl_JCheckBoxValue = new GridBagConstraints();
		gbc_lbl_JCheckBoxValue.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JCheckBoxValue.gridx = 3;
		gbc_lbl_JCheckBoxValue.gridy = 1;
		panel_SwingComponents_1.add(lbl_JCheckBoxValue, gbc_lbl_JCheckBoxValue);

		chckbxCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {

				Boolean value = chckbxCheckBox.isSelected();
				lbl_JCheckBoxValue.setText(String.valueOf(value));
			}
		});
	}

	/**
	 * setJTextFieldComponents
	 * 
	 */
	private void setJTextFieldComponents() {

		// ----- 1st Line / 4th Row -----

		lbl_JTextField = new JLabel("JTextField");
		gbc_lbl_JTextField = new GridBagConstraints();
		gbc_lbl_JTextField.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JTextField.gridx = 6;
		gbc_lbl_JTextField.gridy = 0;
		panel_SwingComponents_1.add(lbl_JTextField, gbc_lbl_JTextField);

		// ----- 1st Line / 5th Row -----

		textField = new JTextField();
		textField.setColumns(10);
		gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 7;
		gbc_textField.gridy = 0;
		panel_SwingComponents_1.add(textField, gbc_textField);

		// ----- 1st Line / 6th Row -----

		lbl_JTextFieldValue = new JLabel("");
		gbc_lbl_JTextFieldValue = new GridBagConstraints();
		gbc_lbl_JTextFieldValue.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_JTextFieldValue.gridx = 9;
		gbc_lbl_JTextFieldValue.gridy = 0;
		panel_SwingComponents_1.add(lbl_JTextFieldValue, gbc_lbl_JTextFieldValue);

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {

				String value = textField.getText();
				lbl_JTextFieldValue.setText(value);
			}
		});
	}

	/**
	 * SetJButtonComponents
	 * 
	 */
	private void setJButtonComponents() {

		// ----- 1st Line / 1st Row -----

		lbl_JButton = new JLabel("JButton");
		gbc_lbl_JButton = new GridBagConstraints();
		gbc_lbl_JButton.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JButton.gridx = 0;
		gbc_lbl_JButton.gridy = 0;
		panel_SwingComponents_1.add(lbl_JButton, gbc_lbl_JButton);

		// ----- 1st Line / 2nd Row -----

		btn_JButton = new JButton("Button");

		gbc_btn_JButton = new GridBagConstraints();
		gbc_btn_JButton.insets = new Insets(0, 0, 5, 5);
		gbc_btn_JButton.gridx = 1;
		gbc_btn_JButton.gridy = 0;
		panel_SwingComponents_1.add(btn_JButton, gbc_btn_JButton);

		// ----- 1st Line / 3rd Row -----

		lbl_JButtonValue = new JLabel("0");
		gbc_lbl_JButtonValue = new GridBagConstraints();
		gbc_lbl_JButtonValue.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_JButtonValue.gridx = 3;
		gbc_lbl_JButtonValue.gridy = 0;
		panel_SwingComponents_1.add(lbl_JButtonValue, gbc_lbl_JButtonValue);

		btn_JButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Integer value = Integer.parseInt(lbl_JButtonValue.getText());
				lbl_JButtonValue.setText(String.valueOf(value + 1));
			}
		});

	}

	/**
	 * main
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample_OracleApp myApp = new Sample_OracleApp();

	}

}
