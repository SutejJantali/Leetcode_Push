class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        mi = len(matrix)
        mj = len(matrix[0])

        def cycle(mi, mj, i, j):
            al = []

            # Top row: left -> right
            al.append(matrix[i][j])

            if mj > 1:
                for x in range(mj - 1):
                    j += 1
                    al.append(matrix[i][j])

            # Right column: top -> bottom
            if mi > 1:
                for x in range(mi - 1):
                    i += 1
                    al.append(matrix[i][j])

            # Bottom row: right -> left
            if mi > 1 and mj > 1:
                for x in range(mj - 1):
                    j -= 1
                    al.append(matrix[i][j])

            # Left column: bottom -> top
            if mi > 2 and mj > 1:
                for x in range(mi - 2):
                    i -= 1
                    al.append(matrix[i][j])

            # Move to inner matrix
            j += 1
            mi -= 2
            mj -= 2

            if mi <= 0 or mj <= 0:
                return al

            return al + cycle(mi, mj, i, j)

        return cycle(mi, mj, 0, 0)