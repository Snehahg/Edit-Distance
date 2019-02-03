class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n= word2.length();
        int[][] wordMap = new int[m+1][n+1];
        //wordMap[0][0]=0;
        for(int i=0;i<=m;i++ ){
            wordMap[i][0]=i;
        }
            
        for(int j=0;j<=n;j++){
            wordMap[0][j]=j;
        }
       
      for(int i=1; i<=m;i++){
            for(int j=1; j<=n ; j++){
                if(word1.charAt(i-1)!=(word2.charAt(j-1))){
                    wordMap[i][j]= 1+ Math.min(wordMap[i-1][j-1], Math.min(wordMap[i-1][j],wordMap[i][j-1]));
                }
                    else{
                       wordMap[i][j]= wordMap[i-1][j-1]; 
                    }
                }
            }
        return wordMap[m][n];
        }
    }
