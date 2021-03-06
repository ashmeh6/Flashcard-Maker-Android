package com.piapps.flashcardpro.model

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.annotation.Transient

/**
 * Created by abduaziz on 4/19/18.
 */

@Entity
class Label(@Id(assignable = true)
            var id: Long,
            var title: String,
            @Transient
            var isSelected: Boolean = false) {
    constructor() : this(0, "")
}