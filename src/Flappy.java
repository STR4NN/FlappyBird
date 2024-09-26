import javax.swing.*;

public class Flappy {
    public static void main(String[] args) {

    int boardWidth = 360;
    int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");

        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        // Faz o foco ir apenas a tela em que o progama esta sendo RODADO
        flappyBird.requestFocus();
        // SETA VISIBILIDADE DA JANELA
        frame.setVisible(true);





    }
}
