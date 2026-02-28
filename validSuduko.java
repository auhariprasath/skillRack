class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            boolean[] ar1 = new boolean[9];
            boolean[] ar2 = new boolean[9];
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                char ch2 = board[j][i];
                if(ch!='.'){
                    int val = ch - '1';
                    if(ar1[val]){
                        return false;
                    }
                    ar1[val] = true;
                }
                if(ch2!='.'){
                    int val = ch2 - '1';
                    if(ar2[val]){
                        return false;
                    }
                    ar2[val] = true;
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                boolean[] ar = new boolean[9];
                for(int l=i*3;l<i*3+3;l++){
                    for(int k=j*3;k<j*3+3;k++){
                        char ch = board[l][k];
                        if(ch!='.'){
                            int val = ch -'1';
                            if(ar[val])return false;
                            ar[val] = true;
                        }
                    }
                }   
            }
        }
        return true;
    }
}