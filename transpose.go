package main
import (
	"fmt"
)
func transpose(arr [][]int) [][]int{
	var COL_LENGTH  int = len(arr[0])
	var ROW_LENGTH	int = len(arr)

	transpose_arr := [][]int{}

	for col:=0; col < COL_LENGTH; col++{
		temp_arr := [] int{}
		for row := 0; row < ROW_LENGTH; row++{
			temp_arr = append(temp_arr, arr[row][col])
		}
		transpose_arr = append(transpose_arr, temp_arr)
	}

	return transpose_arr

}

func main() {
	arr := [][]int{  
		{0, 1, 2, 3},  
		{4, 5, 6, 7},  
		{8, 9, 10,11},
		{10,11,12,13},
	}

	transpose_arr := transpose(arr)
	fmt.Println(transpose_arr)
}