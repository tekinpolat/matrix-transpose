transpose <- function(matrix_values){
    COL_LENGTH <- ncol(matrix_values)
    ROW_LENGTH <- nrow(matrix_values)


    transpose_arr  <- matrix(data = 0, nrow = COL_LENGTH, ncol = ROW_LENGTH)

    for(row in 1:ROW_LENGTH){
        for(col in 1:COL_LENGTH){
            transpose_arr[col,row] <- matrix_values[row, col]
        }
    }
    return(transpose_arr)
}

matrix_values  <- matrix(data = 1:20, nrow = 10, ncol = 2)
transpose_matrix <- transpose(matrix_values)
print(transpose_matrix)