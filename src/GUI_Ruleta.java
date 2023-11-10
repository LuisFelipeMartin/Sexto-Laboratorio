import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;
public class GUI_Ruleta extends javax.swing.JFrame
{
    int j = 0, k = 0, i = 0, h = 0,g=0, apuesta = 0,saldoInicial=10000,saldoFinal=saldoInicial,opc=0,t1=0,t2=0,t3=0,t4=0,t5=0,t6=0,t7=0,t8=0,t9=0,t10=0,t11=0,t12=0,t13=0,t14=0,t15=0,t16=0,t17=0,t18=0,t19=0,t20=0,t21=0,t22=0,t23=0,t24=0,t25=0,t26=0,t27=0,t28=0,t29=0,t30=0,t31=0,t32=0,t33=0,t34=0,t35=0,t36=0,t37=0,t38=0;
    ImageIcon[] ruletas = new ImageIcon[8];
    ImageIcon[] resultados = new ImageIcon[39];
    Thread h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14,h15,h16,h17,h18,h19,h20,h21,h22,h23,h24,h25,h26,h27,h28,h29,h30,h31,h32,h33,h34,h35,h36,h37,h38;
    public GUI_Ruleta() 
    {
        initComponents();
        TexSaldo.setText(Integer.toString(saldoInicial));
    }
    @SuppressWarnings("unchecked")
    public void run()
    {
        do
        {
            if(t1==5||t2==5||t3==5||t4==5||t5==5||t6==5||t7==5||t8==5||t9==5||t10==5||t11==5||t12==5||t13==5||t14==5||t15==5||t16==5||t17==5||t18==5||t19==5||t20==5||t21==5||t22==5||t23==5||t24==5||t25==5||t26==5||t27==5||t28==5||t29==5||t30==5||t31==5||t32==5||t33==5||t34==5||t35==5||t36==5||t37==5||t38==5)
            {
                System.out.println(" ");
            }
            else
            {
                Thread temporal = Thread.currentThread();
                if(temporal==h1)
                {
                    Tablero1();
                }
                else
                {
                    if(temporal==h2)
                    {
                        Tablero2();
                    }
                    else
                    {
                        if(temporal==h3)
                        {
                            Tablero3();
                        }
                        else
                        {
                            if(temporal==h4)
                            {
                                Tablero4();
                            }
                            else
                            {
                                if(temporal==h5)
                                {
                                    Tablero5();
                                }
                                else
                                {
                                    if(temporal==h6)
                                    {
                                        Tablero6();
                                    }
                                    else
                                    {
                                        if(temporal==h7)
                                        {
                                            Tablero7();
                                        }
                                        else
                                        {
                                            if(temporal==h8)
                                            {
                                                Tablero8();
                                            }
                                            else
                                            {
                                                if(temporal==h9)
                                                {
                                                    Tablero9();
                                                }
                                                else
                                                {
                                                    if(temporal==h10)
                                                    {
                                                        Tablero10();
                                                    }
                                                    else
                                                    {
                                                        if(temporal==h11)
                                                        {
                                                            Tablero11();
                                                        }
                                                        else
                                                        {
                                                            if(temporal==h12)
                                                            {
                                                                Tablero12();
                                                            }
                                                            else
                                                            {   
                                                                if(temporal==h13)
                                                                {
                                                                    Tablero13();
                                                                }
                                                                else
                                                                {
                                                                    if(temporal==h14)
                                                                    {
                                                                        Tablero14();
                                                                    }
                                                                    else
                                                                    {
                                                                        if(temporal==h15)
                                                                        {
                                                                            Tablero15();
                                                                        }
                                                                        else
                                                                        {
                                                                            if(temporal==h16)
                                                                            {
                                                                                Tablero16();
                                                                            }
                                                                            else
                                                                            {
                                                                                if(temporal==h17)
                                                                                {
                                                                                    Tablero17();
                                                                                }
                                                                                else
                                                                                {
                                                                                    if(temporal==h18)
                                                                                    {
                                                                                        Tablero18();
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        if(temporal==h19)
                                                                                        {
                                                                                            Tablero19();
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            if(temporal==h20)
                                                                                            {
                                                                                                Tablero20();
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                if(temporal==h21)
                                                                                                {
                                                                                                    Tablero21();
                                                                                                }
                                                                                                else
                                                                                                {
                                                                                                    if(temporal==h22)
                                                                                                    {
                                                                                                        Tablero22();
                                                                                                    }
                                                                                                    else
                                                                                                    {
                                                                                                        if(temporal==h23)
                                                                                                        {
                                                                                                            Tablero23();
                                                                                                        }
                                                                                                        else
                                                                                                        {
                                                                                                            if(temporal==h24)
                                                                                                            {
                                                                                                                Tablero24();
                                                                                                            }
                                                                                                            else
                                                                                                            {   
                                                                                                                if(temporal==h25)
                                                                                                                {
                                                                                                                    Tablero25();
                                                                                                                }
                                                                                                                else
                                                                                                                {
                                                                                                                    if(temporal==h26)
                                                                                                                    {
                                                                                                                        Tablero26();
                                                                                                                    }
                                                                                                                    else
                                                                                                                    {
                                                                                                                        if(temporal==h27)
                                                                                                                        {
                                                                                                                            Tablero27();
                                                                                                                        }
                                                                                                                        else
                                                                                                                        {
                                                                                                                            if(temporal==h28)
                                                                                                                            {
                                                                                                                                Tablero28();
                                                                                                                            }
                                                                                                                            else
                                                                                                                            {
                                                                                                                                if(temporal==h29)
                                                                                                                                {
                                                                                                                                    Tablero29();
                                                                                                                                }
                                                                                                                                else
                                                                                                                                {
                                                                                                                                    if(temporal==h30)
                                                                                                                                    {
                                                                                                                                        Tablero30();
                                                                                                                                    }
                                                                                                                                    else
                                                                                                                                    {
                                                                                                                                        if(temporal==h31)
                                                                                                                                        {
                                                                                                                                            Tablero31();
                                                                                                                                        }
                                                                                                                                        else
                                                                                                                                        {
                                                                                                                                            if(temporal==h32)
                                                                                                                                            {
                                                                                                                                                Tablero32();
                                                                                                                                            }
                                                                                                                                            else
                                                                                                                                            {
                                                                                                                                                if(temporal==h33)
                                                                                                                                                {
                                                                                                                                                    Tablero33();
                                                                                                                                                }
                                                                                                                                                else
                                                                                                                                                {
                                                                                                                                                    if(temporal==h34)
                                                                                                                                                    {
                                                                                                                                                        Tablero34();
                                                                                                                                                    }
                                                                                                                                                    else
                                                                                                                                                    {
                                                                                                                                                        if(temporal==h35)
                                                                                                                                                        {
                                                                                                                                                            Tablero35();
                                                                                                                                                        }
                                                                                                                                                        else
                                                                                                                                                        {
                                                                                                                                                            if(temporal==h36)
                                                                                                                                                            {
                                                                                                                                                                Tablero36();
                                                                                                                                                            }
                                                                                                                                                            else
                                                                                                                                                            {   
                                                                                                                                                                if(temporal==h37)
                                                                                                                                                                {
                                                                                                                                                                    Tablero37();
                                                                                                                                                                }
                                                                                                                                                                else
                                                                                                                                                                {
                                                                                                                                                                    if(temporal==h38)
                                                                                                                                                                    {
                                                                                                                                                                        Tablero38();
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }    
        }while(t1<5||t2<5||t3<5||t4<5||t5<5||t6<5||t7<5||t8<5||t9<5||t10<5||t11<5||t12<5||t13<5||t14<5||t15<5||t16<5||t17<5||t18<5||t19<5||t20<5||t21<5||t22<5||t23<5||t24<5||t25<5||t26<5||t27<5||t28<5||t29<5||t30<5||t31<5||t32<5||t33<5||t34<5||t35<5||t36<5||t37<5||t38<5);
        if((t1-5)==0)
        {
            h=1;
            System.out.println("t1: "+t1);
        }
        else
        {
            if((t2-5)==0)
            {
                h=2;
                System.out.println("t2: "+t2);
            }
            else
            {
                if((t3-5)==0)
                {
                    h=3;
                    System.out.println("t3: "+t3);
                }
                else
                {
                    if((t4-5)==0)
                    {
                       h=4; 
                       System.out.println("t4: "+t4);
                    }
                    else
                    {
                        if((t5-5)==0)
                        {
                            h=5;
                            System.out.println("t5: "+t5);
                        }
                        else
                        {
                            if((t6-5)==0)
                            {
                                h=6;
                                System.out.println("t6: "+t6);
                            }
                            else
                            {
                                if((t7-5)==0)
                                {
                                    h=7;
                                    System.out.println("t7: "+t7);
                                }
                                else
                                {
                                    if((t8-5)==0)
                                    {
                                        h=8;
                                        System.out.println("t8: "+t8);
                                    }
                                    else
                                    {
                                        if((t9-5)==0)
                                        {
                                            h=9;
                                            System.out.println("t9: "+t9);
                                        }
                                        else
                                        {
                                            if((t10-5)==0)
                                            {
                                                h=10;
                                                System.out.println("t10: "+t10);
                                            }
                                            else
                                            {
                                                if((t11-5)==0)
                                                {
                                                    h=11;
                                                    System.out.println("t11: "+t11);
                                                }
                                                else
                                                {
                                                    if((t12-5)==0)
                                                    {
                                                        h=12;
                                                        System.out.println("t12: "+t12);
                                                    }
                                                    else
                                                    {   
                                                        if((t13-5)==0)
                                                        {
                                                            h=13;
                                                            System.out.println("t13: "+t13);
                                                        }
                                                        else
                                                        {
                                                            if((t14-5)==0)
                                                            {
                                                                h=14;
                                                                System.out.println("t14: "+t14);
                                                            }
                                                            else
                                                            {
                                                                if((t15-5)==0)
                                                                {
                                                                    h=15;
                                                                    System.out.println("t15: "+t15);
                                                                }
                                                                else
                                                                {
                                                                    if((t16-5)==0)
                                                                    {
                                                                        h=16;
                                                                        System.out.println("t16: "+t16);
                                                                    }
                                                                    else
                                                                    {
                                                                        if((t17-5)==0)
                                                                        {
                                                                            h=17;
                                                                            System.out.println("t17: "+t17);
                                                                        }
                                                                        else
                                                                        {
                                                                            if((t18-5)==0)
                                                                            {
                                                                                h=18;
                                                                                System.out.println("t18: "+t18);
                                                                            }
                                                                            else
                                                                            {
                                                                                if((t19-5)==0)
                                                                                {
                                                                                    h=19;
                                                                                    System.out.println("t19: "+t19);
                                                                                }
                                                                                else
                                                                                {
                                                                                    if((t20-5)==0)
                                                                                    {
                                                                                        h=20;
                                                                                        System.out.println("t20: "+t20);
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        if((t21-5)==0)
                                                                                        {
                                                                                            h=21;
                                                                                            System.out.println("t21: "+t21);
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            if((t22-5)==0)
                                                                                            {
                                                                                                h=22;
                                                                                                System.out.println("t22: "+t22);
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                if((t23-5)==0)
                                                                                                {
                                                                                                    h=23;
                                                                                                    System.out.println("t23: "+t23);
                                                                                                }
                                                                                                else
                                                                                                {
                                                                                                    if((t24-5)==0)
                                                                                                    {
                                                                                                        h=24;
                                                                                                        System.out.println("t24: "+t24);
                                                                                                    }
                                                                                                    else
                                                                                                    {   
                                                                                                        if((t25-5)==0)
                                                                                                        {
                                                                                                            h=25;
                                                                                                            System.out.println("t25: "+t25);
                                                                                                        }
                                                                                                        else
                                                                                                        {
                                                                                                            if((t26-5)==0)
                                                                                                            {
                                                                                                                h=26;
                                                                                                                System.out.println("t26: "+t26);
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                                if((t27-5)==0)
                                                                                                                {
                                                                                                                    h=27;
                                                                                                                    System.out.println("t27: "+t27);
                                                                                                                }
                                                                                                                else
                                                                                                                {
                                                                                                                    if((t28-5)==0)
                                                                                                                    {
                                                                                                                        h=28;
                                                                                                                        System.out.println("t28: "+t28);
                                                                                                                    }
                                                                                                                    else
                                                                                                                    {
                                                                                                                        if((t29-5)==0)
                                                                                                                        {
                                                                                                                            h=29;
                                                                                                                            System.out.println("t29: "+t29);
                                                                                                                        }
                                                                                                                        else
                                                                                                                        {
                                                                                                                            if((t30-5)==0)
                                                                                                                            {
                                                                                                                                h=30;
                                                                                                                                System.out.println("t30: "+t30);
                                                                                                                            }
                                                                                                                            else
                                                                                                                            {
                                                                                                                                if((t31-5)==0)
                                                                                                                                {
                                                                                                                                    h=31;
                                                                                                                                    System.out.println("t31: "+t31);
                                                                                                                                }
                                                                                                                                else
                                                                                                                                {
                                                                                                                                    if((t32-5)==0)
                                                                                                                                    {
                                                                                                                                        h=32;
                                                                                                                                        System.out.println("t32: "+t32);
                                                                                                                                    }
                                                                                                                                    else
                                                                                                                                    {
                                                                                                                                        if((t33-5)==0)
                                                                                                                                        {
                                                                                                                                            h=33;
                                                                                                                                            System.out.println("t33: "+t33);
                                                                                                                                        }
                                                                                                                                        else
                                                                                                                                        {
                                                                                                                                            if((t34-5)==0)
                                                                                                                                            {
                                                                                                                                                h=34;
                                                                                                                                                System.out.println("t34: "+t34);
                                                                                                                                            }
                                                                                                                                            else
                                                                                                                                            {
                                                                                                                                                if((t35-5)==0)
                                                                                                                                                {
                                                                                                                                                    h=35;
                                                                                                                                                    System.out.println("t35: "+t35);
                                                                                                                                                }
                                                                                                                                                else
                                                                                                                                                {
                                                                                                                                                    if((t36-5)==0)
                                                                                                                                                    {
                                                                                                                                                        h=36;
                                                                                                                                                        System.out.println("t36: "+t36);
                                                                                                                                                    }
                                                                                                                                                    else
                                                                                                                                                    {   
                                                                                                                                                        if((t37-5)==0)
                                                                                                                                                        {
                                                                                                                                                            h=37;
                                                                                                                                                            System.out.println("t37: "+t37);
                                                                                                                                                        }
                                                                                                                                                        else
                                                                                                                                                        {
                                                                                                                                                            if((t38-5)==0)
                                                                                                                                                            {
                                                                                                                                                                h=38;
                                                                                                                                                                System.out.println("t38: "+t38);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public void Tablero1()
    {
        t1++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero2()
    {
        t2++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero3()
    {
        t3++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero4()
    {
        t4++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero5()
    {
        t5++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero6()
    {
        t6++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero7()
    {
        t7++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero8()
    {
        t8++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero9()
    {
        t9++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero10()
    {
        t10++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void Tablero11()
    {
        t11++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero12()
    {
        t12++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero13()
    {
        t13++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero14()
    {
        t14++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero15()
    {
        t15++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero16()
    {
        t16++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero17()
    {
        t17++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero18()
    {
        t18++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero19()
    {
        t19++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero20()
    {
        t20++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void Tablero21()
    {
        t21++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero22()
    {
        t22++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero23()
    {
        t23++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero24()
    {
        t24++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero25()
    {
        t25++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero26()
    {
        t26++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero27()
    {
        t27++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero28()
    {
        t28++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void Tablero29()
    {
        t29++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero30()
    {
        t30++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero31()
    {
        t31++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero32()
    {
        t32++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero33()
    {
        t33++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero34()
    {
        t34++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero35()
    {
        t35++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero36()
    {
        t36++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero37()
    {
        t37++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Tablero38()
    {
        t38++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI_Ruleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ImgTablero = new javax.swing.JLabel();
        ImgRuleta = new javax.swing.JLabel();
        ImgResultado = new javax.swing.JLabel();
        TitTitulo = new javax.swing.JLabel();
        BotApuesta1 = new javax.swing.JButton();
        BotApuesta2 = new javax.swing.JButton();
        BotApuesta3 = new javax.swing.JButton();
        BotApuesta4 = new javax.swing.JButton();
        BotDeshacer = new javax.swing.JButton();
        BotApuesta5 = new javax.swing.JButton();
        TitSaldo = new javax.swing.JLabel();
        TexSaldo = new javax.swing.JTextField();
        BotGirar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TexApuesta = new javax.swing.JTextField();

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Apuestas_0002.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Apuestas_0004.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 10, 23));

        jLabel1.setForeground(new java.awt.Color(255, 144, 19));
        jLabel1.setText("Ruleta medio fea :/");

        ImgTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Tablero1.png"))); // NOI18N
        ImgTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgTableroMouseClicked(evt);
            }
        });

        ImgRuleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Ruleta_1.png"))); // NOI18N

        ImgResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Resultado_1.png"))); // NOI18N

        TitTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Titulo.png"))); // NOI18N

        BotApuesta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Apuestas_0001.png"))); // NOI18N
        BotApuesta1.setBorder(null);
        BotApuesta1.setBorderPainted(false);
        BotApuesta1.setContentAreaFilled(false);
        BotApuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotApuesta1ActionPerformed(evt);
            }
        });

        BotApuesta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Apuestas_0002.png"))); // NOI18N
        BotApuesta2.setBorder(null);
        BotApuesta2.setBorderPainted(false);
        BotApuesta2.setContentAreaFilled(false);
        BotApuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotApuesta2ActionPerformed(evt);
            }
        });

        BotApuesta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Apuestas_0003.png"))); // NOI18N
        BotApuesta3.setBorder(null);
        BotApuesta3.setBorderPainted(false);
        BotApuesta3.setContentAreaFilled(false);
        BotApuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotApuesta3ActionPerformed(evt);
            }
        });

        BotApuesta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Apuestas_0004.png"))); // NOI18N
        BotApuesta4.setBorder(null);
        BotApuesta4.setBorderPainted(false);
        BotApuesta4.setContentAreaFilled(false);
        BotApuesta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotApuesta4ActionPerformed(evt);
            }
        });

        BotDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Deshacer.png"))); // NOI18N
        BotDeshacer.setBorder(null);
        BotDeshacer.setBorderPainted(false);
        BotDeshacer.setContentAreaFilled(false);
        BotDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotDeshacerActionPerformed(evt);
            }
        });

        BotApuesta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Apuestas_0005.png"))); // NOI18N
        BotApuesta5.setBorder(null);
        BotApuesta5.setBorderPainted(false);
        BotApuesta5.setContentAreaFilled(false);
        BotApuesta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotApuesta5ActionPerformed(evt);
            }
        });

        TitSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Saldo.png"))); // NOI18N

        TexSaldo.setBackground(new java.awt.Color(40, 10, 23));
        TexSaldo.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        TexSaldo.setForeground(new java.awt.Color(255, 235, 149));
        TexSaldo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TexSaldo.setBorder(null);

        BotGirar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Universidad\\2023 - 2 + Laboratorio de programacion 3 + Mec lab 3\\Trabajos\\Tercer corte\\2023 - 2 + Informe 06 + Hilos\\Girar.png")); // NOI18N
        BotGirar.setBorder(null);
        BotGirar.setBorderPainted(false);
        BotGirar.setContentAreaFilled(false);
        BotGirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotGirarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Apuestas.png"))); // NOI18N

        TexApuesta.setBackground(new java.awt.Color(40, 10, 23));
        TexApuesta.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TexApuesta.setForeground(new java.awt.Color(255, 235, 149));
        TexApuesta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TexApuesta.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ImgResultado)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TitTitulo)
                        .addGap(103, 103, 103))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImgTablero)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotApuesta1)
                                .addGap(10, 10, 10)
                                .addComponent(BotApuesta2)
                                .addGap(10, 10, 10)
                                .addComponent(BotApuesta3)
                                .addGap(10, 10, 10)
                                .addComponent(BotApuesta4)
                                .addGap(10, 10, 10)
                                .addComponent(BotApuesta5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TitSaldo)
                                .addGap(5, 5, 5)
                                .addComponent(TexSaldo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addComponent(TexApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BotDeshacer))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ImgRuleta)
                                .addGap(10, 10, 10)
                                .addComponent(BotGirar)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(TitTitulo)
                .addGap(10, 10, 10)
                .addComponent(ImgResultado)
                .addGap(10, 10, 10)
                .addComponent(ImgTablero)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotApuesta1)
                    .addComponent(BotApuesta2)
                    .addComponent(BotApuesta3)
                    .addComponent(BotApuesta4)
                    .addComponent(BotDeshacer)
                    .addComponent(BotApuesta5))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TexSaldo)
                            .addComponent(TitSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TexApuesta)))
                    .addComponent(BotGirar)
                    .addComponent(ImgRuleta))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImgTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgTableroMouseClicked
        int x=evt.getX();
        int y=evt.getY();
        System.out.println(x+" "+y);
        if(x>=0&&x<=52)
        {
            if(y>=0&&y<=69)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 38;
                   g = 1;
               }
            }
        }
        if(x>=0&&x<=52)
        {
            if(y>=74&&y<=140)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 38;
                   g = 2;
               }
            }
        }
        if(x>=56&&x<=100)
        {
            if(y>=0&&y<=44)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 3;
               }
            }
        }
        if(x>=56&&x<=100)
        {
            if(y>=50&&y<=94)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 4;
               }
            }
        }
        if(x>=56&&x<=100)
        {
            if(y>=98&&y<=141)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 5;
               }
            }
        }
        if(x>=104&&x<=148)
        {
            if(y>=2&&y<=46)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 6;
               }
            }
        }
        if(x>=104&&x<=148)
        {
            if(y>=50&&y<=94)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 7;
               }
            }
        }
        if(x>=104&&x<=148)
        {
            if(y>=98&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 8;
               }
            }
        }
        if(x>=152&&x<=196)
        {
            if(y>=2&&y<=45)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 9;
               }
            }
        }
        if(x>=152&&x<=196)
        {
            if(y>=50&&y<=93)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 10;
               }
            }
        }
        if(x>=152&&x<=196)
        {
            if(y>=98&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 11;
               }
            }
        }
        if(x>=199&&x<=244)
        {
            if(y>=0&&y<=46)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 12;
               }
            }
        }
        if(x>=199&&x<=244)
        {
            if(y>=50&&y<=93)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 13;
               }
            }
        }
        if(x>=199&&x<=244)
        {
            if(y>=98&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 14;
               }
            }
        }
        if(x>=250&&x<=292)
        {
            if(y>=0&&y<=46)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 15;
               }
            }
        }
        if(x>=250&&x<=292)
        {
            if(y>=50&&y<=94)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 16;
               }
            }
        }
        if(x>=250&&x<=292)
        {
            if(y>=98&&y<=141)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 17;
               }
            }
        }
        if(x>=296&&x<=340)
        {
            if(y>=0&&y<=44)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 18;
               }
            }
        }
        if(x>=296&&x<=340)
        {
            if(y>=50&&y<=94)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 19;
               }
            }
        }
        if(x>=296&&x<=340)
        {
            if(y>=98&&y<=141)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 20;
               }
            }
        }
        if(x>=344&&x<=388)
        {
            if(y>=0&&y<=46)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 21;
               }
            }
        }
        if(x>=344&&x<=388)
        {
            if(y>=50&&y<=94)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 22;
               }
            }
        }
        if(x>=344&&x<=388)
        {
            if(y>=97&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 23;
               }
            }
        }
        if(x>=392&&x<=436)
        {
            if(y>=0&&y<=46)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 24;
               }
            }
        }
        if(x>=392&&x<=436)
        {
            if(y>=50&y<=93)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 25;
               }
            }
        }
        if(x>=392&&x<=436)
        {
            if(y>=98&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 26;
               }
            }
        }
        if(x>=442&&x<=483)
        {
            if(y>=0&&y<=46)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 27;
               }
            }
        }
        if(x>=442&&x<=483)
        {
            if(y>=50&&y<=92)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 28;
               }
            }
        }
        if(x>=442&&x<=483)
        {
            if(y>=98&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 29;
               }
            }
        }
        if(x>=488&&x<=533)
        {
            if(y>=0&&y<=46)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 30;
               }
            }
        }
        if(x>=488&&x<=533)
        {
            if(y>=50&&y<=93)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 31;
               }
            }
        }
        if(x>=488&&x<=533)
        {
            if(y>=97&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 32;
               }
            }
        }
        if(x>=536&&x<=580)
        {
            if(y>=0&&y<=46)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 33;
               }
            }
        }
        if(x>=536&&x<=580)
        {
            if(y>=50&&y<=94)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 34;
               }
            }
        }
        if(x>=536&&x<=580)
        {
            if(y>=98&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 35;
               }
            }
        }
        if(x>=583&&x<=629)
        {
            if(y>=0&&y<=46)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 36;
               }
            }
        }
        if(x>=583&&x<=629)
        {
            if(y>=50&&y<=93)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 37;
               }
            }
        }
        if(x>=583&&x<=629)
        {
            if(y>=98&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 36;
                   g = 38;
               }
            }
        }
        if(x>=631&&x<=677)
        {
            if(y>=0&&y<=46)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 12;
                   
               }
            }
        }
        if(x>=631&&x<=677)
        {
            if(y>=49&&y<=94)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 12;
               }
            }
        }
        if(x>=631&&x<=677)
        {
            if(y>=97&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 12;
               }
            }
        }
        if(x>=56&&x<=245)
        {
            if(y>=146&&y<=190)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 3;
               }
            }
        }
        if(x>=251&&x<=436)
        {
            if(y>=146&&y<=190)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 3;
               }
            }
        }
        if(x>=443&&x<=627)
        {
            if(y>=146&&y<=190)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 3;
               }
            }
        }
        if(x>=631&&x<=677)
        {
            if(y>=97&&y<=142)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 2;
               }
            }
        }
        if(x>=56&&x<=149)
        {
            if(y>=194&&y<=238)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 2;
               }
            }
        }
        if(x>=152&&x<=245)
        {
            if(y>=194&&y<=238)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 2;
               }
            }
        }
        if(x>=251&&x<=340)
        {
            if(y>=194&&y<=238)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 2;
               }
            }
        }
        if(x>=345&&x<=436)
        {
            if(y>=194&&y<=238)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 2;
               }
            }
        }
        if(x>=443&&x<=532)
        {
            if(y>=194&&y<=238)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 2;
               }
            }
        }
        if(x>=536&&x<=629)
        {
            if(y>=194&&y<=238)
            {
               if(opc!=0)
               {
                   apuesta = apuesta * 2;
               }
            }
        }
    }//GEN-LAST:event_ImgTableroMouseClicked

    private void BotGirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotGirarActionPerformed
        i = 0;
        Ruleta.start();
        Resultado.start();
        Contador.start();
        h1 = new Thread((Runnable) this);
        h2 = new Thread((Runnable) this);
        h3 = new Thread((Runnable) this);
        h4 = new Thread((Runnable) this);
        h5 = new Thread((Runnable) this);
        h6 = new Thread((Runnable) this);
        h7 = new Thread((Runnable) this);
        h8 = new Thread((Runnable) this);
        h9 = new Thread((Runnable)this);
        h10 = new Thread((Runnable) this);
        h11 = new Thread((Runnable) this);
        h12 = new Thread((Runnable) this);
        h13 = new Thread((Runnable) this);
        h14 = new Thread((Runnable) this);
        h15 = new Thread((Runnable) this);
        h16 = new Thread((Runnable) this);
        h17 = new Thread((Runnable) this);
        h18 = new Thread((Runnable) this);
        h19 = new Thread((Runnable) this);
        h20 = new Thread((Runnable) this);
        h21 = new Thread((Runnable) this);
        h22 = new Thread((Runnable) this);
        h23 = new Thread((Runnable) this);
        h24 = new Thread((Runnable) this);
        h25 = new Thread((Runnable) this);
        h26 = new Thread((Runnable) this);
        h27 = new Thread((Runnable) this);
        h28 = new Thread((Runnable) this);
        h29 = new Thread((Runnable) this);
        h30 = new Thread((Runnable) this);
        h31 = new Thread((Runnable) this);
        h32 = new Thread((Runnable) this);
        h33 = new Thread((Runnable) this);
        h34 = new Thread((Runnable) this);
        h35 = new Thread((Runnable) this);
        h36 = new Thread((Runnable) this);
        h37 = new Thread((Runnable) this);
        h38 = new Thread((Runnable) this);
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();
        h7.start();
        h8.start();
        h9.start();
        h10.start();
        h11.start();
        h12.start();
        h13.start();
        h14.start();
        h15.start();
        h16.start();
        h17.start();
        h18.start();
        h19.start();
        h20.start();
        h21.start();
        h22.start();
        h23.start();
        h24.start();
        h25.start();
        h26.start();
        h27.start();
        h28.start();
        h29.start();
        h30.start();
        h31.start();
        h32.start();
        h33.start();
        h34.start();
        h35.start();
        h36.start();
        h37.start();
        h38.start();
    }//GEN-LAST:event_BotGirarActionPerformed

    private void BotApuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotApuesta1ActionPerformed
        apuesta = apuesta + 1;
        if((saldoInicial-apuesta)<0)
        {
            apuesta = apuesta-1;
        }
        else
        {
            saldoFinal = saldoInicial - apuesta;
            TexSaldo.setText(Integer.toString(saldoFinal));
            TexApuesta.setText(Integer.toString(apuesta));
        }
        opc=1;
    }//GEN-LAST:event_BotApuesta1ActionPerformed

    private void BotApuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotApuesta2ActionPerformed
        apuesta = apuesta + 10;
        if((saldoInicial-apuesta)<0)
        {
            apuesta = apuesta-10;
        }
        else
        {
            saldoFinal = saldoInicial - apuesta;
            TexSaldo.setText(Integer.toString(saldoFinal));
            TexApuesta.setText(Integer.toString(apuesta));
        }
        opc=2;
    }//GEN-LAST:event_BotApuesta2ActionPerformed

    private void BotApuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotApuesta3ActionPerformed
        apuesta = apuesta + 100;
        if((saldoInicial-apuesta)<0)
        {
            apuesta = apuesta-100;
        }
        else
        {
            saldoFinal = saldoInicial - apuesta;
            TexSaldo.setText(Integer.toString(saldoFinal));
            TexApuesta.setText(Integer.toString(apuesta));
        }
        opc=3;
    }//GEN-LAST:event_BotApuesta3ActionPerformed

    private void BotApuesta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotApuesta4ActionPerformed
        apuesta = apuesta + 1000;
        if((saldoInicial-apuesta)<0)
        {
            apuesta = apuesta-1000;
        }
        else
        {
            saldoFinal = saldoInicial - apuesta;
            TexSaldo.setText(Integer.toString(saldoFinal));
            TexApuesta.setText(Integer.toString(apuesta));
        }
        opc=4;
    }//GEN-LAST:event_BotApuesta4ActionPerformed

    private void BotApuesta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotApuesta5ActionPerformed
        apuesta = apuesta + 5000;
        System.out.println(saldoInicial-apuesta);
        if((saldoInicial-apuesta)<0)
        {
            apuesta = apuesta-5000;
        }
        else
        {
            saldoFinal = saldoInicial - apuesta;
            TexSaldo.setText(Integer.toString(saldoFinal));
            TexApuesta.setText(Integer.toString(apuesta));
        }
        opc=5;
    }//GEN-LAST:event_BotApuesta5ActionPerformed

    private void BotDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotDeshacerActionPerformed
        switch(opc)
        {
            case 1:
                if(apuesta>0)
                {
                    saldoFinal = saldoFinal + 1;
                    apuesta = apuesta-1;
                    TexApuesta.setText(Integer.toString(apuesta));
                    TexSaldo.setText(Integer.toString(saldoFinal));
                }
            break;
            case 2:
                if(apuesta>0)
                {
                    saldoFinal = saldoFinal + 10;
                    apuesta = apuesta-10;
                    TexApuesta.setText(Integer.toString(apuesta));
                    TexSaldo.setText(Integer.toString(saldoFinal));
                }
            break;
            case 3:
                if(apuesta>0)
                {
                    saldoFinal = saldoFinal + 100;
                    apuesta = apuesta-100;
                    TexApuesta.setText(Integer.toString(apuesta));
                    TexSaldo.setText(Integer.toString(saldoFinal));
                }
            break;
            case 4:
                if(apuesta>0)
                {
                    saldoFinal = saldoFinal + 1000;
                    apuesta = apuesta-1000;
                    TexApuesta.setText(Integer.toString(apuesta));
                    TexSaldo.setText(Integer.toString(saldoFinal));
                }
            break;
            case 5:
                if(apuesta>0)
                {
                    saldoFinal = saldoFinal + 5000;
                    apuesta = apuesta-5000;
                    TexApuesta.setText(Integer.toString(apuesta));
                    TexSaldo.setText(Integer.toString(saldoFinal));
                }
            break;
        }
    }//GEN-LAST:event_BotDeshacerActionPerformed
    Timer Contador = new Timer(1000, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(i<=5)
                {
                    i++;
                }
                else
                {
                    Ruleta.stop();
                    Resultado.stop();
                    ImgResultado.setIcon(resultados[0]);
                    Contador.stop();
                    opc=0;
                    h=3;
                    System.out.println(h);
                    if(h==g)
                    {
                        saldoInicial=saldoFinal+apuesta;
                        TexSaldo.setText(Integer.toString(saldoInicial));
                    }
                    else
                    {
                        saldoInicial = saldoFinal;
                    }
                    apuesta = 0; 
                    TexApuesta.setText(Integer.toString(apuesta));
                }
            }
        });
    Timer Ruleta = new Timer(80, new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
            if(j<8)
            {
                ruletas[j] = new ImageIcon("Ruleta_"+(j+1)+".png");
                ImgRuleta.setIcon(ruletas[j]);
                j++;
            }
            else
            {
                j = 0;
            }
        }
    });
    Timer Resultado = new Timer(80, new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
            if(k<39)
            {
                resultados[k] = new ImageIcon("Resultado_"+(k+1)+".png");
                ImgResultado.setIcon(resultados[k]);
                k++;
            }
            else
            {
                k = 0;
            }
        }
    });
    public static void main(String args[]) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new GUI_Ruleta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotApuesta1;
    private javax.swing.JButton BotApuesta2;
    private javax.swing.JButton BotApuesta3;
    private javax.swing.JButton BotApuesta4;
    private javax.swing.JButton BotApuesta5;
    private javax.swing.JButton BotDeshacer;
    private javax.swing.JButton BotGirar;
    private javax.swing.JLabel ImgResultado;
    private javax.swing.JLabel ImgRuleta;
    private javax.swing.JLabel ImgTablero;
    private javax.swing.JTextField TexApuesta;
    private javax.swing.JTextField TexSaldo;
    private javax.swing.JLabel TitSaldo;
    private javax.swing.JLabel TitTitulo;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
