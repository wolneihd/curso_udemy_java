package secao_pratica_02.entities;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    
    private int id;
    private String description;    
    private String lastUpdate;
    private String status;
    private String title;
    private String type;

    List<File> arquivos = new ArrayList<>();

    public Collection() {}

    public Collection(int id, String description, String lastUpdate, String status, String title, String type) {
        this.id = id;
        this.description = description;
        this.lastUpdate = lastUpdate;
        this.status = status;
        this.title = title;
        this.type = type;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<File> getArquivos() {
        return this.arquivos;
    }
    
    // métodos complementares
    public void addFile(File file) {
        this.arquivos.add(file);
    }

    public void addFile(int id, String fileName, String status, String type) {
        File file = new File(id, this.id, fileName, status, type);
        this.arquivos.add(file);
    }

    public void removeFileById(int id) {
        this.arquivos.removeIf(f -> f.getId() == id);
    }

    public void getCollectionAndFiles() {
        System.out.printf("\nCollection: id: %d | description: %s", this.getId(), this.getDescription());
        for (File f: arquivos) {
            System.out.printf("\n File: id %d | collectionID %d | fileName %s | status %s | type %s", f.getId(), f.getCollectionId(), f.getStatus(), f.getStatus(), f.getStatus());
        }
    }
}
