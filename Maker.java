import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;

public class Maker {

    int a = 0;
    int b = 0;
    public Maker() {}

    public String integerAndMake() {
        Random rand = new Random();
        int a,b;
        a = rand.nextInt(1000);
        b = rand.nextInt(1000);
        this.a = a;
        this.b = b;
        return a+"+"+b+"=";
    }

    public String integerAndAnswer() {
        int result = a+b;
        return a+"+"+b+"="+result;
    }

    public String integerMinusMake() {
        Random rand = new Random();
        int a,b;
        a = rand.nextInt(1000);
        b = rand.nextInt(1000);
        if(b>a) {
            this.a = b;
            this.b = a;
        }
        else {
            this.a = a;
            this.b = b;
        }
        return this.a+"-"+this.b+"=";
    }

    public String integerMinusAnswer() {
        //格式
        return this.a+"-"+this.b+"="+(this.a-this.b);
    }

    public String integerMultiplyMake() {
        Random rand = new Random();
        int a,b;
        a = rand.nextInt(100);
        b = rand.nextInt(100);
        this.a = a;
        this.b = b;
        return a+"*"+b+"=";
    }

    public String integerMultiplyAnswer() {
        //
        return this.a+"*"+this.b+"="+(this.a*this.b);
    }

    public String integerDivideMake() {
        Random rand = new Random();
        int a,b;
        a = rand.nextInt(100);
        b = rand.nextInt(100);
        if(b>a) {
            this.a = b;
            this.b = a;
        }
        else {
            this.a = a;
            this.b = b;
        }
        return this.a*this.b+"/"+this.b+"=";
    }

    public String integerDivideAnswer() {
        //
        return this.a*this.b+"/"+this.b+"="+(this.a*this.b);
    }

    public String decimalAndMake() {
        return "";
    }
}
