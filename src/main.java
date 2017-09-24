import java.io.IOException;


class Main{

    private int w;
    private int h;
    private String width = "";
    private String height = "";
    private int ch = -1;
    char[][] matrix;
    int temp = -1;

    public static void main(String[] args) throws IOException {
        Main path = new Main();
        path.ind();
        path.printMatrix();
    }

    public void ind() throws IOException {

        //first to numbers input are width and height
        while ((ch = System.in.read()) != ' ') {
            width += (char) ch;
        }
        while ((ch = System.in.read()) != '\n') {
            height += (char) ch;
        }
        w = Integer.parseInt(width);
        h = Integer.parseInt(height);

        //init multidim arrary with rows x columns
        matrix = new char[h][w];

        //all rows
        for (int i = 0; i < h; i++) {
            int j = 0;
            //all columns
            while ((ch = System.in.read()) != '\n') {
                //if char is ' ' change it to '*'
                if (ch == 32) {
                    ch = 42;
                }
                matrix[i][j] = (char) ch;
                j++;
            }
        }

        int stop = 0;
        while (stop < 2*(h+w)) {

            //all rows
            for (int i = 1; i < (h - 1); i++) {
                //all columns
                for (int j = 1; j < (w - 1); j++) {
                    //how many nabo '*' does this bit have? Save it to temp
                    if (matrix[i][j] == '*') {
                        temp = nabo(i, j);
                    }
                    //if char is '*' and doesn't have exact 2 naboer change it to ' '
                    if (temp == 1) {
                        matrix[i][j] = ' ';
                    }
                    temp = -1;
                }
            }
            stop++;
        }
    }

    private void printMatrix() {

        //print matrix
        //all rows
        for (int i = 0; i < h; i++) {
            //all columns
            for (int j = 0; j < w; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.print('\n');
        }
    }


    private int nabo(int row, int col) {

        int naboer = 0;

        //get naboer
        char up = matrix[row - 1][col];
        char down = matrix[row + 1][col];
        char left = matrix[row][col - 1];
        char right = matrix[row][col + 1];

        if (up == '*') {
            naboer++;
        }
        if (down == '*') {
            naboer++;
        }
        if (left == '*') {
            naboer++;
        }
        if (right == '*') {
            naboer++;
        }
        //start and end field
        if ((row == 1 && col == 1) || (row == (h - 2) && col == (w - 2))) {
            return 2;
        }
        return naboer;
    }
}








