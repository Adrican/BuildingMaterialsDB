package Controler;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Model.Conexion2Oracle;


public class Cotroler {
	private Conexion2Oracle model;
	private Conexion2Oracle db;
/**
 * Method to certificate the user and the pasword in oracle	
 * @param user
 * @param pass
 * @return
 */
 public boolean isIntro(String usuario, String contra){
	 return model.Introduccion(usuario, contra);
 }
 /**
  * Inser tabla USUARIOS
  * @param user
  * @param pass
  * @return
  */
 public boolean isSignIn(String user,String pass,String email){
	 String dato=user+"','"+pass+"','"+email;
	 String columna="USERS,PASS,CORREO";
	 return model.INSERT("USUARIO", columna, dato);
 }
 /**
  * Method to certificate that the user does not exist
  * @param Dato
  * @return
  */
 public boolean isUserAsiged(String Dato){
	 return model.SELECT("USUARIO","*", "USERS",Dato );
 }
 
 /**
  * Method to make a Select
  * @param tabla
  * @param columna
  * @param dato
  * @return
  */
 public boolean SELECT(String tabla,String columna,String dato){
	 return model.SELECT(tabla,"*", columna, dato);
 }
 /**
  * Method to make a Select
  * @param tabla
  * @param columna
  * @param dato
  * @return
  */
 public String SSELECT(String objetivo,String tabla,String columna,String dato){
	 return model.SSELECT(tabla, objetivo, columna, dato);
 }
 /**
  * Insert could be modificte to 2 or more columns by ading , and amplify to 2 or moro date by ading ',' 
  * @param tabla
  * @param columna
  * @param dato
  * @return
  */
 public boolean Insert(String tabla,String columna,String dato){
	 return model.INSERT(tabla, columna, dato);
 }
 /**
  * Method to update a table with only uno colum
  * @param tabla
  * @param columna
  * @param new_dato
  * @param colum_clave
  * @param clave
  * @return
  */
 public boolean Update(String tabla,String columna,String new_dato,String colum_clave,String clave){
	 return model.UPDATE(tabla, columna, new_dato, colum_clave, clave);
 }
 /**
  * Method to delete
  * @param tabla
  * @param colum_clave
  * @param clave
  * @return
  */
 public boolean Delete(String tabla,String colum_clave,String clave){
	 return model.DELETE(tabla, colum_clave, clave);
 }
 public boolean DeleteMat(String tabla,String colum_clave){
	 return model.DELETEMat(tabla, colum_clave);
 }

 /**
  * Method to asume
  * @param table
  * @return
  */
 public String[] getTable(String table){
	 String[]tabla=model.GetTable(table.trim()).split(",");
	return tabla;
 }
 /**
  * Method to make a the conexion 
  * @param conex
  */
 	public void setConection(Conexion2Oracle conex) {
 		model = conex;
 	}
 	/**
 	 * Method to verificate if is number
 	 * @param letra
 	 * @return
 	 */
 	public boolean isNumber(String letra){
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
				if(letra.charAt(i)==numeros.get(j)){
					return false;
				}
			}
		}
 		return true;
 	}
	public void makeConexion(){
		try {
			model.conexion();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No es posible realizar la conexion");
		}
	}
	public void setDb(Conexion2Oracle db) {
		this.db = db;
	}

	public void cargarMateriales(String columna,String Tabla,String condiciones,DefaultTableModel dtm){
		db.consultaMateriales( columna, Tabla,condiciones, dtm);
	}
	public void cargarComboBox(String Tabla, String Objetivo){
		db.SelectComboBox(Tabla, Objetivo);
	}
}


