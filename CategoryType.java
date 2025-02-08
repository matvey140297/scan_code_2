package grst.model.dic;

import grst.model.AdtAgentInternalType;
import grst.model.CategoryInternalType;
import lombok.Value;

import java.util.UUID;

@Value
public class CategoryType {

    public CategoryType(UUID id, String nameEn, String nameRu, String nameKz, String type, String typeRu) {
        this.id = id;
        this.nameEn = nameEn;
        this.nameRu = nameRu;
        this.nameKz = nameKz;
        this.type = type;
        this.typeRu = typeRu;
    }

    UUID id;
    String nameEn;
    String nameRu;
    String nameKz;
    String type;
    String typeRu;

}
