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