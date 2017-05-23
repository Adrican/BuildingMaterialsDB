package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import Controler.Cotroler;
import Model.Conexion2Oracle;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class SignIn extends JFrame {

	private JPanel contentPane2;
	private Login frmLog;
	private Mantenimiento mant;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField nick;
	private JTextField email;
	private JPasswordField psdPass;
	private JPasswordField passConfirm;
	private JCheckBox chckbxConfirm;
	private Cotroler control;
	private Conexion2Oracle model;
	private JLabel lblObClave2;
	private JLabel lblObClave;
	private JLabel lblObCorreo;
	private JLabel lblObNick;
	private JLabel lblObCon;
	private String desiguales="Estos campos no son iguales";
	private String vacios="Estos campos no puedan estar vacios";

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SignIn() {
		setResizable(false);
		setTitle("Materiales de Construcci\u00F3n");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas\\Downloads\\FAVICON.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 421);
		contentPane2 = new JPanel();
		contentPane2.setBackground(SystemColor.activeCaption);
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane2);

		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setBounds(446, 344, 131, 25);
		btnCancel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ocultarAlertas();
				frmLog.setVisible(true);
				setVisible(false);
				cleanTestField();
			}
		});

		chckbxConfirm = new JCheckBox("Acepto las condiciones de uso(*)");
		chckbxConfirm.setBounds(37, 316, 313, 25);
		chckbxConfirm.setBackground(SystemColor.activeCaption);
		chckbxConfirm.setFont(new Font("Trebuchet MS", Font.BOLD, 13));

		JButton btnRegister = new JButton("Registrar");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setBounds(223, 344, 127, 25);

		btnRegister.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnRegister.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				ocultarAlertas();
				if (chckbxConfirm.isSelected()) {
					if (isSignInCompleated(nick.getText(), new String(psdPass.getPassword()),
							new String(passConfirm.getPassword()), email.getText())) {
						if (control.isSignIn(nick.getText(), new String(psdPass.getPassword()), email.getText())) {
							mant.setVisible(true);
							setVisible(false);
							cleanTestField();
						}
					}

				} else {
					lblObCon.setVisible(true);

				}
			}
		});

		JLabel lblCondicionesDeUso = new JLabel("Condiciones de uso");
		lblCondicionesDeUso.setBounds(37, 262, 272, 45);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(54, 29, 112, 16);

		textField = new JTextField();
		textField.setBounds(209, 26, 139, 22);
		textField.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(54, 69, 112, 16);

		textField_1 = new JTextField();
		textField_1.setBounds(209, 66, 139, 22);
		textField_1.setColumns(10);

		JLabel lblNick = new JLabel("Nick(*)");
		lblNick.setBounds(54, 112, 41, 16);

		nick = new JTextField();
		nick.setBounds(209, 106, 139, 22);
		nick.setColumns(10);

		JLabel lblCorreo = new JLabel("Correo(*)");
		lblCorreo.setBounds(54, 152, 57, 16);

		email = new JTextField();
		email.setBounds(209, 146, 139, 22);
		email.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a(*)");
		lblContrasea.setBounds(54, 189, 83, 16);

		psdPass = new JPasswordField();
		psdPass.setBounds(209, 186, 139, 22);
		psdPass.setColumns(10);

		JLabel lblRepetirContrasea = new JLabel("Repetir Contrase\u00F1a(*)");
		lblRepetirContrasea.setBounds(54, 225, 128, 16);

		passConfirm = new JPasswordField();
		passConfirm.setBounds(209, 222, 141, 22);
		passConfirm.setColumns(10);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(446, 208, 0, 0);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adri\\Desktop\\UniversidadEuropeaDeMadrid.jpg"));
		contentPane2.setLayout(null);
		contentPane2.add(lblNombre);
		contentPane2.add(lblApellido);
		contentPane2.add(lblNick);
		contentPane2.add(lblCorreo);
		contentPane2.add(lblContrasea);
		contentPane2.add(lblRepetirContrasea);
		contentPane2.add(passConfirm);
		contentPane2.add(textField);
		contentPane2.add(nick);
		contentPane2.add(textField_1);
		contentPane2.add(email);
		contentPane2.add(psdPass);
		contentPane2.add(lblCondicionesDeUso);
		contentPane2.add(btnRegister);
		contentPane2.add(btnCancel);
		contentPane2.add(lblNewLabel);
		contentPane2.add(chckbxConfirm);

		lblObNick =  new JLabel("Este campo es obligatorio");
		lblObNick.setVisible(false);
		lblObNick.setForeground(Color.RED);
		lblObNick.setBounds(363, 111, 189, 14);
		contentPane2.add(lblObNick);

		lblObCorreo = new JLabel("El email no es válido");
		lblObCorreo.setVisible(false);
		lblObCorreo.setForeground(Color.RED);
		lblObCorreo.setBounds(363, 153, 214, 14);
		contentPane2.add(lblObCorreo);

		lblObClave = new JLabel(vacios);
		lblObClave.setVisible(false);
		lblObClave.setForeground(Color.RED);
		lblObClave.setBounds(363, 190, 228, 14);
		contentPane2.add(lblObClave);

		lblObClave2 = new JLabel(vacios);
		lblObClave2.setVisible(false);
		lblObClave2.setForeground(Color.RED);
		lblObClave2.setBounds(360, 226, 231, 14);
		contentPane2.add(lblObClave2);

		lblObCon = new JLabel("Tienes que aceptar las condiciones");
		lblObCon.setForeground(Color.RED);
		lblObCon.setVisible(false);
		lblObCon.setBounds(10, 350, 203, 14);
		contentPane2.add(lblObCon);
	}

	/**
	 * set log
	 * 
	 * @param frmLog
	 */
	public void setfrmLogin(Login frmLog) {
		this.frmLog = frmLog;
	}

	/**
	 * set mant
	 * 
	 * @param mant
	 */
	public void setMenuManagement(Mantenimiento mant) {
		this.mant = mant;
	}

	/**
	 * This method check if the passwords of the content signIn are the same and
	 * if email is correct
	 */
	public boolean isSignInCompleated(String nick, String pass1, String pass2, String email) {
		if (isNick(nick) && isEmail(email) && isPassword(pass1, pass2)) {
			if(isNameNotRegisted(nick)){
				lblObCon.setVisible(false);
				lblObNick.setVisible(false);
				lblObCorreo.setVisible(false);
				lblObClave.setVisible(false);
				lblObClave2.setVisible(false);
				return true;
			}
			return false;
		}

		return false;
	}
