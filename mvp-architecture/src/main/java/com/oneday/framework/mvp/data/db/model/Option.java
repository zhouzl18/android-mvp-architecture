package com.oneday.framework.mvp.data.db.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by OneDay on 2017/12/19.
 */

@Entity(nameInDb = "options")
public class Option {

    @Expose
    @SerializedName("id")
    @Id(autoincrement = true)
    private Long id;

    @Expose
    @SerializedName("option_text")
    @Property(nameInDb = "option_text")
    private String optionText;

    @Expose
    @SerializedName("question_id")
    @Property(nameInDb = "question_id")
    private Long questionId;

    @Expose
    @SerializedName("is_correct")
    @Property(nameInDb = "is_correct")
    private boolean isCorrect;

    @Expose
    @SerializedName("created_at")
    @Property(nameInDb = "created_at")
    private String createdAt;

    @Expose
    @SerializedName("updated_at")
    @Property(nameInDb = "updated_at")
    private String updatedAt;
}
