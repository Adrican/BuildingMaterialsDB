package IniciarApp;

import java.io.IOException;

import Controler.Cotroler;
import Model.Conexion2Oracle;
import View.Configuracion;
import View.Login;
import View.Mantenimiento;
import View.SignIn;

public class IniciarApp {
	static Conexion2Oracle model;
	public static void main(String[] args) throws IOException {
		/*Creacion de Ventanas*/
		Login vntnLog = new Login();
		SignIn vntnSI = new SignIn();
		Mantenimiento mant = new Mantenimiento();
		Configuracion vntConfig = new Configuracion();
		model=new Conexion2Oracle(vntConfig);
		Cotroler control = new Cotroler();
		
		
		
		
		/*Conexion a Oracle*/
		vntnLog.setControler(control);
		control.setConection(model);
		vntnSI.setControler(control);
		vntnSI.setConection(model);
		mant.setControler(control);
		mant.setBd(model);
		mant.setCtrl(control);
		model.setMateriales(mant);
		control.setDb(model);
		
		
		
		/*Relaciones entre ventanas*/
		vntnSI.setfrmLogin(vntnLog);
		vntnSI.setMenuManagement(mant);
		vntnLog.setMenuManagement(mant);
		vntnLog.setfrmManagement(vntnSI);
		vntnLog.setfrmConfig(vntConfig);
		vntConfig.setfrmLogin(vntnLog);
		vntConfig.setControl(control);
		
		
		mant.setLog(vntnLog);
		
		/*Volver visible la ventana de lOgIn*/
		vntnLog.setVisible(true);

	}
	public void setModel(Conexion2Oracle model){
		this.model=model;
	}
}