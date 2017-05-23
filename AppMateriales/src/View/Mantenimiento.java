package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Controler.Cotroler;
import Model.Conexion2Oracle;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JSlider;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;

public class Mantenimiento extends JFrame {

	private Cotroler ctrl;
	private Conexion2Oracle bd;

	private Login log;
	private JTabbedPane tabbedPane;
	private JPanel Materiales;
	private JPanel Propiedades;
	private JPanel Union;
	private JPanel Dimension;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnAadirATabla;
	private JButton btnModificar;
	private JButton btnBorrar;
	private JLabel lblPropiedad;
	private JLabel lblCategora;
	private JLabel lblValor;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnAadirALista_1;
	private JButton btnBorrarDeLista;
	private JTable table;// +++
	private JTable t2;// ++
	private JTable t3;
	private JButton btnNewButton_1;
	private JLabel lblDimensiones;
	private JLabel lblFormato;
	private JLabel lblCategora_1;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton btnAadirALista_2;
	private JButton btnBorrarDeLista_1;
	private JScrollPane scrollPane_4;
	private JTable t6;
	private JButton btnAadirATabla_2;
	private JButton btnModificar_2;
	private JButton btnBorrar_2;
	private JPanel Producto;
	private JScrollPane scrollPane_7;
	private JTable t9;// ++
	private JButton btnCrearProducto;
	private JButton button_1;
	private JPanel Edificio;
	private JLabel lblEdificio;
	private JLabel lblDescripcion;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblEnlace;
	private JScrollPane scrollPane_8;
	private JTable t14;
	private JButton btnModificar_3;
	private JButton btnBorrar_3;
	private JPanel Fabricante;
	private JLabel lblFabricante;
	private JComboBox comboBox_9;
	private JTextField textField_12;
	private JComboBox comboBox_10;
	private JLabel lblReferencia;
	private JTextField textField_13;
	private JLabel lblPropiedad_1;
	private JComboBox comboBox_11;
	private JTextField textField_14;
	private JButton button_2;
	private JButton btnBorrarLista;
	private JButton button_3;
	private JButton btnModificar_5;
	private JButton btnBorrar_4;
	private JTable t10;
	private JTable t13;
	private JTextField textField_15;
	private JLabel lblTablaProducto_1;
	private JLabel lblTablaFabricante;
	private JTable t17;
	private JLabel lblTablaUso;
	private JLabel lblTablaFabrica;
	private JLabel lblTablaProducto_2;
	private JLabel lblTablaEdificio;
	private JButton btnSalir;
	private JButton btnCancel_8;
	private JTextField textField_9;
	private DefaultTableModel dtm;
	private DefaultTableModel dtm2;
	private DefaultTableModel dtm3;
	private DefaultTableModel dtm4;
	private DefaultTableModel dtm5;
	private DefaultTableModel dtm6;
	private JButton btnAadirALista;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JComboBox comboBox_2;
	private JTable t1;
	private JTextField textField_16;
	private JTable t18;
	private JButton btnModificar_4;
	private JTextPane textPane;
	private JScrollPane scrollPane_16;
	private JButton btnNewButton_2;
	private JLabel lblTitulo;
	private JLabel lblDescripcion_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JTextPane textPane_1;
	private Cotroler control;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField textField_17;
	private JButton btnCrearInfo;
	private JTextPane textPane_2;
	private JScrollPane scrollPane_17;
	private JTextPane textPane_3;
	private JButton button_8;
	private JButton button_9;
	private JLabel label;
	private JLabel lblNumeroDeInfo;
	private JPanel contentPane;
	private JLabel lblNewLabel_2;
	private JLabel lblTablaDeDimensiones;
	private JScrollPane scrollPane_18;
	private JButton button_12;
	private JButton button_13;
	private JLabel lblInfo;
	private JLabel lblTablaDeNoticias;
	private JLabel lblUsos;
	private JLabel lblFabrica;
	private JLabel lblFabricante_1;
	private JLabel lbltablaProducto;
	private JLabel lblNewLabel_3;
	private JTable t19;
	private JComboBox comboBox_5;
	private JTextArea textArea;
	private JComboBox comboBox_12;
	private JLabel label_1;
	private JLabel lblProducto;
	private JTextField textField_18;
	private JComboBox comboBox_16;
	private JComboBox comboBox_17;
	private JComboBox comboBox_18;
	private JComboBox comboBox_19;
	private JComboBox comboBox_20;
	private JTextField textField_19;
	private JComboBox comboBox_6;
	private JComboBox comboBox_13;
	private JScrollPane scrollPane_1;
	private JComboBox comboBox_14;
	private JComboBox comboBox_15;
	private JScrollPane scrollPane_2;
	private JButton button;
	private JButton button_4;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Mantenimiento() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				/* Materiales */
				limpiarTabla(t1);
				ctrl.cargarMateriales("nom_familia, nom_subfamilia, nom_material", "familia, subfamilia, material",
						"cod_Familia,cod_subfamilia,cod_subfamilia,Cod_material", (DefaultTableModel) t1.getModel());
				// /*Propieades*/
				limpiarTabla(t2);
				// Esta debe ser modificada
				ctrl.cargarMateriales("nom_prop_m,NOM_CAT_M,valor,unidad",
						"propiedad_m,CAT_PROPIEDAD_M ,TIENE_MAT_PROP",
						"PROPIEDAD_M_COD_PROP_M,cod_prop_m,cod_cat_prop_m,cod_prop_m",
						(DefaultTableModel) t2.getModel());
				/* Union */
				limpiarTabla(t3);

				ctrl.cargarMateriales("nom_prop_m,NOM_CAT_M,valor,unidad",
						"propiedad_m,CAT_PROPIEDAD_M ,TIENE_MAT_PROP",
						"PROPIEDAD_M_COD_PROP_M,cod_prop_m,cod_cat_prop_m,cod_prop_m",
						(DefaultTableModel) t3.getModel());
				

				/* Dimension */
				limpiarTabla(t6);
				ctrl.cargarMateriales("NOM_DIMENSION,NOM_CAT_FORMATO,NOM_FORMATO", "DIMENSIONES,CAT_FORMATO,fORMATO",
						"cod_dimension,cod_cat_formato,cod_cat_formato,COD_FORMATO", (DefaultTableModel) t6.getModel());
				// /*Producto*/
				limpiarTabla(t9);
				ctrl.cargarMateriales("NOM_PRODUCTO,nom_material,precio,NOM_DIMENSION", "PRODUCTO,material,dimensiones",
						"COD_PRODUCTO,COD_MATERIAL,FORMATO_COD_FORMATO,COD_PRODUCTO",
						(DefaultTableModel) t9.getModel());
				// /*Fabricante*/
				limpiarTabla(t10);
				ctrl.cargarMateriales("nom_fabricante, nom_referencia, nom_prop_ref",
						"fabricante, ref_comercial, propiedad_ref",
						"COD_FABRICANTE,COD_PROP_REF,COD_FABRICANTE,COD_REFERENCIA",
						(DefaultTableModel) t10.getModel());
				//// /*Fabrica*/

				limpiarTabla(t13);
				ctrl.cargarMateriales("nom_producto, nom_fabricante", "producto, fabricante",
						"COD_PRODUCTO,COD_FABRICANTE", (DefaultTableModel) t13.getModel());
				// /*Edificio*/
				limpiarTabla(t14);
				ctrl.cargarMateriales("nom_edificio, des_edificio,  nom_arquitecto,  localizacion_edificio",
						"edificio", "", (DefaultTableModel) t14.getModel());
				// /*Usos*/

				limpiarTabla(t17);
				ctrl.cargarMateriales("NOM_USO,nom_edificio ,nom_producto", "uso,edificio,producto",
						"COD_USO,COD_EDIFICIO,COD_EDIFICIO,COD_PRODUCTO", (DefaultTableModel) t17.getModel());
				// /*Noticia*/
				limpiarTabla(t18);
				ctrl.cargarMateriales("*", "Noticia", "", (DefaultTableModel) t18.getModel());
				// /*Info*/
				limpiarTabla(t19);
				ctrl.cargarMateriales("*", "INFO", "", (DefaultTableModel) t19.getModel());
			}
		});
		setResizable(false);
		setTitle("Materiales de construcci\u00F3n");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas\\Downloads\\FAVICON.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 640);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				t18.clearSelection();
				btnNewButton_3.setText("");
				btnNewButton_3.setText("");
				btnNewButton_3.setEnabled(false);
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE));
		dtm = new DefaultTableModel(new Object[][] { { null, null, null }, },
				new String[] { "Material", "Familia", "Subfamilia" });

		Materiales = new JPanel();
		Materiales.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Materiales", null, Materiales, null);

		comboBox = new JComboBox();
