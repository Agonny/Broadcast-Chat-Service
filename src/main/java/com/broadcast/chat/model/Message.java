package com.broadcast.chat.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "messages")
@EntityListeners(AuditingEntityListener.class)
public class Message {

    @Id
    private String id;

    private String content;

    @OneToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "message")
    private Set<MessageFiles> messageFiles;

    private Long countOfLikes;

    private String creatorId;

    private Boolean isUpdated;

    private Boolean isSystemMessage;

    private Boolean isDeleted;

    private String type;

    @JoinColumn(name = "chat_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    private Chat chat;

    private LocalDateTime createdAt;

}
