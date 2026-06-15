class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<>();
        HashSet<Character> col = new HashSet<>();

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                if(board[c][r] != '.'){
                    if(row.contains(board[c][r])) return false;
                    row.add(board[c][r]);
                }
                if(board[r][c] != '.'){
                    if(col.contains(board[r][c])) return false;
                    col.add(board[r][c]);
                }
            }
            col.clear();
            row.clear();
        }

        HashSet<Character> square = new HashSet<>();
        for(int r = 0; r < board.length; r += 3){
            for(int c = 0; c < board[r].length; c += 3){
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        if(board[r+i][c+j] != '.'){
                            if(square.contains(board[r+i][c+j])) return false;
                            square.add(board[r+i][c+j]);
                        }
                    }
                }
                square.clear();
            }
        }
        return true;
    }
}
