package application;

import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessPPosition(sc);
				
				System.out.println();
				System.out.println("Target: ");
				ChessPosition target = UI.readChessPPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMovo(source, target);	
			}
			catch(ChessException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