/**
 * method to control if nick is not empy
 * @param nick
 * @return
 */
	public boolean isNick(String nick) {
		if (nick.isEmpty()) {
			lblObNick.setVisible(true);
			return false;
		}
		return true;

	}
	public boolean isNameNotRegisted(String nick){
		if (control.isUserAsiged(nick)) {
			JOptionPane.showMessageDialog(null, "Usuario ya existe", null, JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	}

	/**
	 * Method to check to String that are the same
	 */
	public boolean isPassword(String pass, String pass2) {
		if (pass.equals(pass2)) {
			if (pass.isEmpty()) {
				lblObClave.setText(vacios);
				lblObClave2.setText(vacios);
				lblObClave.setVisible(true);
				lblObClave2.setVisible(true);
				return false;
			} else {
				return true;
			}
		}
		lblObClave.setText(desiguales);
		lblObClave2.setText(desiguales);
		lblObClave.setVisible(true);
		lblObClave2.setVisible(true);
		return false;
	}

	/**
	 * Method to check the email
	 */
	public boolean isEmail(String email) {
		char a = '@';// variable de busqueda @
		char dop = '.';// variable de busqueda .
		char charEmail;// variable que almacena los char de email
		int checkinga = 0;// variable de comprobacion de @
		int checkingdop = 0;// Variable de comprobacion de .
		for (int i = 0; i < email.length(); i++) {
			charEmail = email.charAt(i);
			if (charEmail == a) {// busqueda de @
				checkinga++;
			} else if (charEmail == dop) {// buqueda de .
				checkingdop++;
			}
		}
		if (checkinga == 1) {// si @=1
			if (checkingdop > 0) {// si .>1

				return true;
			}
			lblObCorreo.setVisible(true);
			return false;
		}
		lblObCorreo.setVisible(true);
		return false;

	}

	/**
	 * Method to make a the conexion
	 * 
	 * @param conex
	 */
	public void setControler(Cotroler conex) {
		control = conex;
	}
 	public void setConection(Conexion2Oracle conect) {
 		model = conect;
 	}

	/**
	 * Method to clean the alert
	 */
	public void ocultarAlertas() {
		lblObNick.setVisible(false);
		lblObCorreo.setVisible(false);
		lblObClave.setVisible(false);
		lblObClave2.setVisible(false);
		lblObCon.setVisible(false);
	}

	/**
	 * Method to clean the TestField
	 */
	public void cleanTestField() {
		textField.setText("");
		textField_1.setText("");
		nick.setText("");
		email.setText("");
		psdPass.setText("");
		passConfirm.setText("");
		chckbxConfirm.setSelected(false);
	}
}