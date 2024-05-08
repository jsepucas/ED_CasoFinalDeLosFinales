package C_GUI;

import A_modelo.CuentaUsuario;
import A_modelo.Tuit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class VentanaPrincipal extends JFrame {
    private CuentaUsuario usuarioActual;
    private List<CuentaUsuario> todosLosUsuarios;

    private JTextArea textAreaInfo;
    private JTextField textFieldAlias, textFieldCorreo, textFieldMensaje;
    private JButton btnCrearUsuario, btnSeguirUsuario, btnPublicarTuit;
    private JComboBox<CuentaUsuario> comboBoxUsuarios;

    public VentanaPrincipal() {
        super(" Twitter UAX ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Establecer el look and feel a Nimbus
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        todosLosUsuarios = new ArrayList<>();
        initUIComponents();

        // Añadir espaciado alrededor de los componentes
        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Cambiar la fuente de los componentes
        Font font = new Font("Arial", Font.PLAIN, 14);
        for (Component component : getContentPane().getComponents()) {
            component.setFont(font);
        }
    }

    private void initUIComponents() {
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(6, 2, 10, 10)); // Grid layout para ordenar los componentes.

        textFieldAlias = new JTextField();
        textFieldCorreo = new JTextField();
        textFieldMensaje = new JTextField();
        JLabel labelCaracteresRestantes = new JLabel("Caracteres restantes: 140");

        btnCrearUsuario = new JButton("Crear Usuario");
        btnSeguirUsuario = new JButton("Seguir Usuario");
        btnPublicarTuit = new JButton("Publicar Tuit");

        comboBoxUsuarios = new JComboBox<>();
        comboBoxUsuarios.setModel(new DefaultComboBoxModel<>(todosLosUsuarios.toArray(new CuentaUsuario[0])));
        comboBoxUsuarios.addActionListener(e -> usuarioActual = (CuentaUsuario) comboBoxUsuarios.getSelectedItem());

        textAreaInfo = new JTextArea(10, 30);
        textAreaInfo.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaInfo);

        btnCrearUsuario.addActionListener(this::accionCrearUsuario);
        btnSeguirUsuario.addActionListener(this::accionSeguirUsuario);
        btnPublicarTuit.addActionListener(this::accionPublicarTuit);

        textFieldMensaje.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                int maxLength = 140;
                int length = textFieldMensaje.getText().length();
                labelCaracteresRestantes.setText("Caracteres restantes: " + (maxLength - length));
                if (length > maxLength) {
                    textFieldMensaje.setText(textFieldMensaje.getText().substring(0, maxLength));
                }
            }
        });

        panelCentral.add(new JLabel("Alias:"));
        panelCentral.add(textFieldAlias);
        panelCentral.add(new JLabel("Correo Electrónico:"));
        panelCentral.add(textFieldCorreo);
        panelCentral.add(new JLabel("Mensaje:"));
        panelCentral.add(textFieldMensaje);
        panelCentral.add(btnCrearUsuario);
        panelCentral.add(btnSeguirUsuario);
        panelCentral.add(btnPublicarTuit);
        panelCentral.add(new JLabel("Seleccionar Usuario:"));
        panelCentral.add(comboBoxUsuarios);
        panelCentral.add(labelCaracteresRestantes);

        add(panelCentral, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
    }

    private void accionCrearUsuario(ActionEvent e) {
        String alias = textFieldAlias.getText();
        String correo = textFieldCorreo.getText();
        if (!alias.isEmpty() && !correo.isEmpty()) {
            CuentaUsuario nuevoUsuario = new CuentaUsuario(alias, correo);
            todosLosUsuarios.add(nuevoUsuario);
            comboBoxUsuarios.addItem(nuevoUsuario);
            textAreaInfo.append("Usuario creado: " + nuevoUsuario + "\n");
        } else {
            JOptionPane.showMessageDialog(this, "Alias y correo son requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void accionSeguirUsuario(ActionEvent e) {
        CuentaUsuario usuarioAseguir = (CuentaUsuario) comboBoxUsuarios.getSelectedItem();
        if (usuarioActual != null && usuarioAseguir != null && usuarioActual != usuarioAseguir && !usuarioActual.yaSigueA(usuarioAseguir)) {
            usuarioActual.seguir(usuarioAseguir);
            textAreaInfo.append("Ahora sigues a: " + usuarioAseguir.getAlias() + "\n");
        } else {
            JOptionPane.showMessageDialog(this, "Error al seguir usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void accionPublicarTuit(ActionEvent e) {
        String mensaje = textFieldMensaje.getText();
        if (usuarioActual != null && !mensaje.isEmpty() && mensaje.length() <= 140) {
            Tuit nuevoTuit = new Tuit(mensaje, usuarioActual);
            usuarioActual.publicarTuit(nuevoTuit);
            textAreaInfo.append("Tuit publicado: " + nuevoTuit + "\n");
        } else {
            JOptionPane.showMessageDialog(this, "Error: El mensaje no puede estar vacío y debe ser menor a 140 caracteres.", "Error de Tweet", JOptionPane.ERROR_MESSAGE);
        }
    }
}