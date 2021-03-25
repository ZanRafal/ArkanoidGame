public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[height + 2][width + 2];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public void setPoint(double x, double y, char c) {
        int x0 = (int) Math.round(x);
        int y0 = (int) Math.round(y);
        if(x < 0 || y< 0) return;
        if(y >= matrix.length || x >= matrix[0].length) return;

        matrix[y0][x0] = c;
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        int height = matrix.length;
        int width = matrix[0].length;

        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; i++) {
                if(matrix[i][j] == 1) {
                    setPoint(x + j, y + i, c);
                }
            }
        }
    }

    public void clear() {
        this.matrix = new char[height + 2][width + 2];
    }

    public void print() {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.println(" ");
                System.out.println(matrix[i][j]);
                System.out.println(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
