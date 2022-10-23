import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CalculatorApplication extends JFrame implements ActionListener{
    double num1=0,num2=0,result=0;
    String operation,ans;
    int calculation;
    JFrame frame=new JFrame("Scientific Calculator");
    JLabel label=new JLabel();
    JTextField TextField=new JTextField();
    JRadioButton onRadioButton=new JRadioButton("on");
    JRadioButton offRadioButton=new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonsin = new JButton("sin");
    JButton buttonsinh =new JButton("sinh");
    JButton buttoncos =new JButton("cos");
    JButton buttoncosh =new JButton("cosh");
    JButton buttontan = new JButton("tan");
    JButton buttontanh =new JButton("tanh");
    JButton buttonN = new JButton("n!");
    JButton buttonCube = new JButton("x\u00B3");
    JButton buttonPow = new JButton("X^Y");
    JButton btnEx = new JButton("e^x");
    JButton btnLog = new JButton("log");
    JButton btnTen = new JButton("X10");
    JButton btnPM = new JButton("+/-");

    CalculatorApplication(){
        prepareGui();
        addComponents();
        addActionEvent();
    }
    public void prepareGui(){
        frame.setBounds(100,100,357,539);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addComponents(){
        label.setBounds(10,11,320,27);
        label.setForeground(Color.black);
        label.setBackground(Color.red);
        frame.add(label);

        TextField.setBounds(10,39,320,63);
        TextField.setFont(new Font("Arial",Font.BOLD,20));
        TextField.setEditable(false);
        TextField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(TextField);

        onRadioButton.setBounds(10,109,63,23);
        onRadioButton.setSelected(false);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        frame.add(onRadioButton);

        offRadioButton.setBounds(74,109,64,23);
        offRadioButton.setSelected(true);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup=new  ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(74,295,64,50);
        buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonSeven);

        buttonEight.setBounds(139,295,64,50);
        buttonEight.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonEight);

        buttonNine.setBounds(202,295,64,50);
        buttonNine.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonNine);

        buttonFour.setBounds(74,347,64,50);
        buttonFour.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonFour);

        buttonFive.setBounds(139,347,64,50);
        buttonFive.setFont(new Font("Arial",Font.BOLD,23));
        frame.add(buttonFive);

        buttonSix.setBounds(202,347,64,50);
        buttonSix.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonSix);

        buttonOne.setBounds(74,398,64,50);
        buttonOne.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonOne);

        buttonTwo.setBounds(139,398,64,50);
        buttonTwo.setFont(new Font("Arial",Font.BOLD,23));
        frame.add(buttonTwo);

        buttonThree.setBounds(202,398,64,50);
        buttonThree.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonThree);

        buttonDot.setBounds(202,449,64,50);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonDot);

        buttonZero.setBounds(74,449,129,50);
        buttonZero.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonZero);

        buttonEqual.setBounds(266,449,64,50);
        buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
        buttonEqual.setBackground(new Color(239,188,2));
        frame.add(buttonEqual);

        buttonDiv.setBounds(266,398,64,50);
        buttonDiv.setFont(new Font("Arial",Font.BOLD,20));
        buttonDiv.setBackground(new Color(239,188,2));
        frame.add(buttonDiv);
        
        buttonSqrt.setBounds(10,139,64,50);
        buttonSqrt.setFont(new Font("Arial",Font.BOLD,18));
        frame.add(buttonSqrt);

        buttonMul.setBounds(266,347,64,50);
        buttonMul.setFont(new Font("Arial",Font.BOLD,20));
        buttonMul.setBackground(new Color(239,188,2));
        frame.add(buttonMul);

        buttonMinus.setBounds(266,295,64,50);
        buttonMinus.setFont(new Font("Arial",Font.BOLD,20));
        buttonMinus.setBackground(new Color(239,188,2));
        frame.add(buttonMinus);

        buttonPlus.setBounds(266,243,64,50);
        buttonPlus.setFont(new Font("Arial",Font.BOLD,20));
        buttonPlus.setBackground(new Color(239,188,2));
        frame.add(buttonPlus);

        buttonSquare.setBounds(10,347,64,50);
        buttonSquare.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(9,191,64,50);
        buttonReciprocal.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(74,243,64,50);
        buttonDelete.setFont(new Font("Arial",Font.BOLD,12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);

        buttonClear.setBounds(139,243,64,50);
        buttonClear.setFont(new Font("Arial",Font.BOLD,12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);

        buttonsin.setBounds(139,139,64,50);
        buttonsin.setFont(new Font("Tahoma",Font.PLAIN,13));
        frame.add(buttonsin);

        buttonsinh.setBounds(139,191,64,50);
        buttonsinh.setFont(new Font("Tahoma",Font.PLAIN,13));
        frame.add(buttonsinh);

        buttoncos.setBounds(202,139,64,50);
        buttoncos.setFont(new Font("Tahoma",Font.PLAIN,13));
        frame.add(buttoncos);

        buttoncosh.setBounds(202,191,64,50);
        buttoncosh.setFont(new Font("Tahoma",Font.PLAIN,13));
        frame.add(buttoncosh);

        buttontan.setBounds(266,139,64,50);
        buttontan.setFont(new Font("Tahoma",Font.PLAIN,13));
        frame.add(buttontan);

        buttontanh.setBounds(266,191,64,50);
        buttontanh.setFont(new Font("Tahoma",Font.PLAIN,13));
        frame.add(buttontanh);

        buttonN.setBounds(10,398,64,50);
        buttonN.setFont(new Font("Tahoma",Font.PLAIN,18));
        frame.add(buttonN);

        buttonPow.setBounds(10,243,64,50);
        buttonPow.setFont(new Font("Tahoma",Font.PLAIN,12));
        frame.add(buttonPow);

        buttonCube.setBounds(10,295,64,50);
        buttonCube.setFont(new Font("Tahoma",Font.PLAIN,18));
        frame.add(buttonCube);

        btnEx.setBounds(74,139,64,50);
        btnEx.setFont(new Font("Tahoma",Font.PLAIN,13));
        frame.add(btnEx);

        btnLog.setBounds(74,192,64,50);
        btnLog.setFont(new Font("Tahoma",Font.PLAIN,18));
        frame.add(btnLog);

        btnTen.setBounds(202,243,64,50);
        btnTen.setFont(new Font("Tahoma",Font.PLAIN,12));
        frame.add(btnTen);

        btnPM.setBounds(10,449,64,50);
        btnPM.setFont(new Font("Tahoma",Font.PLAIN,18));
        frame.add(btnPM);
    }
    public void addActionEvent(){
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonsin.addActionListener(this);
        buttonsinh.addActionListener(this);
        buttoncos.addActionListener(this);
        buttoncosh.addActionListener(this);
        buttontan.addActionListener(this);
        buttontanh.addActionListener(this);
        buttonN.addActionListener(this);
        buttonCube.addActionListener(this);
        buttonPow.addActionListener(this);
        btnEx.addActionListener(this);
        btnLog.addActionListener(this);
        btnTen.addActionListener(this);
        btnPM.addActionListener(this);        
    }
    public void actionPerformed(ActionEvent e){
        Object source =e.getSource();
        if(source==onRadioButton){
            enable();
        }else if(source==offRadioButton){
            disable();
        }else if(source==buttonClear){
            label.setText("");
            TextField.setText("");
        }else if(source==buttonDelete){
            int length=TextField.getText().length();
            int number=length-1;
            if(length>0){
                StringBuilder back=new StringBuilder(TextField.getText());
                back.deleteCharAt(number);
                TextField.setText(back.toString());
            }if(TextField.getText().endsWith(null));
            label.setText(null);
        }else if(source==buttonZero){
            if(TextField.getText().equals("0")){
                return;
            }else{
                TextField.setText(TextField.getText()+"0");
            }
        }else if(source==buttonOne){
            TextField.setText(TextField.getText()+"1");
        }else if(source==buttonTwo){
            TextField.setText(TextField.getText()+"2");
        }else if(source==buttonThree){
            TextField.setText(TextField.getText()+"3");
        }else if(source==buttonFour){
            TextField.setText(TextField.getText()+"4");
        }else if(source==buttonFive){
            TextField.setText(TextField.getText()+"5");
        }else if(source==buttonSix){
            TextField.setText(TextField.getText()+"6");
        }else if(source==buttonSeven){
            TextField.setText(TextField.getText()+"7");
        }else if(source==buttonEight){
            TextField.setText(TextField.getText()+"8");
        }else if(source==buttonNine){
            TextField.setText(TextField.getText()+"9");
        }else if(source==buttonDot){
            if(TextField.getText().contains(".")){
                return;
            }else{
                TextField.setText(TextField.getText()+".");
            }
        }else if(source==buttonPlus){
            String str=TextField.getText();
            num1 =Double.parseDouble(TextField.getText());
            calculation=1;
            TextField.setText("");
            label.setText(str +"+");    
        }else if(source==buttonMinus){
            String str=TextField.getText();
            num1 =Double.parseDouble(TextField.getText());
            calculation=2;
            label.setText(str +"-"); 
            TextField.setText("");                       
        }else if(source==buttonMul){
            String str=TextField.getText();
            num1 =Double.parseDouble(TextField.getText());
            calculation=3;
            TextField.setText("");
            label.setText(str +"X");            
        }else if(source==buttonDiv){
            String str=TextField.getText();
            num1 =Double.parseDouble(TextField.getText());
            calculation=4;
            TextField.setText("");
            label.setText(str +"/");            
        }else if(source==buttonSquare){
            num1=Double.parseDouble(TextField.getText());
            double square=Math.pow(num1,2);
            String string=Double.toString(square);
            if(string.endsWith(".0")){
                TextField.setText(string.replace(".0",""));
            }else{
                TextField.setText(string);
            }
        }else if(source==buttonCube){
            num1=Double.parseDouble(TextField.getText());
            double cube= Math.pow(num1,3);
            String str=Double.toString(cube);
            if(str.endsWith(".0")){
                TextField.setText(str.replace(".0",""));
            }else{
                TextField.setText(str);
            }
        }else if(source==buttonSqrt){
            num1=Double.parseDouble(TextField.getText());
            double sqrt=Math.sqrt(num1);
            TextField.setText(Double.toString(sqrt));
        }else if(source==buttonReciprocal){
            num1=Double.parseDouble(TextField.getText());
            double recoprocal=1/num1;
            String string=Double.toString(recoprocal);
            if(string.endsWith(".0")){
                TextField.setText(string.replace(".0",""));
            }else{
                TextField.setText(string);
            }
        }else if(source==buttonEqual){
            num2=Double.parseDouble(TextField.getText());
            switch(calculation){
                case 1:
                    result=num1+num2;
                    break;
                case 2:
                    result=num1-num2;
                    break;
                case 3:
                    result=num1*num2;
                    break;
                case 4:
                    result=num1/num2;
                    break;
                case 5:
                    double res=1;
                    for(int i=0;i<num2;i++){
                        res=num1*res;
                    }
                    result=res;
                    break;
            }if(Double.toString(result).endsWith(".0")){
                TextField.setText(Double.toString(result).replace(".0",""));
            }else{
                TextField.setText(Double.toString(result));
            }
            label.setText("");
            num1=result;
        }else if(source==buttonPow){
            String str=TextField.getText();
            num1=Double.parseDouble(TextField.getText());
            TextField.setText("");
            label.setText(str + "^");
            calculation=5;
        }else if(source==buttonsin){
            double a= Math.sin(Double.parseDouble(TextField.getText()));
            TextField.setText("");
            TextField.setText(TextField.getText()+a);
        }else if(source==buttonsinh){
            double a=Math.sinh(Double.parseDouble(TextField.getText()));
            TextField.setText("");
            TextField.setText(TextField.getText()+a);
        }else if(source==buttoncos){
            double a= Math.cos(Double.parseDouble(TextField.getText()));
            TextField.setText("");
            TextField.setText(TextField.getText()+a);
        }else if(source==buttoncosh){
            double a= Math.cosh(Double.parseDouble(TextField.getText()));
            TextField.setText("");
            TextField.setText(TextField.getText()+a);
        }else if(source==buttontan){
            double a= Math.tan(Double.parseDouble(TextField.getText()));
            TextField.setText("");
            TextField.setText(TextField.getText()+a);
        }else if(source==buttontanh){
            double a= Math.tanh(Double.parseDouble(TextField.getText()));
            TextField.setText("");
            TextField.setText(TextField.getText()+a);
        }else if(source==btnLog){
            double a = Math.log(Double.parseDouble(TextField.getText()));
            TextField.setText("");
            TextField.setText(TextField.getText()+a);
        }else if(source==btnEx){
            double a= Math.exp(Double.parseDouble(TextField.getText()));
            TextField.setText("");
            TextField.setText(TextField.getText()+a);
        }else if(source==btnTen){
            double a = Double.parseDouble(TextField.getText());
            a=a*10;
            TextField.setText("");
            TextField.setText(TextField.getText()+a);
        }else if(source==buttonN){
            double a=Double.parseDouble(TextField.getText());
            double f=1;
            while(a!=0){
                f=f*a;
                a--;
            }
            TextField.setText("");
            TextField.setText(TextField.getText()+f);
        }else if(source==btnTen){
            double a=Double.parseDouble((String.valueOf(TextField.getText())));
            a=a*a-1;
            TextField.setText(String.valueOf(a));
        }else if(source==btnPM){
            double a=Double.parseDouble(String.valueOf(TextField.getText()));
			a=a*(-1);
			TextField.setText(String.valueOf(a));
        }
    }
    public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        TextField.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        btnLog.setEnabled(true);
        btnEx.setEnabled(true);
        buttonPow.setEnabled(true);
        btnPM.setEnabled(true);
        btnTen.setEnabled(true);
        buttonsin.setEnabled(true);
        buttonsinh.setEnabled(true);
        buttoncos.setEnabled(true);
        buttoncosh.setEnabled(true);
        buttontan.setEnabled(true);
        buttontanh.setEnabled(true);
        buttonN.setEnabled(true);
        buttonCube.setEnabled(true);
        buttonDot.setEnabled(true);
    }
    public void disable(){
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        TextField.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        btnLog.setEnabled(false);
        btnEx.setEnabled(false);
        buttonPow.setEnabled(false);
        btnPM.setEnabled(false);
        btnTen.setEnabled(false);
        buttonsin.setEnabled(false);
        buttonsinh.setEnabled(false);
        buttoncos.setEnabled(false);
        buttoncosh.setEnabled(false);
        buttontan.setEnabled(false);
        buttontanh.setEnabled(false);
        buttonN.setEnabled(false);
        buttonCube.setEnabled(false);
        buttonDot.setEnabled(false);
    }
    public static void main(String args[]){
        new CalculatorApplication();
    }
}