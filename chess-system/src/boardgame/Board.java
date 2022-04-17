package boardgame;

public class Board {
	private static final String POSITION_NOT_ON_THE_BOARD = "Position not on the board";

	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}

		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return this.rows;
	}

	public int getColumns() {
		return this.columns;
	}

	public Piece piece(int row, int column) {
		if (!this.positionExists(row, column)) {
			throw new BoardException(POSITION_NOT_ON_THE_BOARD);
		}
		return this.pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!this.positionExists(position)) {
			throw new BoardException(POSITION_NOT_ON_THE_BOARD);
		}
		return this.pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (this.thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}

		this.pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	public boolean positionExists(Position position) {
		return this.positionExists(position.getRow(), position.getColumn());
	}

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < this.rows && column >= 0 && column < this.columns;
	}

	public boolean thereIsAPiece(Position position) {
		if (!this.positionExists(position)) {
			throw new BoardException(POSITION_NOT_ON_THE_BOARD);
		}
		return this.piece(position) != null;
	}
}
