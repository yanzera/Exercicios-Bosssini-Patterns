package Exercicio8_1;

public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Diego", noticiario);
	noticiario.notificaNoticia("Uma nova noticia", 1, 2, "Topicos interessantes!");
	new Consumidor("Matheus", noticiario);
	noticiario.notificaNoticia("Uma noticia mais nova ainda", 2, 2, "Topico ruim");
	
	
	}
}
