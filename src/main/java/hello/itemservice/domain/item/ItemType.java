package hello.itemservice.domain.item;

import lombok.Getter;

@Getter
public enum ItemType {
    BOOK("도서"), FOOD("음석"), ETC("기타");

    ItemType(String description) {
        this.description = description;
    }

    private final String description;

}
