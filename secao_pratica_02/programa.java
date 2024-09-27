package secao_pratica_02;

import secao_pratica_02.entities.Collection;
import secao_pratica_02.entities.File;

public class programa {
    public static void main(String[] args) {
        
        Collection collection = new Collection(1, "Resumo do Curso", "24/09/27", "Loading", "Resumo", "Word");

        collection.addFile(new File(1, collection.getId(), "Word", "Loading", "Word"));
        collection.addFile(new File(2, collection.getId(), "PDF", "Error", "PDF"));
        collection.addFile(3, "TCC", "Error", "Python");

        collection.getCollectionAndFiles();
    }    
}
