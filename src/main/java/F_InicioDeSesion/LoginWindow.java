package F_InicioDeSesion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import C_GUI.VentanaPrincipal;

public class LoginWindow extends JFrame implements ActionListener {
    private JTextField textFieldUsuario;
    private JPasswordField passwordField;
    private JButton botonIniciarSesion;

    public LoginWindow() {
        super("Inicio de Sesión Twitter UAX \uD83D\uDC24");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500); // Ajusta el tamaño de la ventana
        this.setLocationRelativeTo(null); // Centra la ventana en pantalla

        // Configura el panel principal con una imagen de fondo
        URL fondoUrl = getClass().getResource("/images/fon.jpg");
        if (fondoUrl != null) {
            ImageIcon fondo = new ImageIcon(fondoUrl);
            JLabel labelFondo = new JLabel(fondo);
            labelFondo.setLayout(new BorderLayout());
            this.setContentPane(labelFondo);
        } else {
            System.err.println("No se pudo cargar la imagen de fondo");
            // Configura un color de fondo como fallback
            this.getContentPane().setBackground(Color.GRAY);
        }

        // Panel de entrada de datos
        JPanel panelCentral = new JPanel(new GridBagLayout());
        panelCentral.setOpaque(false); // Hace el panel transparente
        GridBagConstraints c = new GridBagConstraints();

        //añadir otra imagen en la parte superior
        URL imagenUsuarioUrl = getClass().getResource("/images/Usuario.png");
        if (imagenUsuarioUrl != null) {
            ImageIcon imagenUsuario = new ImageIcon(imagenUsuarioUrl);

            // Ajusta el tamaño de la imagen del usuario
            Image imagen = imagenUsuario.getImage();
            Image imagenRedimensionada = imagen.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
            imagenUsuario = new ImageIcon(imagenRedimensionada);

            // Crea un JLabel para la imagen del usuario
            JLabel labelImagenUsuario = new JLabel(imagenUsuario);

            // Añade la imagen del usuario al panel principal
            c.gridx = 0;
            c.gridy = 0;
            panelCentral.add(labelImagenUsuario, c);
            c.gridy++;
        } else {
            System.err.println("No se pudo cargar la imagen del usuario");
        }

        // Configura los campos de texto y etiquetas
        JLabel etiquetaUsuario = new JLabel("Usuario \uD83D\uDC26 :");
        etiquetaUsuario.setForeground(Color.WHITE); // Texto blanco
        textFieldUsuario = new JTextField(20);
        JLabel etiquetaContraseña = new JLabel("Contraseña \uD83D\uDC26 :");
        etiquetaContraseña.setForeground(Color.WHITE); // Texto blanco
        passwordField = new JPasswordField(20);
        passwordField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonIniciarSesion.doClick();
                }
            }
        });

        // Añade los componentes al panel central
        c.insets = new Insets(10, 10, 10, 10); // Margen entre componentes
        panelCentral.add(etiquetaUsuario, c);
        c.gridy++;
        panelCentral.add(textFieldUsuario, c);
        c.gridy++;
        panelCentral.add(etiquetaContraseña, c);
        c.gridy++;
        panelCentral.add(passwordField, c);

        // Botón de inicio de sesión
        botonIniciarSesion = new JButton("Iniciar Sesión \uD83D\uDC64");
        botonIniciarSesion.setBackground(new Color(8, 112, 243)); // Color personalizado
        botonIniciarSesion.setForeground(Color.WHITE);
        c.gridy++;
        panelCentral.add(botonIniciarSesion, c);
        botonIniciarSesion.addActionListener(this);

        // Añade el logo de la empresa
        URL logoUrl = getClass().getResource("/images/UAX2.png");
        if (logoUrl != null) {
            ImageIcon logo = new ImageIcon(logoUrl);

            // Ajusta el tamaño de la imagen del logo
            Image imagen = logo.getImage();
            Image imagenRedimensionada = imagen.getScaledInstance(125, 68, java.awt.Image.SCALE_SMOOTH);
            logo = new ImageIcon(imagenRedimensionada);

            JLabel labelLogo = new JLabel(logo);
            c.gridy++;
            panelCentral.add(labelLogo, c);
        } else {
            System.err.println("No se pudo cargar el logo de la empresa");
        }
        // Añade el panel al fondo
        this.add(panelCentral, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        iniciarSesion();
    }

    private void iniciarSesion() {
        String usuario = textFieldUsuario.getText();
        char[] contraseña = passwordField.getPassword();
        if (GestorAutenticacion.autenticar(usuario, new String(contraseña))) {
            this.dispose(); // Cierra la ventana de inicio de sesión
            // Abre la ventana principal
            new VentanaPrincipal().setVisible(true); // Asume que VentanaPrincipal es la clase de tu ventana principal
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}