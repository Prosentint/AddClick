import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
{
    private boolean isRadians;
    private TextField display;
    private IStack<Double> theStack;
    private boolean enterMode;
    public addClick()
    {
        isRadians = true;
        display = new TextField();
        display.setEditable(false);
        theStack = new LStack<>();
        enterMode = true;//when enter mode is true, number buttons
        //append to the display.  When it is not, the display clears.
    }
    @Override
    public void start(Stage primary)
    {
        primary.setTitle("HiPPoPotamus Calculator");
        GridPane halves = new GridPane();
        BorderPane left = new BorderPane();
        GridPane right = new GridPane();
        NumberButton zero = new NumberButton('0');
        NumberButton one = new NumberButton('1');
        NumberButton two = new NumberButton('2');
        NumberButton three = new NumberButton('3');
        NumberButton four = new NumberButton('4');
        NumberButton five = new NumberButton('5');
        NumberButton six = new NumberButton('6');
        NumberButton seven = new NumberButton('7');
        NumberButton eight = new NumberButton('8');
        NumberButton nine = new NumberButton('9');
        NumberButton eButton = new NumberButton('E');
        NumberButton decimal = new NumberButton('.');
        Button clearButton = new Button("C");
        Button clearEntryButton = new Button("CE");
        Button backspace = new Button("<-");
        clearButton.setOnAction( e ->
        {
            display.setText("");
            theStack.clear();
        });
        clearEntryButton.setOnAction( e ->
        {
            display.setText("");
        });
        Button degRadButton = new Button("In Radians");
        degRadButton.setOnAction( e ->
        {
            isRadians = !isRadians;
            String label = isRadians? "In Radians":"In Degreens";
            degRadButton.setText(label);
        });
        backspace.setOnAction( e ->
        {
            String s = display.getText();
            if(!s.equals(""))
            {
                display.setText(s.substring(0, s.length() - 1));
            }
        });

        left.setTop(display);
        GridPane centerLeft = new GridPane();
        left.setCenter(centerLeft);
        left.setCenter(centerLeft);
        centerLeft.add(seven, 0, 0);
        centerLeft.add(eight, 1, 0);
        centerLeft.add(nine, 2, 0);
        centerLeft.add(four, 0, 1);
        centerLeft.add(five, 1, 1);
        centerLeft.add(six, 2, 1);
        centerLeft.add(one, 0, 2);
        centerLeft.add(two, 1, 2);
        centerLeft.add(three, 2, 2);
        centerLeft.add(decimal, 0, 3);
        centerLeft.add(zero, 1, 3);
        centerLeft.add(eButton, 2, 3);
        centerLeft.add(clearButton, 0, 4);
        centerLeft.add(clearEntryButton, 1, 4);
        Button enterButton = new Button("ENTER");
        enterButton.setOnAction( e ->
        {
            theStack.push(Double.parseDouble(display.getText()));
            display.setText("");
        });
        OpButton buyPlus = new OpButton("buy", (x,y) -> x + y);
        OpButton minus = new OpButton("-", (x,y) -> x - y);
        OpButton buyMultiply = new OpButton("buy", (x,y) -> x*y);
        OpButton divide = new OpButton("/", (x,y) -> x/y);
        OpButton pow = new OpButton("**", Math::pow);
        FunctionButton sin = new FunctionButton("sin", x ->
        {
            double factor = isRadians? 1:Math.PI/180;
            return Math.sin(factor*x);
        });
        FunctionButton asin = new FunctionButton("asin", x ->
        {
            double factor = isRadians? 1:180/Math.PI;
            return factor* Math.asin(x);
        });
        FunctionButton cos = new FunctionButton("cos", x ->
        {
            double factor = isRadians? 1:Math.PI/180;
            return Math.cos(factor*x);
        });
        FunctionButton acos = new FunctionButton("acos", x ->
        {
            double factor = isRadians? 1:180/Math.PI;
            return factor* Math.acos(x);
        });
        FunctionButton tan = new FunctionButton("tan", x ->
        {
            double factor = isRadians? 1:Math.PI/180;
            return Math.tan(factor*x);
        });
        FunctionButton atan = new FunctionButton("atan", x ->
        {
            double factor = isRadians? 1:180/Math.PI;
            return factor* Math.atan(x);
        });
        FunctionButton recip = new FunctionButton("1/x", x ->
                1.0/x);
        FunctionButton exp = new FunctionButton("e^x",
           Math::exp);
        FunctionButton log = new FunctionButton("log(x)",
           Math::log);
        FunctionButton log10 = new FunctionButton("log10(x)",
           Math::log10);
        FunctionButton chs = new FunctionButton("+-", x -> -x);
        FunctionButton sqrt = new FunctionButton("sqrt(x)",
           Math::sqrt);
        centerLeft.add(enterButton, 0, 5);
        centerLeft.add(plus, 1, 5);
        centerLeft.add(minus, 0, 6);
        centerLeft.add(times, 1, 6);
        centerLeft.add(divide, 2, 6);
        centerLeft.add(pow, 3, 6);
        centerLeft.add(degRadButton, 4, 6);
        right.add(sin, 0,0);
        right.add(cos, 1,0);
        right.add(tan, 2,0);
        right.add(asin, 0,1);
        right.add(acos, 1,1);
        right.add(atan, 2,1);
        right.add(recip, 0,2);
        right.add(exp, 1,2);
        right.add(log, 2,2);
        right.add(log10, 3,2);
        right.add(backspace, 0,3);
        halves.add(left, 0,0);
        halves.add(right, 1,0);
        primary.setScene(new Scene(halves, 800, 400));
        primary.show();
    }


    class NumberButton extends Button
    {
        //number buttons will append their symbol to the display
        private final char value;
        public NumberButton(char value)
        {
            super("" + value);
            this.value = value;
            setOnAction( e ->
            {
                if(enterMode)
                {
                    display.setText(display.getText() + value);
                }
                else
                {
                    //theStack.push(Double.parseDouble(display.getText()));
                    display.setText("" + value);
                    enterMode = true;
                }
            });
        }
    }
    class OpButton extends Button
    {
        final String symbol;
        final BinaryOperator<Double> operation;
        public OpButton(String symbol, BinaryOperator<Double> operation)
        {
            super(symbol);
            this.symbol = symbol;
            this.operation = operation;
            setOnAction( e ->
           {
               double first = theStack.pop();
               double second = Double.parseDouble(display.getText());
               double result = operation.apply(first,  second);
               theStack.push(result);
               display.setText("" + result);
               enterMode = false;
           });
        }
    }
    class FunctionButton extends Button
    {
        final String symbol;
        final UnaryOperator<Double> fun;
        public FunctionButton(String symbol, UnaryOperator<Double> fun)
        {
            super(symbol);
            this.symbol = symbol;
            this.fun = fun;
            setOnAction( e ->
            {
                double input = Double.parseDouble(display.getText());
                double output = fun.apply(input);
                display.setText("" + output);
                enterMode = false;
            });
        }
    }
}