//		control.cargarComboBox("FAMILIA","NOM_FAMILIA");
//		rellenarComboBox(comboBox.getModel());
		
		comboBox.setBounds(101, 147, 116, 22);

		JLabel lblMaterial = new JLabel("Familia");
		lblMaterial.setBounds(129, 83, 41, 16);

		textField = new JTextField();
		textField.setBounds(101, 110, 116, 22);
		textField.setColumns(10);

		JLabel lblFamilia = new JLabel("Subfamilia");
		lblFamilia.setBounds(363, 83, 60, 16);

		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(328, 147, 116, 22);

		textField_1 = new JTextField();
		textField_1.setBounds(328, 110, 116, 22);
		textField_1.setColumns(10);

		JLabel lblSubfamilia = new JLabel("Material");
		lblSubfamilia.setBounds(618, 84, 46, 16);

		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(586, 147, 98, 22);

		textField_2 = new JTextField();
		textField_2.setBounds(586, 111, 98, 22);
		textField_2.setColumns(10);

		btnAadirALista = new JButton("A\u00F1adir a Lista");
		btnAadirALista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.addItem(textField.getText());
				botonInsertar(btnAadirALista, "familia", "nom_familia", textField.getText());
				comboBox_1.addItem(textField_1.getText());
				botonInsertar(btnAadirALista, "subfamilia", "nom_subfamilia", textField_1.getText());
				comboBox_2.addItem(textField_2.getText());
				botonInsertar(btnAadirALista, "material", "nom_material", textField_2.getText());
			}
		});
		btnAadirALista.setBounds(200, 176, 141, 25);

		btnNewButton = new JButton("Borrar de lista");
		btnNewButton.setBounds(450, 176, 135, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.removeItem(comboBox.getSelectedItem());
				comboBox_1.removeItem(comboBox_1.getSelectedItem());
				comboBox_2.removeItem(comboBox_2.getSelectedItem());
			}
		});

		scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 232, 660, 166);

		btnAadirATabla = new JButton("A\u00F1adir a tabla");
		btnAadirATabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				Object[] fila = { comboBox.getSelectedItem(), comboBox_1.getSelectedItem(),
//						comboBox_2.getSelectedItem() };
//				dtm.addRow(fila);
			añadirTabla(comboBox.getSelectedItem().toString(),comboBox_1.getSelectedItem().toString(),comboBox_2.getSelectedItem().toString());
			limpiarTabla(t1);
			ctrl.cargarMateriales("nom_familia, nom_subfamilia, nom_material", "familia, subfamilia, material",
					"cod_Familia,cod_subfamilia,cod_subfamilia,Cod_material", (DefaultTableModel) t1.getModel());
			}
		});
		btnAadirATabla.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnAadirATabla.setBounds(125, 405, 129, 25);

		btnModificar = new JButton("Modificar");
		btnModificar.setEnabled(false);
		btnModificar.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnModificar.setBounds(345, 405, 99, 25);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (control.DeleteMat("MATERIAL", "Nom_Material,"+"'" +t1.getValueAt(t1.getSelectedRow(), 2).toString()+"'")) {
					if (control.DeleteMat("SUBFAMILIA", "NOM_SUBFAMILIA,"+ "'" +t1.getValueAt(t1.getSelectedRow(), 1).toString()+"'")) {
						if (control.DeleteMat("FAMILIA","NOM_FAMILIA," +"'" +t1.getValueAt(t1.getSelectedRow(), 0).toString()+"'")) {
							limpiarTabla(t1);
							ctrl.cargarMateriales("nom_familia, nom_subfamilia, nom_material", "familia, subfamilia, material",
									"cod_Familia,cod_subfamilia,cod_subfamilia,Cod_material", (DefaultTableModel) t1.getModel());
						}
					}

					
				}
			}
		});
		btnBorrar.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnBorrar.setBounds(565, 405, 99, 25);

		JButton btnLogout = new JButton("Salir");
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(255, 140, 0));
		btnLogout.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnLogout.setBounds(12, 469, 111, 25);
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Log_out();// Finalizacion de la ap
			}
		});

		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setBackground(new Color(255, 140, 0));
		btnCancel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnCancel.setBounds(673, 469, 99, 25);
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cancel();// Vuelta a la pantalla de LogIn
			}
		});

		scrollPane.setViewportView(table);
		Materiales.setLayout(null);
		Materiales.add(lblMaterial);
		Materiales.add(lblFamilia);
		Materiales.add(lblSubfamilia);
		Materiales.add(btnModificar);
		Materiales.add(btnBorrar);
		Materiales.add(textField);
		Materiales.add(comboBox);
		Materiales.add(textField_1);
		Materiales.add(comboBox_1);
		Materiales.add(textField_2);
		Materiales.add(comboBox_2);
		Materiales.add(scrollPane);

		t1 = new JTable();
		t1.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Familia", "Subfamilia", "Materiales" }));
		scrollPane.setViewportView(t1);
		Materiales.add(btnAadirATabla);
		Materiales.add(btnAadirALista);
		Materiales.add(btnNewButton);
		Materiales.add(btnLogout);
		Materiales.add(btnCancel);

		JLabel lblNewLabel_1 = new JLabel("                TABLA DE MATERIALES");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 31));
		lblNewLabel_1.setBounds(101, 11, 600, 43);
		Materiales.add(lblNewLabel_1);

		Propiedades = new JPanel();
		Propiedades.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Propiedades", null, Propiedades, null);

		lblPropiedad = new JLabel("Categoria");

		lblCategora = new JLabel("Propiedad");

		lblValor = new JLabel("Valor");

		comboBox_3 = new JComboBox();

		comboBox_4 = new JComboBox();

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setColumns(10);

		btnAadirALista_1 = new JButton("A\u00F1adir a lista");
		btnAadirALista_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_3.addItem(textField_3.getText());
				botonInsertar(btnAadirALista, "CAT_PROPIEDAD_M", "NOM_CAT_M", textField_3.getText());
				comboBox_4.addItem(textField_4.getText());
				botonInsertar(btnAadirALista, "PROPIEDAD_M", "NOM_PROP_M", textField_4.getText());
//				botonInsertar(btnAadirALista, "material", "nom_material", comboBox_5.getSelectedItem());
//				botonInsertar(btnAadirALista, "material", "nom_material", textField_5.getText());
			}
		});
		btnAadirALista_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));

		btnBorrarDeLista = new JButton("Borrar de lista");
		btnBorrarDeLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_3.removeItem(comboBox_3.getSelectedItem());
				comboBox_4.removeItem(comboBox_4.getSelectedItem());
			}
		});
		btnBorrarDeLista.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));

		JScrollPane scrMaterial = new JScrollPane();

		JButton btnAadirATabla_1 = new JButton("A\u00F1adir a tabla");
		btnAadirATabla_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object [] fila = {comboBox_3.getSelectedItem(), comboBox_4.getSelectedItem(), comboBox_5.getSelectedItem(), textField_5.getText()};
				dtm6.addRow(fila);
				t2.setModel(dtm6);
				
