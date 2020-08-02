function transpose(arr){
    const COL_LENGTH = arr[0].length;
    const ROW_LENGTH = arr.length;
    let tranpose_arr = [];

    let temp_arr
    for(let col = 0; col < COL_LENGTH; col++){
        temp_arr = [];
        for(let row = 0; row < ROW_LENGTH; row++){
            temp_arr.push(arr[row][col])
        }
        tranpose_arr.push(temp_arr);
    }
    return tranpose_arr;
}


const arr = [
    [1, 2, 3, 7, 9],
    [4, 5, 6, 8, 10],
    [11,12,13,14,15],
];

console.table(arr);
const tranpose_arr = transpose(arr);

console.table(tranpose_arr);