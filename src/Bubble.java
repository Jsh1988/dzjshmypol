public class Bubble {
    private int []array;

    public Bubble(int []array){
        this.array = array;
    }

    private void swap(int []array, int index){
        int temp = array[index-1];
        array[index-1] = array[index];
        array[index] = temp;
    }

    //Ascending sort function
    public int []bubbleSortR(){
        int []resArr = array;
        for(int i = 1; i < resArr.length; i++){
            for(int j = resArr.length-1; j >= i; j--){
                if(resArr[j-1] < resArr[j]) swap(resArr,j);
            }
        }
        return resArr;
    }
    //Sort function in descending order
    public int []bubbleSortL(){
        int []resArr = array;
        for(int i = 1; i < resArr.length; i++){
            for(int j = resArr.length-1; j >= i; j--){
                if(resArr[j-1] > resArr[j]) swap(resArr,j);
            }
        }
        return resArr;
    }
}
