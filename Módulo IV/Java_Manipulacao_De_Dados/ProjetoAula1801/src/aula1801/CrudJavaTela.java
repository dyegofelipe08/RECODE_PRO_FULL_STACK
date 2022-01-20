package aula1801;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CrudJavaTela extends JFrame {

	private JPanel contentPane;
	private JTextField txfIdAluno;
	private JTextField txtNomeAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudJavaTela frame = new CrudJavaTela();
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
	public CrudJavaTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Exec\u00EDcio CRUD ");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel.setBounds(141, 11, 169, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id_Aluno:");
		lblNewLabel_1.setBounds(10, 85, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome: ");
		lblNewLabel_2.setBounds(10, 125, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btEnviar = new JButton("Enviar");
		btEnviar.setBounds(40, 190, 89, 23);
		contentPane.add(btEnviar);
		
		JButton btListar = new JButton("Listar");
		btListar.setBounds(179, 190, 89, 23);
		contentPane.add(btListar);
		
		JButton BtApagar = new JButton("Apagar");
		BtApagar.setBounds(313, 190, 89, 23);
		contentPane.add(BtApagar);
		
		txfIdAluno = new JTextField();
		txfIdAluno.setBounds(64, 82, 105, 20);
		contentPane.add(txfIdAluno);
		txfIdAluno.setColumns(10);
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setBounds(64, 122, 169, 20);
		contentPane.add(txtNomeAluno);
		txtNomeAluno.setColumns(10);
	}
}
