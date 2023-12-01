package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.HashMap;

import Classes.bancoConta;

public class applicationBanco {

	private JFrame frmBancoEstcio;
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JTextField textField;
    private JLabel lblNewLabel_2, lblNewLabel_1_2;
    private JLabel lblNewLabel_1_1, lblNewLabel_1;
    private JButton btnNaoSouCliente;
    private JButton btnAce;
    private JComboBox<String> comboBox;
    private JPanel panel_2, panel_3;
    
    private String Nome;
    private JButton btnCriarConta;
    private bancoConta banco;
    private JButton btnNaoSouCliente_2;
    private JButton btnNaoSouCliente_3;
    private JButton btnNaoSouCliente_4;
    private JButton btnNaoSouCliente_5;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    applicationBanco window = new applicationBanco();
                    window.frmBancoEstcio.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public applicationBanco() {
        banco = new bancoConta();
        initialize();
    }


    private void initialize()
    {    	
    	frmBancoEstcio = new JFrame();
    	frmBancoEstcio.getContentPane().setBackground(new Color(255, 255, 255));
        
        frmBancoEstcio.setSize(750, 500);
        frmBancoEstcio.getContentPane().setLayout(null);
        
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\guilh\\onedrive\\Documentos\\banco\\banco\\assets\\banner_01.png");
        Image originalImage = originalIcon.getImage();
        int newWidth = 400;
        int newHeight = 250;
        Image newImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(newImage);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(91, 188, 192));
        panel.setBounds(0, 0, 300, 461);
        frmBancoEstcio.getContentPane().add(panel);
        
