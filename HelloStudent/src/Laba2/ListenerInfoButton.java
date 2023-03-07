package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//����� ����������� ��������� (�������� ������� ������)
public class ListenerInfoButton implements ActionListener {

	@Override // �������� �����, ������� ��������� � �������� ������ ������ ������� ���������� ������ ������������� ������
	public void actionPerformed(ActionEvent e) {

		JFrame info_GUI = new JFrame ("Info");
		info_GUI.setTitle ("���������� � �������������");
		info_GUI.setBounds(1000,600,600,400);
		info_GUI.setResizable(false); // ������������� ������ ����
		
		JPanel info_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
		info_panel.setLayout(null);
		info_GUI.add(info_panel);
		
		JLabel info_label_KR = new JLabel("<html> ������ �����������<br>" + "����� �������� ������: 0207 <br></html>" ); // ����������� ������ ��� �����������
		info_label_KR.setBounds(10,0,300,30);
		info_panel.add(info_label_KR);
		
		JLabel info_label_MN = new JLabel("<html> �������� �������� <br>" + "����� �������� ������: 0003 <br></html>"); // ����������� ������ ��� �����������
		info_label_MN.setBounds(10,50,300,30);
		info_panel.add(info_label_MN); 
		
		JButton button_back = new JButton("�����"); // ��������� ������
		button_back.setBounds(30,250,100,40);
        ActionListener back_listener = new ListenerButton() {
			public void actionPerformed(ActionEvent e) {
				subversion student = new subversion();
					info_GUI.setVisible(false);
					info_GUI.getContentPane().removeAll();
			}
        };
        button_back.addActionListener(back_listener);
		info_panel.add(button_back);
		
		info_GUI.setVisible(true);
		
	}
	
	} 

