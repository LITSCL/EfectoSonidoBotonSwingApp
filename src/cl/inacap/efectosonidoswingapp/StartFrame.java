package cl.inacap.efectosonidoswingapp;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.applet.AudioClip;

public class StartFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnBoton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
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
	public StartFrame() {
		this.setTitle("EfectoSonidoBotonSwingApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnBoton = new JButton("Boton");
		btnBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					AudioClip sonido;
					sonido = java.applet.Applet.newAudioClip(getClass().getResource("/cl/inacap/efectosonidoswingapp/sound/sonido.wav")); //El sonido tiene que estar obligatoriamente en un paquete (No se puede usar un Folder).
					sonido.play();
				} catch (Exception e) {
					System.out.println("Ruta Erronea");
				}
			}
		});
		btnBoton.setBounds(297, 209, 89, 23);
		contentPane.add(btnBoton);
	}
}