        panel.setLayout(new BorderLayout());

        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel, BorderLayout.CENTER);
        lblNewLabel.setIcon(resizedIcon);
        
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        panel.add(rightPanel, BorderLayout.EAST);
        
        JPanel panel_1 = new JPanel();
        panel_1.setForeground(new Color(255, 255, 255));
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(303, 0, 508, 483);
        frmBancoEstcio.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(99, 177, 230, 20);
        panel_1.add(textField);
        textField.setColumns(10);
        
        lblNewLabel_1 = new JLabel("Nome *");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setBounds(100, 161, 299, 14);
        panel_1.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("Acesse sua conta");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\guilh\\onedrive\\Documentos\\banco\\banco\\assets\\User.png"));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_2.setBounds(88, 102, 272, 35);
        panel_1.add(lblNewLabel_2);
        
        panel_2 = new JPanel();
        panel_2.setBackground(new Color(245, 246, 250));
        panel_2.setBounds(0, 398, 505, 63);
        panel_1.add(panel_2);
        panel_2.setLayout(null);
        
        btnNaoSouCliente = new JButton("Não sou cliente");
        btnNaoSouCliente.setBounds(96, 11, 230, 25);
        panel_2.add(btnNaoSouCliente);
        btnNaoSouCliente.setForeground(new Color(0, 114, 198));
        btnNaoSouCliente.setBackground(new Color(255, 255, 255));
        btnNaoSouCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
        
                btnNaoSouCliente.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        lblNewLabel_2.setText("Criar uma conta");
                        comboBox.setVisible(true);
                        lblNewLabel_1_1.setVisible(true);
                        panel_2.setVisible(false);
                        btnCriarConta.setVisible(true);
                        btnAce.setVisible(false);
                        textField.setText("");
                        panel_3.setVisible(false);
                    }
                });

        
        lblNewLabel_1_1 = new JLabel("Selecione um tipo de conta: *");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_1.setBounds(99, 208, 300, 14);
        lblNewLabel_1_1.setVisible(false);
        panel_1.add(lblNewLabel_1_1);
        
        lblNewLabel_1_2 = new JLabel("");
        lblNewLabel_1_2.setEnabled(false);
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_2.setBounds(100, 180, 299, 14);
        panel_1.add(lblNewLabel_1_2);
        
        panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 255, 255));
        panel_3.setBounds(0, 224, 505, 163);
        panel_1.add(panel_3);
        panel_3.setLayout(null);
        panel_3.setVisible(false);
        
        JButton btnNaoSouCliente_1 = new JButton("");
        btnNaoSouCliente_1.setIcon(new ImageIcon("C:\\Users\\guilh\\onedrive\\Documentos\\\\banco\\banco\\assets\\Saque.png"));
        btnNaoSouCliente_1.setBounds(98, 11, 54, 54);
        btnNaoSouCliente_1.setForeground(new Color(0, 114, 198));
        btnNaoSouCliente_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNaoSouCliente_1.setBackground(new Color(64, 0, 64));
        panel_3.add(btnNaoSouCliente_1);
        
        btnNaoSouCliente_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(frmBancoEstcio, "Digite o valor do saque:");

                try {
                    double valorSaque = Double.parseDouble(input);

                    if (banco.sacar(Nome, valorSaque)) {
                        double novoSaldo = banco.getConta(Nome).getSaldo();
                        lblNewLabel_1_2.setText("Saldo: R$ " + novoSaldo);
                        JOptionPane.showMessageDialog(frmBancoEstcio, "Saque de R$ " + valorSaque + " realizado com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(frmBancoEstcio, "Saldo insuficiente para o saque.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frmBancoEstcio, "Valor inválido. Certifique-se de inserir um número válido.");
                }
            }
        });

        
        btnNaoSouCliente_2 = new JButton("");
        btnNaoSouCliente_2.setIcon(new ImageIcon("C:\\Users\\guilh\\onedrive\\Documentos\\banco\\banco\\assets\\Deposito.png"));
        btnNaoSouCliente_2.setForeground(new Color(0, 114, 198));
        btnNaoSouCliente_2.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNaoSouCliente_2.setBackground(new Color(34, 34, 34));
        btnNaoSouCliente_2.setBounds(183, 11, 54, 54);
        panel_3.add(btnNaoSouCliente_2);
        btnNaoSouCliente_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(frmBancoEstcio, "Digite o valor do depósito:");

                try {
                	double valorDeposito = Double.parseDouble(input);

                    if (banco.depositar(Nome, valorDeposito)) {
                        double novoSaldo = banco.getConta(Nome).getSaldo();
                        lblNewLabel_1_2.setText("Saldo: R$ " + novoSaldo);
                        JOptionPane.showMessageDialog(frmBancoEstcio, "Depósito de R$ " + valorDeposito + " realizado com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(frmBancoEstcio, "Conta não encontrada.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frmBancoEstcio, "Valor inválido. Certifique-se de inserir um número válido.");
                }
            }
        });
        
        btnNaoSouCliente_3 = new JButton("");
        btnNaoSouCliente_3.setIcon(new ImageIcon("C:\\Users\\guilh\\onedrive\\Documentos\\banco\\banco\\assets\\Contas.png"));
        btnNaoSouCliente_3.setForeground(new Color(0, 114, 198));
        btnNaoSouCliente_3.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNaoSouCliente_3.setBackground(new Color(34, 34, 34));
        btnNaoSouCliente_3.setBounds(273, 11, 54, 54);
        panel_3.add(btnNaoSouCliente_3);
        btnNaoSouCliente_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                JTextField nomeBoletoField = new JTextField();
                JTextField valorBoletoField = new JTextField();
                Object[] message = {
                    "Insira o nome do boleto:", nomeBoletoField,
                    "Insira o valor do boleto:", valorBoletoField
                };

                int option = JOptionPane.showConfirmDialog(frmBancoEstcio, message, "Pagar Conta", JOptionPane.OK_CANCEL_OPTION);

                if (option == JOptionPane.OK_OPTION) {
                    String nomeUsuario = Nome;
                    bancoConta.Conta conta = banco.getConta(nomeUsuario);
                    
                    String nomeBoleto = nomeBoletoField.getText();
                    String tipoConta = conta.getTipoConta();
                    String valorBoletoStr = valorBoletoField.getText();
                    
                    boolean entradaValida = false;
                    double valorBoleto = 0.0;
                    
                    while (!entradaValida) {
                        if (valorBoletoStr.matches("^\\d*\\.?\\d*$")) {
                            valorBoleto = Double.parseDouble(valorBoletoStr);
                            entradaValida = true;
                        } else {
                            JOptionPane.showMessageDialog(frmBancoEstcio, "Valor inválido. Certifique-se de inserir um número válido.");
                            valorBoletoStr = JOptionPane.showInputDialog(frmBancoEstcio, "Digite o valor do boleto:");
                            
                            if (valorBoletoStr == null || valorBoletoStr.trim().isEmpty()) {
                                JOptionPane.showMessageDialog(frmBancoEstcio, "É necessário inserir um valor para pagar o boleto.");
                                break;
                            }
                        }
                    }
                    
                    if (entradaValida) {
                        Map<String, Boolean> boletosPagos = new HashMap();
                    
                        if (banco.debitarBoleto(Nome, valorBoleto)) {
                            boletosPagos.put(nomeBoleto, true);
                            
                            if (tipoConta.equals("Conta Corrente")) {
                                JOptionPane.showMessageDialog(frmBancoEstcio, "Boleto " + nomeBoleto + " marcado como pago. Valor: R$ " + (valorBoleto + 12));
                            } else if (tipoConta.equals("Conta Poupança")) {
                                JOptionPane.showMessageDialog(frmBancoEstcio, "Boleto marcado como pago. Valor: R$ " + (valorBoleto + 20));
                            }
                            
                            double novoSaldo = banco.getConta(Nome).getSaldo();
                            lblNewLabel_1_2.setText("Saldo: R$ " + novoSaldo);
                        } else {
                            JOptionPane.showMessageDialog(frmBancoEstcio, "Saldo insuficiente para pagar o boleto.");
                        }
                    }
                }
        	}
        });

        btnNaoSouCliente_4 = new JButton("Fechar conta");
        btnNaoSouCliente_4.setForeground(new Color(0, 114, 198));
        btnNaoSouCliente_4.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNaoSouCliente_4.setBackground(new Color(255, 255, 255));
        btnNaoSouCliente_4.setBounds(98, 98, 229, 25);
        panel_3.add(btnNaoSouCliente_4);
        
        btnNaoSouCliente_5 = new JButton("Sair");
        btnNaoSouCliente_5.setBounds(98, 127, 229, 25);
        panel_3.add(btnNaoSouCliente_5);
        btnNaoSouCliente_5.setForeground(new Color(0, 114, 198));
        btnNaoSouCliente_5.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNaoSouCliente_5.setBackground(new Color(255, 255, 255));
        
        lblNewLabel_3 = new JLabel("Saque");
        lblNewLabel_3.setBounds(108, 61, 46, 26);
        panel_3.add(lblNewLabel_3);
        
        lblNewLabel_4 = new JLabel("Depósito");
        lblNewLabel_4.setBounds(185, 67, 70, 14);
        panel_3.add(lblNewLabel_4);
        
        lblNewLabel_5 = new JLabel("Contas");
        lblNewLabel_5.setBounds(279, 67, 68, 14);
        panel_3.add(lblNewLabel_5);
        btnNaoSouCliente_5.setVisible(false);
        btnNaoSouCliente_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblNewLabel_2.setText("Acesse sua conta");
                comboBox.setVisible(false);
                lblNewLabel_1_1.setVisible(false);
                panel_2.setVisible(true);
                textField.setVisible(true);
                btnAce.setVisible(true);
                panel_3.setVisible(false);
                Nome = null;
                lblNewLabel_1.setText("Nome *");
                btnNaoSouCliente_5.setVisible(false);
                textField.setText("");
            }
        });
        
        btnAce = new JButton("ENTRAR");
        btnAce.setBounds(99, 270, 230, 35);
        panel_1.add(btnAce);
        btnAce.setForeground(Color.WHITE);
        btnAce.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAce.setBackground(new Color(0, 114, 198));
        
        btnCriarConta = new JButton("CRIAR CONTA");
        btnCriarConta.setBounds(99, 270, 230, 35);
        panel_1.add(btnCriarConta);
        btnCriarConta.setForeground(Color.WHITE);
        btnCriarConta.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnCriarConta.setBackground(new Color(0, 114, 198));
        
        comboBox = new JComboBox<>();
        comboBox.setBounds(99, 233, 230, 20);
        panel_1.add(comboBox);
        comboBox.addItem("Conta Corrente");
        comboBox.addItem("Conta Poupança");
        comboBox.setVisible(false);
        btnCriarConta.setVisible(false);
        
                
                btnCriarConta.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                        Nome = textField.getText();
                        String tipoConta = comboBox.getSelectedItem().toString();
        
                        if (banco.existeConta(Nome)) {
                            JOptionPane.showMessageDialog(frmBancoEstcio, "Usuário já existe. Por favor, escolha um nome de usuário diferente.");
                        } else {
                            banco.criarConta(Nome, tipoConta);
        
                            JOptionPane.showMessageDialog(frmBancoEstcio, "Conta Cadastrada!\n\nNome: " + Nome + "\n" + comboBox.getSelectedItem());
        
                            lblNewLabel_2.setText("Acesse sua Conta");
                            comboBox.setVisible(false);
                            lblNewLabel_1_1.setVisible(false);
                            panel_2.setVisible(true);
                            btnCriarConta.setVisible(false);
                            btnAce.setVisible(true);
                            textField.setText("");
                            panel_3.setVisible(false);
                        }
                    }
                });
        
        btnAce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String nomeUsuario = textField.getText();
                bancoConta.Conta conta = banco.getConta(nomeUsuario);
                
                if (conta != null)
                {
                    String tipoConta = conta.getTipoConta();
                    Nome = conta.getNome();
                    
                    double saldo = conta.getSaldo();
                    
                    lblNewLabel_2.setText("Olá, " + Nome + "!");
                    lblNewLabel_1.setText("" + tipoConta);
                    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
                    
                    panel_2.setVisible(false);
                    textField.setVisible(false);
                    btnAce.setVisible(false);
                    panel_3.setVisible(true);
                    btnNaoSouCliente_5.setVisible(true);
                    
                    lblNewLabel_1_2.setText("Saldo: R$ " + saldo);
                } else {
                    JOptionPane.showMessageDialog(frmBancoEstcio, "Usuário não encontrado. Por favor, verifique o nome.");
                }
            }
        });
        btnNaoSouCliente_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int opcao = JOptionPane.showConfirmDialog(frmBancoEstcio, "Tem certeza de que deseja fechar a conta? Isso não pode ser desfeito.", "Fechar Conta", JOptionPane.YES_NO_OPTION);
                if (opcao == JOptionPane.YES_OPTION) {
                    if (banco.fecharConta(Nome)) {
                        JOptionPane.showMessageDialog(frmBancoEstcio, "Conta fechada com sucesso.");
                        Nome = null;
                        lblNewLabel_2.setText("Acesse sua Conta");
                        lblNewLabel_1.setText("");
                        panel_2.setVisible(true);
                        textField.setVisible(true);
                        btnAce.setVisible(true);
                        panel_3.setVisible(false);
                        textField.setText("");
                        lblNewLabel_1.setText("Nome *");
                        btnNaoSouCliente_5.setVisible(false);
                        
                    } else {
                        JOptionPane.showMessageDialog(frmBancoEstcio, "Não foi possível fechar a conta. Certifique-se de que o saldo é zero.");
                    }
                }
            }
        });
    }
}