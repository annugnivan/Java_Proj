package java_project;
import java.util.*;


public class fvalue {
    
    //class to get the rates of foreign values
    
    private double GBPrate;
    private double USDrate;
    private double EURrate;
    
    public fvalue() {
        
    }
    
    public fvalue (double GBPrate, double USDrate, double EURrate) {
        
        this.GBPrate = GBPrate;
        this.USDrate = USDrate;
        this.EURrate = EURrate;
        
    }

    public double getEURrate() {
        return EURrate;
    }

    public void setEURrate(double EURrate) {
        this.EURrate = EURrate;
    }

    public double getGBPrate() {
        return GBPrate;
    }

    public void setGBPrate(double GBPrate) {
        this.GBPrate = GBPrate;
    }

    public double getUSDrate() {
        return USDrate;
    }

    public void setUSDrate(double USDrate) {
        this.USDrate = USDrate;
    }

    
    
}
