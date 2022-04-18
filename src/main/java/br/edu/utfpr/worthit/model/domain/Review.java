package br.edu.utfpr.worthit.model.domain;

import lombok.*;
import javax.persistence.*;

@Entity
@Data(staticConstructor = "of")
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String user;

    @NonNull
    private String likes;

    @NonNull
    private String review;

    @NonNull
    @ManyToOne
    private Product product;
}
