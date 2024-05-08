import F_InicioDeSesion.LoginWindow;

import javax.swing.*;

public class MainGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginWindow ventana = new LoginWindow();
            ventana.setVisible(true);
        });
    }
}
