package C_GUI;

import A_modelo.CuentaUsuario;
import A_modelo.Tuit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class VentanaPrincipal extends JFrame {
    private CuentaUsuario usuarioActual;
    private List<CuentaUsuario> todosLosUsuarios;

    private JTextArea textAreaInfo;
    private JTextField textFieldAlias, textFieldCorreo, textFieldMensaje;
    private JButton btnCrearUsuario, btnSeguirUsuario, btnPublicarTuit;

    public VentanaPrincipal() {
        super("Simulación de Twitter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);  // Centrar la ventana en la pantalla

        todosLosUsuarios = new ArrayList<>();
        initUIComponents();

        
    }