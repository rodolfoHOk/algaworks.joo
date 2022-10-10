package com.algaworks.curso.joo.avancados.datas;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {

	private Date dataUltimoPeriodoMenstrual;

	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
	
	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}
	
	public Date calcularDataEstimadaConcepcao() {
		Calendar c = converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		c.add(Calendar.WEEK_OF_YEAR, 2);
		return c.getTime();
	}
	
	public Date calcularDataEstimadaParto() {
		Calendar c = converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		c.add(Calendar.WEEK_OF_YEAR, 40);
		return c.getTime();
	}

}
