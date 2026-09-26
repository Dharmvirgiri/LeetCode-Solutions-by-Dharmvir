/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let returnedArray = [];
    let j = 0;

        for (let i = 0; i < arr.length; i++) {
        if(fn(arr[i],i)){
            returnedArray[j] = arr[i];
            j++;
          }
        }
        return returnedArray;
};