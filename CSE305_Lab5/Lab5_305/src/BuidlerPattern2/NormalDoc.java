package BuidlerPattern2;

public class NormalDoc implements IDocument {
    String Extension;
    String Encryption;

    public NormalDoc(String extension, String encryption) {
        Extension = extension;
        Encryption = encryption;
    }

    @Override
    public void setExtension(String extension) {
        this.Extension = extension;
    }

    @Override
    public void setEncryption(String encryption) {
        this.Encryption = encryption;
    }

    @Override
    public Document buildDoc() {
        return new Document(Extension, Encryption);
    }

}