package cadastrocliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtAluno;
	private JTextField txtEndAluno;
	private JTextField txtDataNasc;
	private JTextField txtRg;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setSize(600,600);
		
		
		JLabel lblNewLabel = new JLabel("Aluno:");
		lblNewLabel.setBounds(10, 11, 63, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o:");
		lblNewLabel_1.setBounds(10, 45, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de nascimento:");
		lblNewLabel_2.setBounds(10, 83, 133, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RG:");
		lblNewLabel_3.setBounds(10, 122, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CPF:");
		lblNewLabel_4.setBounds(214, 122, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtAluno = new JTextField();
		txtAluno.setBounds(50, 8, 349, 20);
		contentPane.add(txtAluno);
		txtAluno.setColumns(10);
		
		txtEndAluno = new JTextField();
		txtEndAluno.setBounds(75, 42, 324, 20);
		contentPane.add(txtEndAluno);
		txtEndAluno.setColumns(10);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setBounds(134, 80, 193, 20);
		contentPane.add(txtDataNasc);
		txtDataNasc.setColumns(10);
		
		txtRg = new JTextField();
		txtRg.setBounds(39, 119, 129, 20);
		contentPane.add(txtRg);
		txtRg.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(253, 119, 146, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(39, 169, 356, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnLimparCampos = new JButton("Limpar Dados");
		btnLimparCampos.setBounds(36, 203, 116, 23);
		contentPane.add(btnLimparCampos);
		
		JButton btnListar = new JButton("Listar Alunos");
		btnListar.setBounds(269, 203, 129, 23);
		contentPane.add(btnListar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(170, 227, 89, 23);
		contentPane.add(btnSair);
	}
}
