package BuidlerPattern2;


public interface IDocument {
    public void setExtension(String extension);
    public void setEncryption(String encryption);
    public Document buildDoc();
}
