package secao_pratica_02.entities;

public class File {
    
    private int id;
    private int collectionId;
    private String fileName;
    private String status;
    private String type;
    
    public File() {}

    public File(int id, int collectionId, String fileName, String status, String type) {
        this.id = id;
        this.collectionId = collectionId;
        this.fileName = fileName;
        this.status = status;
        this.type = type;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCollectionId() {
        return this.collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // método implementado na UML

    public void getFileInformations() {
        System.out.printf("id %d | collectionID %d | fileName %s | status %s | type %s", this.getId(), this.getCollectionId(), this.getFileName(), this.getStatus(), this.getType());
    }
}
