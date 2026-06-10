class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<>();
        HashSet<Character> col = new HashSet<>();
        HashSet<Character> box = new HashSet<>();

        for(int r = 0; r < board.length; r++){
            row.clear();
            for(int c = 0; c < board.length; c++){
                if(board[r][c] != '.'){
                    if(row.contains(board[r][c])) return false;
                    row.add(board[r][c]);
                }
                

                if(board[c][r] != '.'){
                    if(col.contains(board[c][r])) return false;
                    col.add(board[c][r]);
                }
                
            }
            col.clear();
        }

        for(int r = 0; r < 9; r += 3){
            for(int c = 0; c < 9; c += 3){
                box.clear();
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        if(board[r+i][c+j] != '.'){
                            if(box.contains(board[r+i][c+j])) return false;
                            box.add(board[r+i][c+j]);   
                        }
                    }
                }
            }
        }

        return true;

    }
}
