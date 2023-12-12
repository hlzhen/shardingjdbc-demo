package org.sj.demo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 日志实体类
 * created by Lz on 2023/12/1 17:08
 */
public class HlzLog implements Serializable {

    private static final long serialVersionUID = -8245955342288177518L;

    private long id;

    private long userid;

    private String type;

    private String title;

    private String contents;

    private String opcode;

    private LocalDateTime opdt;

    private String opuser;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getOpcode() {
        return opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public LocalDateTime getOpdt() {
        return opdt;
    }

    public void setOpdt(LocalDateTime opdt) {
        this.opdt = opdt;
    }

    public String getOpuser() {
        return opuser;
    }

    public void setOpuser(String opuser) {
        this.opuser = opuser;
    }

    @Override
    public String toString() {
        return "HlzLog{" +
                "id=" + id +
                ", userid=" + userid +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", opcode='" + opcode + '\'' +
                ", opdt=" + opdt +
                ", opuser='" + opuser + '\'' +
                '}';
    }
}
