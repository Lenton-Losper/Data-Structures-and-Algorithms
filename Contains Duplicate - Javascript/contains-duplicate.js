// an algorithm build to check if an array of numbers contains a duplicate

var arr = [1,2,3,4,1]

function check(array){
    var k = array.length;
    c= false;
    low = 0;
    high = k;
    mid = low + (high - low) / 2
    val = array[mid]

   for(var i = 0; i<k ;i++){
    while(low < high){
        if(array[i] < val){
            low = mid + 1;
        }
        else if( array[i] > val){
            low = mid -1;

        }
        else{
            c = true;
            break;

        }
    }
   }2
   return c;

}






check(arr)