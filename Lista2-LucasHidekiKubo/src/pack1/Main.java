package pack1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustosVariaveis mes1 = new CustosVariaveis("200.20");
		mes1.setDataValideadeDoBoleto(10, 01, 2021);
		System.out.println("Valor sem formata��o: ".toUpperCase() + mes1.getValor());
		System.out.println("Valor com formata��o: ".toUpperCase()  + mes1.getValorFormatado());
		System.out.println("Valor de gasto fixo: ".toUpperCase()  + mes1.consultarValorFixo(CustosFixosMensais.AGUA));
		System.out.println("Data de validade do boleto: ".toUpperCase() + mes1.getDataValidadeDoBoleto());
		System.out.println("Hor�rio da validade do boleto: ".toUpperCase() + mes1.getHorarioValidadeDoBoleto());
	}

}
