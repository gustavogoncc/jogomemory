import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class JogoMemoria {
	public static void main(String[]args) {
		JogoMemoria game = new JogoMemoria();
		game.startGame();
	}
	
	private void startGame() {
		Scanner scanner = new Scanner(System.in);
		Integer [] array = {1,1,2,2,3,3,4,4,5,5};
		List<Integer> cartas = Arrays.asList(array);
		Collections.shuffle(cartas);
		Integer[] guessArray = new Integer[10];
		int paresEncontrados = 0;
		
		while(paresEncontrados < 5) {
			System.out.println("Estado atual:"+ Arrays.toString(guessArray));
			System.out.println("Insira dois índices de cartas para revelar");
			
			int palpite1 = scanner.nextInt();
			int palpite2 = scanner.nextInt();
			
			if(cartas.get(palpite1).equals(cartas.get(palpite2))) {
				System.out.println("Você encontrou um par!");
				guessArray[palpite1] = cartas.get(palpite1);
				guessArray[palpite2] = cartas.get(palpite2);
				paresEncontrados++;
			}else {
				System.out.println("Desculpe, esses cartões não correspondem. Tente novamente!");
				
			}
			}
		System.out.println("Parabéns, você venceu. Estado final: "+ Arrays.toString(array));
		
	}

}
