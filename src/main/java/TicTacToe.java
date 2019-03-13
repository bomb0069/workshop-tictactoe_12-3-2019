public class TicTacToe {

    private String[] board = new String[9];
    private boolean boardIsEmpty = true;
    private String nextMark = "X";

    public boolean isEmpty() {
        return boardIsEmpty;
    }

    public void mark(int move) {
        board[move - 1] = nextMark;
        boardIsEmpty = false;
        switchPlayer();
    }

    private void switchPlayer() {
        if (nextMark.equals("X")){
            nextMark = "O";
        } else {
            nextMark = "X";
        }
    }

    public boolean hasAnyWinner(String markValue) {
        return markValue.equals(board[0]) && board[0].equals(board[1]) && board[0].equals(board[2]);
    }

    public String getStatus() {
        String previousMark = (nextMark.equals("X") ? "O" : "X");
        if (hasAnyWinner(previousMark)) {
            return previousMark + "Win";
        }
        return "continue" + nextMark;
    }
}
