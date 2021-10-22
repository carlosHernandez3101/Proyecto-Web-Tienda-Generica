package modelo;

import controlador.ConexionBD;

public class ReportesDTO {

	private ReportesDAO reportesDao;
	private ConexionBD conexion;

	public ReportesDTO() {
		this.conexion = new ConexionBD();
		this.reportesDao = new ReportesDAO(conexion);
	}

	public ReportesDAO getReportesDao() {
		return reportesDao;
	}

	public void setReportesDao(ReportesDAO reportesDao) {
		this.reportesDao = reportesDao;
	}

	public ConexionBD getConexion() {
		return conexion;
	}

	public void setConexion(ConexionBD conexion) {
		this.conexion = conexion;
	}

}
