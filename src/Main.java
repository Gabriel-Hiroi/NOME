public class Main {
    public static void main(String[] args) {
        char[][][] alphabet = {letraH(), letraI(), letraR(), letraO(), letraI2()};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                char[][] letter = alphabet[j];
                for (int k = 0; k < letter[i].length; k++) {
                    System.out.print(letter[i][k] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static char[][] letraH() {
        return new char[][]{
                {'H', ' ', ' ', ' ', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
                {'H', 'H', 'H', 'H', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
        };
    }

    public static char[][] letraI() {
        return new char[][]{
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
        };
    }

    public static char[][] letraR() {
        return new char[][]{
                {'R', 'R', 'R', 'R', ' '},
                {'R', ' ', ' ', 'R', ' '},
                {'R', 'R', 'R', 'R', ' '},
                {'R', ' ', 'R', ' ', ' '},
                {'R', ' ', ' ', 'R', ' '},
        };
    }

    public static char[][] letraO() {
        return new char[][]{
                {' ', 'O', 'O', 'O', ' '},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {' ', 'O', 'O', 'O', ' '},
        };
    }

    public static char[][] letraI2() {
        return new char[][]{
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
        };
    }
}

