

package com.codemelinux.HUSAP.model;


import com.codemelinux.HUSAP.enums.ItemType;

public interface LazyLoading {
    ItemType getItemType();
    void setItemType(ItemType itemType);
}