//				control.Insert("TIENE_MAT_PROP", "VALOR", textField_5.getText());
//				control.Insert("TIENE_MAT_PROP", "UNIDAD", comboBox_5.getSelectedItem().toString());
//				limpiarTabla(t2);
//				ctrl.cargarMateriales("nom_prop_m,NOM_CAT_M,valor,unidad",
//						"propiedad_m,CAT_PROPIEDAD_M ,TIENE_MAT_PROP",
//						"PROPIEDAD_M_COD_PROP_M,cod_prop_m,cod_cat_prop_m,cod_prop_m",
//						(DefaultTableModel) t2.getModel());
			}
		});
		btnAadirATabla_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));

		JButton btnModificar_1 = new JButton("Modificar");
		btnModificar_1.setEnabled(false);
		btnModificar_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));

		JButton btnBorrar_1 = new JButton("Borrar");
		btnBorrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtm6.removeRow(t2.getSelectedRow());
			}
		});
		btnBorrar_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));

		JButton btnLogOut = new JButton("Salir");
		btnLogOut.setForeground(new Color(255, 255, 255));
		btnLogOut.setBackground(new Color(255, 140, 0));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogOut.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Log_out();// Finalizacion de la ap
			}
		});

		JButton btnCancel_1 = new JButton("Cancelar");
		btnCancel_1.setForeground(new Color(255, 255, 255));
		btnCancel_1.setBackground(new Color(255, 140, 0));
		btnCancel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnCancel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cancel();// Vuelta a la pantalla de LogIn
			}
		});

		JLabel lblNewLabel = new JLabel("Rango");

		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "alto", "medio", "bajo" }));

		lblNewLabel_2 = new JLabel("                 TABLA DE PROPIEDADES");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 31));
		GroupLayout gl_Propiedades = new GroupLayout(Propiedades);
		gl_Propiedades
				.setHorizontalGroup(
						gl_Propiedades.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING,
										gl_Propiedades.createSequentialGroup().addGap(163)
												.addComponent(btnAadirALista_1, GroupLayout.PREFERRED_SIZE, 140,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
												.addComponent(btnBorrarDeLista, GroupLayout.PREFERRED_SIZE, 138,
														GroupLayout.PREFERRED_SIZE)
												.addGap(132))
								.addGroup(
										gl_Propiedades.createSequentialGroup().addContainerGap().addComponent(btnLogOut)
												.addPreferredGap(ComponentPlacement.RELATED, 642, Short.MAX_VALUE)
												.addComponent(btnCancel_1).addGap(69))
								.addGroup(gl_Propiedades.createSequentialGroup().addGap(94)
										.addGroup(gl_Propiedades
												.createParallelGroup(
														Alignment.TRAILING)
												.addGroup(gl_Propiedades.createSequentialGroup().addGroup(gl_Propiedades
														.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblNewLabel_2, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
														.addGroup(gl_Propiedades.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED, 59,
																		Short.MAX_VALUE)
																.addComponent(scrMaterial, GroupLayout.PREFERRED_SIZE,
																		609, GroupLayout.PREFERRED_SIZE)))
														.addGap(107))
												.addGroup(Alignment.LEADING,
														gl_Propiedades.createSequentialGroup()
																.addComponent(btnAadirATabla_1)
																.addPreferredGap(ComponentPlacement.RELATED, 200,
																		Short.MAX_VALUE)
																.addComponent(btnModificar_1).addGap(176)
																.addComponent(btnBorrar_1).addGap(116))
												.addGroup(Alignment.LEADING,
														gl_Propiedades
																.createSequentialGroup().addGroup(gl_Propiedades
																		.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_Propiedades.createSequentialGroup()
																				.addGroup(gl_Propiedades
																						.createParallelGroup(
																								Alignment.TRAILING,
																								false)
																						.addComponent(comboBox_3,
																								Alignment.LEADING, 0,
																								GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(textField_3,
																								Alignment.LEADING))
																				.addGap(95))
																		.addGroup(gl_Propiedades.createSequentialGroup()
																				.addGap(17)
																				.addComponent(lblPropiedad,
																						GroupLayout.DEFAULT_SIZE, 111,
																						Short.MAX_VALUE)
																				.addGap(67)))
																.addGroup(gl_Propiedades
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(lblCategora,
																				GroupLayout.DEFAULT_SIZE, 120,
																				Short.MAX_VALUE)
																		.addGroup(gl_Propiedades
																				.createParallelGroup(Alignment.TRAILING,
																						false)
																				.addComponent(comboBox_4,
																						Alignment.LEADING, 0,
																						GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(textField_4,
																						Alignment.LEADING, 107, 107,
																						Short.MAX_VALUE)))
																.addGap(75)
																.addGroup(gl_Propiedades
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(lblValor,
																				GroupLayout.PREFERRED_SIZE, 76,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblNewLabel))
																.addPreferredGap(ComponentPlacement.RELATED, 73,
																		Short.MAX_VALUE)
																.addGroup(gl_Propiedades
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(textField_5, 70, 70, 70)
																		.addComponent(comboBox_5,
																				GroupLayout.PREFERRED_SIZE, 62,
																				GroupLayout.PREFERRED_SIZE))
																.addGap(166)))));
		gl_Propiedades.setVerticalGroup(gl_Propiedades.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Propiedades.createSequentialGroup().addGap(23)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_Propiedades.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPropiedad, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE).addComponent(
										lblCategora, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_Propiedades.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
						.addGap(18)
						.addGroup(gl_Propiedades.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblValor))
						.addGap(21)
						.addGroup(gl_Propiedades.createParallelGroup(Alignment.BASELINE).addComponent(btnBorrarDeLista)
								.addComponent(btnAadirALista_1))
						.addGap(29)
						.addComponent(scrMaterial, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(gl_Propiedades.createParallelGroup(Alignment.BASELINE).addComponent(btnBorrar_1)
								.addComponent(btnModificar_1).addComponent(btnAadirATabla_1))
						.addGap(41).addGroup(gl_Propiedades.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnLogOut).addComponent(btnCancel_1))
						.addGap(36)));

		t2 = new JTable();
		dtm6 = new DefaultTableModel(new Object[][] {

		}, new String[] { "Propiedad", "Categoria", "Valor", "Rango" });
		
		t2.setModel(dtm6);
		scrMaterial.setViewportView(t2);
		Propiedades.setLayout(gl_Propiedades);
		
				Union = new JPanel();
				Union.setBackground(SystemColor.activeCaption);
				tabbedPane.addTab("Union", null, Union, null);
				
						scrollPane_1 = new JScrollPane();
						
								JButton btnAadir = new JButton("A\u00F1adir");
								btnAadir.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										Object [] fila = {comboBox_6.getSelectedItem(), comboBox_12.getSelectedItem(), comboBox_13.getSelectedItem()};
										dtm2.addRow(fila);
										t3.setModel(dtm2);
									}
								});
								btnAadir.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
								
										btnNewButton_1 = new JButton("Borrar");
										btnNewButton_1.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
												dtm2.removeRow(t3.getSelectedRow());
												
											}
										});
										btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
										
												JLabel lblTablaMaterial = new JLabel("Materiales");
												lblTablaMaterial.setFont(new Font("Tahoma", Font.PLAIN, 14));
												
														JLabel lblTablaPropiedades = new JLabel("Propiedades");
														lblTablaPropiedades.setFont(new Font("Tahoma", Font.PLAIN, 14));
														
																JLabel lblTablaUnion = new JLabel("Propiedades del material");
																lblTablaUnion.setFont(new Font("Tahoma", Font.PLAIN, 14));
																
																		JButton btnLogout_1 = new JButton("Salir");
																		btnLogout_1.setForeground(new Color(255, 255, 255));
																		btnLogout_1.setBackground(new Color(255, 140, 0));
																		btnLogout_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
																		btnLogout_1.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent arg0) {
																			}
																		});
																		btnLogout_1.addMouseListener(new MouseAdapter() {
																			@Override
																			public void mouseClicked(MouseEvent arg0) {
																				Log_out();// Finalizacion de la ap
																			}
																		});
																		
																				JButton btnCancel_2 = new JButton("Cancelar");
																				btnCancel_2.setForeground(new Color(255, 255, 255));
																				btnCancel_2.setBackground(new Color(255, 140, 0));
																				btnCancel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
																				btnCancel_2.addMouseListener(new MouseAdapter() {
																					@Override
																					public void mouseClicked(MouseEvent arg0) {
																						cancel();// Vuelta a la pantalla de LogIn
																					}
																				});
																				
																						JSlider slider = new JSlider();
																						slider.setMaximum(2);
																						
																								JLabel lblRango = new JLabel("Rango");
																								
																										JLabel lblAlto = new JLabel("Alto");
																										
																												JLabel lblMedio = new JLabel("Medio");
																												
																														JLabel lblBajo = new JLabel("Bajo");
																														
																														comboBox_6 = new JComboBox();
																														comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Arcilla"}));
																														
																														comboBox_12 = new JComboBox();
																														comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Densidad"}));
																														
																														JLabel lblValor_1 = new JLabel("Valor");
																														lblValor_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
																														
																														comboBox_13 = new JComboBox();
																														comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"100dm3"}));
																														
																																GroupLayout gl_Union = new GroupLayout(Union);
																																gl_Union.setHorizontalGroup(
																																	gl_Union.createParallelGroup(Alignment.LEADING)
																																		.addGroup(gl_Union.createSequentialGroup()
																																			.addGap(156)
																																			.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
																																			.addGap(97)
																																			.addComponent(comboBox_12, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
																																			.addGap(122)
																																			.addComponent(comboBox_13, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
																																			.addContainerGap(164, Short.MAX_VALUE))
																																		.addGroup(gl_Union.createSequentialGroup()
																																			.addGap(183)
																																			.addComponent(lblTablaMaterial)
																																			.addGap(142)
																																			.addComponent(lblTablaPropiedades, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
																																			.addGap(176)
																																			.addComponent(lblValor_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
																																			.addGap(175))
																																		.addGroup(gl_Union.createSequentialGroup()
																																			.addContainerGap(654, Short.MAX_VALUE)
																																			.addComponent(lblRango)
																																			.addGap(184))
																																		.addGroup(gl_Union.createSequentialGroup()
																																			.addContainerGap(385, Short.MAX_VALUE)
																																			.addGroup(gl_Union.createParallelGroup(Alignment.TRAILING)
																																				.addGroup(gl_Union.createSequentialGroup()
																																					.addComponent(lblBajo)
																																					.addGap(78)
																																					.addComponent(lblMedio)
																																					.addGap(64)
																																					.addComponent(lblAlto))
																																				.addGroup(gl_Union.createSequentialGroup()
																																					.addComponent(btnAadir, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
																																					.addGap(105)
																																					.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																																			.addGap(102))
																																		.addGroup(gl_Union.createSequentialGroup()
																																			.addGap(357)
																																			.addComponent(lblTablaUnion)
																																			.addContainerGap(366, Short.MAX_VALUE))
																																		.addGroup(Alignment.TRAILING, gl_Union.createSequentialGroup()
																																			.addGroup(gl_Union.createParallelGroup(Alignment.LEADING)
																																				.addGroup(gl_Union.createSequentialGroup()
																																					.addGap(33)
																																					.addComponent(btnLogout_1)
																																					.addPreferredGap(ComponentPlacement.RELATED, 666, Short.MAX_VALUE))
																																				.addGroup(gl_Union.createSequentialGroup()
																																					.addContainerGap(172, Short.MAX_VALUE)
																																					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 538, GroupLayout.PREFERRED_SIZE)
																																					.addGap(50)))
																																			.addGroup(gl_Union.createParallelGroup(Alignment.LEADING)
																																				.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
																																				.addComponent(btnCancel_2))
																																			.addGap(22))
																																);
																																gl_Union.setVerticalGroup(
																																	gl_Union.createParallelGroup(Alignment.TRAILING)
																																		.addGroup(gl_Union.createSequentialGroup()
																																			.addGap(109)
																																			.addGroup(gl_Union.createParallelGroup(Alignment.BASELINE)
																																				.addComponent(lblTablaMaterial)
																																				.addComponent(lblTablaPropiedades)
																																				.addComponent(lblValor_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
																																			.addGap(18)
																																			.addGroup(gl_Union.createParallelGroup(Alignment.BASELINE)
																																				.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																				.addComponent(comboBox_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																				.addComponent(comboBox_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																																			.addGap(33)
																																			.addComponent(lblRango)
																																			.addGap(6)
																																			.addGroup(gl_Union.createParallelGroup(Alignment.LEADING)
																																				.addGroup(gl_Union.createSequentialGroup()
																																					.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																																					.addGap(18)
																																					.addGroup(gl_Union.createParallelGroup(Alignment.BASELINE)
																																						.addComponent(lblAlto)
																																						.addComponent(lblMedio)
																																						.addComponent(lblBajo)))
																																				.addComponent(btnAadir))
																																			.addGap(7)
																																			.addComponent(lblTablaUnion)
																																			.addGroup(gl_Union.createParallelGroup(Alignment.LEADING)
																																				.addGroup(gl_Union.createSequentialGroup()
																																					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
																																					.addGroup(gl_Union.createParallelGroup(Alignment.LEADING)
																																						.addGroup(Alignment.TRAILING, gl_Union.createSequentialGroup()
																																							.addComponent(btnNewButton_1)
																																							.addGap(31)
																																							.addComponent(btnCancel_2))
																																						.addGroup(gl_Union.createSequentialGroup()
																																							.addGap(116)
																																							.addComponent(btnLogout_1)))
																																					.addGap(80))
																																				.addGroup(gl_Union.createSequentialGroup()
																																					.addGap(18)
																																					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
																																					.addContainerGap())))
																																);
																																
																																		t3 = new JTable();
																																		dtm2 = new DefaultTableModel(new Object[][] {

																																		}, new String[] { "Material", "Propiedad", "Valor" });
																																		
																																		t3.setModel(dtm2);
																																		
																																		
																																		scrollPane_1.setViewportView(t3);
																																		Union.setLayout(gl_Union);

		Dimension = new JPanel();
		Dimension.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Dimensiones", null, Dimension, null);

		lblDimensiones = new JLabel("Dimensiones");

		lblFormato = new JLabel("Cat Formato");

		lblCategora_1 = new JLabel("Formato");

		comboBox_7 = new JComboBox();

		comboBox_8 = new JComboBox();

		textField_6 = new JTextField();
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setColumns(10);

		btnAadirALista_2 = new JButton("A\u00F1adir a lista");
		btnAadirALista_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botonInsertar(btnAadirALista_2, "DIMENSIONES", "NOM_DIMENSION", textField_6.getText());
				comboBox_7.addItem(textField_7.getText());
				botonInsertar(btnAadirALista_2, "CAT_FORMATO", "NOM_CAT_FORMATO", textField_7.getText());
				comboBox_8.addItem(textField_8.getText());
				botonInsertar(btnAadirALista_2, "FORMATO", "NOM_FORMATO", textField_8.getText());
			}
		});
		btnAadirALista_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));

		btnBorrarDeLista_1 = new JButton("Borrar de lista");
		btnBorrarDeLista_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_7.removeItem(comboBox_7.getSelectedItem());
				comboBox_8.removeItem(comboBox_8.getSelectedItem());
			}
		});
		btnBorrarDeLista_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));

		scrollPane_4 = new JScrollPane();

		btnAadirATabla_2 = new JButton("A\u00F1adir a tabla");
		btnAadirATabla_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirTabla(textField_6.getText(),comboBox_7.getSelectedItem().toString(),comboBox_8.getSelectedItem().toString());
				limpiarTabla(t6);
				ctrl.cargarMateriales("NOM_DIMENSION,NOM_CAT_FORMATO,NOM_FORMATO", "DIMENSIONES,CAT_FORMATO,fORMATO",
						"cod_dimension,cod_cat_formato,cod_cat_formato,COD_FORMATO", (DefaultTableModel) t6.getModel());
			}
		});
		btnAadirATabla_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));

		btnModificar_2 = new JButton("Modificar");
		btnModificar_2.setEnabled(false);
		btnModificar_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));

		btnBorrar_2 = new JButton("Borrar");
		btnBorrar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (control.DeleteMat("DIMENSIONES", "NOM_DIMENSION,"+"'" +t6.getValueAt(t6.getSelectedRow(), 0).toString()+"'")) {
					if (control.DeleteMat("FORMATO", "NOM_FORMATO,"+ "'" +t6.getValueAt(t6.getSelectedRow(), 1).toString()+"'")) {
						if (control.DeleteMat("CAT_FORMATO","NOM_CAT_FORMATO," +"'" +t6.getValueAt(t6.getSelectedRow(), 2).toString()+"'")) {
							limpiarTabla(t6);
							ctrl.cargarMateriales("NOM_DIMENSION,NOM_CAT_FORMATO,NOM_FORMATO", "DIMENSIONES,CAT_FORMATO,fORMATO",
									"cod_dimension,cod_cat_formato,cod_cat_formato,COD_FORMATO", (DefaultTableModel) t6.getModel());
						}
					}
				}
			}
		});
		btnBorrar_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));

		JButton btnLogout_2 = new JButton("Salir");
		btnLogout_2.setForeground(new Color(255, 255, 255));
		btnLogout_2.setBackground(new Color(255, 140, 0));
		btnLogout_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnLogout_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogout_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Log_out();// Finalizacion de la ap
			}
		});

		JButton btnCancel_3 = new JButton("Cancelar");
		btnCancel_3.setForeground(new Color(255, 255, 255));
		btnCancel_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel_3.setBackground(new Color(255, 140, 0));
		btnCancel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnCancel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cancel();// Vuelta a la pantalla de LogIn
			}
		});

		lblTablaDeDimensiones = new JLabel("             TABLA DE DIMENSIONES");
		lblTablaDeDimensiones.setFont(new Font("Arial", Font.BOLD, 38));

		GroupLayout gl_Dimension = new GroupLayout(Dimension);
		gl_Dimension
				.setHorizontalGroup(
						gl_Dimension.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Dimension.createSequentialGroup().addGap(127)
										.addComponent(btnAadirATabla_2, GroupLayout.PREFERRED_SIZE, 124,
												GroupLayout.PREFERRED_SIZE)
										.addGap(113)
										.addComponent(btnModificar_2, GroupLayout.PREFERRED_SIZE, 91,
												GroupLayout.PREFERRED_SIZE)
										.addGap(149)
										.addComponent(btnBorrar_2, GroupLayout.PREFERRED_SIZE, 93,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(172, Short.MAX_VALUE))
								.addGroup(gl_Dimension.createSequentialGroup().addGap(38).addComponent(btnLogout_2)
										.addPreferredGap(ComponentPlacement.RELATED, 632, Short.MAX_VALUE)
										.addComponent(btnCancel_3).addGap(51))
								.addGroup(gl_Dimension.createSequentialGroup().addGap(58).addGroup(gl_Dimension
										.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_Dimension.createSequentialGroup()
												.addComponent(lblTablaDeDimensiones, GroupLayout.PREFERRED_SIZE, 673,
														GroupLayout.PREFERRED_SIZE)
												.addContainerGap())
										.addGroup(gl_Dimension.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Dimension
														.createSequentialGroup().addComponent(lblDimensiones)
														.addGap(221)
														.addGroup(gl_Dimension.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_Dimension.createSequentialGroup()
																		.addComponent(lblFormato,
																				GroupLayout.DEFAULT_SIZE, 268,
																				Short.MAX_VALUE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(lblCategora_1).addGap(217))
																.addGroup(gl_Dimension.createSequentialGroup()
																		.addGroup(gl_Dimension
																				.createParallelGroup(Alignment.TRAILING,
																						false)
																				.addComponent(comboBox_7,
																						Alignment.LEADING, 0,
																						GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(textField_7,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE, 97,
																						Short.MAX_VALUE))
																		.addContainerGap())))
												.addGroup(gl_Dimension.createSequentialGroup().addGroup(gl_Dimension
														.createParallelGroup(Alignment.TRAILING)
														.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 661,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_Dimension.createSequentialGroup()
																.addGroup(gl_Dimension
																		.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(textField_6)
																		.addComponent(btnAadirALista_2,
																				GroupLayout.DEFAULT_SIZE, 114,
																				Short.MAX_VALUE))
																.addPreferredGap(ComponentPlacement.RELATED, 437,
																		Short.MAX_VALUE)
																.addGroup(gl_Dimension
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(btnBorrarDeLista_1,
																				GroupLayout.PREFERRED_SIZE, 116,
																				GroupLayout.PREFERRED_SIZE)
																		.addGroup(gl_Dimension
																				.createParallelGroup(Alignment.TRAILING,
																						false)
																				.addComponent(comboBox_8,
																						Alignment.LEADING, 0,
																						GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(textField_8,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE, 101,
																						Short.MAX_VALUE)))
																.addGap(5)))
														.addGap(139))))));
		gl_Dimension
				.setVerticalGroup(
						gl_Dimension.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_Dimension.createSequentialGroup().addContainerGap()
												.addComponent(lblTablaDeDimensiones, GroupLayout.PREFERRED_SIZE, 42,
														GroupLayout.PREFERRED_SIZE)
												.addGap(56)
												.addGroup(gl_Dimension.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblFormato, GroupLayout.PREFERRED_SIZE, 24,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblCategora_1)
														.addComponent(lblDimensiones))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_Dimension.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_Dimension.createParallelGroup(Alignment.BASELINE)
																.addComponent(textField_7, GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(textField_6, GroupLayout.PREFERRED_SIZE,
																		20, GroupLayout.PREFERRED_SIZE))
														.addComponent(textField_8, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(gl_Dimension.createParallelGroup(Alignment.BASELINE)
														.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(gl_Dimension.createParallelGroup(Alignment.BASELINE)
														.addComponent(btnAadirALista_2).addComponent(
																btnBorrarDeLista_1))
												.addGap(26)
												.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 141,
														GroupLayout.PREFERRED_SIZE)
												.addGap(13)
												.addGroup(gl_Dimension.createParallelGroup(Alignment.BASELINE)
														.addComponent(btnModificar_2).addComponent(btnBorrar_2)
														.addComponent(btnAadirATabla_2))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_Dimension.createParallelGroup(Alignment.LEADING)
														.addComponent(btnCancel_3).addComponent(btnLogout_2))
												.addContainerGap(112, Short.MAX_VALUE)));

		t6 = new JTable();
		t6.setModel(new DefaultTableModel(new Object[][] { { null, null, null }, },
				new String[] { "Dimension", "Formato", "Categoria" }));
		scrollPane_4.setViewportView(t6);
		Dimension.setLayout(gl_Dimension);
																																		dtm2 = new DefaultTableModel(new Object[][] {

																																		}, new String[] {
																																				"Material", "Propiedad", "Valor"
																																			});

		Producto = new JPanel();
		Producto.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Producto", null, Producto, null);

		scrollPane_7 = new JScrollPane();

		btnCrearProducto = new JButton("Crear  Producto");
		btnCrearProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object [] fila = {comboBox_14.getSelectedItem(), comboBox_15.getSelectedItem(), textField_18.getText(), textField_15.getText()};
				dtm3.addRow(fila);
				t9.setModel(dtm3);
			}
		});

		button_1 = new JButton("Borrar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtm3.removeRow(t9.getSelectedRow());
			}
		});

		JLabel lblTablaProducto = new JLabel("Tabla Producto");

		JLabel lblTablaDimension = new JLabel("Dimension");
		lblTablaDimension.setFont(new Font("Tahoma", Font.PLAIN, 14));

		textField_15 = new JTextField();
		textField_15.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton btnLogout_3 = new JButton("Salir");
		btnLogout_3.setForeground(new Color(255, 255, 255));
		btnLogout_3.setBackground(new Color(255, 140, 0));
		btnLogout_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Log_out();// Finalizacion de la ap
			}
		});
		JButton btnCancel_4 = new JButton("Cancel");
		btnCancel_4.setForeground(new Color(255, 255, 255));
		btnCancel_4.setBackground(new Color(255, 140, 0));
		btnCancel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cancel();// Vuelta a la pantalla de LogIn
			}
		});

		lbltablaProducto = new JLabel("                   TABLA PRODUCTO");
		lbltablaProducto.setFont(new Font("Arial", Font.BOLD, 31));
		
		label_1 = new JLabel("Materiales");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"Arcilla"}));
		
		comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"50x50cm"}));
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);

		GroupLayout gl_Producto = new GroupLayout(Producto);
		gl_Producto.setHorizontalGroup(
			gl_Producto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Producto.createSequentialGroup()
					.addGroup(gl_Producto.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Producto.createSequentialGroup()
							.addGroup(gl_Producto.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Producto.createSequentialGroup()
									.addGap(39)
									.addComponent(btnLogout_3))
								.addGroup(Alignment.TRAILING, gl_Producto.createSequentialGroup()
									.addContainerGap(170, Short.MAX_VALUE)
									.addComponent(scrollPane_7, GroupLayout.PREFERRED_SIZE, 479, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_Producto.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_Producto.createSequentialGroup()
									.addGap(64)
									.addComponent(btnCancel_4)
									.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
								.addGroup(gl_Producto.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_Producto.createSequentialGroup()
							.addGap(434)
							.addComponent(lblProducto, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(280)))
					.addGap(92))
				.addGroup(gl_Producto.createSequentialGroup()
					.addContainerGap(148, Short.MAX_VALUE)
					.addComponent(lbltablaProducto, GroupLayout.PREFERRED_SIZE, 533, GroupLayout.PREFERRED_SIZE)
					.addGap(188))
				.addGroup(gl_Producto.createSequentialGroup()
					.addGap(129)
					.addGroup(gl_Producto.createParallelGroup(Alignment.LEADING, false)
						.addComponent(comboBox_14, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
					.addGap(85)
					.addGroup(gl_Producto.createParallelGroup(Alignment.LEADING, false)
						.addComponent(comboBox_15, Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblTablaDimension, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
					.addGroup(gl_Producto.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_Producto.createSequentialGroup()
							.addComponent(lblPrecio)
							.addGap(205))
						.addGroup(Alignment.TRAILING, gl_Producto.createSequentialGroup()
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(99)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(178))))
				.addGroup(gl_Producto.createSequentialGroup()
					.addGap(341)
					.addComponent(btnCrearProducto, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(396, Short.MAX_VALUE))
				.addGroup(gl_Producto.createSequentialGroup()
					.addGap(366)
					.addComponent(lblTablaProducto)
					.addContainerGap(431, Short.MAX_VALUE))
		);
		gl_Producto.setVerticalGroup(
			gl_Producto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Producto.createSequentialGroup()
					.addGap(27)
					.addComponent(lbltablaProducto, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(gl_Producto.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrecio)
						.addComponent(lblTablaDimension)
						.addComponent(lblProducto, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_Producto.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(65)
					.addComponent(btnCrearProducto)
					.addGap(40)
					.addGroup(gl_Producto.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_Producto.createSequentialGroup()
							.addGroup(gl_Producto.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_Producto.createSequentialGroup()
									.addGap(29)
									.addComponent(lblTablaProducto)
									.addGap(18)
									.addComponent(scrollPane_7, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_Producto.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_1)
									.addGap(18)))
							.addComponent(btnCancel_4)
							.addGap(7))
						.addGroup(gl_Producto.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnLogout_3)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addContainerGap(14, Short.MAX_VALUE))
		);

		t9 = new JTable();
		dtm3 = new DefaultTableModel(new Object[][] {

		}, new String[] { "Nombre Producto", "Material", "Dimension", "Precio" });
		t9.setModel(dtm3);
				
			
		
		scrollPane_7.setViewportView(t9);
		Producto.setLayout(gl_Producto);

		Fabricante = new JPanel();
		Fabricante.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Fabricante", null, Fabricante, null);

		lblFabricante = new JLabel("Referencia");

		comboBox_9 = new JComboBox();

		textField_12 = new JTextField();
		textField_12.setColumns(10);

		comboBox_10 = new JComboBox();

		lblReferencia = new JLabel("Prop Referencial");

		textField_13 = new JTextField();
		textField_13.setColumns(10);

		lblPropiedad_1 = new JLabel("Fabricante");

		comboBox_11 = new JComboBox();

		textField_14 = new JTextField();
		textField_14.setColumns(10);

		button_2 = new JButton("A\u00F1adir a lista");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_9.addItem(textField_12.getText());
				botonInsertar(btnAadirALista, "REF_COMERCIAL", "NOM_REFERENCIA", textField_12.getText());
				comboBox_10.addItem(textField_13.getText());
				botonInsertar(btnAadirALista, "PROPIEDAD_REF", "NOM_PROP_REF", textField_13.getText());
				comboBox_11.addItem(textField_14.getText());
				botonInsertar(btnAadirALista, "FABRICANTE", "NOM_FABRICANTE", textField_14.getText());
			}
		});

		btnBorrarLista = new JButton("Borrar lista");
		btnBorrarLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_9.removeItem(comboBox_9.getSelectedItem());
				comboBox_10.removeItem(comboBox_10.getSelectedItem());
				comboBox_11.removeItem(comboBox_11.getSelectedItem());
			}
		});

		button_3 = new JButton("A\u00F1adir a tabla");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarTabla(t10);
				ctrl.cargarMateriales("nom_fabricante, nom_referencia, nom_prop_ref",
						"fabricante, ref_comercial, propiedad_ref",
						"COD_FABRICANTE,COD_PROP_REF,COD_FABRICANTE,COD_REFERENCIA",
						(DefaultTableModel) t10.getModel());
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnModificar_5 = new JButton("Modificar");
		btnModificar_5.setEnabled(false);
		btnModificar_5.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnBorrar_4 = new JButton("Borrar");
		btnBorrar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (control.DeleteMat("FABRICANTE", "NOM_FABRICANTE,"+"'" +t10.getValueAt(t10.getSelectedRow(), 0).toString()+"'")) {
					if (control.DeleteMat("REF_COMERCIAL", "NOM_REFERENCIA,"+ "'" +t10.getValueAt(t10.getSelectedRow(), 1).toString()+"'")) {
						if (control.DeleteMat("PROPIEDAD_REF","NOM_PROP_REF," +"'" +t10.getValueAt(t10.getSelectedRow(), 2).toString()+"'")) {
							limpiarTabla(t10);
							ctrl.cargarMateriales("nom_fabricante, nom_referencia, nom_prop_ref",
									"fabricante, ref_comercial, propiedad_ref",
									"COD_FABRICANTE,COD_PROP_REF,COD_FABRICANTE,COD_REFERENCIA",
									(DefaultTableModel) t10.getModel());
						}
					}
				}
			}
		});
		btnBorrar_4.setFont(new Font("Tahoma", Font.BOLD, 11));

		JScrollPane scrollPane_9 = new JScrollPane();

		JButton btnLogout_4 = new JButton("Salir\r\n");
		btnLogout_4.setForeground(new Color(255, 255, 255));
		btnLogout_4.setBackground(new Color(255, 140, 0));
		btnLogout_4.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnLogout_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Log_out();// Finalizacion de la ap
			}
		});
		JButton btnCancel_5 = new JButton("Cancel");
		btnCancel_5.setForeground(new Color(255, 255, 255));
		btnCancel_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		btnCancel_5.setBackground(new Color(255, 140, 0));
		btnCancel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cancel();// Vuelta a la pantalla de LogIn
			}
		});

		lblFabricante_1 = new JLabel("FABRICANTE");
		lblFabricante_1.setFont(new Font("Arial", Font.BOLD, 31));
		GroupLayout gl_Fabricante = new GroupLayout(Fabricante);
		gl_Fabricante
				.setHorizontalGroup(
						gl_Fabricante.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Fabricante.createSequentialGroup().addGap(208)
										.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 119,
												GroupLayout.PREFERRED_SIZE)
										.addGap(150)
										.addComponent(btnBorrarLista, GroupLayout.PREFERRED_SIZE, 121,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(271, Short.MAX_VALUE))
								.addGroup(gl_Fabricante.createSequentialGroup().addGap(56).addComponent(btnLogout_4)
										.addPreferredGap(ComponentPlacement.RELATED, 596, Short.MAX_VALUE)
										.addComponent(btnCancel_5).addGap(91))
								.addGroup(gl_Fabricante.createSequentialGroup().addGap(87)
										.addComponent(scrollPane_9, GroupLayout.PREFERRED_SIZE, 638,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(gl_Fabricante.createSequentialGroup().addGap(98)
										.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 114,
												GroupLayout.PREFERRED_SIZE)
										.addGap(118)
										.addComponent(btnModificar_5, GroupLayout.PREFERRED_SIZE, 99,
												GroupLayout.PREFERRED_SIZE)
										.addGap(112)
										.addComponent(btnBorrar_4, GroupLayout.PREFERRED_SIZE, 99,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(229, Short.MAX_VALUE))
								.addGroup(gl_Fabricante.createSequentialGroup().addGroup(gl_Fabricante
										.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_Fabricante.createSequentialGroup().addGap(113)
												.addComponent(lblFabricante))
										.addGroup(gl_Fabricante.createSequentialGroup().addGap(99)
												.addGroup(gl_Fabricante.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(comboBox_9, Alignment.LEADING, 0,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(textField_12, Alignment.LEADING))))
										.addGap(161)
										.addGroup(gl_Fabricante.createParallelGroup(Alignment.LEADING)
												.addComponent(lblReferencia, GroupLayout.PREFERRED_SIZE, 106,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Fabricante.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(comboBox_10, Alignment.LEADING, 0,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(textField_13, Alignment.LEADING)))
										.addPreferredGap(ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
										.addGroup(gl_Fabricante.createParallelGroup(Alignment.LEADING)
												.addGroup(Alignment.TRAILING, gl_Fabricante.createSequentialGroup()
														.addComponent(textField_14, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(142))
												.addGroup(Alignment.TRAILING,
														gl_Fabricante.createSequentialGroup()
																.addComponent(comboBox_11, GroupLayout.PREFERRED_SIZE,
																		90, GroupLayout.PREFERRED_SIZE)
																.addGap(137))
												.addGroup(Alignment.TRAILING, gl_Fabricante.createSequentialGroup()
														.addComponent(lblPropiedad_1, GroupLayout.PREFERRED_SIZE, 135,
																GroupLayout.PREFERRED_SIZE)
														.addGap(69))))
								.addGroup(gl_Fabricante.createSequentialGroup().addGap(359)
										.addComponent(lblFabricante_1).addContainerGap(313, Short.MAX_VALUE)));
		gl_Fabricante.setVerticalGroup(gl_Fabricante.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Fabricante.createSequentialGroup()
						.addGroup(gl_Fabricante.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Fabricante.createSequentialGroup().addGap(13).addComponent(lblFabricante_1)
										.addGap(35)
										.addGroup(gl_Fabricante.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblFabricante).addComponent(lblReferencia))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_Fabricante.createParallelGroup(Alignment.BASELINE)
												.addComponent(textField_12, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_13, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Fabricante.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_Fabricante.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(
																comboBox_9, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_Fabricante.createSequentialGroup().addGap(11).addComponent(
														comboBox_10, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(Alignment.TRAILING, gl_Fabricante.createSequentialGroup().addContainerGap()
										.addComponent(lblPropiedad_1).addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(textField_14, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(8)
										.addComponent(comboBox_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(1)))
						.addGap(20)
						.addGroup(gl_Fabricante.createParallelGroup(Alignment.BASELINE).addComponent(btnBorrarLista)
								.addComponent(button_2))
						.addGap(42)
						.addComponent(scrollPane_9, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(gl_Fabricante.createParallelGroup(Alignment.BASELINE).addComponent(button_3)
								.addComponent(btnModificar_5).addComponent(btnBorrar_4))
						.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
						.addGroup(gl_Fabricante.createParallelGroup(Alignment.LEADING)
								.addComponent(btnLogout_4, Alignment.TRAILING)
								.addComponent(btnCancel_5, Alignment.TRAILING))
						.addGap(24)));

		t10 = new JTable();
		t10.setModel(new DefaultTableModel(new Object[][] { { null, null, null }, },
				new String[] { "Fabricante", "Referencia", "Propiedad Ref" }));
		scrollPane_9.setViewportView(t10);
		Fabricante.setLayout(gl_Fabricante);

		JPanel Fabrica = new JPanel();
		Fabrica.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Fabrica", null, Fabrica, null);

		scrollPane_2 = new JScrollPane();

		lblTablaProducto_1 = new JLabel("Producto");
		lblTablaProducto_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		lblTablaFabricante = new JLabel("Fabricante");
		lblTablaFabricante.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton btnLogout_5 = new JButton("Salir");
		btnLogout_5.setForeground(new Color(255, 255, 255));
		btnLogout_5.setBackground(new Color(255, 140, 0));
		btnLogout_5.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnLogout_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Log_out();// Finalizacion de la ap
			}
		});

		JButton btnCancel_6 = new JButton("Cancel");
		btnCancel_6.setForeground(new Color(255, 255, 255));
		btnCancel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel_6.setBackground(new Color(255, 140, 0));
		btnCancel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cancel();// Vuelta a la pantalla de LogIn
			}
		});

		button = new JButton("A\u00F1adir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object [] fila = {comboBox_16.getSelectedItem(), comboBox_17.getSelectedItem(), comboBox_18.getSelectedItem()};
				dtm4.addRow(fila);
				t13.setModel(dtm4);
			}
		});
		button.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));

		button_4 = new JButton("Borrar");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtm4.removeRow(t13.getSelectedRow());
			}
		});
		button_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));

		lblTablaFabrica = new JLabel("Tabla Fabrica");

		lblFabrica = new JLabel("FABRICA");
		lblFabrica.setFont(new Font("Arial", Font.BOLD, 31));
		
		JLabel lblReferenciaComercial = new JLabel("Referencia Comercial");
		lblReferenciaComercial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		comboBox_16 = new JComboBox();
		
		comboBox_17 = new JComboBox();
		
		comboBox_18 = new JComboBox();

		GroupLayout gl_Fabrica = new GroupLayout(Fabrica);
		gl_Fabrica.setHorizontalGroup(
			gl_Fabrica.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Fabrica.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Fabrica.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTablaFabrica, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
					.addGap(372))
				.addGroup(gl_Fabrica.createSequentialGroup()
					.addGroup(gl_Fabrica.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Fabrica.createSequentialGroup()
							.addContainerGap(220, Short.MAX_VALUE)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
							.addGap(47)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Fabrica.createSequentialGroup()
							.addGap(55)
							.addComponent(btnLogout_5)
							.addPreferredGap(ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
							.addComponent(btnCancel_6))
						.addGroup(gl_Fabrica.createSequentialGroup()
							.addComponent(lblFabrica)
							.addGap(314)))
					.addGap(49))
				.addGroup(Alignment.LEADING, gl_Fabrica.createSequentialGroup()
					.addGap(130)
					.addGroup(gl_Fabrica.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(comboBox_16, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblTablaProducto_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
					.addGroup(gl_Fabrica.createParallelGroup(Alignment.LEADING, false)
						.addComponent(comboBox_17, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblReferenciaComercial, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
					.addGap(151)
					.addGroup(gl_Fabrica.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTablaFabricante, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_18, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addGap(110))
		);
		gl_Fabrica.setVerticalGroup(
			gl_Fabrica.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Fabrica.createSequentialGroup()
					.addGap(16)
					.addComponent(lblFabrica)
					.addGap(35)
					.addGroup(gl_Fabrica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTablaProducto_1)
						.addComponent(lblReferenciaComercial)
						.addComponent(lblTablaFabricante))
					.addGroup(gl_Fabrica.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Fabrica.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_Fabrica.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(85)
							.addComponent(button)
							.addGap(29)
							.addComponent(lblTablaFabrica, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Fabrica.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_4)))
					.addGap(82)
					.addGroup(gl_Fabrica.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogout_5)
						.addComponent(btnCancel_6))
					.addGap(18))
		);

		t13 = new JTable();
		dtm4 = new DefaultTableModel(new Object[][] {

		}, new String[] { "Referencia Comercial", "Fabricante", "Producto" });
		t13.setModel(dtm4);

		scrollPane_2.setViewportView(t13);
		Fabrica.setLayout(gl_Fabrica);

		Edificio = new JPanel();
		Edificio.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Edificio", null, Edificio, null);

		lblEdificio = new JLabel("Nombre de edificio");

		lblDescripcion = new JLabel("Descripcion");

		textField_10 = new JTextField();
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);

		lblEnlace = new JLabel("Arquitecto");

		scrollPane_8 = new JScrollPane();

		btnModificar_3 = new JButton("A\u00F1adir");
		btnModificar_3.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnModificar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				botonInsertar(btnAadirALista, "EDIFICIO", "NOM_EDIFICIO", textField_10.getText());
