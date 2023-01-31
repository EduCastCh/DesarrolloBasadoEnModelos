public class App {
    public static void main(String[] args) {
		Xiaomi xiaomi = new Xiaomi("9");
	
        Celular1 celular1 = new Celular1(xiaomi);
        Celular2 celular2 = new Celular2(xiaomi);
        Celular3 celular3 = new Celular3(xiaomi);

        xiaomi.setModel ("9");
        xiaomi.setModel ("9S");
        xiaomi.setModel ("9PRO");
		
	}
}
