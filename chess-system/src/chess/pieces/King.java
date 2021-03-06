package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
	private ChessMatch chessMatch;

	public King(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) this.getBoard().piece(position);
		return p == null || p.getColor() != this.getColor();
	}

	private boolean testRookCastling(Position position) {
		ChessPiece p = (ChessPiece) this.getBoard().piece(position);
		return p instanceof Rook && p.getColor() == this.getColor() && p.getMoveCount() == 0;
	}

	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[this.getBoard().getRows()][this.getBoard().getColumns()];

		Position p = new Position(0, 0);

		// above
		p.setValues(this.position.getRow() - 1, this.position.getColumn());

		if (this.getBoard().positionExists(p) && this.canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// below
		p.setValues(this.position.getRow() + 1, this.position.getColumn());

		if (this.getBoard().positionExists(p) && this.canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// left
		p.setValues(this.position.getRow(), this.position.getColumn() - 1);

		if (this.getBoard().positionExists(p) && this.canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// right
		p.setValues(this.position.getRow(), this.position.getColumn() + 1);

		if (this.getBoard().positionExists(p) && this.canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// northwest
		p.setValues(this.position.getRow() - 1, this.position.getColumn() - 1);

		if (this.getBoard().positionExists(p) && this.canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// northeast
		p.setValues(this.position.getRow() - 1, this.position.getColumn() + 1);

		if (this.getBoard().positionExists(p) && this.canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// south-west
		p.setValues(this.position.getRow() + 1, this.position.getColumn() - 1);

		if (this.getBoard().positionExists(p) && this.canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// southeast
		p.setValues(this.position.getRow() + 1, this.position.getColumn() + 1);

		if (this.getBoard().positionExists(p) && this.canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// special move castling
		if (this.getMoveCount() == 0 && !this.chessMatch.getCheck()) {
			// special move castling king side rook
			Position posT1 = new Position(this.position.getRow(), this.position.getColumn() + 3);

			if (this.testRookCastling(posT1)) {
				Position p1 = new Position(this.position.getRow(), this.position.getColumn() + 1);
				Position p2 = new Position(this.position.getRow(), this.position.getColumn() + 2);

				if (this.getBoard().piece(p1) == null && this.getBoard().piece(p2) == null) {
					mat[this.position.getRow()][this.position.getColumn() + 2] = true;
				}
			}

			// special move castling queen side rook
			Position posT2 = new Position(this.position.getRow(), this.position.getColumn() - 4);

			if (this.testRookCastling(posT2)) {
				Position p1 = new Position(this.position.getRow(), this.position.getColumn() - 1);
				Position p2 = new Position(this.position.getRow(), this.position.getColumn() - 2);
				Position p3 = new Position(this.position.getRow(), this.position.getColumn() - 3);

				if (this.getBoard().piece(p1) == null && this.getBoard().piece(p2) == null
						&& this.getBoard().piece(p3) == null) {
					mat[this.position.getRow()][this.position.getColumn() - 2] = true;
				}
			}
		}

		return mat;
	}
}
