package Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class Buttons {
    private double operand1 = 0, operand2 = 0, result = 0;
char op;
    @FXML private TextField Ecran_Input;
    @FXML private TextField backup;

    @FXML
    void Input_Button(ActionEvent event) {
        Ecran_Input.setAlignment(Pos.TOP_RIGHT);
        JFXButton Button = (JFXButton) event.getSource();
        Ecran_Input.setText(Ecran_Input.getText() + Button.getText());
    }
   double result(double a, double b,char op)
   {
       switch (op)
       {
           case '+': return a + b;
           case '-': return a - b;
           case '/': return a / b;
           case '*': return a * b;
           default: break;
       }
       return 0;
   }
    public void Result(ActionEvent actionEvent) {
        JFXButton button =(JFXButton)(actionEvent.getSource());
 char ops = button.getText().charAt(0);
        if(ops!='='&&ops!='C')
        {
             op = ops;
            operand1 = Double.parseDouble(Ecran_Input.getText());
            backup.setText(backup.getText()+Ecran_Input.getText()+ops);
            Ecran_Input.setText("");
        } else if(ops=='=')
        {
            backup.setText(backup.getText()+Ecran_Input.getText()+ops);
            operand2 = Double.parseDouble(Ecran_Input.getText());
            Ecran_Input.setText(String.valueOf(result(operand1,operand2,op)));
        }else if(ops=='C')
        {
            backup.setText("");
            Ecran_Input.setText("");
        }
    }
}
