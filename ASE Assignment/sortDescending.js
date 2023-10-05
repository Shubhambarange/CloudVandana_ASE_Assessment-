// 2. Perforn sorting of an array in descending order.

function sortDescending(arr) {
  for (let i = 0; i < arr.length - 1; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[i] < arr[j]) {
        // Swap elements if they are out of order
        const temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
  return arr;
}

const inputArray = [5, 2, 9, 1, 5, 6];
const sortedArray = sortDescending(inputArray);
console.log("Sorted Array in Descending Order:", sortedArray);
