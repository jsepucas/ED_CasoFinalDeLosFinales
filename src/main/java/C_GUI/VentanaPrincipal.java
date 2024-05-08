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

    private void initUIComponents() {
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(5, 2, 10, 10)); // Grid layout para ordenar los componentes.

        textFieldAlias = new JTextField();
        textFieldCorreo = new JTextField();
        textFieldMensaje = new JTextField();

        btnCrearUsuario = new JButton("Crear Usuario");
        btnSeguirUsuario = new JButton("Seguir Usuario");
        btnPublicarTuit = new JButton("Publicar Tuit");

        textAreaInfo = new JTextArea(10, 30);
        textAreaInfo.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaInfo);