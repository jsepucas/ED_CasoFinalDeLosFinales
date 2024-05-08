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

        btnCrearUsuario.addActionListener(this::accionCrearUsuario);
        btnSeguirUsuario.addActionListener(this::accionSeguirUsuario);
        btnPublicarTuit.addActionListener(this::accionPublicarTuit);

        panelCentral.add(new JLabel("Alias:"));
        panelCentral.add(textFieldAlias);
        panelCentral.add(new JLabel("Correo Electrónico:"));
        panelCentral.add(textFieldCorreo);
        panelCentral.add(new JLabel("Mensaje:"));
        panelCentral.add(textFieldMensaje);
        panelCentral.add(btnCrearUsuario);
        panelCentral.add(btnSeguirUsuario);
        panelCentral.add(btnPublicarTuit);

        add(panelCentral, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
    }

    private void accionCrearUsuario(ActionEvent e) {
        String alias = textFieldAlias.getText();
        String correo = textFieldCorreo.getText();
        if (!alias.isEmpty() && !correo.isEmpty()) {
            CuentaUsuario nuevoUsuario = new CuentaUsuario(alias, correo);
            todosLosUsuarios.add(nuevoUsuario);
            textAreaInfo.append("Usuario creado: " + nuevoUsuario + "\n");
        } else {
            JOptionPane.showMessageDialog(this, "Alias y correo son requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void accionSeguirUsuario(ActionEvent e) {
        // Implementación de seguir a otro usuario (simplificada para demostración)
        // Aquí se debería permitir seleccionar a qué usuario seguir desde la lista de todosLosUsuarios
    }

    private void accionPublicarTuit(ActionEvent e) {
        // Implementación de publicar un tuit (simplificada para demostración)
        // Aquí se debería permitir escribir un mensaje y publicarlo como tuit
    }
}