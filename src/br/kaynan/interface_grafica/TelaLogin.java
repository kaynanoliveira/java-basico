package br.kaynan.interface_grafica;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin {
    public static void main(String[] args) {
        JFrame janela = new JFrame();

        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setBounds(50, 50, 100, 30);

        JTextField inputUsuario = new JTextField();
        inputUsuario.setBounds(50, 80, 150, 30);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(50, 150, 100, 30);

        JPasswordField inputSenha = new JPasswordField();
        inputSenha.setBounds(50, 180, 150, 30);

        JButton botaoLogar = new JButton("Login");
        botaoLogar.setBounds(50, 250, 150, 30);
        // Coloca uma funçao para o botao
        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String usuario = inputUsuario.getText();
                String senha = new String(inputSenha.getPassword());
                System.out.printf("Usuário: %s\nSenha: %s\n", usuario, senha);
                inputSenha.setText("");
                inputUsuario.setText("");
            }
        } );

        // add => Adicionar
        janela.add(botaoLogar);
        janela.add(labelUsuario);
        janela.add(inputUsuario);
        janela.add(labelSenha);
        janela.add(inputSenha);

        janela.setLayout(null);
        janela.setBounds(0, 0, 400, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
