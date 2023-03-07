package Laba2; //пакет Java классов

import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {

	public static Object logo;
	private Image icon;
	
	public Image getIcon() {
		return icon;
	}
	
	protected JFrame main_GUI;
	protected JPanel main_panel;
	protected static subversion student;
	protected static JComboBox combo_student;

	
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// создание графического окна
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(1000,600,600,400);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	laba_info.setBounds(215,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(240,250,100,40);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("Информация"); // добавляем кнопку
	button_info.setBounds(30,250,150,40);
	ActionListener info_listener = new ListenerInfoButton(); //создаем слушателя
	button_info.addActionListener(info_listener);
	main_panel.add(button_info); 
	
	ActionListener info_listener2 = new ListenerInfoButton() {
		public void actionPerformed(ActionEvent e) {
			if (main_GUI.isVisible()) {
				main_GUI.setVisible(false);
			}
		}
	};
	
	button_info.addActionListener(info_listener2);
	
	JMenu menu = new JMenu("Главная"); // добавляем выпадающее меню
	JMenuBar menuBar = new JMenuBar();
	JMenuItem menu1 = new JMenuItem("Отобразить логотип УГАТУ"); // добавляем кнопку
	JMenuItem menu2 = new JMenuItem("Выход"); // добавляем кнопку
	JMenuItem menu3 = new JMenuItem("Загрузить файл в проект 8");
	
	menu2.addActionListener(actionListener);
	ActionListener logo_image = new ListenerButton();
	
	menu.add(menu1);
	menu.add(menu2);
	menu.add(menu3);
	menuBar.add(menu);
	main_GUI.setJMenuBar(menuBar);
	
	icon = new Image(); // добавляем логотип 
	main_panel.add(icon);
	icon.setBounds(350,20, 250,150); // прописываем положение логотипа
	icon.setVisible(false);
	
	
	
	ActionListener logo = new ListenerButton() {
		public void actionPerformed(ActionEvent e) {
			icon.setVisible(true);
		}
	};
	
	menu1.addActionListener(logo);
	
	String[] positions = { "Переместить логотип УГАТУ в верхний правый угол", "Переместить логотип УГАТУ в середину", "Переместить логотип УГАТУ в левый верхний угол", "Отсортировать данные в проекте 8"};
	JComboBox menu4 = new JComboBox(positions); // добавляем выпадающий список с выбором позиций логотипа
	menu4.setBounds(120,200,350,30);
	ActionListener logo_transfer = new transfer_logo();
	menu4.addActionListener(logo_transfer);
	menu4.setVisible(true);
	main_panel.add(menu4);	
	
	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}

}
