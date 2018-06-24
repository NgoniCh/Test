import java.util.Locale;
import java.util.ResourceBundle;


public class PropertyFileAttributes {
    
    private int numberOfKeys;
    private String propertiesFileName;
    private Locale propertiesFileLocale;
    private ResourceBundle resourceBundle = ResourceBundle.getBundle(propertiesFileName, propertiesFileLocale);
    
    public Locale getPropertiesFileLocale() {
        return propertiesFileLocale;
    }
    
    public void setPropertiesFileLocale(Locale propertiesFileLocale) {
        this.propertiesFileLocale = propertiesFileLocale;
    }
    
    public String getPropertiesFileName() {
        return propertiesFileName;
    }
    
    public void setPropertiesFileName(String propertiesFileName) {
        this.propertiesFileName = propertiesFileName;
    }
    
    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
    
    public int getNumberOfKeys() {
        return resourceBundle.keySet().size();
    }
    
    public boolean containsKey(String key) {
        return resourceBundle.containsKey(key);
    }
    
    
    
}
