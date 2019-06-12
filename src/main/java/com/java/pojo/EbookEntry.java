package com.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EbookEntry implements Serializable {

    private static final long serialVersionUID = -2009161467058932841L;

    private Long id;

    private Long categoryId;

    private String title;

    private String summary;

    private String uploaduser;

    private Date createdate;


}