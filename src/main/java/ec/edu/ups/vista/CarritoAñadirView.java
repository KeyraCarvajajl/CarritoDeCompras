package ec.edu.ups.vista;

import ec.edu.ups.modelo.Producto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CarritoAñadirView extends JInternalFrame {
    private JPanel panelPrincipal;
    private JTextField txtCodigo;
    private JButton btnBuscar;
    private JTextField txtNombre;
    private JTextField txtPrecio;
    private JTextField txtCantidad;
    private JButton btnAñadir;
    private JTable tableCarrito;
    private DefaultTableModel tableModel;
    private JButton btnGuardar;
    private JButton btnLimpiar;
    private JTextField txtSubtotal;
    private JTextField txtIva;
    private JTextField txtTotal;

    public CarritoAñadirView() {
        super("Añadir al Carrito", true, true, true, true);
        initComponents();
        setContentPane(panelPrincipal);
        setSize(700, 550);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponents() {
        panelPrincipal = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Título
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 3;
        JLabel lblTitulo = new JLabel("Datos del Producto");
        lblTitulo.setFont(lblTitulo.getFont().deriveFont(Font.BOLD, 16f));
        panelPrincipal.add(lblTitulo, gbc);
        gbc.gridwidth = 1;

        // Código + Buscar
        gbc.gridy = 1; gbc.gridx = 0;
        panelPrincipal.add(new JLabel("Código:"), gbc);
        txtCodigo = new JTextField(10);
        gbc.gridx = 1;
        panelPrincipal.add(txtCodigo, gbc);
        btnBuscar = new JButton("Buscar");
        gbc.gridx = 2;
        panelPrincipal.add(btnBuscar, gbc);

        // Nombre
        gbc.gridy = 2; gbc.gridx = 0;
        panelPrincipal.add(new JLabel("Nombre:"), gbc);
        txtNombre = new JTextField(20);
        txtNombre.setEditable(false);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panelPrincipal.add(txtNombre, gbc);
        gbc.gridwidth = 1;

        // Precio
        gbc.gridy = 3; gbc.gridx = 0;
        panelPrincipal.add(new JLabel("Precio:"), gbc);
        txtPrecio = new JTextField(10);
        txtPrecio.setEditable(false);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panelPrincipal.add(txtPrecio, gbc);
        gbc.gridwidth = 1;

        // Cantidad + Añadir
        gbc.gridy = 4; gbc.gridx = 0;
        panelPrincipal.add(new JLabel("Cantidad:"), gbc);
        txtCantidad = new JTextField(5);
        gbc.gridx = 1;
        panelPrincipal.add(txtCantidad, gbc);
        btnAñadir = new JButton("Añadir");
        gbc.gridx = 2;
        panelPrincipal.add(btnAñadir, gbc);

        // Tabla carrito
        tableModel = new DefaultTableModel(new Object[]{"Código","Nombre","Precio","Cantidad"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        tableCarrito = new JTable(tableModel);
        tableCarrito.setFillsViewportHeight(true);
        gbc.gridy = 5; gbc.gridx = 0; gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH; gbc.weightx = 1; gbc.weighty = 1;
        panelPrincipal.add(new JScrollPane(tableCarrito), gbc);
        gbc.weightx = 0; gbc.weighty = 0; gbc.fill = GridBagConstraints.HORIZONTAL; gbc.gridwidth = 1;

        // Botones inferior
        gbc.gridy = 6; gbc.gridx = 1;
        btnGuardar = new JButton("Guardar");
        panelPrincipal.add(btnGuardar, gbc);
        btnLimpiar = new JButton("Limpiar");
        gbc.gridx = 2;
        panelPrincipal.add(btnLimpiar, gbc);

        // Subtotal, IVA y Total
        gbc.gridy = 7; gbc.gridx = 0;
        panelPrincipal.add(new JLabel("Subtotal:"), gbc);
        txtSubtotal = new JTextField(10);
        txtSubtotal.setEditable(false);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panelPrincipal.add(txtSubtotal, gbc);
        gbc.gridwidth = 1;

        gbc.gridy = 8; gbc.gridx = 0;
        panelPrincipal.add(new JLabel("IVA (12%):"), gbc);
        txtIva = new JTextField(10);
        txtIva.setEditable(false);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panelPrincipal.add(txtIva, gbc);
        gbc.gridwidth = 1;

        gbc.gridy = 9; gbc.gridx = 0;
        panelPrincipal.add(new JLabel("Total:"), gbc);
        txtTotal = new JTextField(10);
        txtTotal.setEditable(false);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panelPrincipal.add(txtTotal, gbc);
        gbc.gridwidth = 1;
    }

    public JTextField getTxtCodigo()       { return txtCodigo; }
    public JButton    getBtnBuscar()       { return btnBuscar; }
    public JTextField getTxtNombre()       { return txtNombre; }
    public JTextField getTxtPrecio()       { return txtPrecio; }
    public JTextField getTxtCantidad()     { return txtCantidad; }
    public JButton    getBtnAñadir()       { return btnAñadir; }
    public JTable     getTableCarrito()    { return tableCarrito; }
    public DefaultTableModel getTableModel(){ return tableModel; }
    public JButton    getBtnGuardar()      { return btnGuardar; }
    public JButton    getBtnLimpiar()      { return btnLimpiar; }
    public JTextField getTxtSubtotal()     { return txtSubtotal; }
    public JTextField getTxtIva()          { return txtIva; }
    public JTextField getTxtTotal()        { return txtTotal; }
}
