package lista03q07;

public class TestHora {

	public static void main(String[] args) {
		Hora ObjetoHora1 = new Hora();
		Hora ObjetoHora2 = new Hora();
		
		ObjetoHora1.hour="13:57:35";
		ObjetoHora2.hour="05:04:25";
		
		System.out.println ("Hora = " + ObjetoHora1.RetornarHora());
		System.out.println ("Minuto = " + ObjetoHora1.RetornarMinuto());
		System.out.println ("Segundo = " + ObjetoHora1.RetornarSegundo());
		System.out.println ("Soma das Horas = " + ObjetoHora1.SomarHora(ObjetoHora2));
		System.out.println ("Subtração das Horas = " + ObjetoHora1.SubtrairHora(ObjetoHora2));		
	}

}
