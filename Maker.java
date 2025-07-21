import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;

public class Maker {
    int a = 0;
    int b = 0;
    public Maker() {}
    public String andMake() {
        Random rand = new Random();
        int a,b;
        a = rand.nextInt(1000);
        b = rand.nextInt(1000);
        this.a = a;
        this.b = b;
        String result = a+"+"+b+"=";
        return result;
    }

    public String andAnswer() {
        int result = a+b;
        return a+"+"+b+"="+result;
    }

    public String minusMake() {
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

    public String minusAnswer() {
        //格式
        return this.a+"-"+this.b+"="+(this.a-this.b);
    }
}
