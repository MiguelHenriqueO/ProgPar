package dc.unifacef.bd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String name;
    @Column
    private Double price;
    @Column (length = 500)
    private String descricao;
}