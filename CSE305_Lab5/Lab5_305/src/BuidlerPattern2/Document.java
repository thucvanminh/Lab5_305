package BuidlerPattern2;

public class Document {
    String Extension;
    String Encryption;

    
    public Document(String extension, String encryption) {
        Extension = extension;
        Encryption = encryption;
    }
    
    public String getExtension() {
        return Extension;
    }
    public void setExtension(String extension) {
        Extension = extension;
    }
    public String getEncryption() {
        return Encryption;
    }
    public void setEncryption(String encryption) {
        Encryption = encryption;
    }

    
}