//				botonInsertar(btnAadirALista, "EDIFICIO", "DES_EDIFICIO", textArea.getText());
//				botonInsertar(btnAadirALista, "EDIFICIO", "NOM_ARQUITECTO", textField_11.getText());
//				botonInsertar(btnAadirALista, "EDIFICIO", "LOCALIZACION_EDIFICIO", textField_9.getText());
				control.Insert("EDIFICIO", "NOM_EDIFICIO, DES_EDIFICIO, NOM_ARQUITECTO, LOCALIZACION_EDIFICIO", textField_10.getText()+"','"+textArea.getText()+"','"+textField_11.getText()+"','"+textField_9.getText());
				limpiarTabla(t14);
				ctrl.cargarMateriales("nom_edificio, des_edificio,  nom_arquitecto,  localizacion_edificio",
						"edificio", "", (DefaultTableModel) t14.getModel());
			}
		});

		btnBorrar_3 = new JButton("Borrar");
		btnBorrar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (control.DeleteMat("EDIFICIO", "NOM_EDIFICIO,"+"'" +t14.getValueAt(t14.getSelectedRow(), 0).toString()+"'")) {
					if (control.DeleteMat("EDIFICIO", "DES_EDIFICIO,"+ "'" +t14.getValueAt(t14.getSelectedRow(), 1).toString()+"'")) {
						if (control.DeleteMat("EDIFICIO","NOM_ARQUITECTO," +"'" +t14.getValueAt(t14.getSelectedRow(), 2).toString()+"'")) {
							if (control.DeleteMat("EDIFICIO","LOCALIZACION_EDIFICIO," +"'" +t14.getValueAt(t14.getSelectedRow(), 3).toString()+"'")) {
							limpiarTabla(t14);
							ctrl.cargarMateriales("nom_edificio, des_edificio,  nom_arquitecto,  localizacion_edificio",
									"edificio", "", (DefaultTableModel) t14.getModel());
						}
						}
					}
					}
				
			}
		});
		btnBorrar_3.setFont(new Font("Trebuchet MS", Font.BOLD, 12));

		JButton btnLogout_6 = new JButton("Salir");
		btnLogout_6.setForeground(new Color(255, 255, 255));
		btnLogout_6.setBackground(new Color(255, 140, 0));
		btnLogout_6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnLogout_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Log_out();// Finalizacion de la ap
			}
		});

		JButton btnCancel_7 = new JButton("Cancelar");
		btnCancel_7.setForeground(new Color(255, 255, 255));
		btnCancel_7.setBackground(new Color(255, 140, 0));
		btnCancel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnCancel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cancel();// Vuelta a la pantalla de LogIn
			}
		});

		t14 = new JTable();
		t14.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "Edificio", "Descripcion", "Foto", "Uso" }));
		scrollPane_8.setViewportView(t14);

		JLabel lblUso = new JLabel("Localizacion");

		textField_9 = new JTextField();
		textField_9.setColumns(10);

		btnModificar_4 = new JButton("Modificar");
		btnModificar_4.setEnabled(false);
		btnModificar_4.setFont(new Font("Trebuchet MS", Font.BOLD, 11));

		scrollPane_18 = new JScrollPane();

		lblNewLabel_3 = new JLabel("                EDIFICIO");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 31));
		GroupLayout gl_Edificio = new GroupLayout(Edificio);
		gl_Edificio.setHorizontalGroup(
			gl_Edificio.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Edificio.createSequentialGroup()
					.addGroup(gl_Edificio.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Edificio.createSequentialGroup()
							.addContainerGap(108, Short.MAX_VALUE)
							.addGroup(gl_Edificio.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEdificio))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_Edificio.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Edificio.createSequentialGroup()
									.addGap(69)
									.addComponent(scrollPane_18, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Edificio.createSequentialGroup()
									.addGap(127)
									.addComponent(lblDescripcion)))
							.addGroup(gl_Edificio.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_Edificio.createSequentialGroup()
									.addGap(118)
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(56))
								.addGroup(Alignment.TRAILING, gl_Edificio.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblEnlace)
									.addGap(75)))
							.addGroup(gl_Edificio.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_9, 87, 87, 87)
								.addGroup(gl_Edificio.createSequentialGroup()
									.addGap(19)
									.addComponent(lblUso)))
							.addGap(75))
						.addGroup(gl_Edificio.createSequentialGroup()
							.addGap(98)
							.addGroup(gl_Edificio.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_8, GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
								.addGroup(gl_Edificio.createSequentialGroup()
									.addComponent(btnModificar_3, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addGap(183)
									.addComponent(btnModificar_4)
									.addPreferredGap(ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
									.addComponent(btnBorrar_3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
							.addGap(67)))
					.addGap(0))
				.addGroup(gl_Edificio.createSequentialGroup()
					.addGap(123)
					.addComponent(btnLogout_6)
					.addPreferredGap(ComponentPlacement.RELATED, 528, Short.MAX_VALUE)
					.addComponent(btnCancel_7)
					.addGap(70))
				.addGroup(gl_Edificio.createSequentialGroup()
					.addContainerGap(227, Short.MAX_VALUE)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 642, GroupLayout.PREFERRED_SIZE))
		);
		gl_Edificio.setVerticalGroup(
			gl_Edificio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Edificio.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(gl_Edificio.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Edificio.createSequentialGroup()
							.addGroup(gl_Edificio.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Edificio.createSequentialGroup()
									.addGap(11)
									.addComponent(lblEdificio)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Edificio.createSequentialGroup()
									.addGap(5)
									.addComponent(lblDescripcion)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(scrollPane_18, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))
							.addGap(57)
							.addGroup(gl_Edificio.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnBorrar_3, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
								.addComponent(btnModificar_4)))
						.addGroup(gl_Edificio.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_Edificio.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEnlace)
								.addComponent(lblUso))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_Edificio.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
							.addComponent(btnModificar_3)))
					.addGap(6)
					.addComponent(scrollPane_8, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_Edificio.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Edificio.createSequentialGroup()
							.addGap(48)
							.addComponent(btnCancel_7))
						.addGroup(gl_Edificio.createSequentialGroup()
							.addGap(41)
							.addComponent(btnLogout_6)))
					.addGap(77))
		);

		textArea = new JTextArea();
		scrollPane_18.setViewportView(textArea);
		Edificio.setLayout(gl_Edificio);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Usos", null, panel, null);

		JScrollPane scrollPane_15 = new JScrollPane();

		JButton button_6 = new JButton("A\u00F1adir");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object [] fila = {comboBox_19.getSelectedItem(), comboBox_20.getSelectedItem(), textField_19.getText()};
				dtm5.addRow(fila);
				t13.setModel(dtm5);
			}
		});

		JButton button_7 = new JButton("Borrar");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtm5.removeRow(t17.getSelectedRow());
			}
		});

		lblTablaUso = new JLabel("Tabla Uso");

		lblTablaProducto_2 = new JLabel("Producto");
		lblTablaProducto_2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		lblTablaEdificio = new JLabel("Edificio");
		lblTablaEdificio.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnSalir = new JButton("Salir");
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(255, 140, 0));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Log_out();
			}
		});

		btnCancel_8 = new JButton("Cancel");
		btnCancel_8.setForeground(new Color(255, 255, 255));
		btnCancel_8.setBackground(new Color(255, 140, 0));
		btnCancel_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cancel();
			}
		});

		lblUsos = new JLabel("USOS");
		lblUsos.setFont(new Font("Arial", Font.BOLD, 31));
		
		comboBox_19 = new JComboBox();
		
		comboBox_20 = new JComboBox();
		
		JLabel lblNewLabel_4 = new JLabel("Uso");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(44)
					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(544)
					.addComponent(btnCancel_8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(88))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(386)
					.addComponent(lblUsos)
					.addContainerGap(396, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTablaProducto_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_19, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addGap(112)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(comboBox_20, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(158)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(187))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(lblTablaEdificio, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_4)
							.addGap(219))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(372)
					.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(415, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(387)
					.addComponent(lblTablaUso)
					.addContainerGap(435, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(198, Short.MAX_VALUE)
					.addComponent(scrollPane_15, GroupLayout.PREFERRED_SIZE, 509, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(36))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblUsos)
							.addGap(32)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4)
								.addComponent(lblTablaEdificio)
								.addComponent(lblTablaProducto_2))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(58)
							.addComponent(button_6)
							.addGap(32)
							.addComponent(lblTablaUso)
							.addGap(18)
							.addComponent(scrollPane_15, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_7))
					.addGap(73)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalir)
						.addComponent(btnCancel_8))
					.addContainerGap(72, Short.MAX_VALUE))
		);

		t17 = new JTable();
		dtm5 = new DefaultTableModel(new Object[][] {

		}, new String[] { "Uso", "Producto", "Edificio" });
		t17.setModel(dtm5);
		scrollPane_15.setViewportView(t17);
		panel.setLayout(gl_panel);

		panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t18.clearSelection();
				textPane_1.setText("");
				btnNewButton_3.setEnabled(false);
				btnNewButton_4.setEnabled(false);
			}
		});
		panel_1.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Noticia", null, panel_1, null);

		lblTitulo = new JLabel("Numero Noticia");

		btnNewButton_2 = new JButton("Crear Noticia");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!control.SELECT("NOTICIA", "COD_NOTICIA", new String(textField_16.getText().trim()))) {
					if (control.Insert("NOTICIA", "COD_NOTICIA,DES_NOTICIA",
							new String(textField_16.getText() + "','" + textPane.getText()))) {
						limpiarTabla(t18);
						ctrl.cargarMateriales("*", "Noticia", "", (DefaultTableModel) t18.getModel());
						textField_16.setText("");
						textPane.setText("");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Codigo ya existente", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		textField_16 = new JTextField();
		textField_16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if (isNumber(textField_16.getText())) {
					JOptionPane.showMessageDialog(null, "¡Solo puedes escribir numeros!", null,
							JOptionPane.ERROR_MESSAGE);
					textField_16.setText("");
				} else {
					btnNewButton_2.setEnabled(true);
				}
			}
		});
		textField_16.setColumns(10);

		textPane = new JTextPane();

		lblDescripcion_1 = new JLabel("Descripcion");

		scrollPane_16 = new JScrollPane();

		btnNewButton_3 = new JButton("Modificar");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (control.Update("Noticia", "DES_NOTICIA", textPane_1.getText(), "COD_NOTICIA",
						t18.getValueAt(t18.getSelectedRow(), 0).toString())) {
					limpiarTabla(t18);
					ctrl.cargarMateriales("*", "Noticia", "", (DefaultTableModel) t18.getModel());
				}
			}
		});

		btnNewButton_4 = new JButton("Eliminar");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (control.Delete("Noticia", "COD_NOTICIA", t18.getValueAt(t18.getSelectedRow(), 0).toString())) {
					limpiarTabla(t18);
					ctrl.cargarMateriales("*", "Noticia", "", (DefaultTableModel) t18.getModel());
				}
			}
		});

		textPane_1 = new JTextPane();

		JButton button_10 = new JButton("Salir");
		button_10.setForeground(new Color(255, 255, 255));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				System.exit(0);// cerrar app

			}
		});
		button_10.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		button_10.setBackground(new Color(255, 140, 0));

		JButton button_11 = new JButton("Cancel");
		button_11.setForeground(new Color(255, 255, 255));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				log.setVisible(true);
				setVisible(false);
			}
		});
		button_11.setBackground(new Color(255, 140, 0));

		lblTablaDeNoticias = new JLabel("                TABLA DE NOTICIAS");
		lblTablaDeNoticias.setFont(new Font("Arial", Font.BOLD, 31));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(34)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE).addGap(50))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(38).addGroup(gl_panel_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(scrollPane_16, GroupLayout.PREFERRED_SIZE, 744,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(87, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_panel_1.createSequentialGroup()
												.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 99,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(btnNewButton_3))
										.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 422,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnNewButton_4).addComponent(button_11,
												GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
								.addGap(104))))
				.addGroup(
						gl_panel_1.createSequentialGroup().addGap(131)
								.addGroup(
										gl_panel_1
												.createParallelGroup(
														Alignment.LEADING)
												.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
														.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
																.addComponent(lblTablaDeNoticias, Alignment.LEADING,
																		GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
																.addGroup(gl_panel_1.createSequentialGroup()
																		.addPreferredGap(ComponentPlacement.RELATED, 24,
																				Short.MAX_VALUE)
																		.addComponent(textField_16,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(122).addComponent(textPane,
																				GroupLayout.PREFERRED_SIZE, 440,
																				GroupLayout.PREFERRED_SIZE)))
														.addGap(66))
												.addGroup(gl_panel_1.createSequentialGroup().addComponent(lblTitulo)
														.addPreferredGap(ComponentPlacement.RELATED, 356,
																Short.MAX_VALUE)
														.addComponent(lblDescripcion_1).addGap(256)))));
		gl_panel_1
				.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
								.addComponent(lblTablaDeNoticias, GroupLayout.PREFERRED_SIZE, 41,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_panel_1.createSequentialGroup().addComponent(lblDescripcion_1)
												.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_panel_1.createSequentialGroup().addComponent(lblTitulo).addGap(6)))
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 114,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_16, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18).addComponent(btnNewButton_2).addGap(34)
								.addComponent(scrollPane_16, GroupLayout.PREFERRED_SIZE, 170,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_1.createSequentialGroup()
												.addGap(21).addComponent(btnNewButton_4)
												.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
										.addGroup(gl_panel_1.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(textPane_1,
														GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
								.addGap(18)
								.addGroup(
										gl_panel_1.createParallelGroup(Alignment.LEADING).addComponent(btnNewButton_3)
												.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 25,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(button_11))
								.addGap(14)));

		t18 = new JTable();
		t18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int filaSelect = t18.getSelectedRow();

				int aux = t18.getSelectedRow();
				if (t18.getSelectedRow() == aux) {
					btnNewButton_3.setEnabled(true);
					btnNewButton_4.setEnabled(true);
				} else
					btnNewButton_3.setEnabled(false);
			}

		});
		dtm = new DefaultTableModel(new Object[][] {

		}, new String[] { "Clave Noticia", "Descripcion" });
		t18.setModel(dtm);
		scrollPane_16.setViewportView(t18);
		contentPane.setLayout(gl_contentPane);

		panel_1.setLayout(gl_panel_1);

		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t19.clearSelection();
				textPane_3.setText("");
				button_8.setEnabled(false);
				button_9.setEnabled(false);
			}
		});
		panel_2.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Info", null, panel_2, null);

		textField_17 = new JTextField();
		textField_17.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if (isNumber(textField_17.getText())) {
					JOptionPane.showMessageDialog(null, "¡Solo puedes escribir numeros!", null,
							JOptionPane.ERROR_MESSAGE);
					textField_17.setText("");
				} else {
					btnCrearInfo.setEnabled(true);
				}
			}
		});

		textField_17.setColumns(10);

		btnCrearInfo = new JButton("Crear Info");
		btnCrearInfo.setEnabled(false);
		btnCrearInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!control.SELECT("INFO", "COD_INFO", new String(textField_17.getText().trim()))) {
					if (control.Insert("INFO", "COD_INFO,DES_INFO",
							new String(textField_17.getText() + "','" + textPane_2.getText()))) {
						limpiarTabla(t19);
						ctrl.cargarMateriales("*", "INFO", "", (DefaultTableModel) t19.getModel());
						textField_17.setText("");
						textPane.setText("");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Codigo ya existente", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		textPane_2 = new JTextPane();

		scrollPane_17 = new JScrollPane();

		textPane_3 = new JTextPane();

		button_8 = new JButton("Modificar");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (control.Update("INFO", "DES_INFO", textPane_3.getText(), "COD_INFO",
						t19.getValueAt(t19.getSelectedRow(), 0).toString())) {
					limpiarTabla(t19);
					ctrl.cargarMateriales("*", "INFO", "", (DefaultTableModel) t19.getModel());
				}
			}
		});
		button_8.setEnabled(false);

		button_9 = new JButton("Eliminar");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (control.Delete("INFO", "COD_INFO", t19.getValueAt(t19.getSelectedRow(), 0).toString())) {
					limpiarTabla(t19);
					ctrl.cargarMateriales("*", "INFO", "", (DefaultTableModel) t19.getModel());
				}
			}
		});
		button_9.setEnabled(false);

		label = new JLabel("Descripcion");

		lblNumeroDeInfo = new JLabel("Numero De Info");

		button_12 = new JButton("Cancel");
		button_12.setForeground(new Color(255, 255, 255));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				log.setVisible(true);
				setVisible(false);
			}
		});
		button_12.setBackground(new Color(255, 140, 0));

		button_13 = new JButton("Salir");
		button_13.setForeground(new Color(255, 255, 255));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.exit(0);// cerrar app
			}
		});
		button_13.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		button_13.setBackground(new Color(255, 140, 0));

		lblInfo = new JLabel("INFO");
		lblInfo.setFont(new Font("Arial", Font.BOLD, 31));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2
				.setHorizontalGroup(
						gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_2.createSequentialGroup().addContainerGap(88, Short.MAX_VALUE)
										.addComponent(btnCrearInfo, GroupLayout.PREFERRED_SIZE, 753,
												GroupLayout.PREFERRED_SIZE)
										.addGap(28))
								.addGroup(gl_panel_2.createSequentialGroup().addContainerGap(86, Short.MAX_VALUE)
										.addComponent(scrollPane_17, GroupLayout.PREFERRED_SIZE, 744,
												GroupLayout.PREFERRED_SIZE)
										.addGap(39))
								.addGroup(
										gl_panel_2.createSequentialGroup().addContainerGap(607, Short.MAX_VALUE)
												.addComponent(label, GroupLayout.PREFERRED_SIZE, 54,
														GroupLayout.PREFERRED_SIZE)
												.addGap(208))
								.addGroup(gl_panel_2.createSequentialGroup().addGap(55).addGroup(gl_panel_2
										.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_2.createSequentialGroup()
												.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE,
														422, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 245, Short.MAX_VALUE))
										.addGroup(gl_panel_2.createSequentialGroup()
												.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 100,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
												.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 75,
														GroupLayout.PREFERRED_SIZE)
												.addGap(245)))
										.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
												.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 69,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_panel_2.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 103,
																GroupLayout.PREFERRED_SIZE)))
										.addGap(44))
								.addGroup(gl_panel_2.createSequentialGroup().addGap(119)
										.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 86,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
										.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
												.addComponent(lblInfo).addComponent(textPane_2,
														GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE))
										.addGap(41))
								.addGroup(Alignment.LEADING,
										gl_panel_2.createSequentialGroup().addGap(127)
												.addComponent(lblNumeroDeInfo, GroupLayout.PREFERRED_SIZE, 96,
														GroupLayout.PREFERRED_SIZE)
												.addContainerGap(646, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
						.addGroup(
								gl_panel_2
										.createParallelGroup(
												Alignment.LEADING)
										.addGroup(gl_panel_2.createSequentialGroup()
												.addGroup(gl_panel_2
														.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
																.createSequentialGroup()
																.addContainerGap(65, Short.MAX_VALUE)
																.addComponent(label).addGap(9)
																.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE,
																		114, GroupLayout.PREFERRED_SIZE)
																.addGap(34))
														.addGroup(gl_panel_2.createSequentialGroup().addGap(41)
																.addComponent(lblNumeroDeInfo).addGap(12)
																.addComponent(textField_17, GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)))
												.addGap(31))
										.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
												.addComponent(lblInfo).addGap(172).addComponent(btnCrearInfo)
												.addGap(22)))
						.addPreferredGap(ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
						.addComponent(scrollPane_17, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
						.addGap(14)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
								.createSequentialGroup().addGap(14)
								.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_2.createSequentialGroup().addGap(10).addComponent(button_8))
										.addGroup(gl_panel_2.createSequentialGroup().addGap(18).addComponent(button_13,
												GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel_2.createSequentialGroup().addGap(39).addComponent(button_9)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(button_12)))
						.addGap(14)));

		t19 = new JTable();
		t19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int aux = t19.getSelectedRow();
				if (t19.getSelectedRow() == aux) {
					button_8.setEnabled(true);
					button_9.setEnabled(true);
				} else
					button_8.setEnabled(false);
			}
			
		});
		t19.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Numero de info", "Descripcion" }));
		scrollPane_17.setViewportView(t19);
		panel_2.setLayout(gl_panel_2);

	}

	/**
	 * method to exit the app
	 */
	private void Log_out() {
		setVisible(false);
		System.exit(0);// cerrar app
	}

	/**
	 * Method to go to logIn
	 */
	private void cancel() {
		log.setVisible(true);
		setVisible(false);
	}

	/**
	 * method to set login in mantenimiento
	 * 
	 * @param log
	 */
	public void setLog(Login log) {
		this.log = log;
	}

	/**
	 * Method to make a the conexion
	 * 
	 * @param conex
	 */
	public void setControler(Cotroler conex) {
		control = conex;
	}

	/**
	 * Method to verificate if is number
	 * 
	 * @param letra
	 * @return
	 */
	public boolean isNumber(String letra) {
		ArrayList<Character> numeros = new ArrayList<Character>();
		numeros.add('1');
		numeros.add('2');
		numeros.add('3');
		numeros.add('4');
		numeros.add('5');
		numeros.add('6');
		numeros.add('7');
		numeros.add('8');
		numeros.add('9');
		numeros.add('0');
		for (int i = 0; i < letra.length(); i++) {
			for (int j = 0; j < numeros.size(); j++) {
				if (letra.charAt(i) == numeros.get(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public void setCtrl(Cotroler ctrl) {
		this.ctrl = ctrl;
	}

	public void setBd(Conexion2Oracle bd) {
		this.bd = bd;
	}

	/**
	 * Method to include new content to a Jtable
	 * 
	 * @param infotabla
	 */
	public void rellenarTabla(DefaultTableModel infotabla) {
		String[][] tabla = bd.getMateriales();
		DefaultTableModel modelo = infotabla;
		for (int i = 0; i < tabla.length; i++) {
			modelo.addRow(tabla[i]);
		}
	}

	/**
	 * Method to eliminated all data of a table
	 * 
	 * @param tabla
	 */
	public void limpiarTabla(JTable tabla) {
		for (int i = 0; i < tabla.getRowCount(); i++) {
			DefaultTableModel modeling = (DefaultTableModel) tabla.getModel();
			modeling.removeRow(i);
			i -= 1;
		}
	}

	 /** Method to include new content to a JComboBox 
	 * @param comboBoxModel
	 */
	public void rellenarComboBox(ComboBoxModel comboBoxModel) {
		String[] comboBox = bd.getComboBox();
		ComboBoxModel model = comboBoxModel;
		for (int i = 0; i < comboBox.length; i++) {
			((DefaultComboBoxModel) model).addElement(comboBox[i]);;
		}
	}
	/**
	 * Method to eliminated all data of a table
	 * 
	 * @param tabla
	 */
	public void limpiarComboBox(ComboBoxModel infotabla) {
		for (int i = 0; i < infotabla.getSize(); i++) {
			ComboBoxModel modeling = infotabla;
			((DefaultComboBoxModel) modeling).removeElementAt(i);;
			i -= 1;
		}
	}

	public void buscarInfo(JTextField txtF) {
		txtF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
	}
/**
 * JBUtonAceptar Genaliced
 * @param tablas
 * @param columnas
 * @param valores
 * @param Jtable
 */
	public void botonInsertar(JButton btn,String tablas, String columnas, String valores) {
				if (!control.SELECT(tablas, columnas, valores.trim())) {
					if (control.Insert(tablas,columnas,valores.trim())) {
						System.out.println(tablas +" " +columnas +" "+valores);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Datos ya existentes", null, JOptionPane.ERROR_MESSAGE);
				}
		
	}
	/**
	 *JBUtonElimionar Genaliced 
	 * @param tablas
	 * @param columnas
	 * @param valores
	 * @param Jtable
	 */
	public void botonEliminar(JButton btn,String tablas, String columnas, String valores,JTable Jtable){

				if (control.Delete(tablas,columnas, Jtable.getValueAt(Jtable.getSelectedRow(), 0).toString())) {
					limpiarTabla(Jtable);
					ctrl.cargarMateriales(columnas,tablas,"", (DefaultTableModel) Jtable.getModel());
				}
			
	}
	/**
	 * JButonModificar Generaliced
	 * @param btn
	 * @param tablas
	 * @param columnas
	 * @param nuevoDato
	 * @param Jtable
	 */
	public void botonModificar(JButton btn,String tablas, String columnas, String nuevoDato,JTable Jtable){//String tabla,String columna,String new_dato,String colum_clave,String clave
				if (control.Update(tablas, columnas, nuevoDato, Jtable.getColumnName(Jtable.getSelectedRow()),
						Jtable.getValueAt(Jtable.getSelectedRow(), 0).toString())) {
					limpiarTabla(t18);
					ctrl.cargarMateriales("*", "Noticia", "", (DefaultTableModel) Jtable.getModel());
				}
	}
	
	public void añadirTabla(String f ,String s,String m){
		String Cod_F=control.SSELECT("cod_Familia","FAMILIA","nom_familia",f);
		System.out.println("codf= "+Cod_F);
		String Cod_S=control.SSELECT("COD_SUBFAMILIA","SUBFamilia","nom_subfamilia",s); 
		System.out.println("cods= "+Cod_S);
		String Cod_M=control.SSELECT("COD_MATERIAL","MATERIAL","nom_material",m);
		System.out.println("codm= "+Cod_M);
		control.Update("SUBFAMILIA","FAMILIA_COD_FAMILIA",Cod_F,"COD_SUBFAMILIA",Cod_S);
		control.Update("MATERIAL", "SUBFAMILIA_COD_SUBFAMILIA",Cod_S,"COD_MATERIAL",Cod_M);
		}
	public void añadirTablaProp(String f ,String s,String v,String u){
		String Cod_Cat=control.SSELECT("COD_CAT_PROP_M","CAT_PROP_M","NOM_CAT_M",f);
		System.out.println("codf= "+Cod_Cat);
		String Cod_Prop=control.SSELECT("COD_PROP_M","PROP_M","NOM_PROP_M",s); 
		System.out.println("cods= "+Cod_Prop);
		String Valor=control.SSELECT("COD_MATERIAL","MATERIAL","nom_material",v);
		System.out.println("codm= "+Valor);
		String Unidad=control.SSELECT("COD_MATERIAL","MATERIAL","nom_material",u);
		System.out.println("codm= "+Unidad);
//		control.Update("SUBFAMILIA","FAMILIA_COD_FAMILIA",Cod_Cat,"COD_SUBFAMILIA",Cod_Prop);
//		control.Update("MATERIAL", "SUBFAMILIA_COD_SUBFAMILIA",Valor,"COD_MATERIAL",Cod_M);
		}
	
	public void añadirTablaDim(String c ,String f,String d){
		String Cod_C=control.SSELECT("COD_CAT_FORMATO","CAT_FORMATO","NOM_CAT_FORMATO",c);
		System.out.println("codc= "+Cod_C);
		String Cod_F=control.SSELECT("COD_FORMATO","FORMATO","NOM_FORMATO",f); 
		System.out.println("cods= "+Cod_F);
		String Cod_D=control.SSELECT("COD_DIMENSION","DIMENSIONES","NOM_DIMENSION",d);
		System.out.println("codm= "+Cod_D);
		control.Update("FORMATO","CAT_FORMATO_COD_CAT_FORMATO",Cod_C,"COD_FORMATO",Cod_F);
		control.Update("DIMENSIONES", "FORMATO_COD_FORMATO",Cod_F,"COD_DIMENSION",Cod_D);
		}
}
	
