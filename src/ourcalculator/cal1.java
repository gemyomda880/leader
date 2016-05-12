package ourcalculator;
 import java.util.Stack;

import com.sun.javafx.cursor.CursorFrame;
import com.sun.javafx.cursor.CursorType;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
 import javafx.scene.control.TextArea;
 import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
 import javafx.stage.Stage;
 import javafx.scene.control.Button;
 import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;
import javafx.scene.layout.GridPane;
 import javafx.geometry.Pos;
 import javafx.scene.layout.HBox;
 import javafx.scene.layout.HBox;
 
 public class cal1 extends Application {
	 double d;
	 DoubleProperty d1;
	 Stack<String>ss=new Stack<>();
	 String all="";
	 StringBuffer buffer=new StringBuffer("");
	 String s="";
	 public void start(Stage primaryStage) {
		
        BorderPane pp=new BorderPane();
      

		 GridPane pane = new GridPane();
		 pane.setPadding(new Insets(11.5, 12.5, 13.5, 16.5));
		  pane.setHgap(5.5);
		  pane.setVgap(5.5);
		
		  
		 
	     Button bt0 = new Button("0");
	     Button bt1 = new Button("1");
	     Button bt2 = new Button("2");
	     Button bt3 = new Button("3");
	     Button bt6 = new Button("6");
	     Button bt5 = new Button("5");
	     Button bt4 = new Button("6");
	     Button bt7 = new Button("7");
	     Button bt8 = new Button("8");
	     Button bt9 = new Button("9");
	    
	     
	     Button btmul = new Button  ("*");
	     Button btdiv = new Button  ("/");
	     Button btmod = new Button  ("%");
	     Button btadd = new Button  ("+");
	     Button btsub = new Button  ("-");
	     Button btcoma = new Button (".");
	     Button btequal = new Button("=");
	     Button btb1 = new Button   ("(");
	     Button btb2 = new Button   (")");
	     Button btsquar = new Button("x^2");
	     Button btentr = new Button ("←");
	     Button btsqrt = new Button ("√");
	     Button btdel = new Button  ("∆");
	     Button btprecent = new Button  ("n%");
	     
	     
	     Button btsin=new Button  ("sin");
	     Button btcos=new Button  ("cos");
	     Button bttan=new Button  ("tan");
	     Button btc=new Button  ("c");
	     Button btrigth=new Button  ("R");
	     Button btleft=new Button  ("L");
	     
	     

		 TextArea taNote = new TextArea();
		 taNote.setPrefColumnCount(20);
		 taNote.setPrefRowCount(3);
		 taNote.setWrapText(true);
		 taNote.setFont(Font.font(15));
		 taNote.setEditable(false);
		 
		 
		 HBox h1=new HBox(5);
		 h1.getChildren().addAll(bt7,bt8,bt9,btdiv,btentr,btdel);
		 
		 HBox h2=new HBox(5);
		 h2.getChildren().addAll(bt4,bt5,bt6,btmul,btb1,btb2);
		 
		 HBox h3=new HBox(5);
		 h3.getChildren().addAll(bt1,bt2,bt3,btsub,btsquar,btsqrt);
		 
		 HBox h4=new HBox(5);
		 h4.getChildren().addAll(bt0,btcoma,btmod,btadd,btequal);
		 
		 HBox h5=new HBox(5);
		 h5.getChildren().addAll(btsin,btcos,bttan,btc,btrigth,btleft); 
		 
		 pane.add(taNote, 0, 0);
		 pane.add(h5, 0, 1);
		 pane.add(h1, 0, 2);
		 pane.add(h2, 0, 3);
		 pane.add(h3, 0, 4);
		 pane.add(h4, 0, 5);
	 /*d1=new SimpleDoubleProperty(bt1.maxHeightProperty().getValue());
	 d=bt1.maxHeightProperty().getValue();
	bt1.maxHeightProperty().addListener(new InvalidationListener() {
		 public void invalidated(Observable ov) {
			 d=bt1.maxHeightProperty().getValue();
			 d1.setValue((pane.maxHeightProperty().getValue()-d)*(d/bt1.maxHeightProperty().getValue()));
		 }
			});
	
		 bt1.prefHeightProperty().bind(d1);*/
		 ///////////////////////////////
		
		 btsin.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btsin.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btcos.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btcos.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 bttan.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bttan.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btc.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btc.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btrigth.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btrigth.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btleft.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btleft.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 bt1.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt1.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 ////////////////////////taNote/////////////////////////////
		 
		 taNote.prefWidthProperty().bind(primaryStage.widthProperty().subtract(50));
		  taNote.prefHeightProperty().bind(primaryStage.heightProperty().multiply(1.0/3.0));
		 
		// taNote.maxWidthProperty().bind(primaryStage.widthProperty().subtract(50));
		//taNote.maxHeightProperty().bind(primaryStage.heightProperty().multiply(1.0/4.0));
        
		 /////////////////////////////////////////////////////
		 bt0.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt0.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 bt2.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt2.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
	     
		 bt3.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt3.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 bt4.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt4.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 bt5.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt5.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 bt6.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt6.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 bt7.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt7.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 bt8.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt8.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 bt9.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 bt9.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btb1.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btb1.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btb2.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btb2.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btmul.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btmul.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btdiv.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btdiv.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btsub.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btsub.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btadd.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btadd.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btmod.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btmod.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btprecent.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btprecent.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btcoma.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btcoma.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btentr.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btentr.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btdel.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btdel.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btsquar.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btsquar.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btsqrt.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		 btsqrt.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 btequal.prefWidthProperty().bind(btsqrt.prefWidthProperty().multiply(2));
		 btequal.prefHeightProperty().bind(btsqrt.prefHeightProperty());
		 ////////////////////////////////////////////////////////
		 
      	 
	
	     bt0.setOnAction(e->{
	    	  s="0";
	    	  ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt1.setOnAction(e->{
	    	  s="1";
	    	  ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt2.setOnAction(e->{
	    	  s="2"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });

	     bt3.setOnAction(e->{
	    	  s="3"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt4.setOnAction(e->{
	    	  s="4"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt5.setOnAction(e->{
	    	  s="5"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     bt6.setOnAction(e->{
	    	  s="6"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt7.setOnAction(e->{
	    	  s="7"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt8.setOnAction(e->{
	    	  s="8"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     bt9.setOnAction(e->{
	    	  s="9"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btmul.setOnAction(e->{
	    	  s="*"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btdiv.setOnAction(e->{
	    	  s="/"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btmod.setOnAction(e->{
	    	  s="%"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btadd.setOnAction(e->{
	    	  s="+"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btsub.setOnAction(e->{
	    	  s="-"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     btcoma.setOnAction(e->{
	    	  s="."; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     btequal.setOnAction(e->{
	    	  s="="; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     btb1.setOnAction(e->{
	    	  s="("; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btb2.setOnAction(e->{
	    	  s=")"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btsquar.setOnAction(e->{
	    	 s="^2"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btentr.setOnAction(e->{
	    	  s="\r\n"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btsqrt.setOnAction(e->{
	    	  s="√"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     
	     btdel.setOnAction(e->{
	    	 if(all.length()>0)
	    	 {
      	    	 all=all.substring(0, all.length()-ss.pop().length());
	         	 taNote.setText(all);
	    	 }
	    	 else 
	    		  taNote.setText("");
	     });
	     
	     
	     btsin.setOnAction(e->{
	    	  s="(sin"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     btcos.setOnAction(e->{
	    	  s="(cos"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	      
	     
	     bttan.setOnAction(e->{
	    	  s="(tan"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	   
	     btc.setOnAction(e->{
	    	 all="";
	    	 taNote.setText(all);
	     });
	     
	     btrigth.setOnAction(e->{
	    	 
	     });
	     
	     
	     btleft.setOnAction(e->{
	    	 
	    	 
	     });
	     
	     // pane.setStyle("-fx-border-width:7px;-fx-border-color:red");
		  Scene scene = new Scene( pane ,300, 300);
		  // pane.prefHeightProperty().bind(scene.xProperty());
		   //pane.prefWidthProperty().bind(scene.yProperty());
		  primaryStage.setTitle("Taschenrechener"); 
		  primaryStage.setScene(scene); 
		  primaryStage.show(); 
		 
	 }
	 public static boolean is_symbol(char c)
	 {
		 switch (c) {
		case '+':
			return true;
		case '-':
			return true;

        case '*':
        	return true;
        case '/':
        	return true;
        case '%':
        	return true;
       case '√':
    	   return true;
    	   
      /* case 's':
    	   return true;
    	   
       case 't':
    	   return true;
    	   
       case 'c':
    	   return true;*/
    	   
       case '^':
    	   return true;
        default:
        	return false;
		}
	 }
	 
	 public static void main(String[] args){
		  Application.launch(args);
		  
	 }
}

