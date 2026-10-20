class Solution {
      void reverse(int arr[]){
        int left = 0 , right =arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;

            left++;
            right--;
        }
    }
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        

        for(int i =0 ; i < m ; i++){
            for(int j = i + 1 ; j < m ; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i = 0 ; i < m ;i++){
            reverse(matrix[i]);
        }
    }
}
        
    
    
    
