package Exercicio6_1;

import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date(System.currentTimeMillis()));
		int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

		
		MensagemDoDia mensagem = null;
		switch (diaSemana) {
		case Calendar.SUNDAY:
			mensagem = new MensagemDomingo();
			break;
		case Calendar.MONDAY:
			mensagem = new MensagemSegunda();
			break;
		case Calendar.TUESDAY:
			mensagem = new MensagemTerca();
			break;
		case Calendar.WEDNESDAY:
			mensagem = new MensagemQuarta();
			break;
		case Calendar.THURSDAY:
			mensagem = new MensagemQuinta();
			break;
		case Calendar.FRIDAY:
			mensagem = new MensagemSexta();
			break;
		case Calendar.SATURDAY:
			mensagem = new MensagemSabado();
			break;
		}

		
		mensagem.imprimir();
	}
}
