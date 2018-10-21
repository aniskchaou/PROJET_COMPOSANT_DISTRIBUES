/*

lecteur mp3 est la classe principale qui hete de jframe et permet d'afficher les interface 
et contient tout les evenement
 */
import java.awt.Color;
/*
 
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;

import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;

public class LecteurMP3 extends javax.swing.JFrame {

    String current_music = null;

    private Recording recorder;
    private Radio r;
    private Photos ph;
    private Music m;

    public LecteurMP3() {
        initComponents();
        init_navigation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        background_image_panel = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {
                ImageIcon ii=new ImageIcon("icons/background_board.png");
                Image  i=ii.getImage();
                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }

        };
        play_bt = new javax.swing.JButton();
        next_bt = new javax.swing.JButton();
        previous_bt = new javax.swing.JButton();
        menu_bt = new javax.swing.JButton();
        main_screen = new javax.swing.JPanel();
        menu_button = new javax.swing.JButton();
        time_label = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {
                ImageIcon ii=new ImageIcon("icons/mp3_logo.png");
                Image  i=ii.getImage();
                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        };
        menu_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_menu_list = new javax.swing.JList<>();
        list_music_label = new javax.swing.JLabel();
        return_music_list_main_screen_bt = new javax.swing.JButton();
        music_list_panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_music_list = new javax.swing.JList<>();
        music_list_menu_list_bt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logo_panel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g)
            {
                ImageIcon ii=new ImageIcon("logo_apple.png");
                Image  i=ii.getImage();
                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        };
        play_music_panel = new javax.swing.JPanel();
        now_play_musiqc_list_bt = new javax.swing.JButton();
        music_name_label = new javax.swing.JLabel();
        play_button = new javax.swing.JButton();
        stop_buuton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {
                ImageIcon ii=new ImageIcon("icons./music_logo.jpg");
                Image  i=ii.getImage();
                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        };
        photos_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        photos_list_menu_list_bt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_photos = new javax.swing.JList<>();
        view_photo_panel = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        image_name_lbl = new javax.swing.JLabel();
        radio_panel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_radio = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        return_radio_menu_bt = new javax.swing.JButton();
        recording_panel = new javax.swing.JPanel();
        recording_file_label = new javax.swing.JLabel();
        start_recording_button = new javax.swing.JButton();
        stop_recording_button = new javax.swing.JButton();
        return_recording_button_recorded_list_bt = new javax.swing.JButton();
        recorded_file_name_label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g)
            {
                ImageIcon ii=new ImageIcon("icons/recording.jpg");
                Image  i=ii.getImage();
                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }
        };
        radio_listening_panel = new javax.swing.JPanel();
        stream_radio_radio_list_bt = new javax.swing.JButton();
        radio_station_logo = new javax.swing.JPanel(){
            public void paintComponent(Graphics g)
            {
                ImageIcon ii=new ImageIcon("icons/radio_station.png");
                Image  i=ii.getImage();
                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);
            }

        };
        jLabel2 = new javax.swing.JLabel();
        recorded_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        list_recording = new javax.swing.JList<>();
        return_recording_menu = new javax.swing.JButton();
        record_button = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(894984300, 2147483647));

        play_bt.setIcon(new javax.swing.ImageIcon("icons/play.png"));
        play_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_btActionPerformed(evt);
            }
        });

        next_bt.setIcon(new javax.swing.ImageIcon("icons/media_next.png"));
        next_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btActionPerformed(evt);
            }
        });

        previous_bt.setIcon(new javax.swing.ImageIcon("icons/media_previous.png"));
        previous_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous_btActionPerformed(evt);
            }
        });

        menu_bt.setIcon(new javax.swing.ImageIcon("icons/menu.svg.png"));
        menu_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background_image_panelLayout = new javax.swing.GroupLayout(background_image_panel);
        background_image_panel.setLayout(background_image_panelLayout);
        background_image_panelLayout.setHorizontalGroup(
            background_image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_image_panelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(background_image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(play_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(background_image_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previous_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        background_image_panelLayout.setVerticalGroup(
            background_image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_image_panelLayout.createSequentialGroup()
                .addComponent(play_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(background_image_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previous_bt)
                    .addComponent(next_bt))
                .addGap(29, 29, 29)
                .addComponent(menu_bt)
                .addContainerGap())
        );

        main_screen.setBackground(new java.awt.Color(255, 255, 255));
        main_screen.setPreferredSize(new java.awt.Dimension(270, 271));

        menu_button.setText("Menu");
        menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buttonActionPerformed(evt);
            }
        });

        time_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        time_label.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout main_screenLayout = new javax.swing.GroupLayout(main_screen);
        main_screen.setLayout(main_screenLayout);
        main_screenLayout.setHorizontalGroup(
            main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_screenLayout.createSequentialGroup()
                .addGroup(main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_screenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menu_button))
                    .addGroup(main_screenLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        main_screenLayout.setVerticalGroup(
            main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_screenLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(menu_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        menu_panel.setBackground(new java.awt.Color(255, 255, 255));
        menu_panel.setPreferredSize(new java.awt.Dimension(270, 271));

        list_menu_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Music", "Photos", "Recording", "Radio", "Return" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_menu_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_menu_listMouseClicked(evt);
            }
        });
        list_menu_list.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                list_menu_listKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(list_menu_list);

        list_music_label.setText("Menu List");

        return_music_list_main_screen_bt.setText("Return");
        return_music_list_main_screen_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_music_list_main_screen_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_panelLayout.createSequentialGroup()
                        .addComponent(list_music_label, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(return_music_list_main_screen_bt))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(list_music_label)
                    .addGroup(menu_panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(return_music_list_main_screen_bt)))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        music_list_panel.setBackground(new java.awt.Color(255, 255, 255));
        music_list_panel.setPreferredSize(new java.awt.Dimension(270, 271));

        list_music_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_music_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_music_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_music_list);

        music_list_menu_list_bt.setText("Return");
        music_list_menu_list_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                music_list_menu_list_btActionPerformed(evt);
            }
        });

        jLabel1.setText("Music List");

        javax.swing.GroupLayout music_list_panelLayout = new javax.swing.GroupLayout(music_list_panel);
        music_list_panel.setLayout(music_list_panelLayout);
        music_list_panelLayout.setHorizontalGroup(
            music_list_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(music_list_panelLayout.createSequentialGroup()
                .addGroup(music_list_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(music_list_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(music_list_panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(music_list_menu_list_bt)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        music_list_panelLayout.setVerticalGroup(
            music_list_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, music_list_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(music_list_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(music_list_menu_list_bt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout logo_panelLayout = new javax.swing.GroupLayout(logo_panel);
        logo_panel.setLayout(logo_panelLayout);
        logo_panelLayout.setHorizontalGroup(
            logo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        logo_panelLayout.setVerticalGroup(
            logo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        play_music_panel.setBackground(new java.awt.Color(255, 255, 255));
        play_music_panel.setPreferredSize(new java.awt.Dimension(270, 271));

        now_play_musiqc_list_bt.setText("Return");
        now_play_musiqc_list_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                now_play_musiqc_list_btActionPerformed(evt);
            }
        });

        music_name_label.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        music_name_label.setText("Playing");

        play_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\PROJET_COMPOSANTS_DISTRIBUES\\icons\\play.png")); // NOI18N
        play_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_buttonActionPerformed(evt);
            }
        });

        stop_buuton.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\PROJET_COMPOSANTS_DISTRIBUES\\icons\\stop_media.png")); // NOI18N
        stop_buuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop_buutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout play_music_panelLayout = new javax.swing.GroupLayout(play_music_panel);
        play_music_panel.setLayout(play_music_panelLayout);
        play_music_panelLayout.setHorizontalGroup(
            play_music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(play_music_panelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(play_music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(play_music_panelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(music_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                    .addGroup(play_music_panelLayout.createSequentialGroup()
                        .addComponent(play_button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(stop_buuton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, play_music_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(now_play_musiqc_list_bt)
                .addGap(94, 94, 94))
        );
        play_music_panelLayout.setVerticalGroup(
            play_music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(play_music_panelLayout.createSequentialGroup()
                .addGroup(play_music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(play_music_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(now_play_musiqc_list_bt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(music_name_label)
                        .addGap(87, 87, 87))
                    .addGroup(play_music_panelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(play_music_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stop_buuton)
                    .addComponent(play_button))
                .addGap(38, 38, 38))
        );

        photos_panel.setBackground(new java.awt.Color(255, 255, 255));
        photos_panel.setPreferredSize(new java.awt.Dimension(270, 271));

        jLabel3.setText("Photo List");

        photos_list_menu_list_bt.setText("Return");
        photos_list_menu_list_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photos_list_menu_list_btActionPerformed(evt);
            }
        });

        list_photos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_photos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_photosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(list_photos);

        javax.swing.GroupLayout photos_panelLayout = new javax.swing.GroupLayout(photos_panel);
        photos_panel.setLayout(photos_panelLayout);
        photos_panelLayout.setHorizontalGroup(
            photos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photos_panelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(photos_list_menu_list_bt)
                .addGap(18, 18, 18))
            .addGroup(photos_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        photos_panelLayout.setVerticalGroup(
            photos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photos_panelLayout.createSequentialGroup()
                .addGroup(photos_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(photos_panelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3))
                    .addGroup(photos_panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(photos_list_menu_list_bt)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        view_photo_panel.setBackground(new java.awt.Color(255, 255, 255));
        view_photo_panel.setPreferredSize(new java.awt.Dimension(270, 271));

        jButton6.setText("Return");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        image_name_lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        image_name_lbl.setText("jLabel2");

        javax.swing.GroupLayout view_photo_panelLayout = new javax.swing.GroupLayout(view_photo_panel);
        view_photo_panel.setLayout(view_photo_panelLayout);
        view_photo_panelLayout.setHorizontalGroup(
            view_photo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, view_photo_panelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(image_name_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(33, 33, 33))
        );
        view_photo_panelLayout.setVerticalGroup(
            view_photo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_photo_panelLayout.createSequentialGroup()
                .addGroup(view_photo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(image_name_lbl)
                    .addComponent(jButton6))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        radio_panel.setBackground(new java.awt.Color(255, 255, 255));
        radio_panel.setPreferredSize(new java.awt.Dimension(270, 271));

        list_radio.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Radio nami" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_radioMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(list_radio);

        jLabel5.setText("Radio List");

        return_radio_menu_bt.setText("Return");
        return_radio_menu_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_radio_menu_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout radio_panelLayout = new javax.swing.GroupLayout(radio_panel);
        radio_panel.setLayout(radio_panelLayout);
        radio_panelLayout.setHorizontalGroup(
            radio_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radio_panelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(return_radio_menu_bt)
                .addGap(21, 21, 21))
            .addGroup(radio_panelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        radio_panelLayout.setVerticalGroup(
            radio_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, radio_panelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(radio_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(return_radio_menu_bt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        recording_panel.setBackground(new java.awt.Color(255, 255, 255));
        recording_panel.setPreferredSize(new java.awt.Dimension(270, 271));

        recording_file_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        start_recording_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\PROJET_COMPOSANTS_DISTRIBUES\\icons\\record_media.png")); // NOI18N
        start_recording_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_recording_buttonActionPerformed(evt);
            }
        });

        stop_recording_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\PROJET_COMPOSANTS_DISTRIBUES\\icons\\stop_media.png")); // NOI18N
        stop_recording_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop_recording_buttonActionPerformed(evt);
            }
        });

        return_recording_button_recorded_list_bt.setText("Return");
        return_recording_button_recorded_list_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_recording_button_recorded_list_btActionPerformed(evt);
            }
        });

        recorded_file_name_label.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout recording_panelLayout = new javax.swing.GroupLayout(recording_panel);
        recording_panel.setLayout(recording_panelLayout);
        recording_panelLayout.setHorizontalGroup(
            recording_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recording_panelLayout.createSequentialGroup()
                .addGroup(recording_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recording_panelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(return_recording_button_recorded_list_bt))
                    .addGroup(recording_panelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(start_recording_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(stop_recording_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(recording_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(recorded_file_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(recording_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(recording_file_label, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        recording_panelLayout.setVerticalGroup(
            recording_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recording_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(recording_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(return_recording_button_recorded_list_bt)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(recording_file_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recorded_file_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(recording_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(start_recording_button, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stop_recording_button, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        radio_listening_panel.setBackground(new java.awt.Color(255, 255, 255));
        radio_listening_panel.setPreferredSize(new java.awt.Dimension(270, 271));

        stream_radio_radio_list_bt.setText("Return");
        stream_radio_radio_list_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stream_radio_radio_list_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout radio_station_logoLayout = new javax.swing.GroupLayout(radio_station_logo);
        radio_station_logo.setLayout(radio_station_logoLayout);
        radio_station_logoLayout.setHorizontalGroup(
            radio_station_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        radio_station_logoLayout.setVerticalGroup(
            radio_station_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setText("Playing Now ...");

        javax.swing.GroupLayout radio_listening_panelLayout = new javax.swing.GroupLayout(radio_listening_panel);
        radio_listening_panel.setLayout(radio_listening_panelLayout);
        radio_listening_panelLayout.setHorizontalGroup(
            radio_listening_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, radio_listening_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stream_radio_radio_list_bt)
                .addContainerGap())
            .addGroup(radio_listening_panelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(radio_listening_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(radio_station_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        radio_listening_panelLayout.setVerticalGroup(
            radio_listening_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(radio_listening_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(stream_radio_radio_list_bt)
                .addGap(26, 26, 26)
                .addComponent(radio_station_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        recorded_panel.setBackground(new java.awt.Color(255, 255, 255));
        recorded_panel.setPreferredSize(new java.awt.Dimension(270, 271));

        jLabel6.setText("Recoding list");

        list_recording.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(list_recording);

        return_recording_menu.setText("Return");
        return_recording_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_recording_menuActionPerformed(evt);
            }
        });

        record_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\PROJET_COMPOSANTS_DISTRIBUES\\icons\\record_media.png")); // NOI18N
        record_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                record_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recorded_panelLayout = new javax.swing.GroupLayout(recorded_panel);
        recorded_panel.setLayout(recorded_panelLayout);
        recorded_panelLayout.setHorizontalGroup(
            recorded_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recorded_panelLayout.createSequentialGroup()
                .addGroup(recorded_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recorded_panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addGap(114, 114, 114)
                        .addComponent(return_recording_menu))
                    .addGroup(recorded_panelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(recorded_panelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(record_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        recorded_panelLayout.setVerticalGroup(
            recorded_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recorded_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(recorded_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recorded_panelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6))
                    .addComponent(return_recording_menu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(record_button)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(background_image_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(610, 610, 610)
                        .addComponent(logo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(main_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(photos_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(music_list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(view_photo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(play_music_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(radio_listening_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(radio_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recording_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recorded_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(play_music_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(music_list_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(recorded_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(photos_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                            .addComponent(view_photo_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(radio_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(recording_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(radio_listening_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1977, Short.MAX_VALUE)
                        .addComponent(background_image_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(main_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void next_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btActionPerformed

        m = new Music();
        m.next();
        play_music_panel.setVisible(true);
    }//GEN-LAST:event_next_btActionPerformed

    private void previous_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous_btActionPerformed

        m = new Music();
        m.previous();
        play_music_panel.setVisible(true);
    }//GEN-LAST:event_previous_btActionPerformed

    private void menu_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btActionPerformed

        radio_panel.setVisible(false);
        recorded_panel.setVisible(false);
        recording_panel.setVisible(false);
        photos_panel.setVisible(false);
        view_photo_panel.setVisible(false);
        radio_listening_panel.setVisible(false);
        main_screen.setVisible(false);
        menu_panel.setVisible(true);
    }//GEN-LAST:event_menu_btActionPerformed

    private void menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buttonActionPerformed
        main_screen.setVisible(false);
        menu_panel.setVisible(true);

    }//GEN-LAST:event_menu_buttonActionPerformed

    private void return_music_list_main_screen_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_music_list_main_screen_btActionPerformed

        main_screen.setVisible(true);
        menu_panel.setVisible(false);
    }//GEN-LAST:event_return_music_list_main_screen_btActionPerformed

    private void list_menu_listKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_list_menu_listKeyPressed

    }//GEN-LAST:event_list_menu_listKeyPressed

    private void list_menu_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_menu_listMouseClicked

        int index = list_menu_list.getSelectedIndex();
        String[] radios = {"Radio nimo"};
        if (index == 0) {
            music_list_panel.setVisible(true);
            menu_panel.setVisible(false);

        } else if (index == 1) {
            ph = new Photos();
            ph.afficher_liste_images(list_photos);
            photos_panel.setVisible(true);
            menu_panel.setVisible(false);
        } else if (index == 2) {
            recorded_panel.setVisible(true);
            menu_panel.setVisible(false);
        } else if (index == 3) {
            list_radio.setListData(radios);
            radio_panel.setVisible(true);
            menu_panel.setVisible(false);

        } else {
            main_screen.setVisible(true);
            menu_panel.setVisible(false);
        }
    }//GEN-LAST:event_list_menu_listMouseClicked

    private void photos_list_menu_list_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photos_list_menu_list_btActionPerformed
        photos_panel.setVisible(false);
        menu_panel.setVisible(true);

    }//GEN-LAST:event_photos_list_menu_list_btActionPerformed

    private void music_list_menu_list_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_music_list_menu_list_btActionPerformed

        music_list_panel.setVisible(false);
        menu_panel.setVisible(true);
    }//GEN-LAST:event_music_list_menu_list_btActionPerformed

    private void return_radio_menu_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_radio_menu_btActionPerformed

        radio_panel.setVisible(false);
        menu_panel.setVisible(true);
    }//GEN-LAST:event_return_radio_menu_btActionPerformed

    private void return_recording_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_recording_menuActionPerformed

        recorded_panel.setVisible(false);
        menu_panel.setVisible(true);
    }//GEN-LAST:event_return_recording_menuActionPerformed

    private void list_music_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_music_listMouseClicked

        int index = list_music_list.getSelectedIndex();
        m = new Music();
        current_music = list_music_list.getSelectedValue();
        m.playmp3(list_music_list.getSelectedValue());
        music_name_label.setText(list_music_list.getSelectedValue());
        play_music_panel.setVisible(true);
        music_list_panel.setVisible(false);
        play_button.setEnabled(false);
    }//GEN-LAST:event_list_music_listMouseClicked

    private void now_play_musiqc_list_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_now_play_musiqc_list_btActionPerformed

        play_music_panel.setVisible(false);
        music_list_panel.setVisible(true);
        m = new Music();
        m.stopMusic();
        play_button.setEnabled(true);
        stop_buuton.setEnabled(true);
    }//GEN-LAST:event_now_play_musiqc_list_btActionPerformed

    private void play_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_buttonActionPerformed
        m = new Music();
        m.playmp3(current_music);
        play_button.setEnabled(false);
        stop_buuton.setEnabled(true);
    }//GEN-LAST:event_play_buttonActionPerformed

    private void stop_buutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop_buutonActionPerformed

        m = new Music();
        m.stopMusic();
        stop_buuton.setEnabled(false);
        play_button.setEnabled(true);
    }//GEN-LAST:event_stop_buutonActionPerformed

    private void list_radioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_radioMouseClicked

        int index = list_music_list.getSelectedIndex();
        r = new Radio();
        radio_panel.setVisible(false);
        radio_listening_panel.setVisible(true);
        r.lectureRadio(1);

    }//GEN-LAST:event_list_radioMouseClicked

    private void stream_radio_radio_list_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stream_radio_radio_list_btActionPerformed

        r.arreterRadio();
        radio_panel.setVisible(true);
        radio_listening_panel.setVisible(false);
    }//GEN-LAST:event_stream_radio_radio_list_btActionPerformed

    private void record_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_record_buttonActionPerformed

        recording_panel.setVisible(true);
        recorded_panel.setVisible(false);
    }//GEN-LAST:event_record_buttonActionPerformed

    private void list_photosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_photosMouseClicked

        int index = list_photos.getSelectedIndex();
        ImagePanel panel = new ImagePanel(new ImageIcon("images/" + list_photos.getSelectedValue()).getImage());
        panel.setLocation(50, 50);
        image_name_lbl.setText(list_photos.getSelectedValue());
        photos_panel.setVisible(false);
        view_photo_panel.setVisible(true);

        view_photo_panel.add(panel);
    }//GEN-LAST:event_list_photosMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        view_photo_panel.setVisible(false);
        photos_panel.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void start_recording_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_recording_buttonActionPerformed

        recorder = new Recording();
        Date d = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss");
        String strDate = dateFormat.format(d);
        recorder.filename = strDate;
        recorder.demarrerEnregistrement(recorder.filename + ".wav");
        recording_file_label.setText("Recording .... ");
        recorded_file_name_label.setText(recorder.filename + ".wav is generated ");
    }//GEN-LAST:event_start_recording_buttonActionPerformed

    private void stop_recording_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop_recording_buttonActionPerformed

        recorder.arreterEnregistrement();
        recording_file_label.setText("the file " + recorder.filename + ".wav");
        recorded_file_name_label.setText(" is saved in recording directory");
    }//GEN-LAST:event_stop_recording_buttonActionPerformed

    private void return_recording_button_recorded_list_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_recording_button_recorded_list_btActionPerformed

        recording_panel.setVisible(false);
        recorded_panel.setVisible(true);
    }//GEN-LAST:event_return_recording_button_recorded_list_btActionPerformed

    private void play_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_btActionPerformed

        m = new Music();
        String[] music_lists = m.getMusiques();
        current_music = music_lists[0];
        m.playmp3(music_lists[0]);
        menu_panel.setVisible(false);
        music_list_panel.setVisible(false);
        play_music_panel.setVisible(false);
        radio_panel.setVisible(false);
        recorded_panel.setVisible(false);
        recording_panel.setVisible(false);
        photos_panel.setVisible(false);
        view_photo_panel.setVisible(false);
        radio_listening_panel.setVisible(false);
        main_screen.setVisible(false);
        play_music_panel.setVisible(true);
        music_name_label.setText(music_lists[0]);
    }//GEN-LAST:event_play_btActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LecteurMP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecteurMP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecteurMP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecteurMP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LecteurMP3 p = new LecteurMP3();
                p.setSize(new Dimension(300, 580));
                p.getContentPane().setBackground(Color.black);
                ImageIcon img = new ImageIcon("icons/icon.jpg");
                p.setIconImage(img.getImage());
                p.setResizable(false);
                p.setVisible(true);

            }

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_image_panel;
    private javax.swing.JLabel image_name_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> list_menu_list;
    private javax.swing.JLabel list_music_label;
    private javax.swing.JList<String> list_music_list;
    private javax.swing.JList<String> list_photos;
    private javax.swing.JList<String> list_radio;
    private javax.swing.JList<String> list_recording;
    private javax.swing.JPanel logo_panel;
    private javax.swing.JPanel main_screen;
    private javax.swing.JButton menu_bt;
    private javax.swing.JButton menu_button;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JButton music_list_menu_list_bt;
    private javax.swing.JPanel music_list_panel;
    private javax.swing.JLabel music_name_label;
    private javax.swing.JButton next_bt;
    private javax.swing.JButton now_play_musiqc_list_bt;
    private javax.swing.JButton photos_list_menu_list_bt;
    private javax.swing.JPanel photos_panel;
    private javax.swing.JButton play_bt;
    private javax.swing.JButton play_button;
    private javax.swing.JPanel play_music_panel;
    private javax.swing.JButton previous_bt;
    private javax.swing.JPanel radio_listening_panel;
    private javax.swing.JPanel radio_panel;
    private javax.swing.JPanel radio_station_logo;
    private javax.swing.JButton record_button;
    private javax.swing.JLabel recorded_file_name_label;
    private javax.swing.JPanel recorded_panel;
    private javax.swing.JLabel recording_file_label;
    private javax.swing.JPanel recording_panel;
    private javax.swing.JButton return_music_list_main_screen_bt;
    private javax.swing.JButton return_radio_menu_bt;
    private javax.swing.JButton return_recording_button_recorded_list_bt;
    private javax.swing.JButton return_recording_menu;
    private javax.swing.JButton start_recording_button;
    private javax.swing.JButton stop_buuton;
    private javax.swing.JButton stop_recording_button;
    private javax.swing.JButton stream_radio_radio_list_bt;
    private javax.swing.JLabel time_label;
    private javax.swing.JPanel view_photo_panel;
    // End of variables declaration//GEN-END:variables

    //initiation des interfaces et afficher l'interface principle
    private void init_navigation() {
        menu_panel.setVisible(false);
        music_list_panel.setVisible(false);
        play_music_panel.setVisible(false);
        radio_panel.setVisible(false);
        recorded_panel.setVisible(false);
        recording_panel.setVisible(false);
        photos_panel.setVisible(false);
        view_photo_panel.setVisible(false);
        radio_listening_panel.setVisible(false);
        Music m = new Music();
        m.afficher_liste_musique(list_music_list);
        Recording r = new Recording();
        r.afficher_liste_record(list_recording);
        demarrerHorloge();
    }

    //afficher l'horloge
    public void demarrerHorloge() {

        Runnable runnable = () -> {

            try {
                for (;;) {

                    Calendar c1 = new GregorianCalendar();
                    int day = c1.get(Calendar.DAY_OF_MONTH);
                    int month = c1.get(Calendar.MONTH);
                    int year = c1.get(Calendar.YEAR);

                    int seconds = c1.get(Calendar.SECOND);
                    int minutes = c1.get(Calendar.MINUTE);
                    int hours = c1.get(Calendar.HOUR);
                    int am_pm = c1.get(Calendar.AM_PM);

                    String d_n = "";
                    if (am_pm == 1) {
                        d_n = "PM";
                    } else {
                        d_n = "AM";
                    }
                    if (time_label != null) {
                        time_label.setText(hours + " : " + minutes + " : " + seconds + "  " + d_n);
                        System.err.println(hours + " : " + minutes + " : " + seconds + "  " + d_n);
                    }
                    sleep(1000);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        };

        Thread horloge_thread = new Thread(runnable);
        horloge_thread.start();
    }

}
