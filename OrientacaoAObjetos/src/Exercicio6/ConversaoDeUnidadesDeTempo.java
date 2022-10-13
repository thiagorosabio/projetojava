package Exercicio6;
//6. Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos

//para conversão aproximada das unidades de velocidade segundo a lista
//abaixo.
//• 1 minuto = 60 segundos
//• 1 hora = 60 minutos
//• 1 dia = 24 horas
//• 1 semana = 7 dias
//• 1 mês = 30 dias
//• 1 ano = 365.25 dias

public class ConversaoDeUnidadesDeTempo {

	// Metodo de converção minutos para Segundos

	public static double converteMinuto(double numero) {
		return numero * 60;
	}

	// Metodo de converção Horas para Minutos

	public static double converteHora(double numero) {
		return numero * 60;
	}

	// Metodo de converção Dias para Horas

	public static double converteDia(double numero) {
		return numero * 24;
	}

	// Metodo de converção Semanas para Dias

	public static double converteSemana(double numero) {
		return numero * 7;
	}

	// Metodo de converção Meses para Dias

	public static double converteMes(double numero) {
		return numero * 30;
	}

	// Metodo de converção Anos para Dias

	public static double converteAno(double numero) {
		return numero * 365;

	}

}
