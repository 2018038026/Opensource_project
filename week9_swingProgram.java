import javax.swing.*;
import java.awt.*;
 
public class week9_swingProgram extends JFrame{
	week9_swingProgram(){
        setTitle("Open Challenge 9");//�������� Ÿ��Ʋ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ �����츦 ������ ���α׷� ����
        
        Container c = getContentPane();
        
        c.setLayout(new BorderLayout());//����Ʈ ������  �� ��ġ�����ڸ� ������ �ֱ� ������ ���� ��ġ������ �������ص� ��
        c.add(new NorthPanel(), BorderLayout.NORTH);//North �г� �߰�
        c.add(new CenterPanel(), BorderLayout.CENTER);//Center �г� �߰�
       
        setSize(300,300);//������ ũ�� 300x200 ����
        setVisible(true);//�������� ȭ�鿡 ���
         
    }
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new week9_swingProgram();
    }
     
}

class NorthPanel extends JPanel{//NORTH�� ���� �г�
    NorthPanel(){
        setBackground(Color.LIGHT_GRAY);
        
        this.add(new JButton("Open"));
        this.add(new JButton("Read"));
        this.add(new JButton("Close"));
    }
}

class CenterPanel extends JPanel{//CENTER�� ���� �г�
    CenterPanel(){
        this.setLayout(null);//�����̳� ��ġ������ ����
        String text[] = {"Hello", "Java", "Love"};
        
        int x;
        int y;
        JLabel label;
        
        for(int i = 0; i < 3; i++) {
            x = (int)(Math.random()*250);
            y = (int)(Math.random()*250);
            
            label = new JLabel(text[i]);
            label.setLocation(x, y);//������ġ�� label ���̱�
            label.setSize(50,10);//label ũ�� ����
            this.add(label);
        }
    }
}

