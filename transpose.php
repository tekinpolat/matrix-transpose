<?php
function transpose($arr){
    $colCount   = count($arr[0]);
    $rowCount   = count($arr);
    $new_arr    = [];

    for($col = 0; $col < $colCount; $col++){
        $temp_arr = [];
        for($row = 0; $row < $rowCount; $row++){
            $temp_arr[] = $arr[$row][$col];
        }
        $new_arr[] = $temp_arr;
    }   

    return $new_arr;
}

$arr = [
    [1, 2, 100, 103],
    [3, 4, 101, 104],
    [5, 6, 102, 105],
    [7, 8, 103, 106],
    [9, 10,107, 108],
];

#echo "<pre>";
#print_r($arr);

$result = transpose($arr);
print_r($result);