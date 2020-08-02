from pprint import pprint
def transpose(matrix):
    news_matrix     = []

    rows_length     = len(matrix)
    columns_length  = len(matrix[0]) 

    for col in range(columns_length):
        row_matris = []
        for row in range(rows_length):
            row_matris.append(matrix[row][col])
        news_matrix.append(row_matris)

    return news_matrix


matrix = [
    [1,     2,      11],
    [3,     4,      12],
    [5,     6,      13],
    [7,     8,      14],
    [9,     10,     15],
    [9,     17,     16],
    [100,   101,    102],
    [103,   104,    105],
]

transpose_matrix = transpose(matrix)
#transpose_matrix_transpose = transpose(transpose_matrix)
#print(transpose_matrix_transpose)
pprint(transpose_matrix)