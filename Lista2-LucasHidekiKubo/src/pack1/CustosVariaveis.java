package pack1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class CustosVariaveis {
	private BigDecimal valor;
	private static final String UNIDADE_MONETARIA = ("R$");
	private static final DecimalFormat FORMATO = new DecimalFormat(UNIDADE_MONETARIA + " #,###,##0.00");
	private LocalDate dataValidadeDoBoleto;
	private final LocalTime horarioValidadeDoBoleto = LocalTime.of(12, 00);
	
	public CustosVariaveis (String valor) {
		this.valor = new BigDecimal(valor);
	}
	public BigDecimal getValor() {
		return valor;
	}
	
	public String getValorFormatado () {
		return FORMATO.format(valor);
	}
	
	public LocalDate getDataValidadeDoBoleto() {
		return dataValidadeDoBoleto;
	}
	
	public void setDataValideadeDoBoleto (int diaDeValidade, int mesValidade, int anoValidade) {
		dataValidadeDoBoleto = LocalDate.of(anoValidade,mesValidade,diaDeValidade);
	}
	
	public LocalTime getHorarioValidadeDoBoleto() {
		return horarioValidadeDoBoleto;
	}
	
	public int consultarValorFixo(CustosFixosMensais tipo) {
		return tipo.getValor();
	}
	
}
