class Solution {
    public static boolean fun(char[][] board,int row,int col){
        HashSet<Character> set1= new HashSet<>();
        int n=board.length;
        HashSet<Character> set2= new HashSet<>();
        int m=board[0].length;
        set1.add(board[row][col]);
        set2.add(board[row][col]);
        for(int i=0;i<n;i++){
            char ele=board[row][i];
            if(ele=='.'||i==col) continue;
            else if(set1.contains(ele)) return false;
            else set1.add(ele);
        }
        for(int i=0;i<m;i++){
            char ele=board[i][col];
            if(ele=='.'||i==row) continue;
            else if(set2.contains(ele)) return false;
            else set2.add(ele);
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> boxes= new ArrayList<>();
        for(int i=0;i<9;i++){
            boxes.add(new HashSet<>());
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int row=i;int col=j;
                char ele=board[row][col];
                int box=(row/3)*3+(col/3);
                if(ele=='.') continue;
                else if(!boxes.get(box).contains(ele))
                    boxes.get(box).add(ele);
                else return false;
                if(!fun(board,row,col)) return false;

            }
        }
        return true;
    }
}
